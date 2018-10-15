/**
 */
package com.wellnr.bashDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Optional Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.wellnr.bashDSL.OptionalArgument#isDynamicDefault <em>Dynamic Default</em>}</li>
 *   <li>{@link com.wellnr.bashDSL.OptionalArgument#getDefault <em>Default</em>}</li>
 *   <li>{@link com.wellnr.bashDSL.OptionalArgument#isIsBoolean <em>Is Boolean</em>}</li>
 * </ul>
 *
 * @see com.wellnr.bashDSL.BashDSLPackage#getOptionalArgument()
 * @model
 * @generated
 */
public interface OptionalArgument extends AbstractArgument
{
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
   * @see com.wellnr.bashDSL.BashDSLPackage#getOptionalArgument_DynamicDefault()
   * @model
   * @generated
   */
  boolean isDynamicDefault();

  /**
   * Sets the value of the '{@link com.wellnr.bashDSL.OptionalArgument#isDynamicDefault <em>Dynamic Default</em>}' attribute.
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
   * @see com.wellnr.bashDSL.BashDSLPackage#getOptionalArgument_Default()
   * @model
   * @generated
   */
  String getDefault();

  /**
   * Sets the value of the '{@link com.wellnr.bashDSL.OptionalArgument#getDefault <em>Default</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default</em>' attribute.
   * @see #getDefault()
   * @generated
   */
  void setDefault(String value);

  /**
   * Returns the value of the '<em><b>Is Boolean</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is Boolean</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is Boolean</em>' attribute.
   * @see #setIsBoolean(boolean)
   * @see com.wellnr.bashDSL.BashDSLPackage#getOptionalArgument_IsBoolean()
   * @model
   * @generated
   */
  boolean isIsBoolean();

  /**
   * Sets the value of the '{@link com.wellnr.bashDSL.OptionalArgument#isIsBoolean <em>Is Boolean</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is Boolean</em>' attribute.
   * @see #isIsBoolean()
   * @generated
   */
  void setIsBoolean(boolean value);

} // OptionalArgument
