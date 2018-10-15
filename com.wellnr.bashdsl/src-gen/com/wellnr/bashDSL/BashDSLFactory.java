/**
 */
package com.wellnr.bashDSL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.wellnr.bashDSL.BashDSLPackage
 * @generated
 */
public interface BashDSLFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  BashDSLFactory eINSTANCE = com.wellnr.bashDSL.impl.BashDSLFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Domainmodel</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Domainmodel</em>'.
   * @generated
   */
  Domainmodel createDomainmodel();

  /**
   * Returns a new object of class '<em>Script</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Script</em>'.
   * @generated
   */
  Script createScript();

  /**
   * Returns a new object of class '<em>Description</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Description</em>'.
   * @generated
   */
  Description createDescription();

  /**
   * Returns a new object of class '<em>Abstract Argument</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Abstract Argument</em>'.
   * @generated
   */
  AbstractArgument createAbstractArgument();

  /**
   * Returns a new object of class '<em>Argument</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Argument</em>'.
   * @generated
   */
  Argument createArgument();

  /**
   * Returns a new object of class '<em>Optional Argument</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Optional Argument</em>'.
   * @generated
   */
  OptionalArgument createOptionalArgument();

  /**
   * Returns a new object of class '<em>Environment Variable</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Environment Variable</em>'.
   * @generated
   */
  EnvironmentVariable createEnvironmentVariable();

  /**
   * Returns a new object of class '<em>Function</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Function</em>'.
   * @generated
   */
  Function createFunction();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  BashDSLPackage getBashDSLPackage();

} //BashDSLFactory
