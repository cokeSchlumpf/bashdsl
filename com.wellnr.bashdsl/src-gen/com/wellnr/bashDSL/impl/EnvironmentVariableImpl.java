/**
 */
package com.wellnr.bashDSL.impl;

import com.wellnr.bashDSL.BashDSLPackage;
import com.wellnr.bashDSL.EnvironmentVariable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Environment Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.wellnr.bashDSL.impl.EnvironmentVariableImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.wellnr.bashDSL.impl.EnvironmentVariableImpl#isDynamicDefault <em>Dynamic Default</em>}</li>
 *   <li>{@link com.wellnr.bashDSL.impl.EnvironmentVariableImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link com.wellnr.bashDSL.impl.EnvironmentVariableImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvironmentVariableImpl extends MinimalEObjectImpl.Container implements EnvironmentVariable
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
   * The default value of the '{@link #isDynamicDefault() <em>Dynamic Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDynamicDefault()
   * @generated
   * @ordered
   */
  protected static final boolean DYNAMIC_DEFAULT_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isDynamicDefault() <em>Dynamic Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isDynamicDefault()
   * @generated
   * @ordered
   */
  protected boolean dynamicDefault = DYNAMIC_DEFAULT_EDEFAULT;

  /**
   * The default value of the '{@link #getDefault() <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefault()
   * @generated
   * @ordered
   */
  protected static final String DEFAULT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDefault() <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDefault()
   * @generated
   * @ordered
   */
  protected String default_ = DEFAULT_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EnvironmentVariableImpl()
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
    return BashDSLPackage.Literals.ENVIRONMENT_VARIABLE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, BashDSLPackage.ENVIRONMENT_VARIABLE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDynamicDefault()
  {
    return dynamicDefault;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDynamicDefault(boolean newDynamicDefault)
  {
    boolean oldDynamicDefault = dynamicDefault;
    dynamicDefault = newDynamicDefault;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BashDSLPackage.ENVIRONMENT_VARIABLE__DYNAMIC_DEFAULT, oldDynamicDefault, dynamicDefault));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDefault()
  {
    return default_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDefault(String newDefault)
  {
    String oldDefault = default_;
    default_ = newDefault;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BashDSLPackage.ENVIRONMENT_VARIABLE__DEFAULT, oldDefault, default_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, BashDSLPackage.ENVIRONMENT_VARIABLE__DESCRIPTION, oldDescription, description));
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
      case BashDSLPackage.ENVIRONMENT_VARIABLE__NAME:
        return getName();
      case BashDSLPackage.ENVIRONMENT_VARIABLE__DYNAMIC_DEFAULT:
        return isDynamicDefault();
      case BashDSLPackage.ENVIRONMENT_VARIABLE__DEFAULT:
        return getDefault();
      case BashDSLPackage.ENVIRONMENT_VARIABLE__DESCRIPTION:
        return getDescription();
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
      case BashDSLPackage.ENVIRONMENT_VARIABLE__NAME:
        setName((String)newValue);
        return;
      case BashDSLPackage.ENVIRONMENT_VARIABLE__DYNAMIC_DEFAULT:
        setDynamicDefault((Boolean)newValue);
        return;
      case BashDSLPackage.ENVIRONMENT_VARIABLE__DEFAULT:
        setDefault((String)newValue);
        return;
      case BashDSLPackage.ENVIRONMENT_VARIABLE__DESCRIPTION:
        setDescription((String)newValue);
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
      case BashDSLPackage.ENVIRONMENT_VARIABLE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case BashDSLPackage.ENVIRONMENT_VARIABLE__DYNAMIC_DEFAULT:
        setDynamicDefault(DYNAMIC_DEFAULT_EDEFAULT);
        return;
      case BashDSLPackage.ENVIRONMENT_VARIABLE__DEFAULT:
        setDefault(DEFAULT_EDEFAULT);
        return;
      case BashDSLPackage.ENVIRONMENT_VARIABLE__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
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
      case BashDSLPackage.ENVIRONMENT_VARIABLE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case BashDSLPackage.ENVIRONMENT_VARIABLE__DYNAMIC_DEFAULT:
        return dynamicDefault != DYNAMIC_DEFAULT_EDEFAULT;
      case BashDSLPackage.ENVIRONMENT_VARIABLE__DEFAULT:
        return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
      case BashDSLPackage.ENVIRONMENT_VARIABLE__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
    result.append(", dynamicDefault: ");
    result.append(dynamicDefault);
    result.append(", default: ");
    result.append(default_);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //EnvironmentVariableImpl
