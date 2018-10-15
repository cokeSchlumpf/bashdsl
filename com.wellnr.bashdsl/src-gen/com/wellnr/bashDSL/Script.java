/**
 */
package com.wellnr.bashDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Script</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.wellnr.bashDSL.Script#getName <em>Name</em>}</li>
 *   <li>{@link com.wellnr.bashDSL.Script#getDescription <em>Description</em>}</li>
 *   <li>{@link com.wellnr.bashDSL.Script#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link com.wellnr.bashDSL.Script#getLongDescription <em>Long Description</em>}</li>
 *   <li>{@link com.wellnr.bashDSL.Script#getVariables <em>Variables</em>}</li>
 *   <li>{@link com.wellnr.bashDSL.Script#getArguments <em>Arguments</em>}</li>
 *   <li>{@link com.wellnr.bashDSL.Script#getOptArguments <em>Opt Arguments</em>}</li>
 *   <li>{@link com.wellnr.bashDSL.Script#getFunctions <em>Functions</em>}</li>
 *   <li>{@link com.wellnr.bashDSL.Script#getCode <em>Code</em>}</li>
 * </ul>
 *
 * @see com.wellnr.bashDSL.BashDSLPackage#getScript()
 * @model
 * @generated
 */
public interface Script extends EObject
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
   * @see com.wellnr.bashDSL.BashDSLPackage#getScript_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link com.wellnr.bashDSL.Script#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
   * @see com.wellnr.bashDSL.BashDSLPackage#getScript_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link com.wellnr.bashDSL.Script#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Copyright</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Copyright</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Copyright</em>' attribute.
   * @see #setCopyright(String)
   * @see com.wellnr.bashDSL.BashDSLPackage#getScript_Copyright()
   * @model
   * @generated
   */
  String getCopyright();

  /**
   * Sets the value of the '{@link com.wellnr.bashDSL.Script#getCopyright <em>Copyright</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Copyright</em>' attribute.
   * @see #getCopyright()
   * @generated
   */
  void setCopyright(String value);

  /**
   * Returns the value of the '<em><b>Long Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Long Description</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Long Description</em>' containment reference.
   * @see #setLongDescription(Description)
   * @see com.wellnr.bashDSL.BashDSLPackage#getScript_LongDescription()
   * @model containment="true"
   * @generated
   */
  Description getLongDescription();

  /**
   * Sets the value of the '{@link com.wellnr.bashDSL.Script#getLongDescription <em>Long Description</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Long Description</em>' containment reference.
   * @see #getLongDescription()
   * @generated
   */
  void setLongDescription(Description value);

  /**
   * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
   * The list contents are of type {@link com.wellnr.bashDSL.EnvironmentVariable}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables</em>' containment reference list.
   * @see com.wellnr.bashDSL.BashDSLPackage#getScript_Variables()
   * @model containment="true"
   * @generated
   */
  EList<EnvironmentVariable> getVariables();

  /**
   * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
   * The list contents are of type {@link com.wellnr.bashDSL.Argument}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Arguments</em>' containment reference list.
   * @see com.wellnr.bashDSL.BashDSLPackage#getScript_Arguments()
   * @model containment="true"
   * @generated
   */
  EList<Argument> getArguments();

  /**
   * Returns the value of the '<em><b>Opt Arguments</b></em>' containment reference list.
   * The list contents are of type {@link com.wellnr.bashDSL.OptionalArgument}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opt Arguments</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opt Arguments</em>' containment reference list.
   * @see com.wellnr.bashDSL.BashDSLPackage#getScript_OptArguments()
   * @model containment="true"
   * @generated
   */
  EList<OptionalArgument> getOptArguments();

  /**
   * Returns the value of the '<em><b>Functions</b></em>' containment reference list.
   * The list contents are of type {@link com.wellnr.bashDSL.Function}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Functions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Functions</em>' containment reference list.
   * @see com.wellnr.bashDSL.BashDSLPackage#getScript_Functions()
   * @model containment="true"
   * @generated
   */
  EList<Function> getFunctions();

  /**
   * Returns the value of the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Code</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Code</em>' attribute.
   * @see #setCode(String)
   * @see com.wellnr.bashDSL.BashDSLPackage#getScript_Code()
   * @model
   * @generated
   */
  String getCode();

  /**
   * Sets the value of the '{@link com.wellnr.bashDSL.Script#getCode <em>Code</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Code</em>' attribute.
   * @see #getCode()
   * @generated
   */
  void setCode(String value);

} // Script
