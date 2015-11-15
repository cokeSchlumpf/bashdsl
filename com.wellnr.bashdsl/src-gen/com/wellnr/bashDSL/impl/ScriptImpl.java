/**
 */
package com.wellnr.bashDSL.impl;

import com.wellnr.bashDSL.Argument;
import com.wellnr.bashDSL.BashDSLPackage;
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
 * An implementation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.wellnr.bashDSL.impl.ScriptImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.wellnr.bashDSL.impl.ScriptImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.wellnr.bashDSL.impl.ScriptImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link com.wellnr.bashDSL.impl.ScriptImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link com.wellnr.bashDSL.impl.ScriptImpl#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScriptImpl extends MinimalEObjectImpl.Container implements Script
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The default value of the '{@link #getCopyright() <em>Copyright</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCopyright()
   * @generated
   * @ordered
   */
  protected static final String COPYRIGHT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCopyright()
   * @generated
   * @ordered
   */
  protected String copyright = COPYRIGHT_EDEFAULT;

  /**
   * The cached value of the '{@link #getArguments() <em>Arguments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArguments()
   * @generated
   * @ordered
   */
  protected EList<Argument> arguments;

  /**
   * The default value of the '{@link #getCode() <em>Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCode()
   * @generated
   * @ordered
   */
  protected static final String CODE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCode() <em>Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCode()
   * @generated
   * @ordered
   */
  protected String code = CODE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScriptImpl()
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
    return BashDSLPackage.Literals.SCRIPT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BashDSLPackage.SCRIPT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BashDSLPackage.SCRIPT__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCopyright()
  {
    return copyright;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCopyright(String newCopyright)
  {
    String oldCopyright = copyright;
    copyright = newCopyright;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BashDSLPackage.SCRIPT__COPYRIGHT, oldCopyright, copyright));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Argument> getArguments()
  {
    if (arguments == null)
    {
      arguments = new EObjectContainmentEList<Argument>(Argument.class, this, BashDSLPackage.SCRIPT__ARGUMENTS);
    }
    return arguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCode()
  {
    return code;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCode(String newCode)
  {
    String oldCode = code;
    code = newCode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BashDSLPackage.SCRIPT__CODE, oldCode, code));
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
      case BashDSLPackage.SCRIPT__ARGUMENTS:
        return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
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
      case BashDSLPackage.SCRIPT__NAME:
        return getName();
      case BashDSLPackage.SCRIPT__DESCRIPTION:
        return getDescription();
      case BashDSLPackage.SCRIPT__COPYRIGHT:
        return getCopyright();
      case BashDSLPackage.SCRIPT__ARGUMENTS:
        return getArguments();
      case BashDSLPackage.SCRIPT__CODE:
        return getCode();
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
      case BashDSLPackage.SCRIPT__NAME:
        setName((String)newValue);
        return;
      case BashDSLPackage.SCRIPT__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case BashDSLPackage.SCRIPT__COPYRIGHT:
        setCopyright((String)newValue);
        return;
      case BashDSLPackage.SCRIPT__ARGUMENTS:
        getArguments().clear();
        getArguments().addAll((Collection<? extends Argument>)newValue);
        return;
      case BashDSLPackage.SCRIPT__CODE:
        setCode((String)newValue);
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
      case BashDSLPackage.SCRIPT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BashDSLPackage.SCRIPT__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case BashDSLPackage.SCRIPT__COPYRIGHT:
        setCopyright(COPYRIGHT_EDEFAULT);
        return;
      case BashDSLPackage.SCRIPT__ARGUMENTS:
        getArguments().clear();
        return;
      case BashDSLPackage.SCRIPT__CODE:
        setCode(CODE_EDEFAULT);
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
      case BashDSLPackage.SCRIPT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BashDSLPackage.SCRIPT__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case BashDSLPackage.SCRIPT__COPYRIGHT:
        return COPYRIGHT_EDEFAULT == null ? copyright != null : !COPYRIGHT_EDEFAULT.equals(copyright);
      case BashDSLPackage.SCRIPT__ARGUMENTS:
        return arguments != null && !arguments.isEmpty();
      case BashDSLPackage.SCRIPT__CODE:
        return CODE_EDEFAULT == null ? code != null : !CODE_EDEFAULT.equals(code);
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
    result.append(" (name: ");
    result.append(name);
    result.append(", description: ");
    result.append(description);
    result.append(", copyright: ");
    result.append(copyright);
    result.append(", code: ");
    result.append(code);
    result.append(')');
    return result.toString();
  }

} //ScriptImpl
