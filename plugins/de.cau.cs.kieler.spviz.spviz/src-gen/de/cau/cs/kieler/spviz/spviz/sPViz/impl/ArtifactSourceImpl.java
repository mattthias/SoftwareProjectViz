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
import de.cau.cs.kieler.spviz.spviz.sPViz.ArtifactSource;
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
 * An implementation of the model object '<em><b>Artifact Source</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.cau.cs.kieler.spviz.spviz.sPViz.impl.ArtifactSourceImpl#getArtifact <em>Artifact</em>}</li>
 *   <li>{@link de.cau.cs.kieler.spviz.spviz.sPViz.impl.ArtifactSourceImpl#getSourceChain <em>Source Chain</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArtifactSourceImpl extends MinimalEObjectImpl.Container implements ArtifactSource
{
  /**
   * The cached value of the '{@link #getArtifact() <em>Artifact</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArtifact()
   * @generated
   * @ordered
   */
  protected Artifact artifact;

  /**
   * The cached value of the '{@link #getSourceChain() <em>Source Chain</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSourceChain()
   * @generated
   * @ordered
   */
  protected ArtifactChain sourceChain;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArtifactSourceImpl()
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
    return SPVizPackage.Literals.ARTIFACT_SOURCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Artifact getArtifact()
  {
    if (artifact != null && artifact.eIsProxy())
    {
      InternalEObject oldArtifact = (InternalEObject)artifact;
      artifact = (Artifact)eResolveProxy(oldArtifact);
      if (artifact != oldArtifact)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, SPVizPackage.ARTIFACT_SOURCE__ARTIFACT, oldArtifact, artifact));
      }
    }
    return artifact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Artifact basicGetArtifact()
  {
    return artifact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setArtifact(Artifact newArtifact)
  {
    Artifact oldArtifact = artifact;
    artifact = newArtifact;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPVizPackage.ARTIFACT_SOURCE__ARTIFACT, oldArtifact, artifact));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public ArtifactChain getSourceChain()
  {
    return sourceChain;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSourceChain(ArtifactChain newSourceChain, NotificationChain msgs)
  {
    ArtifactChain oldSourceChain = sourceChain;
    sourceChain = newSourceChain;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SPVizPackage.ARTIFACT_SOURCE__SOURCE_CHAIN, oldSourceChain, newSourceChain);
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
  public void setSourceChain(ArtifactChain newSourceChain)
  {
    if (newSourceChain != sourceChain)
    {
      NotificationChain msgs = null;
      if (sourceChain != null)
        msgs = ((InternalEObject)sourceChain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SPVizPackage.ARTIFACT_SOURCE__SOURCE_CHAIN, null, msgs);
      if (newSourceChain != null)
        msgs = ((InternalEObject)newSourceChain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SPVizPackage.ARTIFACT_SOURCE__SOURCE_CHAIN, null, msgs);
      msgs = basicSetSourceChain(newSourceChain, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, SPVizPackage.ARTIFACT_SOURCE__SOURCE_CHAIN, newSourceChain, newSourceChain));
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
      case SPVizPackage.ARTIFACT_SOURCE__SOURCE_CHAIN:
        return basicSetSourceChain(null, msgs);
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
      case SPVizPackage.ARTIFACT_SOURCE__ARTIFACT:
        if (resolve) return getArtifact();
        return basicGetArtifact();
      case SPVizPackage.ARTIFACT_SOURCE__SOURCE_CHAIN:
        return getSourceChain();
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
      case SPVizPackage.ARTIFACT_SOURCE__ARTIFACT:
        setArtifact((Artifact)newValue);
        return;
      case SPVizPackage.ARTIFACT_SOURCE__SOURCE_CHAIN:
        setSourceChain((ArtifactChain)newValue);
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
      case SPVizPackage.ARTIFACT_SOURCE__ARTIFACT:
        setArtifact((Artifact)null);
        return;
      case SPVizPackage.ARTIFACT_SOURCE__SOURCE_CHAIN:
        setSourceChain((ArtifactChain)null);
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
      case SPVizPackage.ARTIFACT_SOURCE__ARTIFACT:
        return artifact != null;
      case SPVizPackage.ARTIFACT_SOURCE__SOURCE_CHAIN:
        return sourceChain != null;
    }
    return super.eIsSet(featureID);
  }

} //ArtifactSourceImpl