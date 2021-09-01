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

import de.cau.cs.kieler.spviz.spvizmodel.sPVizModel.Artifact;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shown Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.spviz.spviz.sPViz.ShownElement#getShownElement <em>Shown Element</em>}</li>
 *   <li>{@link de.cau.cs.kieler.spviz.spviz.sPViz.ShownElement#getContainedIn <em>Contained In</em>}</li>
 * </ul>
 *
 * @see de.cau.cs.kieler.spviz.spviz.sPViz.SPVizPackage#getShownElement()
 * @model
 * @generated
 */
public interface ShownElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Shown Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shown Element</em>' reference.
   * @see #setShownElement(Artifact)
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.SPVizPackage#getShownElement_ShownElement()
   * @model
   * @generated
   */
  Artifact getShownElement();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.spviz.spviz.sPViz.ShownElement#getShownElement <em>Shown Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shown Element</em>' reference.
   * @see #getShownElement()
   * @generated
   */
  void setShownElement(Artifact value);

  /**
   * Returns the value of the '<em><b>Contained In</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Contained In</em>' reference.
   * @see #setContainedIn(Artifact)
   * @see de.cau.cs.kieler.spviz.spviz.sPViz.SPVizPackage#getShownElement_ContainedIn()
   * @model
   * @generated
   */
  Artifact getContainedIn();

  /**
   * Sets the value of the '{@link de.cau.cs.kieler.spviz.spviz.sPViz.ShownElement#getContainedIn <em>Contained In</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Contained In</em>' reference.
   * @see #getContainedIn()
   * @generated
   */
  void setContainedIn(Artifact value);

} // ShownElement