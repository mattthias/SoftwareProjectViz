/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2020 by
 * + Kiel University
 *   + Department of Computer Science
 *     + Real-Time and Embedded Systems Group
 * 
 * This code is provided under the terms of the Eclipse Public License 2.0 (EPL-2.0).
 */
package de.cau.cs.kieler.spviz.spvizmodel.ui.labeling;

import org.eclipse.xtext.ui.label.DefaultDescriptionLabelProvider;

/**
 * Provides labels for IEObjectDescriptions and IResourceDescriptions.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#label-provider
 */
public class SPVizModelDescriptionLabelProvider extends DefaultDescriptionLabelProvider {

    // Labels and icons can be computed like this:
//    @Override
//    public String text(IEObjectDescription ele) {
//        return ele.getName().toString();
//    }
//    
//    @Override
//    public String image(IEObjectDescription ele) {
//        return ele.getEClass().getName() + ".gif";
//    }
}
