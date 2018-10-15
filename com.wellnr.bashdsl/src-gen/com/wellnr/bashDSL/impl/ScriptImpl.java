/**
 */
package com.wellnr.bashDSL.impl;

import com.wellnr.bashDSL.Argument;
import com.wellnr.bashDSL.BashDSLPackage;
import com.wellnr.bashDSL.Description;
import com.wellnr.bashDSL.EnvironmentVariable;
import com.wellnr.bashDSL.Function;
import com.wellnr.bashDSL.OptionalArgument;
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
 *   <li>{@link com.wellnr.bashDSL.impl.ScriptImpl#getLongDescription <em>Long Description</em>}</li>
 *   <li>{@link com.wellnr.bashDSL.impl.ScriptImpl#getVariables <em>Variables</em>}</li>
 *   <li>{@link com.wellnr.bashDSL.impl.ScriptImpl#getArguments <em>Arguments</em>}</li>
 *   <li>{@link com.wellnr.bashDSL.impl.ScriptImpl#getOptArguments <em>Opt Arguments</em>}</li>
 *   <li>{@link com.wellnr.bashDSL.impl.ScriptImpl#getFunctions <em>Functions</em>}</li>
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
   * The cached value of the '{@link #getLongDescription() <em>Long Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLongDescription()
   * @generated
   * @ordered
   */
  protected Description longDescription;

  /**
   * The cached value of the '{@link #getVariables() <em>Variables</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariables()
   * @generated
   * @ordered
   */
  protected EList<EnvironmentVariable> variables;

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
   * The cached value of the '{@link #getOptArguments() <em>Opt Arguments</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptArguments()
   * @generated
   * @ordered
   */
  protected EList<OptionalArgument> optArguments;

  /**
   * The cached value of the '{@link #getFunctions() <em>Functions</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunctions()
   * @generated
   * @ordered
   */
  protected EList<Function> functions;

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
  public Description getLongDescription()
  {
    return longDescription;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLongDescription(Description newLongDescription, NotificationChain msgs)
  {
    Description oldLongDescription = longDescription;
    longDescription = newLongDescription;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BashDSLPackage.SCRIPT__LONG_DESCRIPTION, oldLongDescription, newLongDescription);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLongDescription(Description newLongDescription)
  {
    if (newLongDescription != longDescription)
    {
      NotificationChain msgs = null;
      if (longDescription != null)
        msgs = ((InternalEObject)longDescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - BashDSLPackage.SCRIPT__LONG_DESCRIPTION, null, msgs);
      if (newLongDescription != null)
        msgs = ((InternalEObject)newLongDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - BashDSLPackage.SCRIPT__LONG_DESCRIPTION, null, msgs);
      msgs = basicSetLongDescription(newLongDescription, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, BashDSLPackage.SCRIPT__LONG_DESCRIPTION, newLongDescription, newLongDescription));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<EnvironmentVariable> getVariables()
  {
    if (variables == null)
    {
      variables = new EObjectContainmentEList<EnvironmentVariable>(EnvironmentVariable.class, this, BashDSLPackage.SCRIPT__VARIABLES);
    }
    return variables;
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
  public EList<OptionalArgument> getOptArguments()
  {
    if (optArguments == null)
    {
      optArguments = new EObjectContainmentEList<OptionalArgument>(OptionalArgument.class, this, BashDSLPackage.SCRIPT__OPT_ARGUMENTS);
    }
    return optArguments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Function> getFunctions()
  {
    if (functions == null)
    {
      functions = new EObjectContainmentEList<Function>(Function.class, this, BashDSLPackage.SCRIPT__FUNCTIONS);
    }
    return functions;
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
      case BashDSLPackage.SCRIPT__LONG_DESCRIPTION:
        return basicSetLongDescription(null, msgs);
      case BashDSLPackage.SCRIPT__VARIABLES:
        return ((InternalEList<?>)getVariables()).basicRemove(otherEnd, msgs);
      case BashDSLPackage.SCRIPT__ARGUMENTS:
        return ((InternalEList<?>)getArguments()).basicRemove(otherEnd, msgs);
      case BashDSLPackage.SCRIPT__OPT_ARGUMENTS:
        return ((InternalEList<?>)getOptArguments()).basicRemove(otherEnd, msgs);
      case BashDSLPackage.SCRIPT__FUNCTIONS:
        return ((InternalEList<?>)getFunctions()).basicRemove(otherEnd, msgs);
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
      case BashDSLPackage.SCRIPT__LONG_DESCRIPTION:
        return getLongDescription();
      case BashDSLPackage.SCRIPT__VARIABLES:
        return getVariables();
      case BashDSLPackage.SCRIPT__ARGUMENTS:
        return getArguments();
      case BashDSLPackage.SCRIPT__OPT_ARGUMENTS:
        return getOptArguments();
      case BashDSLPackage.SCRIPT__FUNCTIONS:
        return getFunctions();
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
      case BashDSLPackage.SCRIPT__LONG_DESCRIPTION:
        setLongDescription((Description)newValue);
        return;
      case BashDSLPackage.SCRIPT__VARIABLES:
        getVariables().clear();
        getVariables().addAll((Collection<? extends EnvironmentVariable>)newValue);
        return;
      case BashDSLPackage.SCRIPT__ARGUMENTS:
        getArguments().clear();
        getArguments().addAll((Collection<? extends Argument>)newValue);
        return;
      case BashDSLPackage.SCRIPT__OPT_ARGUMENTS:
        getOptArguments().clear();
        getOptArguments().addAll((Collection<? extends OptionalArgument>)newValue);
        return;
      case BashDSLPackage.SCRIPT__FUNCTIONS:
        getFunctions().clear();
        getFunctions().addAll((Collection<? extends Function>)newValue);
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
      case BashDSLPackage.SCRIPT__LONG_DESCRIPTION:
        setLongDescription((Description)null);
        return;
      case BashDSLPackage.SCRIPT__VARIABLES:
        getVariables().clear();
        return;
      case BashDSLPackage.SCRIPT__ARGUMENTS:
        getArguments().clear();
        return;
      case BashDSLPackage.SCRIPT__OPT_ARGUMENTS:
        getOptArguments().clear();
        return;
      case BashDSLPackage.SCRIPT__FUNCTIONS:
        getFunctions().clear();
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
      case BashDSLPackage.SCRIPT__LONG_DESCRIPTION:
        return longDescription != null;
      case BashDSLPackage.SCRIPT__VARIABLES:
        return variables != null && !variables.isEmpty();
      case BashDSLPackage.SCRIPT__ARGUMENTS:
        return arguments != null && !arguments.isEmpty();
      case BashDSLPackage.SCRIPT__OPT_ARGUMENTS:
        return optArguments != null && !optArguments.isEmpty();
      case BashDSLPackage.SCRIPT__FUNCTIONS:
        return functions != null && !functions.isEmpty();
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
