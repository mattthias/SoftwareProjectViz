/*
 * KIELER - Kiel Integrated Environment for Layout Eclipse RichClient
 *
 * http://rtsys.informatik.uni-kiel.de/kieler
 * 
 * Copyright 2021 by
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
package de.cau.cs.kieler.spviz.spvizmodel.ui;

import com.google.inject.Injector;
import de.cau.cs.kieler.spviz.spvizmodel.ui.internal.SpvizmodelActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class SPVizModelExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(SpvizmodelActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		SpvizmodelActivator activator = SpvizmodelActivator.getInstance();
		return activator != null ? activator.getInjector(SpvizmodelActivator.DE_CAU_CS_KIELER_SPVIZ_SPVIZMODEL_SPVIZMODEL) : null;
	}

}
