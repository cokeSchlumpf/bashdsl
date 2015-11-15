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
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAINMODEL__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Domainmodel</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOMAINMODEL_FEATURE_COUNT = 1;

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
   * The feature id for the '<em><b>Arguments</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__ARGUMENTS = 3;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__CODE = 4;

  /**
   * The number of structural features of the '<em>Script</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link com.wellnr.bashDSL.impl.ArgumentImpl <em>Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.wellnr.bashDSL.impl.ArgumentImpl
   * @see com.wellnr.bashDSL.impl.BashDSLPackageImpl#getArgument()
   * @generated
   */
  int ARGUMENT = 2;

  /**
   * The feature id for the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__OPTIONAL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__NAME = 1;

  /**
   * The feature id for the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__DEFAULT = 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT__DESCRIPTION = 3;

  /**
   * The number of structural features of the '<em>Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_FEATURE_COUNT = 4;


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
   * Returns the meta object for class '{@link com.wellnr.bashDSL.Argument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument</em>'.
   * @see com.wellnr.bashDSL.Argument
   * @generated
   */
  EClass getArgument();

  /**
   * Returns the meta object for the attribute '{@link com.wellnr.bashDSL.Argument#isOptional <em>Optional</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Optional</em>'.
   * @see com.wellnr.bashDSL.Argument#isOptional()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Optional();

  /**
   * Returns the meta object for the attribute '{@link com.wellnr.bashDSL.Argument#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.wellnr.bashDSL.Argument#getName()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Name();

  /**
   * Returns the meta object for the attribute '{@link com.wellnr.bashDSL.Argument#getDefault <em>Default</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Default</em>'.
   * @see com.wellnr.bashDSL.Argument#getDefault()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Default();

  /**
   * Returns the meta object for the attribute '{@link com.wellnr.bashDSL.Argument#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see com.wellnr.bashDSL.Argument#getDescription()
   * @see #getArgument()
   * @generated
   */
  EAttribute getArgument_Description();

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
     * The meta object literal for the '<em><b>Arguments</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCRIPT__ARGUMENTS = eINSTANCE.getScript_Arguments();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SCRIPT__CODE = eINSTANCE.getScript_Code();

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
     * The meta object literal for the '<em><b>Optional</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__OPTIONAL = eINSTANCE.getArgument_Optional();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__NAME = eINSTANCE.getArgument_Name();

    /**
     * The meta object literal for the '<em><b>Default</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__DEFAULT = eINSTANCE.getArgument_Default();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT__DESCRIPTION = eINSTANCE.getArgument_Description();

  }

} //BashDSLPackage
