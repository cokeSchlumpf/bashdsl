/**
 */
package com.wellnr.bashDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.wellnr.bashDSL.AbstractArgument#getName <em>Name</em>}</li>
 *   <li>{@link com.wellnr.bashDSL.AbstractArgument#isRemaining <em>Remaining</em>}</li>
 *   <li>{@link com.wellnr.bashDSL.AbstractArgument#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see com.wellnr.bashDSL.BashDSLPackage#getAbstractArgument()
 * @model
 * @generated
 */
public interface AbstractArgument extends EObject
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
   * @see com.wellnr.bashDSL.BashDSLPackage#getAbstractArgument_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.wellnr.bashDSL.AbstractArgument#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Remaining</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Remaining</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Remaining</em>' attribute.
   * @see #setRemaining(boolean)
   * @see com.wellnr.bashDSL.BashDSLPackage#getAbstractArgument_Remaining()
   * @model
   * @generated
   */
  boolean isRemaining();

  /**
   * Sets the value of the '{@link com.wellnr.bashDSL.AbstractArgument#isRemaining <em>Remaining</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Remaining</em>' attribute.
   * @see #isRemaining()
   * @generated
   */
  void setRemaining(boolean value);

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
   * @see com.wellnr.bashDSL.BashDSLPackage#getAbstractArgument_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link com.wellnr.bashDSL.AbstractArgument#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

} // AbstractArgument
