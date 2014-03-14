/**
 */
package m4jdsl.util;

import m4jdsl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see m4jdsl.M4jdslPackage
 * @generated
 */
public class M4jdslAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static M4jdslPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public M4jdslAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = M4jdslPackage.eINSTANCE;
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
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
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
    protected M4jdslSwitch<Adapter> modelSwitch =
        new M4jdslSwitch<Adapter>() {
            @Override
            public Adapter caseWorkloadIntensity(WorkloadIntensity object) {
                return createWorkloadIntensityAdapter();
            }
            @Override
            public Adapter caseWorkloadModel(WorkloadModel object) {
                return createWorkloadModelAdapter();
            }
            @Override
            public Adapter caseApplicationModel(ApplicationModel object) {
                return createApplicationModelAdapter();
            }
            @Override
            public Adapter caseBehaviorMix(BehaviorMix object) {
                return createBehaviorMixAdapter();
            }
            @Override
            public Adapter caseRelativeFrequency(RelativeFrequency object) {
                return createRelativeFrequencyAdapter();
            }
            @Override
            public Adapter caseBehaviorModel(BehaviorModel object) {
                return createBehaviorModelAdapter();
            }
            @Override
            public Adapter caseTransition(Transition object) {
                return createTransitionAdapter();
            }
            @Override
            public Adapter caseMarkovState(MarkovState object) {
                return createMarkovStateAdapter();
            }
            @Override
            public Adapter caseService(Service object) {
                return createServiceAdapter();
            }
            @Override
            public Adapter caseApplicationState(ApplicationState object) {
                return createApplicationStateAdapter();
            }
            @Override
            public Adapter caseHTTPRequest(HTTPRequest object) {
                return createHTTPRequestAdapter();
            }
            @Override
            public Adapter caseJavaRequest(JavaRequest object) {
                return createJavaRequestAdapter();
            }
            @Override
            public Adapter caseRequest(Request object) {
                return createRequestAdapter();
            }
            @Override
            public Adapter caseProtocolState(ProtocolState object) {
                return createProtocolStateAdapter();
            }
            @Override
            public Adapter caseProtocolTransition(ProtocolTransition object) {
                return createProtocolTransitionAdapter();
            }
            @Override
            public Adapter caseProtocolLayerEFSM(ProtocolLayerEFSM object) {
                return createProtocolLayerEFSMAdapter();
            }
            @Override
            public Adapter caseSessionLayerEFSM(SessionLayerEFSM object) {
                return createSessionLayerEFSMAdapter();
            }
            @Override
            public Adapter caseConstantWorkloadIntensity(ConstantWorkloadIntensity object) {
                return createConstantWorkloadIntensityAdapter();
            }
            @Override
            public Adapter caseApplicationTransition(ApplicationTransition object) {
                return createApplicationTransitionAdapter();
            }
            @Override
            public Adapter caseNormallyDistributedThinkTime(NormallyDistributedThinkTime object) {
                return createNormallyDistributedThinkTimeAdapter();
            }
            @Override
            public Adapter caseProperty(Property object) {
                return createPropertyAdapter();
            }
            @Override
            public Adapter caseParameter(Parameter object) {
                return createParameterAdapter();
            }
            @Override
            public Adapter caseAssertion(Assertion object) {
                return createAssertionAdapter();
            }
            @Override
            public Adapter caseThinkTime(ThinkTime object) {
                return createThinkTimeAdapter();
            }
            @Override
            public Adapter caseApplicationExitState(ApplicationExitState object) {
                return createApplicationExitStateAdapter();
            }
            @Override
            public Adapter caseSessionLayerEFSMState(SessionLayerEFSMState object) {
                return createSessionLayerEFSMStateAdapter();
            }
            @Override
            public Adapter caseBehaviorModelExitState(BehaviorModelExitState object) {
                return createBehaviorModelExitStateAdapter();
            }
            @Override
            public Adapter caseBehaviorModelState(BehaviorModelState object) {
                return createBehaviorModelStateAdapter();
            }
            @Override
            public Adapter caseProtocolExitState(ProtocolExitState object) {
                return createProtocolExitStateAdapter();
            }
            @Override
            public Adapter caseProtocolLayerEFSMState(ProtocolLayerEFSMState object) {
                return createProtocolLayerEFSMStateAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
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
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link m4jdsl.WorkloadIntensity <em>Workload Intensity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see m4jdsl.WorkloadIntensity
     * @generated
     */
    public Adapter createWorkloadIntensityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link m4jdsl.WorkloadModel <em>Workload Model</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see m4jdsl.WorkloadModel
     * @generated
     */
    public Adapter createWorkloadModelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link m4jdsl.ApplicationModel <em>Application Model</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see m4jdsl.ApplicationModel
     * @generated
     */
    public Adapter createApplicationModelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link m4jdsl.BehaviorMix <em>Behavior Mix</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see m4jdsl.BehaviorMix
     * @generated
     */
    public Adapter createBehaviorMixAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link m4jdsl.RelativeFrequency <em>Relative Frequency</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see m4jdsl.RelativeFrequency
     * @generated
     */
    public Adapter createRelativeFrequencyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link m4jdsl.BehaviorModel <em>Behavior Model</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see m4jdsl.BehaviorModel
     * @generated
     */
    public Adapter createBehaviorModelAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link m4jdsl.Transition <em>Transition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see m4jdsl.Transition
     * @generated
     */
    public Adapter createTransitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link m4jdsl.MarkovState <em>Markov State</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see m4jdsl.MarkovState
     * @generated
     */
    public Adapter createMarkovStateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link m4jdsl.Service <em>Service</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see m4jdsl.Service
     * @generated
     */
    public Adapter createServiceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link m4jdsl.ApplicationState <em>Application State</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see m4jdsl.ApplicationState
     * @generated
     */
    public Adapter createApplicationStateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link m4jdsl.HTTPRequest <em>HTTP Request</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see m4jdsl.HTTPRequest
     * @generated
     */
    public Adapter createHTTPRequestAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link m4jdsl.JavaRequest <em>Java Request</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see m4jdsl.JavaRequest
     * @generated
     */
    public Adapter createJavaRequestAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link m4jdsl.Request <em>Request</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see m4jdsl.Request
     * @generated
     */
    public Adapter createRequestAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link m4jdsl.ProtocolState <em>Protocol State</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see m4jdsl.ProtocolState
     * @generated
     */
    public Adapter createProtocolStateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link m4jdsl.ProtocolTransition <em>Protocol Transition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see m4jdsl.ProtocolTransition
     * @generated
     */
    public Adapter createProtocolTransitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link m4jdsl.ProtocolLayerEFSM <em>Protocol Layer EFSM</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see m4jdsl.ProtocolLayerEFSM
     * @generated
     */
    public Adapter createProtocolLayerEFSMAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link m4jdsl.SessionLayerEFSM <em>Session Layer EFSM</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see m4jdsl.SessionLayerEFSM
     * @generated
     */
    public Adapter createSessionLayerEFSMAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link m4jdsl.ConstantWorkloadIntensity <em>Constant Workload Intensity</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see m4jdsl.ConstantWorkloadIntensity
     * @generated
     */
    public Adapter createConstantWorkloadIntensityAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link m4jdsl.ApplicationTransition <em>Application Transition</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see m4jdsl.ApplicationTransition
     * @generated
     */
    public Adapter createApplicationTransitionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link m4jdsl.NormallyDistributedThinkTime <em>Normally Distributed Think Time</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see m4jdsl.NormallyDistributedThinkTime
     * @generated
     */
    public Adapter createNormallyDistributedThinkTimeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link m4jdsl.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see m4jdsl.Property
     * @generated
     */
    public Adapter createPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link m4jdsl.Parameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see m4jdsl.Parameter
     * @generated
     */
    public Adapter createParameterAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link m4jdsl.Assertion <em>Assertion</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see m4jdsl.Assertion
     * @generated
     */
    public Adapter createAssertionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link m4jdsl.ThinkTime <em>Think Time</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see m4jdsl.ThinkTime
     * @generated
     */
    public Adapter createThinkTimeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link m4jdsl.ApplicationExitState <em>Application Exit State</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see m4jdsl.ApplicationExitState
     * @generated
     */
    public Adapter createApplicationExitStateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link m4jdsl.SessionLayerEFSMState <em>Session Layer EFSM State</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see m4jdsl.SessionLayerEFSMState
     * @generated
     */
    public Adapter createSessionLayerEFSMStateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link m4jdsl.BehaviorModelExitState <em>Behavior Model Exit State</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see m4jdsl.BehaviorModelExitState
     * @generated
     */
    public Adapter createBehaviorModelExitStateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link m4jdsl.BehaviorModelState <em>Behavior Model State</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see m4jdsl.BehaviorModelState
     * @generated
     */
    public Adapter createBehaviorModelStateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link m4jdsl.ProtocolExitState <em>Protocol Exit State</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see m4jdsl.ProtocolExitState
     * @generated
     */
    public Adapter createProtocolExitStateAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link m4jdsl.ProtocolLayerEFSMState <em>Protocol Layer EFSM State</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see m4jdsl.ProtocolLayerEFSMState
     * @generated
     */
    public Adapter createProtocolLayerEFSMStateAdapter() {
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
    public Adapter createEObjectAdapter() {
        return null;
    }

} //M4jdslAdapterFactory
