/**
 */
package m4jdsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see m4jdsl.M4jdslFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/OCL/Import ecore='http://www.eclipse.org/emf/2002/Ecore#/'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore invocationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' settingDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot' validationDelegates='http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot'"
 * @generated
 */
public interface M4jdslPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "m4jdsl";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://m4jdsl/1.0";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "m4jdsl";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    M4jdslPackage eINSTANCE = m4jdsl.impl.M4jdslPackageImpl.init();

    /**
     * The meta object id for the '{@link m4jdsl.impl.WorkloadIntensityImpl <em>Workload Intensity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see m4jdsl.impl.WorkloadIntensityImpl
     * @see m4jdsl.impl.M4jdslPackageImpl#getWorkloadIntensity()
     * @generated
     */
    int WORKLOAD_INTENSITY = 0;

    /**
     * The feature id for the '<em><b>Formula</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKLOAD_INTENSITY__FORMULA = 0;

    /**
     * The number of structural features of the '<em>Workload Intensity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKLOAD_INTENSITY_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Workload Intensity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKLOAD_INTENSITY_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link m4jdsl.impl.WorkloadModelImpl <em>Workload Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see m4jdsl.impl.WorkloadModelImpl
     * @see m4jdsl.impl.M4jdslPackageImpl#getWorkloadModel()
     * @generated
     */
    int WORKLOAD_MODEL = 1;

    /**
     * The feature id for the '<em><b>Workload Intensity</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKLOAD_MODEL__WORKLOAD_INTENSITY = 0;

    /**
     * The feature id for the '<em><b>Application Model</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKLOAD_MODEL__APPLICATION_MODEL = 1;

    /**
     * The feature id for the '<em><b>Behavior Mix</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKLOAD_MODEL__BEHAVIOR_MIX = 2;

    /**
     * The feature id for the '<em><b>Behavior Models</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKLOAD_MODEL__BEHAVIOR_MODELS = 3;

    /**
     * The number of structural features of the '<em>Workload Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKLOAD_MODEL_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Workload Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int WORKLOAD_MODEL_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link m4jdsl.impl.ApplicationModelImpl <em>Application Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see m4jdsl.impl.ApplicationModelImpl
     * @see m4jdsl.impl.M4jdslPackageImpl#getApplicationModel()
     * @generated
     */
    int APPLICATION_MODEL = 2;

    /**
     * The feature id for the '<em><b>Session Layer EFSM</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_MODEL__SESSION_LAYER_EFSM = 0;

    /**
     * The number of structural features of the '<em>Application Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_MODEL_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Application Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_MODEL_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link m4jdsl.impl.BehaviorMixImpl <em>Behavior Mix</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see m4jdsl.impl.BehaviorMixImpl
     * @see m4jdsl.impl.M4jdslPackageImpl#getBehaviorMix()
     * @generated
     */
    int BEHAVIOR_MIX = 3;

    /**
     * The feature id for the '<em><b>Relative Frequencies</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_MIX__RELATIVE_FREQUENCIES = 0;

    /**
     * The number of structural features of the '<em>Behavior Mix</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_MIX_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Behavior Mix</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_MIX_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link m4jdsl.impl.RelativeFrequencyImpl <em>Relative Frequency</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see m4jdsl.impl.RelativeFrequencyImpl
     * @see m4jdsl.impl.M4jdslPackageImpl#getRelativeFrequency()
     * @generated
     */
    int RELATIVE_FREQUENCY = 4;

    /**
     * The feature id for the '<em><b>Behavior Model</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIVE_FREQUENCY__BEHAVIOR_MODEL = 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIVE_FREQUENCY__VALUE = 1;

    /**
     * The number of structural features of the '<em>Relative Frequency</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIVE_FREQUENCY_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Relative Frequency</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int RELATIVE_FREQUENCY_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link m4jdsl.impl.BehaviorModelImpl <em>Behavior Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see m4jdsl.impl.BehaviorModelImpl
     * @see m4jdsl.impl.M4jdslPackageImpl#getBehaviorModel()
     * @generated
     */
    int BEHAVIOR_MODEL = 5;

    /**
     * The feature id for the '<em><b>Markov States</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_MODEL__MARKOV_STATES = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_MODEL__NAME = 1;

    /**
     * The feature id for the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_MODEL__FILENAME = 2;

    /**
     * The number of structural features of the '<em>Behavior Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_MODEL_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Behavior Model</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int BEHAVIOR_MODEL_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link m4jdsl.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see m4jdsl.impl.TransitionImpl
     * @see m4jdsl.impl.M4jdslPackageImpl#getTransition()
     * @generated
     */
    int TRANSITION = 6;

    /**
     * The feature id for the '<em><b>Target State</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSITION__TARGET_STATE = 0;

    /**
     * The feature id for the '<em><b>Probability</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSITION__PROBABILITY = 1;

    /**
     * The feature id for the '<em><b>Think Time</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSITION__THINK_TIME = 2;

    /**
     * The number of structural features of the '<em>Transition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSITION_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Transition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TRANSITION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link m4jdsl.impl.MarkovStateImpl <em>Markov State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see m4jdsl.impl.MarkovStateImpl
     * @see m4jdsl.impl.M4jdslPackageImpl#getMarkovState()
     * @generated
     */
    int MARKOV_STATE = 7;

    /**
     * The feature id for the '<em><b>Outgoing Transitions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MARKOV_STATE__OUTGOING_TRANSITIONS = 0;

    /**
     * The feature id for the '<em><b>Service</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MARKOV_STATE__SERVICE = 1;

    /**
     * The feature id for the '<em><b>EId</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MARKOV_STATE__EID = 2;

    /**
     * The number of structural features of the '<em>Markov State</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MARKOV_STATE_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Markov State</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MARKOV_STATE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link m4jdsl.impl.ServiceImpl <em>Service</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see m4jdsl.impl.ServiceImpl
     * @see m4jdsl.impl.M4jdslPackageImpl#getService()
     * @generated
     */
    int SERVICE = 8;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE__NAME = 0;

    /**
     * The number of structural features of the '<em>Service</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Service</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SERVICE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link m4jdsl.impl.ApplicationStateImpl <em>Application State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see m4jdsl.impl.ApplicationStateImpl
     * @see m4jdsl.impl.M4jdslPackageImpl#getApplicationState()
     * @generated
     */
    int APPLICATION_STATE = 9;

    /**
     * The feature id for the '<em><b>Service</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_STATE__SERVICE = 0;

    /**
     * The feature id for the '<em><b>Protocol Details</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_STATE__PROTOCOL_DETAILS = 1;

    /**
     * The feature id for the '<em><b>Outgoing Transitions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_STATE__OUTGOING_TRANSITIONS = 2;

    /**
     * The feature id for the '<em><b>EId</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_STATE__EID = 3;

    /**
     * The number of structural features of the '<em>Application State</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_STATE_FEATURE_COUNT = 4;

    /**
     * The number of operations of the '<em>Application State</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_STATE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link m4jdsl.impl.RequestImpl <em>Request</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see m4jdsl.impl.RequestImpl
     * @see m4jdsl.impl.M4jdslPackageImpl#getRequest()
     * @generated
     */
    int REQUEST = 11;

    /**
     * The feature id for the '<em><b>EId</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUEST__EID = 0;

    /**
     * The feature id for the '<em><b>Assertions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUEST__ASSERTIONS = 1;

    /**
     * The number of structural features of the '<em>Request</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUEST_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Request</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int REQUEST_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link m4jdsl.impl.HTTPRequestImpl <em>HTTP Request</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see m4jdsl.impl.HTTPRequestImpl
     * @see m4jdsl.impl.M4jdslPackageImpl#getHTTPRequest()
     * @generated
     */
    int HTTP_REQUEST = 10;

    /**
     * The feature id for the '<em><b>EId</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HTTP_REQUEST__EID = REQUEST__EID;

    /**
     * The feature id for the '<em><b>Assertions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HTTP_REQUEST__ASSERTIONS = REQUEST__ASSERTIONS;

    /**
     * The feature id for the '<em><b>Properties</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HTTP_REQUEST__PROPERTIES = REQUEST_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HTTP_REQUEST__PARAMETERS = REQUEST_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>HTTP Request</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HTTP_REQUEST_FEATURE_COUNT = REQUEST_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>HTTP Request</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int HTTP_REQUEST_OPERATION_COUNT = REQUEST_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link m4jdsl.impl.ProtocolStateImpl <em>Protocol State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see m4jdsl.impl.ProtocolStateImpl
     * @see m4jdsl.impl.M4jdslPackageImpl#getProtocolState()
     * @generated
     */
    int PROTOCOL_STATE = 12;

    /**
     * The feature id for the '<em><b>Request</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_STATE__REQUEST = 0;

    /**
     * The feature id for the '<em><b>Outgoing Transitions</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_STATE__OUTGOING_TRANSITIONS = 1;

    /**
     * The feature id for the '<em><b>EId</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_STATE__EID = 2;

    /**
     * The number of structural features of the '<em>Protocol State</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_STATE_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Protocol State</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_STATE_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link m4jdsl.impl.ProtocolTransitionImpl <em>Protocol Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see m4jdsl.impl.ProtocolTransitionImpl
     * @see m4jdsl.impl.M4jdslPackageImpl#getProtocolTransition()
     * @generated
     */
    int PROTOCOL_TRANSITION = 13;

    /**
     * The feature id for the '<em><b>Guard</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_TRANSITION__GUARD = 0;

    /**
     * The feature id for the '<em><b>Target State</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_TRANSITION__TARGET_STATE = 1;

    /**
     * The feature id for the '<em><b>Action</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_TRANSITION__ACTION = 2;

    /**
     * The number of structural features of the '<em>Protocol Transition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_TRANSITION_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Protocol Transition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_TRANSITION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link m4jdsl.impl.ProtocolLayerEFSMImpl <em>Protocol Layer EFSM</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see m4jdsl.impl.ProtocolLayerEFSMImpl
     * @see m4jdsl.impl.M4jdslPackageImpl#getProtocolLayerEFSM()
     * @generated
     */
    int PROTOCOL_LAYER_EFSM = 14;

    /**
     * The feature id for the '<em><b>States</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_LAYER_EFSM__STATES = 0;

    /**
     * The feature id for the '<em><b>Initial State</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_LAYER_EFSM__INITIAL_STATE = 1;

    /**
     * The feature id for the '<em><b>Exit State</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_LAYER_EFSM__EXIT_STATE = 2;

    /**
     * The number of structural features of the '<em>Protocol Layer EFSM</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_LAYER_EFSM_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Protocol Layer EFSM</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROTOCOL_LAYER_EFSM_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link m4jdsl.impl.SessionLayerEFSMImpl <em>Session Layer EFSM</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see m4jdsl.impl.SessionLayerEFSMImpl
     * @see m4jdsl.impl.M4jdslPackageImpl#getSessionLayerEFSM()
     * @generated
     */
    int SESSION_LAYER_EFSM = 15;

    /**
     * The feature id for the '<em><b>States</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSION_LAYER_EFSM__STATES = 0;

    /**
     * The feature id for the '<em><b>Initial State</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSION_LAYER_EFSM__INITIAL_STATE = 1;

    /**
     * The feature id for the '<em><b>Exit State</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSION_LAYER_EFSM__EXIT_STATE = 2;

    /**
     * The number of structural features of the '<em>Session Layer EFSM</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSION_LAYER_EFSM_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Session Layer EFSM</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int SESSION_LAYER_EFSM_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link m4jdsl.impl.ConstantWorkloadIntensityImpl <em>Constant Workload Intensity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see m4jdsl.impl.ConstantWorkloadIntensityImpl
     * @see m4jdsl.impl.M4jdslPackageImpl#getConstantWorkloadIntensity()
     * @generated
     */
    int CONSTANT_WORKLOAD_INTENSITY = 16;

    /**
     * The feature id for the '<em><b>Formula</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_WORKLOAD_INTENSITY__FORMULA = WORKLOAD_INTENSITY__FORMULA;

    /**
     * The feature id for the '<em><b>Number Of Sessions</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_WORKLOAD_INTENSITY__NUMBER_OF_SESSIONS = WORKLOAD_INTENSITY_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Constant Workload Intensity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_WORKLOAD_INTENSITY_FEATURE_COUNT = WORKLOAD_INTENSITY_FEATURE_COUNT + 1;

    /**
     * The number of operations of the '<em>Constant Workload Intensity</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTANT_WORKLOAD_INTENSITY_OPERATION_COUNT = WORKLOAD_INTENSITY_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link m4jdsl.impl.ApplicationTransitionImpl <em>Application Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see m4jdsl.impl.ApplicationTransitionImpl
     * @see m4jdsl.impl.M4jdslPackageImpl#getApplicationTransition()
     * @generated
     */
    int APPLICATION_TRANSITION = 17;

    /**
     * The feature id for the '<em><b>Target State</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_TRANSITION__TARGET_STATE = 0;

    /**
     * The feature id for the '<em><b>Action</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_TRANSITION__ACTION = 1;

    /**
     * The feature id for the '<em><b>Guard</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_TRANSITION__GUARD = 2;

    /**
     * The number of structural features of the '<em>Application Transition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_TRANSITION_FEATURE_COUNT = 3;

    /**
     * The number of operations of the '<em>Application Transition</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int APPLICATION_TRANSITION_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link m4jdsl.impl.ThinkTimeImpl <em>Think Time</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see m4jdsl.impl.ThinkTimeImpl
     * @see m4jdsl.impl.M4jdslPackageImpl#getThinkTime()
     * @generated
     */
    int THINK_TIME = 22;

    /**
     * The number of structural features of the '<em>Think Time</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THINK_TIME_FEATURE_COUNT = 0;

    /**
     * The number of operations of the '<em>Think Time</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int THINK_TIME_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link m4jdsl.impl.NormalDistributionImpl <em>Normal Distribution</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see m4jdsl.impl.NormalDistributionImpl
     * @see m4jdsl.impl.M4jdslPackageImpl#getNormalDistribution()
     * @generated
     */
    int NORMAL_DISTRIBUTION = 18;

    /**
     * The feature id for the '<em><b>Mean</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NORMAL_DISTRIBUTION__MEAN = THINK_TIME_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Deviation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NORMAL_DISTRIBUTION__DEVIATION = THINK_TIME_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Normal Distribution</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NORMAL_DISTRIBUTION_FEATURE_COUNT = THINK_TIME_FEATURE_COUNT + 2;

    /**
     * The number of operations of the '<em>Normal Distribution</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NORMAL_DISTRIBUTION_OPERATION_COUNT = THINK_TIME_OPERATION_COUNT + 0;

    /**
     * The meta object id for the '{@link m4jdsl.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see m4jdsl.impl.PropertyImpl
     * @see m4jdsl.impl.M4jdslPackageImpl#getProperty()
     * @generated
     */
    int PROPERTY = 19;

    /**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__KEY = 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__VALUE = 1;

    /**
     * The number of structural features of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link m4jdsl.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see m4jdsl.impl.ParameterImpl
     * @see m4jdsl.impl.M4jdslPackageImpl#getParameter()
     * @generated
     */
    int PARAMETER = 20;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__NAME = 0;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__VALUE = 1;

    /**
     * The number of structural features of the '<em>Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_FEATURE_COUNT = 2;

    /**
     * The number of operations of the '<em>Parameter</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER_OPERATION_COUNT = 0;

    /**
     * The meta object id for the '{@link m4jdsl.impl.AssertionImpl <em>Assertion</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see m4jdsl.impl.AssertionImpl
     * @see m4jdsl.impl.M4jdslPackageImpl#getAssertion()
     * @generated
     */
    int ASSERTION = 21;

    /**
     * The feature id for the '<em><b>Pattern To Test</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSERTION__PATTERN_TO_TEST = 0;

    /**
     * The number of structural features of the '<em>Assertion</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSERTION_FEATURE_COUNT = 1;

    /**
     * The number of operations of the '<em>Assertion</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ASSERTION_OPERATION_COUNT = 0;


    /**
     * Returns the meta object for class '{@link m4jdsl.WorkloadIntensity <em>Workload Intensity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Workload Intensity</em>'.
     * @see m4jdsl.WorkloadIntensity
     * @generated
     */
    EClass getWorkloadIntensity();

    /**
     * Returns the meta object for the attribute '{@link m4jdsl.WorkloadIntensity#getFormula <em>Formula</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Formula</em>'.
     * @see m4jdsl.WorkloadIntensity#getFormula()
     * @see #getWorkloadIntensity()
     * @generated
     */
    EAttribute getWorkloadIntensity_Formula();

    /**
     * Returns the meta object for class '{@link m4jdsl.WorkloadModel <em>Workload Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Workload Model</em>'.
     * @see m4jdsl.WorkloadModel
     * @generated
     */
    EClass getWorkloadModel();

    /**
     * Returns the meta object for the containment reference '{@link m4jdsl.WorkloadModel#getWorkloadIntensity <em>Workload Intensity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Workload Intensity</em>'.
     * @see m4jdsl.WorkloadModel#getWorkloadIntensity()
     * @see #getWorkloadModel()
     * @generated
     */
    EReference getWorkloadModel_WorkloadIntensity();

    /**
     * Returns the meta object for the containment reference '{@link m4jdsl.WorkloadModel#getApplicationModel <em>Application Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Application Model</em>'.
     * @see m4jdsl.WorkloadModel#getApplicationModel()
     * @see #getWorkloadModel()
     * @generated
     */
    EReference getWorkloadModel_ApplicationModel();

    /**
     * Returns the meta object for the containment reference '{@link m4jdsl.WorkloadModel#getBehaviorMix <em>Behavior Mix</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Behavior Mix</em>'.
     * @see m4jdsl.WorkloadModel#getBehaviorMix()
     * @see #getWorkloadModel()
     * @generated
     */
    EReference getWorkloadModel_BehaviorMix();

    /**
     * Returns the meta object for the containment reference list '{@link m4jdsl.WorkloadModel#getBehaviorModels <em>Behavior Models</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Behavior Models</em>'.
     * @see m4jdsl.WorkloadModel#getBehaviorModels()
     * @see #getWorkloadModel()
     * @generated
     */
    EReference getWorkloadModel_BehaviorModels();

    /**
     * Returns the meta object for class '{@link m4jdsl.ApplicationModel <em>Application Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Application Model</em>'.
     * @see m4jdsl.ApplicationModel
     * @generated
     */
    EClass getApplicationModel();

    /**
     * Returns the meta object for the containment reference '{@link m4jdsl.ApplicationModel#getSessionLayerEFSM <em>Session Layer EFSM</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Session Layer EFSM</em>'.
     * @see m4jdsl.ApplicationModel#getSessionLayerEFSM()
     * @see #getApplicationModel()
     * @generated
     */
    EReference getApplicationModel_SessionLayerEFSM();

    /**
     * Returns the meta object for class '{@link m4jdsl.BehaviorMix <em>Behavior Mix</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Behavior Mix</em>'.
     * @see m4jdsl.BehaviorMix
     * @generated
     */
    EClass getBehaviorMix();

    /**
     * Returns the meta object for the containment reference list '{@link m4jdsl.BehaviorMix#getRelativeFrequencies <em>Relative Frequencies</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Relative Frequencies</em>'.
     * @see m4jdsl.BehaviorMix#getRelativeFrequencies()
     * @see #getBehaviorMix()
     * @generated
     */
    EReference getBehaviorMix_RelativeFrequencies();

    /**
     * Returns the meta object for class '{@link m4jdsl.RelativeFrequency <em>Relative Frequency</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Relative Frequency</em>'.
     * @see m4jdsl.RelativeFrequency
     * @generated
     */
    EClass getRelativeFrequency();

    /**
     * Returns the meta object for the reference '{@link m4jdsl.RelativeFrequency#getBehaviorModel <em>Behavior Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Behavior Model</em>'.
     * @see m4jdsl.RelativeFrequency#getBehaviorModel()
     * @see #getRelativeFrequency()
     * @generated
     */
    EReference getRelativeFrequency_BehaviorModel();

    /**
     * Returns the meta object for the attribute '{@link m4jdsl.RelativeFrequency#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see m4jdsl.RelativeFrequency#getValue()
     * @see #getRelativeFrequency()
     * @generated
     */
    EAttribute getRelativeFrequency_Value();

    /**
     * Returns the meta object for class '{@link m4jdsl.BehaviorModel <em>Behavior Model</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Behavior Model</em>'.
     * @see m4jdsl.BehaviorModel
     * @generated
     */
    EClass getBehaviorModel();

    /**
     * Returns the meta object for the containment reference list '{@link m4jdsl.BehaviorModel#getMarkovStates <em>Markov States</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Markov States</em>'.
     * @see m4jdsl.BehaviorModel#getMarkovStates()
     * @see #getBehaviorModel()
     * @generated
     */
    EReference getBehaviorModel_MarkovStates();

    /**
     * Returns the meta object for the attribute '{@link m4jdsl.BehaviorModel#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see m4jdsl.BehaviorModel#getName()
     * @see #getBehaviorModel()
     * @generated
     */
    EAttribute getBehaviorModel_Name();

    /**
     * Returns the meta object for the attribute '{@link m4jdsl.BehaviorModel#getFilename <em>Filename</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Filename</em>'.
     * @see m4jdsl.BehaviorModel#getFilename()
     * @see #getBehaviorModel()
     * @generated
     */
    EAttribute getBehaviorModel_Filename();

    /**
     * Returns the meta object for class '{@link m4jdsl.Transition <em>Transition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Transition</em>'.
     * @see m4jdsl.Transition
     * @generated
     */
    EClass getTransition();

    /**
     * Returns the meta object for the reference '{@link m4jdsl.Transition#getTargetState <em>Target State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target State</em>'.
     * @see m4jdsl.Transition#getTargetState()
     * @see #getTransition()
     * @generated
     */
    EReference getTransition_TargetState();

    /**
     * Returns the meta object for the attribute '{@link m4jdsl.Transition#getProbability <em>Probability</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Probability</em>'.
     * @see m4jdsl.Transition#getProbability()
     * @see #getTransition()
     * @generated
     */
    EAttribute getTransition_Probability();

    /**
     * Returns the meta object for the containment reference '{@link m4jdsl.Transition#getThinkTime <em>Think Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Think Time</em>'.
     * @see m4jdsl.Transition#getThinkTime()
     * @see #getTransition()
     * @generated
     */
    EReference getTransition_ThinkTime();

    /**
     * Returns the meta object for class '{@link m4jdsl.MarkovState <em>Markov State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Markov State</em>'.
     * @see m4jdsl.MarkovState
     * @generated
     */
    EClass getMarkovState();

    /**
     * Returns the meta object for the containment reference list '{@link m4jdsl.MarkovState#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Outgoing Transitions</em>'.
     * @see m4jdsl.MarkovState#getOutgoingTransitions()
     * @see #getMarkovState()
     * @generated
     */
    EReference getMarkovState_OutgoingTransitions();

    /**
     * Returns the meta object for the reference '{@link m4jdsl.MarkovState#getService <em>Service</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Service</em>'.
     * @see m4jdsl.MarkovState#getService()
     * @see #getMarkovState()
     * @generated
     */
    EReference getMarkovState_Service();

    /**
     * Returns the meta object for the attribute '{@link m4jdsl.MarkovState#getEId <em>EId</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>EId</em>'.
     * @see m4jdsl.MarkovState#getEId()
     * @see #getMarkovState()
     * @generated
     */
    EAttribute getMarkovState_EId();

    /**
     * Returns the meta object for class '{@link m4jdsl.Service <em>Service</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Service</em>'.
     * @see m4jdsl.Service
     * @generated
     */
    EClass getService();

    /**
     * Returns the meta object for the attribute '{@link m4jdsl.Service#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see m4jdsl.Service#getName()
     * @see #getService()
     * @generated
     */
    EAttribute getService_Name();

    /**
     * Returns the meta object for class '{@link m4jdsl.ApplicationState <em>Application State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Application State</em>'.
     * @see m4jdsl.ApplicationState
     * @generated
     */
    EClass getApplicationState();

    /**
     * Returns the meta object for the containment reference '{@link m4jdsl.ApplicationState#getService <em>Service</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Service</em>'.
     * @see m4jdsl.ApplicationState#getService()
     * @see #getApplicationState()
     * @generated
     */
    EReference getApplicationState_Service();

    /**
     * Returns the meta object for the containment reference '{@link m4jdsl.ApplicationState#getProtocolDetails <em>Protocol Details</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Protocol Details</em>'.
     * @see m4jdsl.ApplicationState#getProtocolDetails()
     * @see #getApplicationState()
     * @generated
     */
    EReference getApplicationState_ProtocolDetails();

    /**
     * Returns the meta object for the containment reference list '{@link m4jdsl.ApplicationState#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Outgoing Transitions</em>'.
     * @see m4jdsl.ApplicationState#getOutgoingTransitions()
     * @see #getApplicationState()
     * @generated
     */
    EReference getApplicationState_OutgoingTransitions();

    /**
     * Returns the meta object for the attribute '{@link m4jdsl.ApplicationState#getEId <em>EId</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>EId</em>'.
     * @see m4jdsl.ApplicationState#getEId()
     * @see #getApplicationState()
     * @generated
     */
    EAttribute getApplicationState_EId();

    /**
     * Returns the meta object for class '{@link m4jdsl.HTTPRequest <em>HTTP Request</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>HTTP Request</em>'.
     * @see m4jdsl.HTTPRequest
     * @generated
     */
    EClass getHTTPRequest();

    /**
     * Returns the meta object for the containment reference list '{@link m4jdsl.HTTPRequest#getProperties <em>Properties</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Properties</em>'.
     * @see m4jdsl.HTTPRequest#getProperties()
     * @see #getHTTPRequest()
     * @generated
     */
    EReference getHTTPRequest_Properties();

    /**
     * Returns the meta object for the containment reference list '{@link m4jdsl.HTTPRequest#getParameters <em>Parameters</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Parameters</em>'.
     * @see m4jdsl.HTTPRequest#getParameters()
     * @see #getHTTPRequest()
     * @generated
     */
    EReference getHTTPRequest_Parameters();

    /**
     * Returns the meta object for class '{@link m4jdsl.Request <em>Request</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Request</em>'.
     * @see m4jdsl.Request
     * @generated
     */
    EClass getRequest();

    /**
     * Returns the meta object for the attribute '{@link m4jdsl.Request#getEId <em>EId</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>EId</em>'.
     * @see m4jdsl.Request#getEId()
     * @see #getRequest()
     * @generated
     */
    EAttribute getRequest_EId();

    /**
     * Returns the meta object for the containment reference list '{@link m4jdsl.Request#getAssertions <em>Assertions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Assertions</em>'.
     * @see m4jdsl.Request#getAssertions()
     * @see #getRequest()
     * @generated
     */
    EReference getRequest_Assertions();

    /**
     * Returns the meta object for class '{@link m4jdsl.ProtocolState <em>Protocol State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Protocol State</em>'.
     * @see m4jdsl.ProtocolState
     * @generated
     */
    EClass getProtocolState();

    /**
     * Returns the meta object for the containment reference '{@link m4jdsl.ProtocolState#getRequest <em>Request</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Request</em>'.
     * @see m4jdsl.ProtocolState#getRequest()
     * @see #getProtocolState()
     * @generated
     */
    EReference getProtocolState_Request();

    /**
     * Returns the meta object for the containment reference list '{@link m4jdsl.ProtocolState#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Outgoing Transitions</em>'.
     * @see m4jdsl.ProtocolState#getOutgoingTransitions()
     * @see #getProtocolState()
     * @generated
     */
    EReference getProtocolState_OutgoingTransitions();

    /**
     * Returns the meta object for the attribute '{@link m4jdsl.ProtocolState#getEId <em>EId</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>EId</em>'.
     * @see m4jdsl.ProtocolState#getEId()
     * @see #getProtocolState()
     * @generated
     */
    EAttribute getProtocolState_EId();

    /**
     * Returns the meta object for class '{@link m4jdsl.ProtocolTransition <em>Protocol Transition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Protocol Transition</em>'.
     * @see m4jdsl.ProtocolTransition
     * @generated
     */
    EClass getProtocolTransition();

    /**
     * Returns the meta object for the attribute '{@link m4jdsl.ProtocolTransition#getGuard <em>Guard</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Guard</em>'.
     * @see m4jdsl.ProtocolTransition#getGuard()
     * @see #getProtocolTransition()
     * @generated
     */
    EAttribute getProtocolTransition_Guard();

    /**
     * Returns the meta object for the reference '{@link m4jdsl.ProtocolTransition#getTargetState <em>Target State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target State</em>'.
     * @see m4jdsl.ProtocolTransition#getTargetState()
     * @see #getProtocolTransition()
     * @generated
     */
    EReference getProtocolTransition_TargetState();

    /**
     * Returns the meta object for the attribute '{@link m4jdsl.ProtocolTransition#getAction <em>Action</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Action</em>'.
     * @see m4jdsl.ProtocolTransition#getAction()
     * @see #getProtocolTransition()
     * @generated
     */
    EAttribute getProtocolTransition_Action();

    /**
     * Returns the meta object for class '{@link m4jdsl.ProtocolLayerEFSM <em>Protocol Layer EFSM</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Protocol Layer EFSM</em>'.
     * @see m4jdsl.ProtocolLayerEFSM
     * @generated
     */
    EClass getProtocolLayerEFSM();

    /**
     * Returns the meta object for the containment reference list '{@link m4jdsl.ProtocolLayerEFSM#getStates <em>States</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>States</em>'.
     * @see m4jdsl.ProtocolLayerEFSM#getStates()
     * @see #getProtocolLayerEFSM()
     * @generated
     */
    EReference getProtocolLayerEFSM_States();

    /**
     * Returns the meta object for the reference '{@link m4jdsl.ProtocolLayerEFSM#getInitialState <em>Initial State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Initial State</em>'.
     * @see m4jdsl.ProtocolLayerEFSM#getInitialState()
     * @see #getProtocolLayerEFSM()
     * @generated
     */
    EReference getProtocolLayerEFSM_InitialState();

    /**
     * Returns the meta object for the reference '{@link m4jdsl.ProtocolLayerEFSM#getExitState <em>Exit State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Exit State</em>'.
     * @see m4jdsl.ProtocolLayerEFSM#getExitState()
     * @see #getProtocolLayerEFSM()
     * @generated
     */
    EReference getProtocolLayerEFSM_ExitState();

    /**
     * Returns the meta object for class '{@link m4jdsl.SessionLayerEFSM <em>Session Layer EFSM</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Session Layer EFSM</em>'.
     * @see m4jdsl.SessionLayerEFSM
     * @generated
     */
    EClass getSessionLayerEFSM();

    /**
     * Returns the meta object for the containment reference list '{@link m4jdsl.SessionLayerEFSM#getStates <em>States</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>States</em>'.
     * @see m4jdsl.SessionLayerEFSM#getStates()
     * @see #getSessionLayerEFSM()
     * @generated
     */
    EReference getSessionLayerEFSM_States();

    /**
     * Returns the meta object for the reference '{@link m4jdsl.SessionLayerEFSM#getInitialState <em>Initial State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Initial State</em>'.
     * @see m4jdsl.SessionLayerEFSM#getInitialState()
     * @see #getSessionLayerEFSM()
     * @generated
     */
    EReference getSessionLayerEFSM_InitialState();

    /**
     * Returns the meta object for the reference '{@link m4jdsl.SessionLayerEFSM#getExitState <em>Exit State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Exit State</em>'.
     * @see m4jdsl.SessionLayerEFSM#getExitState()
     * @see #getSessionLayerEFSM()
     * @generated
     */
    EReference getSessionLayerEFSM_ExitState();

    /**
     * Returns the meta object for class '{@link m4jdsl.ConstantWorkloadIntensity <em>Constant Workload Intensity</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Constant Workload Intensity</em>'.
     * @see m4jdsl.ConstantWorkloadIntensity
     * @generated
     */
    EClass getConstantWorkloadIntensity();

    /**
     * Returns the meta object for the attribute '{@link m4jdsl.ConstantWorkloadIntensity#getNumberOfSessions <em>Number Of Sessions</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Number Of Sessions</em>'.
     * @see m4jdsl.ConstantWorkloadIntensity#getNumberOfSessions()
     * @see #getConstantWorkloadIntensity()
     * @generated
     */
    EAttribute getConstantWorkloadIntensity_NumberOfSessions();

    /**
     * Returns the meta object for class '{@link m4jdsl.ApplicationTransition <em>Application Transition</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Application Transition</em>'.
     * @see m4jdsl.ApplicationTransition
     * @generated
     */
    EClass getApplicationTransition();

    /**
     * Returns the meta object for the reference '{@link m4jdsl.ApplicationTransition#getTargetState <em>Target State</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target State</em>'.
     * @see m4jdsl.ApplicationTransition#getTargetState()
     * @see #getApplicationTransition()
     * @generated
     */
    EReference getApplicationTransition_TargetState();

    /**
     * Returns the meta object for the attribute '{@link m4jdsl.ApplicationTransition#getAction <em>Action</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Action</em>'.
     * @see m4jdsl.ApplicationTransition#getAction()
     * @see #getApplicationTransition()
     * @generated
     */
    EAttribute getApplicationTransition_Action();

    /**
     * Returns the meta object for the attribute '{@link m4jdsl.ApplicationTransition#getGuard <em>Guard</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Guard</em>'.
     * @see m4jdsl.ApplicationTransition#getGuard()
     * @see #getApplicationTransition()
     * @generated
     */
    EAttribute getApplicationTransition_Guard();

    /**
     * Returns the meta object for class '{@link m4jdsl.NormalDistribution <em>Normal Distribution</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Normal Distribution</em>'.
     * @see m4jdsl.NormalDistribution
     * @generated
     */
    EClass getNormalDistribution();

    /**
     * Returns the meta object for the attribute '{@link m4jdsl.NormalDistribution#getMean <em>Mean</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Mean</em>'.
     * @see m4jdsl.NormalDistribution#getMean()
     * @see #getNormalDistribution()
     * @generated
     */
    EAttribute getNormalDistribution_Mean();

    /**
     * Returns the meta object for the attribute '{@link m4jdsl.NormalDistribution#getDeviation <em>Deviation</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Deviation</em>'.
     * @see m4jdsl.NormalDistribution#getDeviation()
     * @see #getNormalDistribution()
     * @generated
     */
    EAttribute getNormalDistribution_Deviation();

    /**
     * Returns the meta object for class '{@link m4jdsl.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property</em>'.
     * @see m4jdsl.Property
     * @generated
     */
    EClass getProperty();

    /**
     * Returns the meta object for the attribute '{@link m4jdsl.Property#getKey <em>Key</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key</em>'.
     * @see m4jdsl.Property#getKey()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_Key();

    /**
     * Returns the meta object for the attribute '{@link m4jdsl.Property#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see m4jdsl.Property#getValue()
     * @see #getProperty()
     * @generated
     */
    EAttribute getProperty_Value();

    /**
     * Returns the meta object for class '{@link m4jdsl.Parameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parameter</em>'.
     * @see m4jdsl.Parameter
     * @generated
     */
    EClass getParameter();

    /**
     * Returns the meta object for the attribute '{@link m4jdsl.Parameter#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see m4jdsl.Parameter#getName()
     * @see #getParameter()
     * @generated
     */
    EAttribute getParameter_Name();

    /**
     * Returns the meta object for the attribute '{@link m4jdsl.Parameter#getValue <em>Value</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see m4jdsl.Parameter#getValue()
     * @see #getParameter()
     * @generated
     */
    EAttribute getParameter_Value();

    /**
     * Returns the meta object for class '{@link m4jdsl.Assertion <em>Assertion</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Assertion</em>'.
     * @see m4jdsl.Assertion
     * @generated
     */
    EClass getAssertion();

    /**
     * Returns the meta object for the attribute '{@link m4jdsl.Assertion#getPatternToTest <em>Pattern To Test</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Pattern To Test</em>'.
     * @see m4jdsl.Assertion#getPatternToTest()
     * @see #getAssertion()
     * @generated
     */
    EAttribute getAssertion_PatternToTest();

    /**
     * Returns the meta object for class '{@link m4jdsl.ThinkTime <em>Think Time</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Think Time</em>'.
     * @see m4jdsl.ThinkTime
     * @generated
     */
    EClass getThinkTime();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    M4jdslFactory getM4jdslFactory();

    /**
     * <!-- begin-user-doc -->
     * Defines literals for the meta objects that represent
     * <ul>
     *   <li>each class,</li>
     *   <li>each feature of each class,</li>
     *   <li>each operation of each class,</li>
     *   <li>each enum,</li>
     *   <li>and each data type</li>
     * </ul>
     * <!-- end-user-doc -->
     * @generated
     */
    interface Literals {
        /**
         * The meta object literal for the '{@link m4jdsl.impl.WorkloadIntensityImpl <em>Workload Intensity</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see m4jdsl.impl.WorkloadIntensityImpl
         * @see m4jdsl.impl.M4jdslPackageImpl#getWorkloadIntensity()
         * @generated
         */
        EClass WORKLOAD_INTENSITY = eINSTANCE.getWorkloadIntensity();

        /**
         * The meta object literal for the '<em><b>Formula</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute WORKLOAD_INTENSITY__FORMULA = eINSTANCE.getWorkloadIntensity_Formula();

        /**
         * The meta object literal for the '{@link m4jdsl.impl.WorkloadModelImpl <em>Workload Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see m4jdsl.impl.WorkloadModelImpl
         * @see m4jdsl.impl.M4jdslPackageImpl#getWorkloadModel()
         * @generated
         */
        EClass WORKLOAD_MODEL = eINSTANCE.getWorkloadModel();

        /**
         * The meta object literal for the '<em><b>Workload Intensity</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WORKLOAD_MODEL__WORKLOAD_INTENSITY = eINSTANCE.getWorkloadModel_WorkloadIntensity();

        /**
         * The meta object literal for the '<em><b>Application Model</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WORKLOAD_MODEL__APPLICATION_MODEL = eINSTANCE.getWorkloadModel_ApplicationModel();

        /**
         * The meta object literal for the '<em><b>Behavior Mix</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WORKLOAD_MODEL__BEHAVIOR_MIX = eINSTANCE.getWorkloadModel_BehaviorMix();

        /**
         * The meta object literal for the '<em><b>Behavior Models</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference WORKLOAD_MODEL__BEHAVIOR_MODELS = eINSTANCE.getWorkloadModel_BehaviorModels();

        /**
         * The meta object literal for the '{@link m4jdsl.impl.ApplicationModelImpl <em>Application Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see m4jdsl.impl.ApplicationModelImpl
         * @see m4jdsl.impl.M4jdslPackageImpl#getApplicationModel()
         * @generated
         */
        EClass APPLICATION_MODEL = eINSTANCE.getApplicationModel();

        /**
         * The meta object literal for the '<em><b>Session Layer EFSM</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference APPLICATION_MODEL__SESSION_LAYER_EFSM = eINSTANCE.getApplicationModel_SessionLayerEFSM();

        /**
         * The meta object literal for the '{@link m4jdsl.impl.BehaviorMixImpl <em>Behavior Mix</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see m4jdsl.impl.BehaviorMixImpl
         * @see m4jdsl.impl.M4jdslPackageImpl#getBehaviorMix()
         * @generated
         */
        EClass BEHAVIOR_MIX = eINSTANCE.getBehaviorMix();

        /**
         * The meta object literal for the '<em><b>Relative Frequencies</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BEHAVIOR_MIX__RELATIVE_FREQUENCIES = eINSTANCE.getBehaviorMix_RelativeFrequencies();

        /**
         * The meta object literal for the '{@link m4jdsl.impl.RelativeFrequencyImpl <em>Relative Frequency</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see m4jdsl.impl.RelativeFrequencyImpl
         * @see m4jdsl.impl.M4jdslPackageImpl#getRelativeFrequency()
         * @generated
         */
        EClass RELATIVE_FREQUENCY = eINSTANCE.getRelativeFrequency();

        /**
         * The meta object literal for the '<em><b>Behavior Model</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference RELATIVE_FREQUENCY__BEHAVIOR_MODEL = eINSTANCE.getRelativeFrequency_BehaviorModel();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute RELATIVE_FREQUENCY__VALUE = eINSTANCE.getRelativeFrequency_Value();

        /**
         * The meta object literal for the '{@link m4jdsl.impl.BehaviorModelImpl <em>Behavior Model</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see m4jdsl.impl.BehaviorModelImpl
         * @see m4jdsl.impl.M4jdslPackageImpl#getBehaviorModel()
         * @generated
         */
        EClass BEHAVIOR_MODEL = eINSTANCE.getBehaviorModel();

        /**
         * The meta object literal for the '<em><b>Markov States</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference BEHAVIOR_MODEL__MARKOV_STATES = eINSTANCE.getBehaviorModel_MarkovStates();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BEHAVIOR_MODEL__NAME = eINSTANCE.getBehaviorModel_Name();

        /**
         * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute BEHAVIOR_MODEL__FILENAME = eINSTANCE.getBehaviorModel_Filename();

        /**
         * The meta object literal for the '{@link m4jdsl.impl.TransitionImpl <em>Transition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see m4jdsl.impl.TransitionImpl
         * @see m4jdsl.impl.M4jdslPackageImpl#getTransition()
         * @generated
         */
        EClass TRANSITION = eINSTANCE.getTransition();

        /**
         * The meta object literal for the '<em><b>Target State</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TRANSITION__TARGET_STATE = eINSTANCE.getTransition_TargetState();

        /**
         * The meta object literal for the '<em><b>Probability</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TRANSITION__PROBABILITY = eINSTANCE.getTransition_Probability();

        /**
         * The meta object literal for the '<em><b>Think Time</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TRANSITION__THINK_TIME = eINSTANCE.getTransition_ThinkTime();

        /**
         * The meta object literal for the '{@link m4jdsl.impl.MarkovStateImpl <em>Markov State</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see m4jdsl.impl.MarkovStateImpl
         * @see m4jdsl.impl.M4jdslPackageImpl#getMarkovState()
         * @generated
         */
        EClass MARKOV_STATE = eINSTANCE.getMarkovState();

        /**
         * The meta object literal for the '<em><b>Outgoing Transitions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MARKOV_STATE__OUTGOING_TRANSITIONS = eINSTANCE.getMarkovState_OutgoingTransitions();

        /**
         * The meta object literal for the '<em><b>Service</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference MARKOV_STATE__SERVICE = eINSTANCE.getMarkovState_Service();

        /**
         * The meta object literal for the '<em><b>EId</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute MARKOV_STATE__EID = eINSTANCE.getMarkovState_EId();

        /**
         * The meta object literal for the '{@link m4jdsl.impl.ServiceImpl <em>Service</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see m4jdsl.impl.ServiceImpl
         * @see m4jdsl.impl.M4jdslPackageImpl#getService()
         * @generated
         */
        EClass SERVICE = eINSTANCE.getService();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute SERVICE__NAME = eINSTANCE.getService_Name();

        /**
         * The meta object literal for the '{@link m4jdsl.impl.ApplicationStateImpl <em>Application State</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see m4jdsl.impl.ApplicationStateImpl
         * @see m4jdsl.impl.M4jdslPackageImpl#getApplicationState()
         * @generated
         */
        EClass APPLICATION_STATE = eINSTANCE.getApplicationState();

        /**
         * The meta object literal for the '<em><b>Service</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference APPLICATION_STATE__SERVICE = eINSTANCE.getApplicationState_Service();

        /**
         * The meta object literal for the '<em><b>Protocol Details</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference APPLICATION_STATE__PROTOCOL_DETAILS = eINSTANCE.getApplicationState_ProtocolDetails();

        /**
         * The meta object literal for the '<em><b>Outgoing Transitions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference APPLICATION_STATE__OUTGOING_TRANSITIONS = eINSTANCE.getApplicationState_OutgoingTransitions();

        /**
         * The meta object literal for the '<em><b>EId</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute APPLICATION_STATE__EID = eINSTANCE.getApplicationState_EId();

        /**
         * The meta object literal for the '{@link m4jdsl.impl.HTTPRequestImpl <em>HTTP Request</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see m4jdsl.impl.HTTPRequestImpl
         * @see m4jdsl.impl.M4jdslPackageImpl#getHTTPRequest()
         * @generated
         */
        EClass HTTP_REQUEST = eINSTANCE.getHTTPRequest();

        /**
         * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference HTTP_REQUEST__PROPERTIES = eINSTANCE.getHTTPRequest_Properties();

        /**
         * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference HTTP_REQUEST__PARAMETERS = eINSTANCE.getHTTPRequest_Parameters();

        /**
         * The meta object literal for the '{@link m4jdsl.impl.RequestImpl <em>Request</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see m4jdsl.impl.RequestImpl
         * @see m4jdsl.impl.M4jdslPackageImpl#getRequest()
         * @generated
         */
        EClass REQUEST = eINSTANCE.getRequest();

        /**
         * The meta object literal for the '<em><b>EId</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute REQUEST__EID = eINSTANCE.getRequest_EId();

        /**
         * The meta object literal for the '<em><b>Assertions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference REQUEST__ASSERTIONS = eINSTANCE.getRequest_Assertions();

        /**
         * The meta object literal for the '{@link m4jdsl.impl.ProtocolStateImpl <em>Protocol State</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see m4jdsl.impl.ProtocolStateImpl
         * @see m4jdsl.impl.M4jdslPackageImpl#getProtocolState()
         * @generated
         */
        EClass PROTOCOL_STATE = eINSTANCE.getProtocolState();

        /**
         * The meta object literal for the '<em><b>Request</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROTOCOL_STATE__REQUEST = eINSTANCE.getProtocolState_Request();

        /**
         * The meta object literal for the '<em><b>Outgoing Transitions</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROTOCOL_STATE__OUTGOING_TRANSITIONS = eINSTANCE.getProtocolState_OutgoingTransitions();

        /**
         * The meta object literal for the '<em><b>EId</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROTOCOL_STATE__EID = eINSTANCE.getProtocolState_EId();

        /**
         * The meta object literal for the '{@link m4jdsl.impl.ProtocolTransitionImpl <em>Protocol Transition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see m4jdsl.impl.ProtocolTransitionImpl
         * @see m4jdsl.impl.M4jdslPackageImpl#getProtocolTransition()
         * @generated
         */
        EClass PROTOCOL_TRANSITION = eINSTANCE.getProtocolTransition();

        /**
         * The meta object literal for the '<em><b>Guard</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROTOCOL_TRANSITION__GUARD = eINSTANCE.getProtocolTransition_Guard();

        /**
         * The meta object literal for the '<em><b>Target State</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROTOCOL_TRANSITION__TARGET_STATE = eINSTANCE.getProtocolTransition_TargetState();

        /**
         * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROTOCOL_TRANSITION__ACTION = eINSTANCE.getProtocolTransition_Action();

        /**
         * The meta object literal for the '{@link m4jdsl.impl.ProtocolLayerEFSMImpl <em>Protocol Layer EFSM</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see m4jdsl.impl.ProtocolLayerEFSMImpl
         * @see m4jdsl.impl.M4jdslPackageImpl#getProtocolLayerEFSM()
         * @generated
         */
        EClass PROTOCOL_LAYER_EFSM = eINSTANCE.getProtocolLayerEFSM();

        /**
         * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROTOCOL_LAYER_EFSM__STATES = eINSTANCE.getProtocolLayerEFSM_States();

        /**
         * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROTOCOL_LAYER_EFSM__INITIAL_STATE = eINSTANCE.getProtocolLayerEFSM_InitialState();

        /**
         * The meta object literal for the '<em><b>Exit State</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference PROTOCOL_LAYER_EFSM__EXIT_STATE = eINSTANCE.getProtocolLayerEFSM_ExitState();

        /**
         * The meta object literal for the '{@link m4jdsl.impl.SessionLayerEFSMImpl <em>Session Layer EFSM</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see m4jdsl.impl.SessionLayerEFSMImpl
         * @see m4jdsl.impl.M4jdslPackageImpl#getSessionLayerEFSM()
         * @generated
         */
        EClass SESSION_LAYER_EFSM = eINSTANCE.getSessionLayerEFSM();

        /**
         * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SESSION_LAYER_EFSM__STATES = eINSTANCE.getSessionLayerEFSM_States();

        /**
         * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SESSION_LAYER_EFSM__INITIAL_STATE = eINSTANCE.getSessionLayerEFSM_InitialState();

        /**
         * The meta object literal for the '<em><b>Exit State</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference SESSION_LAYER_EFSM__EXIT_STATE = eINSTANCE.getSessionLayerEFSM_ExitState();

        /**
         * The meta object literal for the '{@link m4jdsl.impl.ConstantWorkloadIntensityImpl <em>Constant Workload Intensity</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see m4jdsl.impl.ConstantWorkloadIntensityImpl
         * @see m4jdsl.impl.M4jdslPackageImpl#getConstantWorkloadIntensity()
         * @generated
         */
        EClass CONSTANT_WORKLOAD_INTENSITY = eINSTANCE.getConstantWorkloadIntensity();

        /**
         * The meta object literal for the '<em><b>Number Of Sessions</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute CONSTANT_WORKLOAD_INTENSITY__NUMBER_OF_SESSIONS = eINSTANCE.getConstantWorkloadIntensity_NumberOfSessions();

        /**
         * The meta object literal for the '{@link m4jdsl.impl.ApplicationTransitionImpl <em>Application Transition</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see m4jdsl.impl.ApplicationTransitionImpl
         * @see m4jdsl.impl.M4jdslPackageImpl#getApplicationTransition()
         * @generated
         */
        EClass APPLICATION_TRANSITION = eINSTANCE.getApplicationTransition();

        /**
         * The meta object literal for the '<em><b>Target State</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference APPLICATION_TRANSITION__TARGET_STATE = eINSTANCE.getApplicationTransition_TargetState();

        /**
         * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute APPLICATION_TRANSITION__ACTION = eINSTANCE.getApplicationTransition_Action();

        /**
         * The meta object literal for the '<em><b>Guard</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute APPLICATION_TRANSITION__GUARD = eINSTANCE.getApplicationTransition_Guard();

        /**
         * The meta object literal for the '{@link m4jdsl.impl.NormalDistributionImpl <em>Normal Distribution</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see m4jdsl.impl.NormalDistributionImpl
         * @see m4jdsl.impl.M4jdslPackageImpl#getNormalDistribution()
         * @generated
         */
        EClass NORMAL_DISTRIBUTION = eINSTANCE.getNormalDistribution();

        /**
         * The meta object literal for the '<em><b>Mean</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NORMAL_DISTRIBUTION__MEAN = eINSTANCE.getNormalDistribution_Mean();

        /**
         * The meta object literal for the '<em><b>Deviation</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NORMAL_DISTRIBUTION__DEVIATION = eINSTANCE.getNormalDistribution_Deviation();

        /**
         * The meta object literal for the '{@link m4jdsl.impl.PropertyImpl <em>Property</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see m4jdsl.impl.PropertyImpl
         * @see m4jdsl.impl.M4jdslPackageImpl#getProperty()
         * @generated
         */
        EClass PROPERTY = eINSTANCE.getProperty();

        /**
         * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY__KEY = eINSTANCE.getProperty_Key();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PROPERTY__VALUE = eINSTANCE.getProperty_Value();

        /**
         * The meta object literal for the '{@link m4jdsl.impl.ParameterImpl <em>Parameter</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see m4jdsl.impl.ParameterImpl
         * @see m4jdsl.impl.M4jdslPackageImpl#getParameter()
         * @generated
         */
        EClass PARAMETER = eINSTANCE.getParameter();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

        /**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

        /**
         * The meta object literal for the '{@link m4jdsl.impl.AssertionImpl <em>Assertion</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see m4jdsl.impl.AssertionImpl
         * @see m4jdsl.impl.M4jdslPackageImpl#getAssertion()
         * @generated
         */
        EClass ASSERTION = eINSTANCE.getAssertion();

        /**
         * The meta object literal for the '<em><b>Pattern To Test</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute ASSERTION__PATTERN_TO_TEST = eINSTANCE.getAssertion_PatternToTest();

        /**
         * The meta object literal for the '{@link m4jdsl.impl.ThinkTimeImpl <em>Think Time</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see m4jdsl.impl.ThinkTimeImpl
         * @see m4jdsl.impl.M4jdslPackageImpl#getThinkTime()
         * @generated
         */
        EClass THINK_TIME = eINSTANCE.getThinkTime();

    }

} //M4jdslPackage
