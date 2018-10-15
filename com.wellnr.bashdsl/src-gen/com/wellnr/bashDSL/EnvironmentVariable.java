/**
 */
package com.wellnr.bashDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.wellnr.bashDSL.EnvironmentVariable#getName <em>Name</em>}</li>
 *   <li>{@link com.wellnr.bashDSL.EnvironmentVariable#isDynamicDefault <em>Dynamic Default</em>}</li>
 *   <li>{@link com.wellnr.bashDSL.EnvironmentVariable#getDefault <em>Default</em>}</li>
 *   <li>{@link com.wellnr.bashDSL.EnvironmentVariable#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see com.wellnr.bashDSL.BashDSLPackage#getEnvironmentVariable()
 * @model
 * @generated
 */
public interface EnvironmentVariable extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see com.wellnr.bashDSL.BashDSLPackage#getEnvironmentVariable_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.wellnr.bashDSL.EnvironmentVariable#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Dynamic Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dynamic Default</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dynamic Default</em>' attribute.
   * @see #setDynamicDefault(boolean)
   * @see com.wellnr.bashDSL.BashDSLPackage#getEnvironmentVariable_DynamicDefault()
   * @model
   * @generated
   */
  boolean isDynamicDefault();

  /**
   * Sets the value of the '{@link com.wellnr.bashDSL.EnvironmentVariable#isDynamicDefault <em>Dynamic Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dynamic Default</em>' attribute.
   * @see #isDynamicDefault()
   * @generated
   */
  void setDynamicDefault(boolean value);

  /**
   * Returns the value of the '<em><b>Default</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default</em>' attribute.
   * @see #setDefault(String)
   * @see com.wellnr.bashDSL.BashDSLPackage#getEnvironmentVariable_Default()
   * @model
   * @generated
   */
  String getDefault();

  /**
   * Sets the value of the '{@link com.wellnr.bashDSL.EnvironmentVariable#getDefault <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default</em>' attribute.
   * @see #getDefault()
   * @generated
   */
  void setDefault(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see com.wellnr.bashDSL.BashDSLPackage#getEnvironmentVariable_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link com.wellnr.bashDSL.EnvironmentVariable#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // EnvironmentVariable
