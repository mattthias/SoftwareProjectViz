/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2021 by
 * + Kiel University
 *   + Department of Computer Science
 *   + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License 2.0 (EPL-2.0).
 */
package de.cau.cs.kieler.spviz.spviz.generator

import de.cau.cs.kieler.spviz.spviz.sPViz.SPViz
import de.cau.cs.kieler.spviz.spvizmodel.sPVizModel.Artifact
import de.cau.cs.kieler.spviz.spvizmodel.sPVizModel.SPVizModel
import java.util.ArrayList
import java.util.LinkedHashMap
import org.eclipse.emf.ecore.resource.Resource

/**
 * Simplifies access to the data in a SPViz representation.
 * 
 * @author leo, nre
 */
class DataAccess {
    
    /** The bundle and package prefix for the generated visualization bundles. */
	String bundleNamePrefix
	/** The imported model bundle and package prefix of the required model. */
	String modelBundleNamePrefix
	/** The name of the visualization */
	String visualizationName
	/** TODO: ? */
	String projectName
	// TODO: it is probably best to use the artifacts themselves, requires real import mechanic of other model
	String[] artifacts
	// TODO: all of these should probably also be the overviews directly, not only their names.
	String[] overviews
	// TODO: especially these, I think a Map<Artifact, List<Artifact>> would be the wanted interface.
	// Also, this string array seems to be a static length array of (connectionName, requiredName), maybe this
	// should rather be a Map<Artifact, List<Connection>> instead? That would contain every necessary information.
	LinkedHashMap<String, ArrayList<String[]>> requiredArtifacts
	LinkedHashMap<String, ArrayList<String[]>> requiringArtifacts
	LinkedHashMap<String, String[]> artifactsInOverviews
	LinkedHashMap<String, ArrayList<String[]>> overviewContentConnections
	
