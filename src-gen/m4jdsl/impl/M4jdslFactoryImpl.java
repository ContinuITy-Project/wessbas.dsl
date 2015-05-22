/**
 */
package m4jdsl.impl;

import m4jdsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class M4jdslFactoryImpl extends EFactoryImpl implements M4jdslFactory {
    /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static M4jdslFactory init() {
		try {
			M4jdslFactory theM4jdslFactory = (M4jdslFactory)EPackage.Registry.INSTANCE.getEFactory(M4jdslPackage.eNS_URI);
			if (theM4jdslFactory != null) {
				return theM4jdslFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new M4jdslFactoryImpl();
	}

    /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public M4jdslFactoryImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case M4jdslPackage.WORKLOAD_MODEL: return createWorkloadModel();
			case M4jdslPackage.APPLICATION_MODEL: return createApplicationModel();
			case M4jdslPackage.BEHAVIOR_MIX: return createBehaviorMix();
			case M4jdslPackage.RELATIVE_FREQUENCY: return createRelativeFrequency();
			case M4jdslPackage.BEHAVIOR_MODEL: return createBehaviorModel();
			case M4jdslPackage.TRANSITION: return createTransition();
			case M4jdslPackage.MARKOV_STATE: return createMarkovState();
			case M4jdslPackage.SERVICE: return createService();
			case M4jdslPackage.APPLICATION_STATE: return createApplicationState();
			case M4jdslPackage.HTTP_REQUEST: return createHTTPRequest();
			case M4jdslPackage.JAVA_REQUEST: return createJavaRequest();
			case M4jdslPackage.BEAN_SHELL_REQUEST: return createBeanShellRequest();
			case M4jdslPackage.JUNIT_REQUEST: return createJUnitRequest();
			case M4jdslPackage.SOAP_REQUEST: return createSOAPRequest();
			case M4jdslPackage.PROTOCOL_STATE: return createProtocolState();
			case M4jdslPackage.PROTOCOL_TRANSITION: return createProtocolTransition();
			case M4jdslPackage.PROTOCOL_LAYER_EFSM: return createProtocolLayerEFSM();
			case M4jdslPackage.SESSION_LAYER_EFSM: return createSessionLayerEFSM();
			case M4jdslPackage.CONSTANT_WORKLOAD_INTENSITY: return createConstantWorkloadIntensity();
			case M4jdslPackage.APPLICATION_TRANSITION: return createApplicationTransition();
			case M4jdslPackage.NORMALLY_DISTRIBUTED_THINK_TIME: return createNormallyDistributedThinkTime();
			case M4jdslPackage.PROPERTY: return createProperty();
			case M4jdslPackage.PARAMETER: return createParameter();
			case M4jdslPackage.ASSERTION: return createAssertion();
			case M4jdslPackage.APPLICATION_EXIT_STATE: return createApplicationExitState();
			case M4jdslPackage.BEHAVIOR_MODEL_EXIT_STATE: return createBehaviorModelExitState();
			case M4jdslPackage.PROTOCOL_EXIT_STATE: return createProtocolExitState();
			case M4jdslPackage.GUARD_ACTION_PARAMETER: return createGuardActionParameter();
			case M4jdslPackage.GUARD: return createGuard();
			case M4jdslPackage.ACTION: return createAction();
			case M4jdslPackage.GUARD_ACTION_PARAMETER_LIST: return createGuardActionParameterList();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case M4jdslPackage.GUARD_ACTION_PARAMETER_TYPE:
				return createGuardActionParameterTypeFromString(eDataType, initialValue);
			case M4jdslPackage.PARAMETER_TYPE:
				return createParameterTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case M4jdslPackage.GUARD_ACTION_PARAMETER_TYPE:
				return convertGuardActionParameterTypeToString(eDataType, instanceValue);
			case M4jdslPackage.PARAMETER_TYPE:
				return convertParameterTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public WorkloadModel createWorkloadModel() {
		WorkloadModelImpl workloadModel = new WorkloadModelImpl();
		return workloadModel;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ApplicationModel createApplicationModel() {
		ApplicationModelImpl applicationModel = new ApplicationModelImpl();
		return applicationModel;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BehaviorMix createBehaviorMix() {
		BehaviorMixImpl behaviorMix = new BehaviorMixImpl();
		return behaviorMix;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public RelativeFrequency createRelativeFrequency() {
		RelativeFrequencyImpl relativeFrequency = new RelativeFrequencyImpl();
		return relativeFrequency;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BehaviorModel createBehaviorModel() {
		BehaviorModelImpl behaviorModel = new BehaviorModelImpl();
		return behaviorModel;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public MarkovState createMarkovState() {
		MarkovStateImpl markovState = new MarkovStateImpl();
		return markovState;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ApplicationState createApplicationState() {
		ApplicationStateImpl applicationState = new ApplicationStateImpl();
		return applicationState;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public HTTPRequest createHTTPRequest() {
		HTTPRequestImpl httpRequest = new HTTPRequestImpl();
		return httpRequest;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public JavaRequest createJavaRequest() {
		JavaRequestImpl javaRequest = new JavaRequestImpl();
		return javaRequest;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BeanShellRequest createBeanShellRequest() {
		BeanShellRequestImpl beanShellRequest = new BeanShellRequestImpl();
		return beanShellRequest;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public JUnitRequest createJUnitRequest() {
		JUnitRequestImpl jUnitRequest = new JUnitRequestImpl();
		return jUnitRequest;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SOAPRequest createSOAPRequest() {
		SOAPRequestImpl soapRequest = new SOAPRequestImpl();
		return soapRequest;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ProtocolState createProtocolState() {
		ProtocolStateImpl protocolState = new ProtocolStateImpl();
		return protocolState;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ProtocolTransition createProtocolTransition() {
		ProtocolTransitionImpl protocolTransition = new ProtocolTransitionImpl();
		return protocolTransition;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ProtocolLayerEFSM createProtocolLayerEFSM() {
		ProtocolLayerEFSMImpl protocolLayerEFSM = new ProtocolLayerEFSMImpl();
		return protocolLayerEFSM;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public SessionLayerEFSM createSessionLayerEFSM() {
		SessionLayerEFSMImpl sessionLayerEFSM = new SessionLayerEFSMImpl();
		return sessionLayerEFSM;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ConstantWorkloadIntensity createConstantWorkloadIntensity() {
		ConstantWorkloadIntensityImpl constantWorkloadIntensity = new ConstantWorkloadIntensityImpl();
		return constantWorkloadIntensity;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ApplicationTransition createApplicationTransition() {
		ApplicationTransitionImpl applicationTransition = new ApplicationTransitionImpl();
		return applicationTransition;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NormallyDistributedThinkTime createNormallyDistributedThinkTime() {
		NormallyDistributedThinkTimeImpl normallyDistributedThinkTime = new NormallyDistributedThinkTimeImpl();
		return normallyDistributedThinkTime;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Property createProperty() {
		PropertyImpl property = new PropertyImpl();
		return property;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Parameter createParameter() {
		ParameterImpl parameter = new ParameterImpl();
		return parameter;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Assertion createAssertion() {
		AssertionImpl assertion = new AssertionImpl();
		return assertion;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ApplicationExitState createApplicationExitState() {
		ApplicationExitStateImpl applicationExitState = new ApplicationExitStateImpl();
		return applicationExitState;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BehaviorModelExitState createBehaviorModelExitState() {
		BehaviorModelExitStateImpl behaviorModelExitState = new BehaviorModelExitStateImpl();
		return behaviorModelExitState;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ProtocolExitState createProtocolExitState() {
		ProtocolExitStateImpl protocolExitState = new ProtocolExitStateImpl();
		return protocolExitState;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuardActionParameter createGuardActionParameter() {
		GuardActionParameterImpl guardActionParameter = new GuardActionParameterImpl();
		return guardActionParameter;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Guard createGuard() {
		GuardImpl guard = new GuardImpl();
		return guard;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuardActionParameterList createGuardActionParameterList() {
		GuardActionParameterListImpl guardActionParameterList = new GuardActionParameterListImpl();
		return guardActionParameterList;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuardActionParameterType createGuardActionParameterTypeFromString(EDataType eDataType, String initialValue) {
		GuardActionParameterType result = GuardActionParameterType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGuardActionParameterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType createParameterTypeFromString(EDataType eDataType, String initialValue) {
		ParameterType result = ParameterType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertParameterTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public M4jdslPackage getM4jdslPackage() {
		return (M4jdslPackage)getEPackage();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
    @Deprecated
    public static M4jdslPackage getPackage() {
		return M4jdslPackage.eINSTANCE;
	}

} //M4jdslFactoryImpl
