/**
 */
package com.wellnr.bashDSL.util;

import com.wellnr.bashDSL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.wellnr.bashDSL.BashDSLPackage
 * @generated
 */
public class BashDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static BashDSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BashDSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = BashDSLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BashDSLSwitch<Adapter> modelSwitch =
    new BashDSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseDomainmodel(Domainmodel object)
      {
        return createDomainmodelAdapter();
      }
      @Override
      public Adapter caseScript(Script object)
      {
        return createScriptAdapter();
      }
      @Override
      public Adapter caseDescription(Description object)
      {
        return createDescriptionAdapter();
      }
      @Override
      public Adapter caseAbstractArgument(AbstractArgument object)
      {
        return createAbstractArgumentAdapter();
      }
      @Override
      public Adapter caseArgument(Argument object)
      {
        return createArgumentAdapter();
      }
      @Override
      public Adapter caseOptionalArgument(OptionalArgument object)
      {
        return createOptionalArgumentAdapter();
      }
      @Override
      public Adapter caseEnvironmentVariable(EnvironmentVariable object)
      {
        return createEnvironmentVariableAdapter();
      }
      @Override
      public Adapter caseFunction(Function object)
      {
        return createFunctionAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link com.wellnr.bashDSL.Domainmodel <em>Domainmodel</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wellnr.bashDSL.Domainmodel
   * @generated
   */
  public Adapter createDomainmodelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wellnr.bashDSL.Script <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wellnr.bashDSL.Script
   * @generated
   */
  public Adapter createScriptAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wellnr.bashDSL.Description <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wellnr.bashDSL.Description
   * @generated
   */
  public Adapter createDescriptionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wellnr.bashDSL.AbstractArgument <em>Abstract Argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wellnr.bashDSL.AbstractArgument
   * @generated
   */
  public Adapter createAbstractArgumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wellnr.bashDSL.Argument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wellnr.bashDSL.Argument
   * @generated
   */
  public Adapter createArgumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wellnr.bashDSL.OptionalArgument <em>Optional Argument</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wellnr.bashDSL.OptionalArgument
   * @generated
   */
  public Adapter createOptionalArgumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wellnr.bashDSL.EnvironmentVariable <em>Environment Variable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wellnr.bashDSL.EnvironmentVariable
   * @generated
   */
  public Adapter createEnvironmentVariableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link com.wellnr.bashDSL.Function <em>Function</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see com.wellnr.bashDSL.Function
   * @generated
   */
  public Adapter createFunctionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //BashDSLAdapterFactory
