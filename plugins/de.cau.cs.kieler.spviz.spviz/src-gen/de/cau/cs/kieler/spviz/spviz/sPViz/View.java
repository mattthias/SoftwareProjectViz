/**
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
package de.cau.cs.kieler.spviz.spviz.sPViz;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.spviz.spviz.sPViz.View#getName <em>Name</em>}</li>
 *   <li>{@link de.cau.cs.kieler.spviz.spviz.sPViz.View#getShownElements <em>Shown Elements</em>}</li>
 *   <li>{@link de.cau.cs.kieler.spviz.spviz.sPViz.View#getShownConnections <em>Shown Connections</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.spviz.spviz.sPViz.SPVizPackage#getView()
 * @model
 * @generated
 */
public interface View extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.SPVizPackage#getView_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.spviz.spviz.sPViz.View#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Shown Elements</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.spviz.spviz.sPViz.ShownElement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shown Elements</em>' containment reference list.
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.SPVizPackage#getView_ShownElements()
   * @model containment="true"
   * @generated
   */
  EList<ShownElement> getShownElements();

  /**
   * Returns the value of the '<em><b>Shown Connections</b></em>' containment reference list.
   * The list contents are of type {@link de.cau.cs.kieler.spviz.spviz.sPViz.ShownConnection}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shown Connections</em>' containment reference list.
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.SPVizPackage#getView_ShownConnections()
   * @model containment="true"
   * @generated
   */
  EList<ShownConnection> getShownConnections();

} // View
