/**
 */
package m4jdsl.util;

import m4jdsl.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see m4jdsl.M4jdslPackage
 * @generated
 */
public class M4jdslSwitch<T> extends Switch<T> {
    /**
	 * The cached model package
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static M4jdslPackage modelPackage;

    /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public M4jdslSwitch() {
		if (modelPackage == null) {
			modelPackage = M4jdslPackage.eINSTANCE;
		}
	}

    /**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
    @Override
    protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

    /**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
    @Override
    protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case M4jdslPackage.WORKLOAD_INTENSITY: {
				WorkloadIntensity workloadIntensity = (WorkloadIntensity)theEObject;
				T result = caseWorkloadIntensity(workloadIntensity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4jdslPackage.WORKLOAD_MODEL: {
				WorkloadModel workloadModel = (WorkloadModel)theEObject;
				T result = caseWorkloadModel(workloadModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4jdslPackage.APPLICATION_MODEL: {
				ApplicationModel applicationModel = (ApplicationModel)theEObject;
				T result = caseApplicationModel(applicationModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4jdslPackage.BEHAVIOR_MIX: {
				BehaviorMix behaviorMix = (BehaviorMix)theEObject;
				T result = caseBehaviorMix(behaviorMix);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4jdslPackage.RELATIVE_FREQUENCY: {
				RelativeFrequency relativeFrequency = (RelativeFrequency)theEObject;
				T result = caseRelativeFrequency(relativeFrequency);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4jdslPackage.BEHAVIOR_MODEL: {
				BehaviorModel behaviorModel = (BehaviorModel)theEObject;
				T result = caseBehaviorModel(behaviorModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4jdslPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4jdslPackage.MARKOV_STATE: {
				MarkovState markovState = (MarkovState)theEObject;
				T result = caseMarkovState(markovState);
				if (result == null) result = caseBehaviorModelState(markovState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4jdslPackage.SERVICE: {
				Service service = (Service)theEObject;
				T result = caseService(service);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4jdslPackage.APPLICATION_STATE: {
				ApplicationState applicationState = (ApplicationState)theEObject;
				T result = caseApplicationState(applicationState);
				if (result == null) result = caseSessionLayerEFSMState(applicationState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4jdslPackage.HTTP_REQUEST: {
				HTTPRequest httpRequest = (HTTPRequest)theEObject;
				T result = caseHTTPRequest(httpRequest);
				if (result == null) result = caseRequest(httpRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4jdslPackage.JAVA_REQUEST: {
				JavaRequest javaRequest = (JavaRequest)theEObject;
				T result = caseJavaRequest(javaRequest);
				if (result == null) result = caseRequest(javaRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4jdslPackage.BEAN_SHELL_REQUEST: {
				BeanShellRequest beanShellRequest = (BeanShellRequest)theEObject;
				T result = caseBeanShellRequest(beanShellRequest);
				if (result == null) result = caseRequest(beanShellRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4jdslPackage.JUNIT_REQUEST: {
				JUnitRequest jUnitRequest = (JUnitRequest)theEObject;
				T result = caseJUnitRequest(jUnitRequest);
				if (result == null) result = caseRequest(jUnitRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4jdslPackage.SOAP_REQUEST: {
				SOAPRequest soapRequest = (SOAPRequest)theEObject;
				T result = caseSOAPRequest(soapRequest);
				if (result == null) result = caseRequest(soapRequest);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4jdslPackage.REQUEST: {
				Request request = (Request)theEObject;
				T result = caseRequest(request);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4jdslPackage.PROTOCOL_STATE: {
				ProtocolState protocolState = (ProtocolState)theEObject;
				T result = caseProtocolState(protocolState);
				if (result == null) result = caseProtocolLayerEFSMState(protocolState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4jdslPackage.PROTOCOL_TRANSITION: {
				ProtocolTransition protocolTransition = (ProtocolTransition)theEObject;
				T result = caseProtocolTransition(protocolTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4jdslPackage.PROTOCOL_LAYER_EFSM: {
				ProtocolLayerEFSM protocolLayerEFSM = (ProtocolLayerEFSM)theEObject;
				T result = caseProtocolLayerEFSM(protocolLayerEFSM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4jdslPackage.SESSION_LAYER_EFSM: {
				SessionLayerEFSM sessionLayerEFSM = (SessionLayerEFSM)theEObject;
				T result = caseSessionLayerEFSM(sessionLayerEFSM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4jdslPackage.CONSTANT_WORKLOAD_INTENSITY: {
				ConstantWorkloadIntensity constantWorkloadIntensity = (ConstantWorkloadIntensity)theEObject;
				T result = caseConstantWorkloadIntensity(constantWorkloadIntensity);
				if (result == null) result = caseWorkloadIntensity(constantWorkloadIntensity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4jdslPackage.APPLICATION_TRANSITION: {
				ApplicationTransition applicationTransition = (ApplicationTransition)theEObject;
				T result = caseApplicationTransition(applicationTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4jdslPackage.NORMALLY_DISTRIBUTED_THINK_TIME: {
				NormallyDistributedThinkTime normallyDistributedThinkTime = (NormallyDistributedThinkTime)theEObject;
				T result = caseNormallyDistributedThinkTime(normallyDistributedThinkTime);
				if (result == null) result = caseThinkTime(normallyDistributedThinkTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4jdslPackage.PROPERTY: {
				Property property = (Property)theEObject;
				T result = caseProperty(property);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4jdslPackage.PARAMETER: {
				Parameter parameter = (Parameter)theEObject;
				T result = caseParameter(parameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4jdslPackage.ASSERTION: {
				Assertion assertion = (Assertion)theEObject;
				T result = caseAssertion(assertion);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4jdslPackage.THINK_TIME: {
				ThinkTime thinkTime = (ThinkTime)theEObject;
				T result = caseThinkTime(thinkTime);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4jdslPackage.APPLICATION_EXIT_STATE: {
				ApplicationExitState applicationExitState = (ApplicationExitState)theEObject;
				T result = caseApplicationExitState(applicationExitState);
				if (result == null) result = caseSessionLayerEFSMState(applicationExitState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4jdslPackage.SESSION_LAYER_EFSM_STATE: {
				SessionLayerEFSMState sessionLayerEFSMState = (SessionLayerEFSMState)theEObject;
				T result = caseSessionLayerEFSMState(sessionLayerEFSMState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4jdslPackage.BEHAVIOR_MODEL_EXIT_STATE: {
				BehaviorModelExitState behaviorModelExitState = (BehaviorModelExitState)theEObject;
				T result = caseBehaviorModelExitState(behaviorModelExitState);
				if (result == null) result = caseBehaviorModelState(behaviorModelExitState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4jdslPackage.BEHAVIOR_MODEL_STATE: {
				BehaviorModelState behaviorModelState = (BehaviorModelState)theEObject;
				T result = caseBehaviorModelState(behaviorModelState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4jdslPackage.PROTOCOL_EXIT_STATE: {
				ProtocolExitState protocolExitState = (ProtocolExitState)theEObject;
				T result = caseProtocolExitState(protocolExitState);
				if (result == null) result = caseProtocolLayerEFSMState(protocolExitState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4jdslPackage.PROTOCOL_LAYER_EFSM_STATE: {
				ProtocolLayerEFSMState protocolLayerEFSMState = (ProtocolLayerEFSMState)theEObject;
				T result = caseProtocolLayerEFSMState(protocolLayerEFSMState);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4jdslPackage.GUARD_ACTION_PARAMETER: {
				GuardActionParameter guardActionParameter = (GuardActionParameter)theEObject;
				T result = caseGuardActionParameter(guardActionParameter);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4jdslPackage.GUARD: {
				Guard guard = (Guard)theEObject;
				T result = caseGuard(guard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4jdslPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case M4jdslPackage.GUARD_ACTION_PARAMETER_LIST: {
				GuardActionParameterList guardActionParameterList = (GuardActionParameterList)theEObject;
				T result = caseGuardActionParameterList(guardActionParameterList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Workload Intensity</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workload Intensity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseWorkloadIntensity(WorkloadIntensity object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Workload Model</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workload Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseWorkloadModel(WorkloadModel object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Application Model</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseApplicationModel(ApplicationModel object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Mix</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Mix</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseBehaviorMix(BehaviorMix object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Relative Frequency</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Relative Frequency</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseRelativeFrequency(RelativeFrequency object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Model</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseBehaviorModel(BehaviorModel object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseTransition(Transition object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Markov State</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Markov State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseMarkovState(MarkovState object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Service</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseService(Service object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Application State</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseApplicationState(ApplicationState object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>HTTP Request</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>HTTP Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseHTTPRequest(HTTPRequest object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Java Request</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Java Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseJavaRequest(JavaRequest object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Bean Shell Request</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bean Shell Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseBeanShellRequest(BeanShellRequest object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>JUnit Request</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>JUnit Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseJUnitRequest(JUnitRequest object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>SOAP Request</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SOAP Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseSOAPRequest(SOAPRequest object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Request</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Request</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseRequest(Request object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol State</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseProtocolState(ProtocolState object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Transition</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseProtocolTransition(ProtocolTransition object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Layer EFSM</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Layer EFSM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseProtocolLayerEFSM(ProtocolLayerEFSM object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Session Layer EFSM</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Session Layer EFSM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseSessionLayerEFSM(SessionLayerEFSM object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Constant Workload Intensity</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Constant Workload Intensity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseConstantWorkloadIntensity(ConstantWorkloadIntensity object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Application Transition</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseApplicationTransition(ApplicationTransition object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Normally Distributed Think Time</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Normally Distributed Think Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseNormallyDistributedThinkTime(NormallyDistributedThinkTime object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseProperty(Property object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseParameter(Parameter object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Assertion</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseAssertion(Assertion object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Think Time</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Think Time</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseThinkTime(ThinkTime object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Application Exit State</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Exit State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseApplicationExitState(ApplicationExitState object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Session Layer EFSM State</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Session Layer EFSM State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseSessionLayerEFSMState(SessionLayerEFSMState object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Model Exit State</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Model Exit State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseBehaviorModelExitState(BehaviorModelExitState object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Behavior Model State</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Behavior Model State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseBehaviorModelState(BehaviorModelState object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Exit State</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Exit State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseProtocolExitState(ProtocolExitState object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Protocol Layer EFSM State</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Protocol Layer EFSM State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
    public T caseProtocolLayerEFSMState(ProtocolLayerEFSMState object) {
		return null;
	}

    /**
	 * Returns the result of interpreting the object as an instance of '<em>Guard Action Parameter</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guard Action Parameter</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuardActionParameter(GuardActionParameter object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Guard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuard(Guard object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>Guard Action Parameter List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Guard Action Parameter List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGuardActionParameterList(GuardActionParameterList object) {
		return null;
	}

				/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch, but this is the last case anyway.
     * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
    @Override
    public T defaultCase(EObject object) {
		return null;
	}

} //M4jdslSwitch
