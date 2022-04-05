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
package de.cau.cs.kieler.spviz.spviz.sPViz.impl;

import de.cau.cs.kieler.spviz.spviz.sPViz.ArtifactChain;
import de.cau.cs.kieler.spviz.spviz.sPViz.SPVizPackage;

import de.cau.cs.kieler.spviz.spvizmodel.sPVizModel.Artifact;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Artifact Chain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.spviz.spviz.sPViz.impl.ArtifactChainImpl#getSource <em>Source</em>}</li>
 *   <li>{@link de.cau.cs.kieler.spviz.spviz.sPViz.impl.ArtifactChainImpl#getFurther <em>Further</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactChainImpl extends MinimalEObjectImpl.Container implements ArtifactChain
{
  /**
   * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSource()
   * @generated
   * @ordered
   */
  protected Artifact source;

  /**
   * The cached value of the '{@link #getFurther() <em>Further</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFurther()
   * @generated
   * @ordered
   */
  protected ArtifactChain further;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArtifactChainImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return SPVizPackage.Literals.ARTIFACT_CHAIN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Artifact getSource()
  {
    if (source != null && source.eIsProxy())
    {
      InternalEObject oldSource = (InternalEObject)source;
      source = (Artifact)eResolveProxy(oldSource);
      if (source != oldSource)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SPVizPackage.ARTIFACT_CHAIN__SOURCE, oldSource, source));
      }
    }
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Artifact basicGetSource()
  {
    return source;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSource(Artifact newSource)
  {
    Artifact oldSource = source;
    source = newSource;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPVizPackage.ARTIFACT_CHAIN__SOURCE, oldSource, source));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArtifactChain getFurther()
  {
    return further;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFurther(ArtifactChain newFurther, NotificationChain msgs)
  {
    ArtifactChain oldFurther = further;
    further = newFurther;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPVizPackage.ARTIFACT_CHAIN__FURTHER, oldFurther, newFurther);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFurther(ArtifactChain newFurther)
  {
    if (newFurther != further)
    {
      NotificationChain msgs = null;
      if (further != null)
        msgs = ((InternalEObject)further).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SPVizPackage.ARTIFACT_CHAIN__FURTHER, null, msgs);
      if (newFurther != null)
        msgs = ((InternalEObject)newFurther).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SPVizPackage.ARTIFACT_CHAIN__FURTHER, null, msgs);
      msgs = basicSetFurther(newFurther, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPVizPackage.ARTIFACT_CHAIN__FURTHER, newFurther, newFurther));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case SPVizPackage.ARTIFACT_CHAIN__FURTHER:
        return basicSetFurther(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case SPVizPackage.ARTIFACT_CHAIN__SOURCE:
        if (resolve) return getSource();
        return basicGetSource();
      case SPVizPackage.ARTIFACT_CHAIN__FURTHER:
        return getFurther();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case SPVizPackage.ARTIFACT_CHAIN__SOURCE:
        setSource((Artifact)newValue);
        return;
      case SPVizPackage.ARTIFACT_CHAIN__FURTHER:
        setFurther((ArtifactChain)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case SPVizPackage.ARTIFACT_CHAIN__SOURCE:
        setSource((Artifact)null);
        return;
      case SPVizPackage.ARTIFACT_CHAIN__FURTHER:
        setFurther((ArtifactChain)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case SPVizPackage.ARTIFACT_CHAIN__SOURCE:
        return source != null;
      case SPVizPackage.ARTIFACT_CHAIN__FURTHER:
        return further != null;
    }
    return super.eIsSet(featureID);
  }

} //ArtifactChainImpl