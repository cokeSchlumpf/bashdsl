/**
 */
package com.wellnr.bashDSL.impl;

import com.wellnr.bashDSL.BashDSLPackage;
import com.wellnr.bashDSL.OptionalArgument;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Optional Argument</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.wellnr.bashDSL.impl.OptionalArgumentImpl#isDynamicDefault <em>Dynamic Default</em>}</li>
 *   <li>{@link com.wellnr.bashDSL.impl.OptionalArgumentImpl#getDefault <em>Default</em>}</li>
 *   <li>{@link com.wellnr.bashDSL.impl.OptionalArgumentImpl#isIsBoolean <em>Is Boolean</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionalArgumentImpl extends AbstractArgumentImpl implements OptionalArgument
{
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
   * The default value of the '{@link #isIsBoolean() <em>Is Boolean</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsBoolean()
   * @generated
   * @ordered
   */
  protected static final boolean IS_BOOLEAN_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isIsBoolean() <em>Is Boolean</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isIsBoolean()
   * @generated
   * @ordered
   */
  protected boolean isBoolean = IS_BOOLEAN_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OptionalArgumentImpl()
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
    return BashDSLPackage.Literals.OPTIONAL_ARGUMENT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, BashDSLPackage.OPTIONAL_ARGUMENT__DYNAMIC_DEFAULT, oldDynamicDefault, dynamicDefault));
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
      eNotify(new ENotificationImpl(this, Notification.SET, BashDSLPackage.OPTIONAL_ARGUMENT__DEFAULT, oldDefault, default_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isIsBoolean()
  {
    return isBoolean;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIsBoolean(boolean newIsBoolean)
  {
    boolean oldIsBoolean = isBoolean;
    isBoolean = newIsBoolean;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BashDSLPackage.OPTIONAL_ARGUMENT__IS_BOOLEAN, oldIsBoolean, isBoolean));
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
      case BashDSLPackage.OPTIONAL_ARGUMENT__DYNAMIC_DEFAULT:
        return isDynamicDefault();
      case BashDSLPackage.OPTIONAL_ARGUMENT__DEFAULT:
        return getDefault();
      case BashDSLPackage.OPTIONAL_ARGUMENT__IS_BOOLEAN:
        return isIsBoolean();
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
      case BashDSLPackage.OPTIONAL_ARGUMENT__DYNAMIC_DEFAULT:
        setDynamicDefault((Boolean)newValue);
        return;
      case BashDSLPackage.OPTIONAL_ARGUMENT__DEFAULT:
        setDefault((String)newValue);
        return;
      case BashDSLPackage.OPTIONAL_ARGUMENT__IS_BOOLEAN:
        setIsBoolean((Boolean)newValue);
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
      case BashDSLPackage.OPTIONAL_ARGUMENT__DYNAMIC_DEFAULT:
        setDynamicDefault(DYNAMIC_DEFAULT_EDEFAULT);
        return;
      case BashDSLPackage.OPTIONAL_ARGUMENT__DEFAULT:
        setDefault(DEFAULT_EDEFAULT);
        return;
      case BashDSLPackage.OPTIONAL_ARGUMENT__IS_BOOLEAN:
        setIsBoolean(IS_BOOLEAN_EDEFAULT);
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
      case BashDSLPackage.OPTIONAL_ARGUMENT__DYNAMIC_DEFAULT:
        return dynamicDefault != DYNAMIC_DEFAULT_EDEFAULT;
      case BashDSLPackage.OPTIONAL_ARGUMENT__DEFAULT:
        return DEFAULT_EDEFAULT == null ? default_ != null : !DEFAULT_EDEFAULT.equals(default_);
      case BashDSLPackage.OPTIONAL_ARGUMENT__IS_BOOLEAN:
        return isBoolean != IS_BOOLEAN_EDEFAULT;
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
    result.append(" (dynamicDefault: ");
    result.append(dynamicDefault);
    result.append(", default: ");
    result.append(default_);
    result.append(", isBoolean: ");
    result.append(isBoolean);
    result.append(')');
    return result.toString();
  }

} //OptionalArgumentImpl
