/**
 */
package com.wellnr.bashDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domainmodel</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.wellnr.bashDSL.Domainmodel#getReadmeTitle <em>Readme Title</em>}</li>
 *   <li>{@link com.wellnr.bashDSL.Domainmodel#getReadmeIntro <em>Readme Intro</em>}</li>
 *   <li>{@link com.wellnr.bashDSL.Domainmodel#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see com.wellnr.bashDSL.BashDSLPackage#getDomainmodel()
 * @model
 * @generated
 */
public interface Domainmodel extends EObject
{
  /**
   * Returns the value of the '<em><b>Readme Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Readme Title</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Readme Title</em>' attribute.
   * @see #setReadmeTitle(String)
   * @see com.wellnr.bashDSL.BashDSLPackage#getDomainmodel_ReadmeTitle()
   * @model
   * @generated
   */
  String getReadmeTitle();

  /**
   * Sets the value of the '{@link com.wellnr.bashDSL.Domainmodel#getReadmeTitle <em>Readme Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Readme Title</em>' attribute.
   * @see #getReadmeTitle()
   * @generated
   */
  void setReadmeTitle(String value);

  /**
   * Returns the value of the '<em><b>Readme Intro</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Readme Intro</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Readme Intro</em>' attribute.
   * @see #setReadmeIntro(String)
   * @see com.wellnr.bashDSL.BashDSLPackage#getDomainmodel_ReadmeIntro()
   * @model
   * @generated
   */
  String getReadmeIntro();

  /**
   * Sets the value of the '{@link com.wellnr.bashDSL.Domainmodel#getReadmeIntro <em>Readme Intro</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Readme Intro</em>' attribute.
   * @see #getReadmeIntro()
   * @generated
   */
  void setReadmeIntro(String value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link com.wellnr.bashDSL.Script}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see com.wellnr.bashDSL.BashDSLPackage#getDomainmodel_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Script> getElements();

} // Domainmodel