	/**
	 * Constructor
	 * 
	 * @param resource
	 * 		The resource for the {@link SPViz} model loaded in the editor.
	 */
	new(Resource resource) {
	    val spviz = resource.contents.head as SPViz
        bundleNamePrefix = spviz.package
        
        val importedSpvizModel = resource.resourceSet.resources.findFirst[
            it.contents.head instanceof SPVizModel
        ]?.contents?.head as SPVizModel
        if (importedSpvizModel === null) {
            println("No SPVizModel found to import with the name " + spviz.importURI)
        }
        modelBundleNamePrefix = importedSpvizModel?.package
        visualizationName = spviz.name
        // FIXME: visualizations are not required to be named ...Viz, so this replacement may not work. What is this
		// differentiation used for anyway?
		projectName = visualizationName.replace("Viz", "Project")
		requiredArtifacts = newLinkedHashMap
		requiringArtifacts = newLinkedHashMap
		artifactsInOverviews = newLinkedHashMap
		overviewContentConnections = newLinkedHashMap
		
		val ArrayList<String> artifactList = newArrayList()
		overviews = newArrayOfSize(spviz.views.size);
		
		for (var i = 0; i < spviz.views.size; i++) {
            val view = spviz.views.get(i)
            overviews.set(i, view.name)
            val String[] shownElements = newArrayOfSize(view.shownElements.size)

            // find all artifacts shown in an overview
            for (var j = 0; j < view.shownElements.size; j++) {
                val artifactName = view.shownElements.get(j).shownElement.name
                shownElements.set(j, artifactName)
                if (!artifactList.contains(artifactName)) artifactList.add(artifactName)
            }
            artifactsInOverviews.put(view.name, shownElements)

            // find all connections between artifacts
            for (var j = 0; j < view.shownConnections.size; j++) {
                val connection = view.shownConnections.get(j).shownConnection
                val connectionName = connection.name
                val requiring = (connection.eContainer as Artifact).name
                val required = connection.dependsOn.name

                if (requiredArtifacts.containsKey(requiring)) {
                    requiredArtifacts.get(requiring).add(#[connectionName, required])
                } else {
                    val ArrayList<String[]> requiredConnections = newArrayList
                    requiredConnections.add(#[connectionName, required])
                    requiredArtifacts.put(requiring, requiredConnections)
                }

                if (requiringArtifacts.containsKey(required)) {
                    requiringArtifacts.get(required).add(#[connectionName, requiring])
                } else {
                    val ArrayList<String[]> requiredConnections = newArrayList
                    requiredConnections.add(#[connectionName, requiring])
                    requiringArtifacts.put(required, requiredConnections)
                }

                if (overviewContentConnections.containsKey(view.name)) {
                    overviewContentConnections.get(view.name).add(#[connectionName, requiring, required])
                } else {
                    val ArrayList<String[]> contentConnections = newArrayList
                    contentConnections.add(#[connectionName, requiring, required])
                    overviewContentConnections.put(view.name, contentConnections)
                }

                // catch artifacts, which are only stated in the SPVizModel or inside a connection
                if (!artifactList.contains(requiring)) artifactList.add(requiring)
                if (!artifactList.contains(required)) artifactList.add(required)
            }
        }

        artifacts = newArrayOfSize(artifactList.size)
        for (var i = 0; i < artifactList.size; i++) {
            artifacts.set(i, artifactList.get(i))
        }
    }
	
	/** @return The prefix of the bundle and package names of the generated bundles. */
	def String getBundleNamePrefix() { return bundleNamePrefix }
	/** @return The prefix of the required model bundle and package names. */
	def String getModelBundleNamePrefix() { return modelBundleNamePrefix }
	/** @return name of the visualization */
	def String getVizName() { return visualizationName }
	/** @return name of the project */
	def String getProjectName() { return projectName }
	/** @return all overview names as a string array */
	def String[] getOverviews() { return overviews }
	/** @return all artifact names as a string array */
	def String[] getArtifacts() { return artifacts }
	
	/** 
	 * Returns all required artifacts for a given artifact. 
	 * 
	 * @param requiring
	 * 		the artifact which requires other artifacts
	 * @return
	 * 		List of the required artifact names
	 */
	def ArrayList<String[]> getRequiredArtifacts(String requiring) { 
		if (!requiredArtifacts.containsKey(requiring)) {
			return newArrayList
		}
		return requiredArtifacts.get(requiring)
	}
	
	/** 
	 * Returns all requiring artifacts for a given artifact. 
	 * 
	 * @param required
	 * 		the artifact which is required by other artifacts
	 * @return
	 * 		List of the requiring artifact names
	 */
	def ArrayList<String[]> getRequiringArtifacts(String required) {
		if (!requiringArtifacts.containsKey(required)) {
			return newArrayList
		}
		return requiringArtifacts.get(required)
	}
	
	/** 
	 * Returns all required artifacts for a given artifact, if the connection
	 * is displayed. 
	 * 
	 * @param requiring
	 * 		the artifact which requires other artifacts
	 * @return
	 * 		List of the required artifact names
	 */
	def ArrayList<String[]> getRequiredArtifactsInOverview(String requiring, String overview) { 
		val ArrayList<String[]> requiredPairs = newArrayList
		if (!requiredArtifacts.containsKey(requiring))  {
			return requiredPairs
		}
		for (requiredConnectionNameAndArtifact : requiredArtifacts.get(requiring)){
			val String[] connection = newArrayOfSize(3)
			connection.set(0, requiredConnectionNameAndArtifact.get(0))
			connection.set(1, requiring)
			connection.set(2, requiredConnectionNameAndArtifact.get(1))
			if (isConnectionDisplayedInOverview(overview, connection)) {
				requiredPairs.add(requiredConnectionNameAndArtifact)
			}
		}
		return requiredPairs
	}
	
	/** 
	 * Returns all requiring artifacts for a given artifact, if the connection
	 * is displayed. 
	 * 
	 * @param required
	 * 		the artifact which is required by other artifacts
	 * @return
	 * 		List of the requiring artifact names
	 */
	def ArrayList<String[]> getRequiringArtifactsInOverview(String required, String overview) {
        val ArrayList<String[]> requiringPairs = newArrayList
        if (!requiringArtifacts.containsKey(required)) {
            return requiringPairs
        }
        for (requiringConnectionNameAndArtifact : requiringArtifacts.get(required)) {
            val String[] connection = newArrayOfSize(3)
            connection.set(0, requiringConnectionNameAndArtifact.get(0))
            connection.set(1, requiringConnectionNameAndArtifact.get(1))
            connection.set(2, required)
            if (isConnectionDisplayedInOverview(overview, connection)) {
                requiringPairs.add(requiringConnectionNameAndArtifact)
            }
        }
        return requiringPairs
    }
	
	/** 
	 * Returns all shown artifacts for an overview. 
	 * 
	 * @param overviewName
	 * 		overview name as a string
	 * @return
	 * 		List of the artifacts shown in an overview
	 */
    def String[] getDisplayedArtifacts(String overviewName) {
        if (!artifactsInOverviews.containsKey(overviewName)) {
            return #[]
        }
        return artifactsInOverviews.get(overviewName)
    }
	
	/** 
	 * Returns all connection shown in an overview. 
	 * 
	 * @param overviewName
	 * 		overview name as a string
	 * @return
	 * 		List of connections shown in an overview.
	 * 		A connection is a tupel of strings:
	 * 			[connection name, requiring artifact name, required artifact name]
	 */
    def ArrayList<String[]> getOverviewConnections(String overviewName) {
        if (!overviewContentConnections.containsKey(overviewName)) {
            return newArrayList
        }
        return overviewContentConnections.get(overviewName)
    }
	
	/** 
	 * Finds for a given artifact the overview, it is contained in. 
	 * 
	 * @param artifact
	 * 		artifact name as a string
	 * @return
	 * 		an overview as a string
	 */
    def String getOverview(String artifact) {
        for (overview : overviews)
            for (overviewArtifact : getDisplayedArtifacts(overview)) {
                if (overviewArtifact == artifact) {
                    return overview
                }
            }
        System.out.println("artifact " + artifact + " not found in any overview")
        return ""
    }

    def boolean isConnectionDisplayedInOverview(String overview, String[] connection) {
        for (overviewConnection : getOverviewConnections(overview)) {
            if (overviewConnection.get(0) == connection.get(0) 
                && overviewConnection.get(1) == connection.get(1) 
                && overviewConnection.get(2) == connection.get(2)) {
                return true
            }
        }
        return false
    }
	
	
}