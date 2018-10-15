/**
 */
package com.wellnr.bashDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.wellnr.bashDSL.BashDSLFactory
 * @model kind="package"
 * @generated
 */
public interface BashDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "bashDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.wellnr.com/BashDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "bashDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BashDSLPackage eINSTANCE = com.wellnr.bashDSL.impl.BashDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link com.wellnr.bashDSL.impl.DomainmodelImpl <em>Domainmodel</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.wellnr.bashDSL.impl.DomainmodelImpl
   * @see com.wellnr.bashDSL.impl.BashDSLPackageImpl#getDomainmodel()
   * @generated
   */
  int DOMAINMODEL = 0;

  /**
   * The feature id for the '<em><b>Readme Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAINMODEL__README_TITLE = 0;

  /**
   * The feature id for the '<em><b>Readme Intro</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAINMODEL__README_INTRO = 1;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAINMODEL__ELEMENTS = 2;

  /**
   * The number of structural features of the '<em>Domainmodel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAINMODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.wellnr.bashDSL.impl.ScriptImpl <em>Script</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.wellnr.bashDSL.impl.ScriptImpl
   * @see com.wellnr.bashDSL.impl.BashDSLPackageImpl#getScript()
   * @generated
   */
  int SCRIPT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__NAME = 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__DESCRIPTION = 1;

  /**
   * The feature id for the '<em><b>Copyright</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__COPYRIGHT = 2;

  /**
   * The feature id for the '<em><b>Long Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__LONG_DESCRIPTION = 3;

  /**
   * The feature id for the '<em><b>Variables</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__VARIABLES = 4;

  /**
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__ARGUMENTS = 5;

  /**
   * The feature id for the '<em><b>Opt Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__OPT_ARGUMENTS = 6;

  /**
   * The feature id for the '<em><b>Functions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__FUNCTIONS = 7;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__CODE = 8;

  /**
   * The number of structural features of the '<em>Script</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link com.wellnr.bashDSL.impl.DescriptionImpl <em>Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.wellnr.bashDSL.impl.DescriptionImpl
   * @see com.wellnr.bashDSL.impl.BashDSLPackageImpl#getDescription()
   * @generated
   */
  int DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION__VALUE = 0;

  /**
   * The number of structural features of the '<em>Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.wellnr.bashDSL.impl.AbstractArgumentImpl <em>Abstract Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.wellnr.bashDSL.impl.AbstractArgumentImpl
   * @see com.wellnr.bashDSL.impl.BashDSLPackageImpl#getAbstractArgument()
   * @generated
   */
  int ABSTRACT_ARGUMENT = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ARGUMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Remaining</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ARGUMENT__REMAINING = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ARGUMENT__DESCRIPTION = 2;

  /**
   * The number of structural features of the '<em>Abstract Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ARGUMENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.wellnr.bashDSL.impl.ArgumentImpl <em>Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.wellnr.bashDSL.impl.ArgumentImpl
   * @see com.wellnr.bashDSL.impl.BashDSLPackageImpl#getArgument()
   * @generated
   */
  int ARGUMENT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__NAME = ABSTRACT_ARGUMENT__NAME;

  /**
   * The feature id for the '<em><b>Remaining</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__REMAINING = ABSTRACT_ARGUMENT__REMAINING;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__DESCRIPTION = ABSTRACT_ARGUMENT__DESCRIPTION;

  /**
   * The number of structural features of the '<em>Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_FEATURE_COUNT = ABSTRACT_ARGUMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.wellnr.bashDSL.impl.OptionalArgumentImpl <em>Optional Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.wellnr.bashDSL.impl.OptionalArgumentImpl
   * @see com.wellnr.bashDSL.impl.BashDSLPackageImpl#getOptionalArgument()
   * @generated
   */
  int OPTIONAL_ARGUMENT = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_ARGUMENT__NAME = ABSTRACT_ARGUMENT__NAME;

  /**
   * The feature id for the '<em><b>Remaining</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_ARGUMENT__REMAINING = ABSTRACT_ARGUMENT__REMAINING;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_ARGUMENT__DESCRIPTION = ABSTRACT_ARGUMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Dynamic Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_ARGUMENT__DYNAMIC_DEFAULT = ABSTRACT_ARGUMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_ARGUMENT__DEFAULT = ABSTRACT_ARGUMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Is Boolean</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_ARGUMENT__IS_BOOLEAN = ABSTRACT_ARGUMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Optional Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int OPTIONAL_ARGUMENT_FEATURE_COUNT = ABSTRACT_ARGUMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link com.wellnr.bashDSL.impl.EnvironmentVariableImpl <em>Environment Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.wellnr.bashDSL.impl.EnvironmentVariableImpl
   * @see com.wellnr.bashDSL.impl.BashDSLPackageImpl#getEnvironmentVariable()
   * @generated
   */
  int ENVIRONMENT_VARIABLE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_VARIABLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Dynamic Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_VARIABLE__DYNAMIC_DEFAULT = 1;

  /**
   * The feature id for the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_VARIABLE__DEFAULT = 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_VARIABLE__DESCRIPTION = 3;

  /**
   * The number of structural features of the '<em>Environment Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENVIRONMENT_VARIABLE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link com.wellnr.bashDSL.impl.FunctionImpl <em>Function</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.wellnr.bashDSL.impl.FunctionImpl
   * @see com.wellnr.bashDSL.impl.BashDSLPackageImpl#getFunction()
   * @generated
   */
  int FUNCTION = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION__CODE = 1;

  /**
   * The number of structural features of the '<em>Function</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FUNCTION_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link com.wellnr.bashDSL.Domainmodel <em>Domainmodel</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Domainmodel</em>'.
   * @see com.wellnr.bashDSL.Domainmodel
   * @generated
   */
  EClass getDomainmodel();

  /**
   * Returns the meta object for the attribute '{@link com.wellnr.bashDSL.Domainmodel#getReadmeTitle <em>Readme Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Readme Title</em>'.
   * @see com.wellnr.bashDSL.Domainmodel#getReadmeTitle()
   * @see #getDomainmodel()
   * @generated
   */
  EAttribute getDomainmodel_ReadmeTitle();

  /**
   * Returns the meta object for the attribute '{@link com.wellnr.bashDSL.Domainmodel#getReadmeIntro <em>Readme Intro</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Readme Intro</em>'.
   * @see com.wellnr.bashDSL.Domainmodel#getReadmeIntro()
   * @see #getDomainmodel()
   * @generated
   */
  EAttribute getDomainmodel_ReadmeIntro();

  /**
   * Returns the meta object for the containment reference list '{@link com.wellnr.bashDSL.Domainmodel#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see com.wellnr.bashDSL.Domainmodel#getElements()
   * @see #getDomainmodel()
   * @generated
   */
  EReference getDomainmodel_Elements();

  /**
   * Returns the meta object for class '{@link com.wellnr.bashDSL.Script <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Script</em>'.
   * @see com.wellnr.bashDSL.Script
   * @generated
   */
  EClass getScript();

  /**
   * Returns the meta object for the attribute '{@link com.wellnr.bashDSL.Script#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.wellnr.bashDSL.Script#getName()
   * @see #getScript()
   * @generated
   */
  EAttribute getScript_Name();

  /**
   * Returns the meta object for the attribute '{@link com.wellnr.bashDSL.Script#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.wellnr.bashDSL.Script#getDescription()
   * @see #getScript()
   * @generated
   */
  EAttribute getScript_Description();

  /**
   * Returns the meta object for the attribute '{@link com.wellnr.bashDSL.Script#getCopyright <em>Copyright</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Copyright</em>'.
   * @see com.wellnr.bashDSL.Script#getCopyright()
   * @see #getScript()
   * @generated
   */
  EAttribute getScript_Copyright();

  /**
   * Returns the meta object for the containment reference '{@link com.wellnr.bashDSL.Script#getLongDescription <em>Long Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Long Description</em>'.
   * @see com.wellnr.bashDSL.Script#getLongDescription()
   * @see #getScript()
   * @generated
   */
  EReference getScript_LongDescription();

  /**
   * Returns the meta object for the containment reference list '{@link com.wellnr.bashDSL.Script#getVariables <em>Variables</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables</em>'.
   * @see com.wellnr.bashDSL.Script#getVariables()
   * @see #getScript()
   * @generated
   */
  EReference getScript_Variables();

  /**
   * Returns the meta object for the containment reference list '{@link com.wellnr.bashDSL.Script#getArguments <em>Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Arguments</em>'.
   * @see com.wellnr.bashDSL.Script#getArguments()
   * @see #getScript()
   * @generated
   */
  EReference getScript_Arguments();

  /**
   * Returns the meta object for the containment reference list '{@link com.wellnr.bashDSL.Script#getOptArguments <em>Opt Arguments</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Opt Arguments</em>'.
   * @see com.wellnr.bashDSL.Script#getOptArguments()
   * @see #getScript()
   * @generated
   */
  EReference getScript_OptArguments();

  /**
   * Returns the meta object for the containment reference list '{@link com.wellnr.bashDSL.Script#getFunctions <em>Functions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Functions</em>'.
   * @see com.wellnr.bashDSL.Script#getFunctions()
   * @see #getScript()
   * @generated
   */
  EReference getScript_Functions();

  /**
   * Returns the meta object for the attribute '{@link com.wellnr.bashDSL.Script#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see com.wellnr.bashDSL.Script#getCode()
   * @see #getScript()
   * @generated
   */
  EAttribute getScript_Code();

  /**
   * Returns the meta object for class '{@link com.wellnr.bashDSL.Description <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Description</em>'.
   * @see com.wellnr.bashDSL.Description
   * @generated
   */
  EClass getDescription();

  /**
   * Returns the meta object for the attribute '{@link com.wellnr.bashDSL.Description#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see com.wellnr.bashDSL.Description#getValue()
   * @see #getDescription()
   * @generated
   */
  EAttribute getDescription_Value();

  /**
   * Returns the meta object for class '{@link com.wellnr.bashDSL.AbstractArgument <em>Abstract Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Argument</em>'.
   * @see com.wellnr.bashDSL.AbstractArgument
   * @generated
   */
  EClass getAbstractArgument();

  /**
   * Returns the meta object for the attribute '{@link com.wellnr.bashDSL.AbstractArgument#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.wellnr.bashDSL.AbstractArgument#getName()
   * @see #getAbstractArgument()
   * @generated
   */
  EAttribute getAbstractArgument_Name();

  /**
   * Returns the meta object for the attribute '{@link com.wellnr.bashDSL.AbstractArgument#isRemaining <em>Remaining</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Remaining</em>'.
   * @see com.wellnr.bashDSL.AbstractArgument#isRemaining()
   * @see #getAbstractArgument()
   * @generated
   */
  EAttribute getAbstractArgument_Remaining();

  /**
   * Returns the meta object for the attribute '{@link com.wellnr.bashDSL.AbstractArgument#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.wellnr.bashDSL.AbstractArgument#getDescription()
   * @see #getAbstractArgument()
   * @generated
   */
  EAttribute getAbstractArgument_Description();

  /**
   * Returns the meta object for class '{@link com.wellnr.bashDSL.Argument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument</em>'.
   * @see com.wellnr.bashDSL.Argument
   * @generated
   */
  EClass getArgument();

  /**
   * Returns the meta object for class '{@link com.wellnr.bashDSL.OptionalArgument <em>Optional Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Optional Argument</em>'.
   * @see com.wellnr.bashDSL.OptionalArgument
   * @generated
   */
  EClass getOptionalArgument();

  /**
   * Returns the meta object for the attribute '{@link com.wellnr.bashDSL.OptionalArgument#isDynamicDefault <em>Dynamic Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dynamic Default</em>'.
   * @see com.wellnr.bashDSL.OptionalArgument#isDynamicDefault()
   * @see #getOptionalArgument()
   * @generated
   */
  EAttribute getOptionalArgument_DynamicDefault();

  /**
   * Returns the meta object for the attribute '{@link com.wellnr.bashDSL.OptionalArgument#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default</em>'.
   * @see com.wellnr.bashDSL.OptionalArgument#getDefault()
   * @see #getOptionalArgument()
   * @generated
   */
  EAttribute getOptionalArgument_Default();

  /**
   * Returns the meta object for the attribute '{@link com.wellnr.bashDSL.OptionalArgument#isIsBoolean <em>Is Boolean</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Is Boolean</em>'.
   * @see com.wellnr.bashDSL.OptionalArgument#isIsBoolean()
   * @see #getOptionalArgument()
   * @generated
   */
  EAttribute getOptionalArgument_IsBoolean();

  /**
   * Returns the meta object for class '{@link com.wellnr.bashDSL.EnvironmentVariable <em>Environment Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Environment Variable</em>'.
   * @see com.wellnr.bashDSL.EnvironmentVariable
   * @generated
   */
  EClass getEnvironmentVariable();

  /**
   * Returns the meta object for the attribute '{@link com.wellnr.bashDSL.EnvironmentVariable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.wellnr.bashDSL.EnvironmentVariable#getName()
   * @see #getEnvironmentVariable()
   * @generated
   */
  EAttribute getEnvironmentVariable_Name();

  /**
   * Returns the meta object for the attribute '{@link com.wellnr.bashDSL.EnvironmentVariable#isDynamicDefault <em>Dynamic Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dynamic Default</em>'.
   * @see com.wellnr.bashDSL.EnvironmentVariable#isDynamicDefault()
   * @see #getEnvironmentVariable()
   * @generated
   */
  EAttribute getEnvironmentVariable_DynamicDefault();

  /**
   * Returns the meta object for the attribute '{@link com.wellnr.bashDSL.EnvironmentVariable#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default</em>'.
   * @see com.wellnr.bashDSL.EnvironmentVariable#getDefault()
   * @see #getEnvironmentVariable()
   * @generated
   */
  EAttribute getEnvironmentVariable_Default();

  /**
   * Returns the meta object for the attribute '{@link com.wellnr.bashDSL.EnvironmentVariable#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.wellnr.bashDSL.EnvironmentVariable#getDescription()
   * @see #getEnvironmentVariable()
   * @generated
   */
  EAttribute getEnvironmentVariable_Description();

  /**
   * Returns the meta object for class '{@link com.wellnr.bashDSL.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Function</em>'.
   * @see com.wellnr.bashDSL.Function
   * @generated
   */
  EClass getFunction();

  /**
   * Returns the meta object for the attribute '{@link com.wellnr.bashDSL.Function#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.wellnr.bashDSL.Function#getName()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Name();

  /**
   * Returns the meta object for the attribute '{@link com.wellnr.bashDSL.Function#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see com.wellnr.bashDSL.Function#getCode()
   * @see #getFunction()
   * @generated
   */
  EAttribute getFunction_Code();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  BashDSLFactory getBashDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.wellnr.bashDSL.impl.DomainmodelImpl <em>Domainmodel</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.wellnr.bashDSL.impl.DomainmodelImpl
     * @see com.wellnr.bashDSL.impl.BashDSLPackageImpl#getDomainmodel()
     * @generated
     */
    EClass DOMAINMODEL = eINSTANCE.getDomainmodel();

    /**
     * The meta object literal for the '<em><b>Readme Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAINMODEL__README_TITLE = eINSTANCE.getDomainmodel_ReadmeTitle();

    /**
     * The meta object literal for the '<em><b>Readme Intro</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOMAINMODEL__README_INTRO = eINSTANCE.getDomainmodel_ReadmeIntro();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOMAINMODEL__ELEMENTS = eINSTANCE.getDomainmodel_Elements();

    /**
     * The meta object literal for the '{@link com.wellnr.bashDSL.impl.ScriptImpl <em>Script</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.wellnr.bashDSL.impl.ScriptImpl
     * @see com.wellnr.bashDSL.impl.BashDSLPackageImpl#getScript()
     * @generated
     */
    EClass SCRIPT = eINSTANCE.getScript();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCRIPT__NAME = eINSTANCE.getScript_Name();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCRIPT__DESCRIPTION = eINSTANCE.getScript_Description();

    /**
     * The meta object literal for the '<em><b>Copyright</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCRIPT__COPYRIGHT = eINSTANCE.getScript_Copyright();

    /**
     * The meta object literal for the '<em><b>Long Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCRIPT__LONG_DESCRIPTION = eINSTANCE.getScript_LongDescription();

    /**
     * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCRIPT__VARIABLES = eINSTANCE.getScript_Variables();

    /**
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCRIPT__ARGUMENTS = eINSTANCE.getScript_Arguments();

    /**
     * The meta object literal for the '<em><b>Opt Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCRIPT__OPT_ARGUMENTS = eINSTANCE.getScript_OptArguments();

    /**
     * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCRIPT__FUNCTIONS = eINSTANCE.getScript_Functions();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCRIPT__CODE = eINSTANCE.getScript_Code();

    /**
     * The meta object literal for the '{@link com.wellnr.bashDSL.impl.DescriptionImpl <em>Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.wellnr.bashDSL.impl.DescriptionImpl
     * @see com.wellnr.bashDSL.impl.BashDSLPackageImpl#getDescription()
     * @generated
     */
    EClass DESCRIPTION = eINSTANCE.getDescription();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESCRIPTION__VALUE = eINSTANCE.getDescription_Value();

    /**
     * The meta object literal for the '{@link com.wellnr.bashDSL.impl.AbstractArgumentImpl <em>Abstract Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.wellnr.bashDSL.impl.AbstractArgumentImpl
     * @see com.wellnr.bashDSL.impl.BashDSLPackageImpl#getAbstractArgument()
     * @generated
     */
    EClass ABSTRACT_ARGUMENT = eINSTANCE.getAbstractArgument();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_ARGUMENT__NAME = eINSTANCE.getAbstractArgument_Name();

    /**
     * The meta object literal for the '<em><b>Remaining</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_ARGUMENT__REMAINING = eINSTANCE.getAbstractArgument_Remaining();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_ARGUMENT__DESCRIPTION = eINSTANCE.getAbstractArgument_Description();

    /**
     * The meta object literal for the '{@link com.wellnr.bashDSL.impl.ArgumentImpl <em>Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.wellnr.bashDSL.impl.ArgumentImpl
     * @see com.wellnr.bashDSL.impl.BashDSLPackageImpl#getArgument()
     * @generated
     */
    EClass ARGUMENT = eINSTANCE.getArgument();

    /**
     * The meta object literal for the '{@link com.wellnr.bashDSL.impl.OptionalArgumentImpl <em>Optional Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.wellnr.bashDSL.impl.OptionalArgumentImpl
     * @see com.wellnr.bashDSL.impl.BashDSLPackageImpl#getOptionalArgument()
     * @generated
     */
    EClass OPTIONAL_ARGUMENT = eINSTANCE.getOptionalArgument();

    /**
     * The meta object literal for the '<em><b>Dynamic Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPTIONAL_ARGUMENT__DYNAMIC_DEFAULT = eINSTANCE.getOptionalArgument_DynamicDefault();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPTIONAL_ARGUMENT__DEFAULT = eINSTANCE.getOptionalArgument_Default();

    /**
     * The meta object literal for the '<em><b>Is Boolean</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute OPTIONAL_ARGUMENT__IS_BOOLEAN = eINSTANCE.getOptionalArgument_IsBoolean();

    /**
     * The meta object literal for the '{@link com.wellnr.bashDSL.impl.EnvironmentVariableImpl <em>Environment Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.wellnr.bashDSL.impl.EnvironmentVariableImpl
     * @see com.wellnr.bashDSL.impl.BashDSLPackageImpl#getEnvironmentVariable()
     * @generated
     */
    EClass ENVIRONMENT_VARIABLE = eINSTANCE.getEnvironmentVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENVIRONMENT_VARIABLE__NAME = eINSTANCE.getEnvironmentVariable_Name();

    /**
     * The meta object literal for the '<em><b>Dynamic Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENVIRONMENT_VARIABLE__DYNAMIC_DEFAULT = eINSTANCE.getEnvironmentVariable_DynamicDefault();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENVIRONMENT_VARIABLE__DEFAULT = eINSTANCE.getEnvironmentVariable_Default();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENVIRONMENT_VARIABLE__DESCRIPTION = eINSTANCE.getEnvironmentVariable_Description();

    /**
     * The meta object literal for the '{@link com.wellnr.bashDSL.impl.FunctionImpl <em>Function</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.wellnr.bashDSL.impl.FunctionImpl
     * @see com.wellnr.bashDSL.impl.BashDSLPackageImpl#getFunction()
     * @generated
     */
    EClass FUNCTION = eINSTANCE.getFunction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__NAME = eINSTANCE.getFunction_Name();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FUNCTION__CODE = eINSTANCE.getFunction_Code();

  }

} //BashDSLPackage
