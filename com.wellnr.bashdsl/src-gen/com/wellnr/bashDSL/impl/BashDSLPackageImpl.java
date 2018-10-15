/**
 */
package com.wellnr.bashDSL.impl;

import com.wellnr.bashDSL.AbstractArgument;
import com.wellnr.bashDSL.Argument;
import com.wellnr.bashDSL.BashDSLFactory;
import com.wellnr.bashDSL.BashDSLPackage;
import com.wellnr.bashDSL.Description;
import com.wellnr.bashDSL.Domainmodel;
import com.wellnr.bashDSL.EnvironmentVariable;
import com.wellnr.bashDSL.Function;
import com.wellnr.bashDSL.OptionalArgument;
import com.wellnr.bashDSL.Script;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BashDSLPackageImpl extends EPackageImpl implements BashDSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass domainmodelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scriptEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass descriptionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractArgumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass argumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass optionalArgumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass environmentVariableEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass functionEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.wellnr.bashDSL.BashDSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private BashDSLPackageImpl()
  {
    super(eNS_URI, BashDSLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link BashDSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static BashDSLPackage init()
  {
    if (isInited) return (BashDSLPackage)EPackage.Registry.INSTANCE.getEPackage(BashDSLPackage.eNS_URI);

    // Obtain or create and register package
    BashDSLPackageImpl theBashDSLPackage = (BashDSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BashDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BashDSLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theBashDSLPackage.createPackageContents();

    // Initialize created meta-data
    theBashDSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theBashDSLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(BashDSLPackage.eNS_URI, theBashDSLPackage);
    return theBashDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDomainmodel()
  {
    return domainmodelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomainmodel_ReadmeTitle()
  {
    return (EAttribute)domainmodelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDomainmodel_ReadmeIntro()
  {
    return (EAttribute)domainmodelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDomainmodel_Elements()
  {
    return (EReference)domainmodelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScript()
  {
    return scriptEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScript_Name()
  {
    return (EAttribute)scriptEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScript_Description()
  {
    return (EAttribute)scriptEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScript_Copyright()
  {
    return (EAttribute)scriptEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScript_LongDescription()
  {
    return (EReference)scriptEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScript_Variables()
  {
    return (EReference)scriptEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScript_Arguments()
  {
    return (EReference)scriptEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScript_OptArguments()
  {
    return (EReference)scriptEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScript_Functions()
  {
    return (EReference)scriptEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getScript_Code()
  {
    return (EAttribute)scriptEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDescription()
  {
    return descriptionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDescription_Value()
  {
    return (EAttribute)descriptionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractArgument()
  {
    return abstractArgumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractArgument_Name()
  {
    return (EAttribute)abstractArgumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractArgument_Remaining()
  {
    return (EAttribute)abstractArgumentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractArgument_Description()
  {
    return (EAttribute)abstractArgumentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArgument()
  {
    return argumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOptionalArgument()
  {
    return optionalArgumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOptionalArgument_DynamicDefault()
  {
    return (EAttribute)optionalArgumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOptionalArgument_Default()
  {
    return (EAttribute)optionalArgumentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOptionalArgument_IsBoolean()
  {
    return (EAttribute)optionalArgumentEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEnvironmentVariable()
  {
    return environmentVariableEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnvironmentVariable_Name()
  {
    return (EAttribute)environmentVariableEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnvironmentVariable_DynamicDefault()
  {
    return (EAttribute)environmentVariableEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnvironmentVariable_Default()
  {
    return (EAttribute)environmentVariableEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEnvironmentVariable_Description()
  {
    return (EAttribute)environmentVariableEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFunction()
  {
    return functionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunction_Name()
  {
    return (EAttribute)functionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFunction_Code()
  {
    return (EAttribute)functionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BashDSLFactory getBashDSLFactory()
  {
    return (BashDSLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    domainmodelEClass = createEClass(DOMAINMODEL);
    createEAttribute(domainmodelEClass, DOMAINMODEL__README_TITLE);
    createEAttribute(domainmodelEClass, DOMAINMODEL__README_INTRO);
    createEReference(domainmodelEClass, DOMAINMODEL__ELEMENTS);

    scriptEClass = createEClass(SCRIPT);
    createEAttribute(scriptEClass, SCRIPT__NAME);
    createEAttribute(scriptEClass, SCRIPT__DESCRIPTION);
    createEAttribute(scriptEClass, SCRIPT__COPYRIGHT);
    createEReference(scriptEClass, SCRIPT__LONG_DESCRIPTION);
    createEReference(scriptEClass, SCRIPT__VARIABLES);
    createEReference(scriptEClass, SCRIPT__ARGUMENTS);
    createEReference(scriptEClass, SCRIPT__OPT_ARGUMENTS);
    createEReference(scriptEClass, SCRIPT__FUNCTIONS);
    createEAttribute(scriptEClass, SCRIPT__CODE);

    descriptionEClass = createEClass(DESCRIPTION);
    createEAttribute(descriptionEClass, DESCRIPTION__VALUE);

    abstractArgumentEClass = createEClass(ABSTRACT_ARGUMENT);
    createEAttribute(abstractArgumentEClass, ABSTRACT_ARGUMENT__NAME);
    createEAttribute(abstractArgumentEClass, ABSTRACT_ARGUMENT__REMAINING);
    createEAttribute(abstractArgumentEClass, ABSTRACT_ARGUMENT__DESCRIPTION);

    argumentEClass = createEClass(ARGUMENT);

    optionalArgumentEClass = createEClass(OPTIONAL_ARGUMENT);
    createEAttribute(optionalArgumentEClass, OPTIONAL_ARGUMENT__DYNAMIC_DEFAULT);
    createEAttribute(optionalArgumentEClass, OPTIONAL_ARGUMENT__DEFAULT);
    createEAttribute(optionalArgumentEClass, OPTIONAL_ARGUMENT__IS_BOOLEAN);

    environmentVariableEClass = createEClass(ENVIRONMENT_VARIABLE);
    createEAttribute(environmentVariableEClass, ENVIRONMENT_VARIABLE__NAME);
    createEAttribute(environmentVariableEClass, ENVIRONMENT_VARIABLE__DYNAMIC_DEFAULT);
    createEAttribute(environmentVariableEClass, ENVIRONMENT_VARIABLE__DEFAULT);
    createEAttribute(environmentVariableEClass, ENVIRONMENT_VARIABLE__DESCRIPTION);

    functionEClass = createEClass(FUNCTION);
    createEAttribute(functionEClass, FUNCTION__NAME);
    createEAttribute(functionEClass, FUNCTION__CODE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    argumentEClass.getESuperTypes().add(this.getAbstractArgument());
    optionalArgumentEClass.getESuperTypes().add(this.getAbstractArgument());

    // Initialize classes and features; add operations and parameters
    initEClass(domainmodelEClass, Domainmodel.class, "Domainmodel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDomainmodel_ReadmeTitle(), ecorePackage.getEString(), "readmeTitle", null, 0, 1, Domainmodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDomainmodel_ReadmeIntro(), ecorePackage.getEString(), "readmeIntro", null, 0, 1, Domainmodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDomainmodel_Elements(), this.getScript(), null, "elements", null, 0, -1, Domainmodel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(scriptEClass, Script.class, "Script", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getScript_Name(), ecorePackage.getEString(), "name", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getScript_Description(), ecorePackage.getEString(), "description", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getScript_Copyright(), ecorePackage.getEString(), "copyright", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScript_LongDescription(), this.getDescription(), null, "longDescription", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScript_Variables(), this.getEnvironmentVariable(), null, "variables", null, 0, -1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScript_Arguments(), this.getArgument(), null, "arguments", null, 0, -1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScript_OptArguments(), this.getOptionalArgument(), null, "optArguments", null, 0, -1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getScript_Functions(), this.getFunction(), null, "functions", null, 0, -1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getScript_Code(), ecorePackage.getEString(), "code", null, 0, 1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(descriptionEClass, Description.class, "Description", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDescription_Value(), ecorePackage.getEString(), "value", null, 0, 1, Description.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractArgumentEClass, AbstractArgument.class, "AbstractArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractArgument_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractArgument_Remaining(), ecorePackage.getEBoolean(), "remaining", null, 0, 1, AbstractArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAbstractArgument_Description(), ecorePackage.getEString(), "description", null, 0, 1, AbstractArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(argumentEClass, Argument.class, "Argument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(optionalArgumentEClass, OptionalArgument.class, "OptionalArgument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOptionalArgument_DynamicDefault(), ecorePackage.getEBoolean(), "dynamicDefault", null, 0, 1, OptionalArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOptionalArgument_Default(), ecorePackage.getEString(), "default", null, 0, 1, OptionalArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getOptionalArgument_IsBoolean(), ecorePackage.getEBoolean(), "isBoolean", null, 0, 1, OptionalArgument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(environmentVariableEClass, EnvironmentVariable.class, "EnvironmentVariable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEnvironmentVariable_Name(), ecorePackage.getEString(), "name", null, 0, 1, EnvironmentVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnvironmentVariable_DynamicDefault(), ecorePackage.getEBoolean(), "dynamicDefault", null, 0, 1, EnvironmentVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnvironmentVariable_Default(), ecorePackage.getEString(), "default", null, 0, 1, EnvironmentVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEnvironmentVariable_Description(), ecorePackage.getEString(), "description", null, 0, 1, EnvironmentVariable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(functionEClass, Function.class, "Function", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFunction_Name(), ecorePackage.getEString(), "name", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFunction_Code(), ecorePackage.getEString(), "code", null, 0, 1, Function.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //BashDSLPackageImpl
