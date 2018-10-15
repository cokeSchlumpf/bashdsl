/**
 */
package com.wellnr.bashDSL.impl;

import com.wellnr.bashDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BashDSLFactoryImpl extends EFactoryImpl implements BashDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static BashDSLFactory init()
  {
    try
    {
      BashDSLFactory theBashDSLFactory = (BashDSLFactory)EPackage.Registry.INSTANCE.getEFactory(BashDSLPackage.eNS_URI);
      if (theBashDSLFactory != null)
      {
        return theBashDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new BashDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BashDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case BashDSLPackage.DOMAINMODEL: return createDomainmodel();
      case BashDSLPackage.SCRIPT: return createScript();
      case BashDSLPackage.DESCRIPTION: return createDescription();
      case BashDSLPackage.ABSTRACT_ARGUMENT: return createAbstractArgument();
      case BashDSLPackage.ARGUMENT: return createArgument();
      case BashDSLPackage.OPTIONAL_ARGUMENT: return createOptionalArgument();
      case BashDSLPackage.ENVIRONMENT_VARIABLE: return createEnvironmentVariable();
      case BashDSLPackage.FUNCTION: return createFunction();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Domainmodel createDomainmodel()
  {
    DomainmodelImpl domainmodel = new DomainmodelImpl();
    return domainmodel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Script createScript()
  {
    ScriptImpl script = new ScriptImpl();
    return script;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Description createDescription()
  {
    DescriptionImpl description = new DescriptionImpl();
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractArgument createAbstractArgument()
  {
    AbstractArgumentImpl abstractArgument = new AbstractArgumentImpl();
    return abstractArgument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Argument createArgument()
  {
    ArgumentImpl argument = new ArgumentImpl();
    return argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OptionalArgument createOptionalArgument()
  {
    OptionalArgumentImpl optionalArgument = new OptionalArgumentImpl();
    return optionalArgument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EnvironmentVariable createEnvironmentVariable()
  {
    EnvironmentVariableImpl environmentVariable = new EnvironmentVariableImpl();
    return environmentVariable;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Function createFunction()
  {
    FunctionImpl function = new FunctionImpl();
    return function;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BashDSLPackage getBashDSLPackage()
  {
    return (BashDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static BashDSLPackage getPackage()
  {
    return BashDSLPackage.eINSTANCE;
  }

} //BashDSLFactoryImpl
