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
package de.cau.cs.kieler.spviz.spvizmodel;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class SPVizModelStandaloneSetup extends SPVizModelStandaloneSetupGenerated {

    public static void doSetup() {
        new SPVizModelStandaloneSetup().createInjectorAndDoEMFRegistration();
    }
}
