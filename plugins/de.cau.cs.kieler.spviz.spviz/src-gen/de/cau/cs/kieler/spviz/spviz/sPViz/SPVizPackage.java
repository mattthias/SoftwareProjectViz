/**
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 * 
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2022 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * Generated by Xtext 2.25.0
 * 
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 * 
 * SPDX-License-Identifier: EPL-2.0
 */
package de.cau.cs.kieler.spviz.spviz.sPViz;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.cau.cs.kieler.spviz.spviz.sPViz.SPVizFactory
 * @model kind="package"
 * @generated
 */
public interface SPVizPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "sPViz";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cau.de/cs/kieler/spviz/spviz/SPViz";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "sPViz";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  SPVizPackage eINSTANCE = de.cau.cs.kieler.spviz.spviz.sPViz.impl.SPVizPackageImpl.init();

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.spviz.spviz.sPViz.impl.SPVizImpl <em>SP Viz</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.impl.SPVizImpl
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.impl.SPVizPackageImpl#getSPViz()
   * @generated
   */
  int SP_VIZ = 0;

  /**
   * The feature id for the '<em><b>Package</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_VIZ__PACKAGE = 0;

  /**
   * The feature id for the '<em><b>Import URI</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_VIZ__IMPORT_URI = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_VIZ__NAME = 2;

  /**
   * The feature id for the '<em><b>Views</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_VIZ__VIEWS = 3;

  /**
   * The feature id for the '<em><b>Artifact Shows</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_VIZ__ARTIFACT_SHOWS = 4;

  /**
   * The number of structural features of the '<em>SP Viz</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SP_VIZ_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.spviz.spviz.sPViz.impl.ViewImpl <em>View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.impl.ViewImpl
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.impl.SPVizPackageImpl#getView()
   * @generated
   */
  int VIEW = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__NAME = 0;

  /**
   * The feature id for the '<em><b>Shown Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__SHOWN_ELEMENTS = 1;

  /**
   * The feature id for the '<em><b>Shown Connections</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW__SHOWN_CONNECTIONS = 2;

  /**
   * The number of structural features of the '<em>View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VIEW_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.spviz.spviz.sPViz.impl.ArtifactShowsImpl <em>Artifact Shows</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.impl.ArtifactShowsImpl
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.impl.SPVizPackageImpl#getArtifactShows()
   * @generated
   */
  int ARTIFACT_SHOWS = 2;

  /**
   * The feature id for the '<em><b>Artifact Shows</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT_SHOWS__ARTIFACT_SHOWS = 0;

  /**
   * The feature id for the '<em><b>Views</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT_SHOWS__VIEWS = 1;

  /**
   * The number of structural features of the '<em>Artifact Shows</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT_SHOWS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.spviz.spviz.sPViz.impl.ArtifactViewImpl <em>Artifact View</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.impl.ArtifactViewImpl
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.impl.SPVizPackageImpl#getArtifactView()
   * @generated
   */
  int ARTIFACT_VIEW = 3;

  /**
   * The feature id for the '<em><b>View</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT_VIEW__VIEW = 0;

  /**
   * The feature id for the '<em><b>Sources</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT_VIEW__SOURCES = 1;

  /**
   * The number of structural features of the '<em>Artifact View</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT_VIEW_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.spviz.spviz.sPViz.impl.ArtifactSourceImpl <em>Artifact Source</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.impl.ArtifactSourceImpl
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.impl.SPVizPackageImpl#getArtifactSource()
   * @generated
   */
  int ARTIFACT_SOURCE = 4;

  /**
   * The feature id for the '<em><b>Artifact</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT_SOURCE__ARTIFACT = 0;

  /**
   * The feature id for the '<em><b>Source Chain</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT_SOURCE__SOURCE_CHAIN = 1;

  /**
   * The number of structural features of the '<em>Artifact Source</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT_SOURCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.spviz.spviz.sPViz.impl.ArtifactChainImpl <em>Artifact Chain</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.impl.ArtifactChainImpl
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.impl.SPVizPackageImpl#getArtifactChain()
   * @generated
   */
  int ARTIFACT_CHAIN = 5;

  /**
   * The feature id for the '<em><b>Source</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT_CHAIN__SOURCE = 0;

  /**
   * The feature id for the '<em><b>Further</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT_CHAIN__FURTHER = 1;

  /**
   * The number of structural features of the '<em>Artifact Chain</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARTIFACT_CHAIN_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.spviz.spviz.sPViz.impl.ShownElementImpl <em>Shown Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.impl.ShownElementImpl
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.impl.SPVizPackageImpl#getShownElement()
   * @generated
   */
  int SHOWN_ELEMENT = 6;

  /**
   * The feature id for the '<em><b>Shown Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOWN_ELEMENT__SHOWN_ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Contained In</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOWN_ELEMENT__CONTAINED_IN = 1;

  /**
   * The number of structural features of the '<em>Shown Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOWN_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link de.cau.cs.kieler.spviz.spviz.sPViz.impl.ShownConnectionImpl <em>Shown Connection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.impl.ShownConnectionImpl
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.impl.SPVizPackageImpl#getShownConnection()
   * @generated
   */
  int SHOWN_CONNECTION = 7;

  /**
   * The feature id for the '<em><b>Shown Connection</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOWN_CONNECTION__SHOWN_CONNECTION = 0;

  /**
   * The feature id for the '<em><b>Via</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOWN_CONNECTION__VIA = 1;

  /**
   * The number of structural features of the '<em>Shown Connection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SHOWN_CONNECTION_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.spviz.spviz.sPViz.SPViz <em>SP Viz</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>SP Viz</em>'.
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.SPViz
   * @generated
   */
  EClass getSPViz();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.spviz.spviz.sPViz.SPViz#getPackage <em>Package</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Package</em>'.
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.SPViz#getPackage()
   * @see #getSPViz()
   * @generated
   */
  EAttribute getSPViz_Package();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.spviz.spviz.sPViz.SPViz#getImportURI <em>Import URI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Import URI</em>'.
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.SPViz#getImportURI()
   * @see #getSPViz()
   * @generated
   */
  EAttribute getSPViz_ImportURI();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.spviz.spviz.sPViz.SPViz#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.SPViz#getName()
   * @see #getSPViz()
   * @generated
   */
  EAttribute getSPViz_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.spviz.spviz.sPViz.SPViz#getViews <em>Views</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Views</em>'.
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.SPViz#getViews()
   * @see #getSPViz()
   * @generated
   */
  EReference getSPViz_Views();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.spviz.spviz.sPViz.SPViz#getArtifactShows <em>Artifact Shows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Artifact Shows</em>'.
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.SPViz#getArtifactShows()
   * @see #getSPViz()
   * @generated
   */
  EReference getSPViz_ArtifactShows();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.spviz.spviz.sPViz.View <em>View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>View</em>'.
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.View
   * @generated
   */
  EClass getView();

  /**
   * Returns the meta object for the attribute '{@link de.cau.cs.kieler.spviz.spviz.sPViz.View#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.View#getName()
   * @see #getView()
   * @generated
   */
  EAttribute getView_Name();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.spviz.spviz.sPViz.View#getShownElements <em>Shown Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Shown Elements</em>'.
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.View#getShownElements()
   * @see #getView()
   * @generated
   */
  EReference getView_ShownElements();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.spviz.spviz.sPViz.View#getShownConnections <em>Shown Connections</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Shown Connections</em>'.
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.View#getShownConnections()
   * @see #getView()
   * @generated
   */
  EReference getView_ShownConnections();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.spviz.spviz.sPViz.ArtifactShows <em>Artifact Shows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Artifact Shows</em>'.
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.ArtifactShows
   * @generated
   */
  EClass getArtifactShows();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.spviz.spviz.sPViz.ArtifactShows#getArtifactShows <em>Artifact Shows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Artifact Shows</em>'.
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.ArtifactShows#getArtifactShows()
   * @see #getArtifactShows()
   * @generated
   */
  EReference getArtifactShows_ArtifactShows();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.spviz.spviz.sPViz.ArtifactShows#getViews <em>Views</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Views</em>'.
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.ArtifactShows#getViews()
   * @see #getArtifactShows()
   * @generated
   */
  EReference getArtifactShows_Views();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.spviz.spviz.sPViz.ArtifactView <em>Artifact View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Artifact View</em>'.
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.ArtifactView
   * @generated
   */
  EClass getArtifactView();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.spviz.spviz.sPViz.ArtifactView#getView <em>View</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>View</em>'.
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.ArtifactView#getView()
   * @see #getArtifactView()
   * @generated
   */
  EReference getArtifactView_View();

  /**
   * Returns the meta object for the containment reference list '{@link de.cau.cs.kieler.spviz.spviz.sPViz.ArtifactView#getSources <em>Sources</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sources</em>'.
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.ArtifactView#getSources()
   * @see #getArtifactView()
   * @generated
   */
  EReference getArtifactView_Sources();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.spviz.spviz.sPViz.ArtifactSource <em>Artifact Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Artifact Source</em>'.
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.ArtifactSource
   * @generated
   */
  EClass getArtifactSource();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.spviz.spviz.sPViz.ArtifactSource#getArtifact <em>Artifact</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Artifact</em>'.
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.ArtifactSource#getArtifact()
   * @see #getArtifactSource()
   * @generated
   */
  EReference getArtifactSource_Artifact();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.spviz.spviz.sPViz.ArtifactSource#getSourceChain <em>Source Chain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Source Chain</em>'.
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.ArtifactSource#getSourceChain()
   * @see #getArtifactSource()
   * @generated
   */
  EReference getArtifactSource_SourceChain();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.spviz.spviz.sPViz.ArtifactChain <em>Artifact Chain</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Artifact Chain</em>'.
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.ArtifactChain
   * @generated
   */
  EClass getArtifactChain();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.spviz.spviz.sPViz.ArtifactChain#getSource <em>Source</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Source</em>'.
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.ArtifactChain#getSource()
   * @see #getArtifactChain()
   * @generated
   */
  EReference getArtifactChain_Source();

  /**
   * Returns the meta object for the containment reference '{@link de.cau.cs.kieler.spviz.spviz.sPViz.ArtifactChain#getFurther <em>Further</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Further</em>'.
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.ArtifactChain#getFurther()
   * @see #getArtifactChain()
   * @generated
   */
  EReference getArtifactChain_Further();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.spviz.spviz.sPViz.ShownElement <em>Shown Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shown Element</em>'.
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.ShownElement
   * @generated
   */
  EClass getShownElement();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.spviz.spviz.sPViz.ShownElement#getShownElement <em>Shown Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Shown Element</em>'.
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.ShownElement#getShownElement()
   * @see #getShownElement()
   * @generated
   */
  EReference getShownElement_ShownElement();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.spviz.spviz.sPViz.ShownElement#getContainedIn <em>Contained In</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Contained In</em>'.
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.ShownElement#getContainedIn()
   * @see #getShownElement()
   * @generated
   */
  EReference getShownElement_ContainedIn();

  /**
   * Returns the meta object for class '{@link de.cau.cs.kieler.spviz.spviz.sPViz.ShownConnection <em>Shown Connection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Shown Connection</em>'.
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.ShownConnection
   * @generated
   */
  EClass getShownConnection();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.spviz.spviz.sPViz.ShownConnection#getShownConnection <em>Shown Connection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Shown Connection</em>'.
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.ShownConnection#getShownConnection()
   * @see #getShownConnection()
   * @generated
   */
  EReference getShownConnection_ShownConnection();

  /**
   * Returns the meta object for the reference '{@link de.cau.cs.kieler.spviz.spviz.sPViz.ShownConnection#getVia <em>Via</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Via</em>'.
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.ShownConnection#getVia()
   * @see #getShownConnection()
   * @generated
   */
  EReference getShownConnection_Via();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  SPVizFactory getSPVizFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.spviz.spviz.sPViz.impl.SPVizImpl <em>SP Viz</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.spviz.spviz.sPViz.impl.SPVizImpl
     * @see de.cau.cs.kieler.spviz.spviz.sPViz.impl.SPVizPackageImpl#getSPViz()
     * @generated
     */
    EClass SP_VIZ = eINSTANCE.getSPViz();

    /**
     * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SP_VIZ__PACKAGE = eINSTANCE.getSPViz_Package();

    /**
     * The meta object literal for the '<em><b>Import URI</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SP_VIZ__IMPORT_URI = eINSTANCE.getSPViz_ImportURI();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SP_VIZ__NAME = eINSTANCE.getSPViz_Name();

    /**
     * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SP_VIZ__VIEWS = eINSTANCE.getSPViz_Views();

    /**
     * The meta object literal for the '<em><b>Artifact Shows</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SP_VIZ__ARTIFACT_SHOWS = eINSTANCE.getSPViz_ArtifactShows();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.spviz.spviz.sPViz.impl.ViewImpl <em>View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.spviz.spviz.sPViz.impl.ViewImpl
     * @see de.cau.cs.kieler.spviz.spviz.sPViz.impl.SPVizPackageImpl#getView()
     * @generated
     */
    EClass VIEW = eINSTANCE.getView();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VIEW__NAME = eINSTANCE.getView_Name();

    /**
     * The meta object literal for the '<em><b>Shown Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW__SHOWN_ELEMENTS = eINSTANCE.getView_ShownElements();

    /**
     * The meta object literal for the '<em><b>Shown Connections</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VIEW__SHOWN_CONNECTIONS = eINSTANCE.getView_ShownConnections();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.spviz.spviz.sPViz.impl.ArtifactShowsImpl <em>Artifact Shows</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.spviz.spviz.sPViz.impl.ArtifactShowsImpl
     * @see de.cau.cs.kieler.spviz.spviz.sPViz.impl.SPVizPackageImpl#getArtifactShows()
     * @generated
     */
    EClass ARTIFACT_SHOWS = eINSTANCE.getArtifactShows();

    /**
     * The meta object literal for the '<em><b>Artifact Shows</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACT_SHOWS__ARTIFACT_SHOWS = eINSTANCE.getArtifactShows_ArtifactShows();

    /**
     * The meta object literal for the '<em><b>Views</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACT_SHOWS__VIEWS = eINSTANCE.getArtifactShows_Views();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.spviz.spviz.sPViz.impl.ArtifactViewImpl <em>Artifact View</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.spviz.spviz.sPViz.impl.ArtifactViewImpl
     * @see de.cau.cs.kieler.spviz.spviz.sPViz.impl.SPVizPackageImpl#getArtifactView()
     * @generated
     */
    EClass ARTIFACT_VIEW = eINSTANCE.getArtifactView();

    /**
     * The meta object literal for the '<em><b>View</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACT_VIEW__VIEW = eINSTANCE.getArtifactView_View();

    /**
     * The meta object literal for the '<em><b>Sources</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACT_VIEW__SOURCES = eINSTANCE.getArtifactView_Sources();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.spviz.spviz.sPViz.impl.ArtifactSourceImpl <em>Artifact Source</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.spviz.spviz.sPViz.impl.ArtifactSourceImpl
     * @see de.cau.cs.kieler.spviz.spviz.sPViz.impl.SPVizPackageImpl#getArtifactSource()
     * @generated
     */
    EClass ARTIFACT_SOURCE = eINSTANCE.getArtifactSource();

    /**
     * The meta object literal for the '<em><b>Artifact</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACT_SOURCE__ARTIFACT = eINSTANCE.getArtifactSource_Artifact();

    /**
     * The meta object literal for the '<em><b>Source Chain</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACT_SOURCE__SOURCE_CHAIN = eINSTANCE.getArtifactSource_SourceChain();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.spviz.spviz.sPViz.impl.ArtifactChainImpl <em>Artifact Chain</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.spviz.spviz.sPViz.impl.ArtifactChainImpl
     * @see de.cau.cs.kieler.spviz.spviz.sPViz.impl.SPVizPackageImpl#getArtifactChain()
     * @generated
     */
    EClass ARTIFACT_CHAIN = eINSTANCE.getArtifactChain();

    /**
     * The meta object literal for the '<em><b>Source</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACT_CHAIN__SOURCE = eINSTANCE.getArtifactChain_Source();

    /**
     * The meta object literal for the '<em><b>Further</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARTIFACT_CHAIN__FURTHER = eINSTANCE.getArtifactChain_Further();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.spviz.spviz.sPViz.impl.ShownElementImpl <em>Shown Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.spviz.spviz.sPViz.impl.ShownElementImpl
     * @see de.cau.cs.kieler.spviz.spviz.sPViz.impl.SPVizPackageImpl#getShownElement()
     * @generated
     */
    EClass SHOWN_ELEMENT = eINSTANCE.getShownElement();

    /**
     * The meta object literal for the '<em><b>Shown Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHOWN_ELEMENT__SHOWN_ELEMENT = eINSTANCE.getShownElement_ShownElement();

    /**
     * The meta object literal for the '<em><b>Contained In</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHOWN_ELEMENT__CONTAINED_IN = eINSTANCE.getShownElement_ContainedIn();

    /**
     * The meta object literal for the '{@link de.cau.cs.kieler.spviz.spviz.sPViz.impl.ShownConnectionImpl <em>Shown Connection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.cau.cs.kieler.spviz.spviz.sPViz.impl.ShownConnectionImpl
     * @see de.cau.cs.kieler.spviz.spviz.sPViz.impl.SPVizPackageImpl#getShownConnection()
     * @generated
     */
    EClass SHOWN_CONNECTION = eINSTANCE.getShownConnection();

    /**
     * The meta object literal for the '<em><b>Shown Connection</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHOWN_CONNECTION__SHOWN_CONNECTION = eINSTANCE.getShownConnection_ShownConnection();

    /**
     * The meta object literal for the '<em><b>Via</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SHOWN_CONNECTION__VIA = eINSTANCE.getShownConnection_Via();

  }

} //SPVizPackage
