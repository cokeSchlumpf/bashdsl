/**
 */
package com.wellnr.bashDSL.impl;

import com.wellnr.bashDSL.BashDSLPackage;
import com.wellnr.bashDSL.Domainmodel;
import com.wellnr.bashDSL.Script;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domainmodel</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.wellnr.bashDSL.impl.DomainmodelImpl#getReadmeTitle <em>Readme Title</em>}</li>
 *   <li>{@link com.wellnr.bashDSL.impl.DomainmodelImpl#getReadmeIntro <em>Readme Intro</em>}</li>
 *   <li>{@link com.wellnr.bashDSL.impl.DomainmodelImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DomainmodelImpl extends MinimalEObjectImpl.Container implements Domainmodel
{
  /**
   * The default value of the '{@link #getReadmeTitle() <em>Readme Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReadmeTitle()
   * @generated
   * @ordered
   */
  protected static final String README_TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReadmeTitle() <em>Readme Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReadmeTitle()
   * @generated
   * @ordered
   */
  protected String readmeTitle = README_TITLE_EDEFAULT;

  /**
   * The default value of the '{@link #getReadmeIntro() <em>Readme Intro</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReadmeIntro()
   * @generated
   * @ordered
   */
  protected static final String README_INTRO_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReadmeIntro() <em>Readme Intro</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReadmeIntro()
   * @generated
   * @ordered
   */
  protected String readmeIntro = README_INTRO_EDEFAULT;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<Script> elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DomainmodelImpl()
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
    return BashDSLPackage.Literals.DOMAINMODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReadmeTitle()
  {
    return readmeTitle;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReadmeTitle(String newReadmeTitle)
  {
    String oldReadmeTitle = readmeTitle;
    readmeTitle = newReadmeTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BashDSLPackage.DOMAINMODEL__README_TITLE, oldReadmeTitle, readmeTitle));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReadmeIntro()
  {
    return readmeIntro;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReadmeIntro(String newReadmeIntro)
  {
    String oldReadmeIntro = readmeIntro;
    readmeIntro = newReadmeIntro;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BashDSLPackage.DOMAINMODEL__README_INTRO, oldReadmeIntro, readmeIntro));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Script> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<Script>(Script.class, this, BashDSLPackage.DOMAINMODEL__ELEMENTS);
    }
    return elements;
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
      case BashDSLPackage.DOMAINMODEL__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
      case BashDSLPackage.DOMAINMODEL__README_TITLE:
        return getReadmeTitle();
      case BashDSLPackage.DOMAINMODEL__README_INTRO:
        return getReadmeIntro();
      case BashDSLPackage.DOMAINMODEL__ELEMENTS:
        return getElements();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case BashDSLPackage.DOMAINMODEL__README_TITLE:
        setReadmeTitle((String)newValue);
        return;
      case BashDSLPackage.DOMAINMODEL__README_INTRO:
        setReadmeIntro((String)newValue);
        return;
      case BashDSLPackage.DOMAINMODEL__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends Script>)newValue);
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
      case BashDSLPackage.DOMAINMODEL__README_TITLE:
        setReadmeTitle(README_TITLE_EDEFAULT);
        return;
      case BashDSLPackage.DOMAINMODEL__README_INTRO:
        setReadmeIntro(README_INTRO_EDEFAULT);
        return;
      case BashDSLPackage.DOMAINMODEL__ELEMENTS:
        getElements().clear();
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
      case BashDSLPackage.DOMAINMODEL__README_TITLE:
        return README_TITLE_EDEFAULT == null ? readmeTitle != null : !README_TITLE_EDEFAULT.equals(readmeTitle);
      case BashDSLPackage.DOMAINMODEL__README_INTRO:
        return README_INTRO_EDEFAULT == null ? readmeIntro != null : !README_INTRO_EDEFAULT.equals(readmeIntro);
      case BashDSLPackage.DOMAINMODEL__ELEMENTS:
        return elements != null && !elements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (readmeTitle: ");
    result.append(readmeTitle);
    result.append(", readmeIntro: ");
    result.append(readmeIntro);
    result.append(')');
    return result.toString();
  }

} //DomainmodelImpl
