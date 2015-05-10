/**
 */
package m4jdsl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The feature id for the '<em><b>Exit State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BEHAVIOR_MODEL__EXIT_STATE = 3;

    /**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BEHAVIOR_MODEL__INITIAL_STATE = 4;

    /**
	 * The number of structural features of the '<em>Behavior Model</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BEHAVIOR_MODEL_FEATURE_COUNT = 5;

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
	 * The meta object id for the '{@link m4jdsl.impl.BehaviorModelStateImpl <em>Behavior Model State</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see m4jdsl.impl.BehaviorModelStateImpl
	 * @see m4jdsl.impl.M4jdslPackageImpl#getBehaviorModelState()
	 * @generated
	 */
    int BEHAVIOR_MODEL_STATE = 30;

    /**
	 * The feature id for the '<em><b>EId</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BEHAVIOR_MODEL_STATE__EID = 0;

    /**
	 * The number of structural features of the '<em>Behavior Model State</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BEHAVIOR_MODEL_STATE_FEATURE_COUNT = 1;

    /**
	 * The number of operations of the '<em>Behavior Model State</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BEHAVIOR_MODEL_STATE_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>EId</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MARKOV_STATE__EID = BEHAVIOR_MODEL_STATE__EID;

    /**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MARKOV_STATE__OUTGOING_TRANSITIONS = BEHAVIOR_MODEL_STATE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MARKOV_STATE__SERVICE = BEHAVIOR_MODEL_STATE_FEATURE_COUNT + 1;

    /**
	 * The number of structural features of the '<em>Markov State</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MARKOV_STATE_FEATURE_COUNT = BEHAVIOR_MODEL_STATE_FEATURE_COUNT + 2;

    /**
	 * The number of operations of the '<em>Markov State</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int MARKOV_STATE_OPERATION_COUNT = BEHAVIOR_MODEL_STATE_OPERATION_COUNT + 0;

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
	 * The meta object id for the '{@link m4jdsl.impl.SessionLayerEFSMStateImpl <em>Session Layer EFSM State</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see m4jdsl.impl.SessionLayerEFSMStateImpl
	 * @see m4jdsl.impl.M4jdslPackageImpl#getSessionLayerEFSMState()
	 * @generated
	 */
    int SESSION_LAYER_EFSM_STATE = 28;

    /**
	 * The feature id for the '<em><b>EId</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SESSION_LAYER_EFSM_STATE__EID = 0;

    /**
	 * The number of structural features of the '<em>Session Layer EFSM State</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SESSION_LAYER_EFSM_STATE_FEATURE_COUNT = 1;

    /**
	 * The number of operations of the '<em>Session Layer EFSM State</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SESSION_LAYER_EFSM_STATE_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>EId</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int APPLICATION_STATE__EID = SESSION_LAYER_EFSM_STATE__EID;

    /**
	 * The feature id for the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int APPLICATION_STATE__SERVICE = SESSION_LAYER_EFSM_STATE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Protocol Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int APPLICATION_STATE__PROTOCOL_DETAILS = SESSION_LAYER_EFSM_STATE_FEATURE_COUNT + 1;

    /**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int APPLICATION_STATE__OUTGOING_TRANSITIONS = SESSION_LAYER_EFSM_STATE_FEATURE_COUNT + 2;

    /**
	 * The number of structural features of the '<em>Application State</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int APPLICATION_STATE_FEATURE_COUNT = SESSION_LAYER_EFSM_STATE_FEATURE_COUNT + 3;

    /**
	 * The number of operations of the '<em>Application State</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int APPLICATION_STATE_OPERATION_COUNT = SESSION_LAYER_EFSM_STATE_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link m4jdsl.impl.RequestImpl <em>Request</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see m4jdsl.impl.RequestImpl
	 * @see m4jdsl.impl.M4jdslPackageImpl#getRequest()
	 * @generated
	 */
    int REQUEST = 15;

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
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int REQUEST__PROPERTIES = 2;

    /**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int REQUEST__PARAMETERS = 3;

    /**
	 * The number of structural features of the '<em>Request</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int REQUEST_FEATURE_COUNT = 4;

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
    int HTTP_REQUEST__PROPERTIES = REQUEST__PROPERTIES;

    /**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int HTTP_REQUEST__PARAMETERS = REQUEST__PARAMETERS;

    /**
	 * The number of structural features of the '<em>HTTP Request</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int HTTP_REQUEST_FEATURE_COUNT = REQUEST_FEATURE_COUNT + 0;

    /**
	 * The number of operations of the '<em>HTTP Request</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int HTTP_REQUEST_OPERATION_COUNT = REQUEST_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link m4jdsl.impl.JavaRequestImpl <em>Java Request</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see m4jdsl.impl.JavaRequestImpl
	 * @see m4jdsl.impl.M4jdslPackageImpl#getJavaRequest()
	 * @generated
	 */
    int JAVA_REQUEST = 11;

    /**
	 * The feature id for the '<em><b>EId</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int JAVA_REQUEST__EID = REQUEST__EID;

    /**
	 * The feature id for the '<em><b>Assertions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int JAVA_REQUEST__ASSERTIONS = REQUEST__ASSERTIONS;

    /**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int JAVA_REQUEST__PROPERTIES = REQUEST__PROPERTIES;

    /**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int JAVA_REQUEST__PARAMETERS = REQUEST__PARAMETERS;

    /**
	 * The number of structural features of the '<em>Java Request</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int JAVA_REQUEST_FEATURE_COUNT = REQUEST_FEATURE_COUNT + 0;

    /**
	 * The number of operations of the '<em>Java Request</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int JAVA_REQUEST_OPERATION_COUNT = REQUEST_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link m4jdsl.impl.BeanShellRequestImpl <em>Bean Shell Request</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see m4jdsl.impl.BeanShellRequestImpl
	 * @see m4jdsl.impl.M4jdslPackageImpl#getBeanShellRequest()
	 * @generated
	 */
    int BEAN_SHELL_REQUEST = 12;

    /**
	 * The feature id for the '<em><b>EId</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BEAN_SHELL_REQUEST__EID = REQUEST__EID;

    /**
	 * The feature id for the '<em><b>Assertions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BEAN_SHELL_REQUEST__ASSERTIONS = REQUEST__ASSERTIONS;

    /**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BEAN_SHELL_REQUEST__PROPERTIES = REQUEST__PROPERTIES;

    /**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BEAN_SHELL_REQUEST__PARAMETERS = REQUEST__PARAMETERS;

    /**
	 * The number of structural features of the '<em>Bean Shell Request</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BEAN_SHELL_REQUEST_FEATURE_COUNT = REQUEST_FEATURE_COUNT + 0;

    /**
	 * The number of operations of the '<em>Bean Shell Request</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BEAN_SHELL_REQUEST_OPERATION_COUNT = REQUEST_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link m4jdsl.impl.JUnitRequestImpl <em>JUnit Request</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see m4jdsl.impl.JUnitRequestImpl
	 * @see m4jdsl.impl.M4jdslPackageImpl#getJUnitRequest()
	 * @generated
	 */
    int JUNIT_REQUEST = 13;

    /**
	 * The feature id for the '<em><b>EId</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int JUNIT_REQUEST__EID = REQUEST__EID;

    /**
	 * The feature id for the '<em><b>Assertions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int JUNIT_REQUEST__ASSERTIONS = REQUEST__ASSERTIONS;

    /**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int JUNIT_REQUEST__PROPERTIES = REQUEST__PROPERTIES;

    /**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int JUNIT_REQUEST__PARAMETERS = REQUEST__PARAMETERS;

    /**
	 * The number of structural features of the '<em>JUnit Request</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int JUNIT_REQUEST_FEATURE_COUNT = REQUEST_FEATURE_COUNT + 0;

    /**
	 * The number of operations of the '<em>JUnit Request</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int JUNIT_REQUEST_OPERATION_COUNT = REQUEST_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link m4jdsl.impl.SOAPRequestImpl <em>SOAP Request</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see m4jdsl.impl.SOAPRequestImpl
	 * @see m4jdsl.impl.M4jdslPackageImpl#getSOAPRequest()
	 * @generated
	 */
    int SOAP_REQUEST = 14;

    /**
	 * The feature id for the '<em><b>EId</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SOAP_REQUEST__EID = REQUEST__EID;

    /**
	 * The feature id for the '<em><b>Assertions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SOAP_REQUEST__ASSERTIONS = REQUEST__ASSERTIONS;

    /**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SOAP_REQUEST__PROPERTIES = REQUEST__PROPERTIES;

    /**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SOAP_REQUEST__PARAMETERS = REQUEST__PARAMETERS;

    /**
	 * The number of structural features of the '<em>SOAP Request</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SOAP_REQUEST_FEATURE_COUNT = REQUEST_FEATURE_COUNT + 0;

    /**
	 * The number of operations of the '<em>SOAP Request</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SOAP_REQUEST_OPERATION_COUNT = REQUEST_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link m4jdsl.impl.ProtocolLayerEFSMStateImpl <em>Protocol Layer EFSM State</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see m4jdsl.impl.ProtocolLayerEFSMStateImpl
	 * @see m4jdsl.impl.M4jdslPackageImpl#getProtocolLayerEFSMState()
	 * @generated
	 */
    int PROTOCOL_LAYER_EFSM_STATE = 32;

    /**
	 * The feature id for the '<em><b>EId</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROTOCOL_LAYER_EFSM_STATE__EID = 0;

    /**
	 * The number of structural features of the '<em>Protocol Layer EFSM State</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROTOCOL_LAYER_EFSM_STATE_FEATURE_COUNT = 1;

    /**
	 * The number of operations of the '<em>Protocol Layer EFSM State</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROTOCOL_LAYER_EFSM_STATE_OPERATION_COUNT = 0;

    /**
	 * The meta object id for the '{@link m4jdsl.impl.ProtocolStateImpl <em>Protocol State</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see m4jdsl.impl.ProtocolStateImpl
	 * @see m4jdsl.impl.M4jdslPackageImpl#getProtocolState()
	 * @generated
	 */
    int PROTOCOL_STATE = 16;

    /**
	 * The feature id for the '<em><b>EId</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROTOCOL_STATE__EID = PROTOCOL_LAYER_EFSM_STATE__EID;

    /**
	 * The feature id for the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROTOCOL_STATE__REQUEST = PROTOCOL_LAYER_EFSM_STATE_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROTOCOL_STATE__OUTGOING_TRANSITIONS = PROTOCOL_LAYER_EFSM_STATE_FEATURE_COUNT + 1;

    /**
	 * The number of structural features of the '<em>Protocol State</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROTOCOL_STATE_FEATURE_COUNT = PROTOCOL_LAYER_EFSM_STATE_FEATURE_COUNT + 2;

    /**
	 * The number of operations of the '<em>Protocol State</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROTOCOL_STATE_OPERATION_COUNT = PROTOCOL_LAYER_EFSM_STATE_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link m4jdsl.impl.ProtocolTransitionImpl <em>Protocol Transition</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see m4jdsl.impl.ProtocolTransitionImpl
	 * @see m4jdsl.impl.M4jdslPackageImpl#getProtocolTransition()
	 * @generated
	 */
    int PROTOCOL_TRANSITION = 17;

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
    int PROTOCOL_LAYER_EFSM = 18;

    /**
	 * The feature id for the '<em><b>Protocol States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROTOCOL_LAYER_EFSM__PROTOCOL_STATES = 0;

    /**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROTOCOL_LAYER_EFSM__INITIAL_STATE = 1;

    /**
	 * The feature id for the '<em><b>Exit State</b></em>' containment reference.
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
    int SESSION_LAYER_EFSM = 19;

    /**
	 * The feature id for the '<em><b>Application States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SESSION_LAYER_EFSM__APPLICATION_STATES = 0;

    /**
	 * The feature id for the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SESSION_LAYER_EFSM__INITIAL_STATE = 1;

    /**
	 * The feature id for the '<em><b>Exit State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SESSION_LAYER_EFSM__EXIT_STATE = 2;

    /**
	 * The feature id for the '<em><b>Guard Action Parameter List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SESSION_LAYER_EFSM__GUARD_ACTION_PARAMETER_LIST = 3;

				/**
	 * The number of structural features of the '<em>Session Layer EFSM</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int SESSION_LAYER_EFSM_FEATURE_COUNT = 4;

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
    int CONSTANT_WORKLOAD_INTENSITY = 20;

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
    int APPLICATION_TRANSITION = 21;

    /**
	 * The feature id for the '<em><b>Target State</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int APPLICATION_TRANSITION__TARGET_STATE = 0;

    /**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int APPLICATION_TRANSITION__GUARD = 1;

				/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int APPLICATION_TRANSITION__ACTION = 2;

    /**
	 * The feature id for the '<em><b>Application State</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_TRANSITION__APPLICATION_STATE = 3;

				/**
	 * The number of structural features of the '<em>Application Transition</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int APPLICATION_TRANSITION_FEATURE_COUNT = 4;

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
    int THINK_TIME = 26;

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
	 * The meta object id for the '{@link m4jdsl.impl.NormallyDistributedThinkTimeImpl <em>Normally Distributed Think Time</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see m4jdsl.impl.NormallyDistributedThinkTimeImpl
	 * @see m4jdsl.impl.M4jdslPackageImpl#getNormallyDistributedThinkTime()
	 * @generated
	 */
    int NORMALLY_DISTRIBUTED_THINK_TIME = 22;

    /**
	 * The feature id for the '<em><b>Mean</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NORMALLY_DISTRIBUTED_THINK_TIME__MEAN = THINK_TIME_FEATURE_COUNT + 0;

    /**
	 * The feature id for the '<em><b>Deviation</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NORMALLY_DISTRIBUTED_THINK_TIME__DEVIATION = THINK_TIME_FEATURE_COUNT + 1;

    /**
	 * The number of structural features of the '<em>Normally Distributed Think Time</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NORMALLY_DISTRIBUTED_THINK_TIME_FEATURE_COUNT = THINK_TIME_FEATURE_COUNT + 2;

    /**
	 * The number of operations of the '<em>Normally Distributed Think Time</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int NORMALLY_DISTRIBUTED_THINK_TIME_OPERATION_COUNT = THINK_TIME_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link m4jdsl.impl.PropertyImpl <em>Property</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see m4jdsl.impl.PropertyImpl
	 * @see m4jdsl.impl.M4jdslPackageImpl#getProperty()
	 * @generated
	 */
    int PROPERTY = 23;

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
    int PARAMETER = 24;

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
    int ASSERTION = 25;

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
	 * The meta object id for the '{@link m4jdsl.impl.ApplicationExitStateImpl <em>Application Exit State</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see m4jdsl.impl.ApplicationExitStateImpl
	 * @see m4jdsl.impl.M4jdslPackageImpl#getApplicationExitState()
	 * @generated
	 */
    int APPLICATION_EXIT_STATE = 27;

    /**
	 * The feature id for the '<em><b>EId</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int APPLICATION_EXIT_STATE__EID = SESSION_LAYER_EFSM_STATE__EID;

    /**
	 * The number of structural features of the '<em>Application Exit State</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int APPLICATION_EXIT_STATE_FEATURE_COUNT = SESSION_LAYER_EFSM_STATE_FEATURE_COUNT + 0;

    /**
	 * The number of operations of the '<em>Application Exit State</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int APPLICATION_EXIT_STATE_OPERATION_COUNT = SESSION_LAYER_EFSM_STATE_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link m4jdsl.impl.BehaviorModelExitStateImpl <em>Behavior Model Exit State</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see m4jdsl.impl.BehaviorModelExitStateImpl
	 * @see m4jdsl.impl.M4jdslPackageImpl#getBehaviorModelExitState()
	 * @generated
	 */
    int BEHAVIOR_MODEL_EXIT_STATE = 29;

    /**
	 * The feature id for the '<em><b>EId</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BEHAVIOR_MODEL_EXIT_STATE__EID = BEHAVIOR_MODEL_STATE__EID;

    /**
	 * The number of structural features of the '<em>Behavior Model Exit State</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BEHAVIOR_MODEL_EXIT_STATE_FEATURE_COUNT = BEHAVIOR_MODEL_STATE_FEATURE_COUNT + 0;

    /**
	 * The number of operations of the '<em>Behavior Model Exit State</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int BEHAVIOR_MODEL_EXIT_STATE_OPERATION_COUNT = BEHAVIOR_MODEL_STATE_OPERATION_COUNT + 0;

    /**
	 * The meta object id for the '{@link m4jdsl.impl.ProtocolExitStateImpl <em>Protocol Exit State</em>}' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see m4jdsl.impl.ProtocolExitStateImpl
	 * @see m4jdsl.impl.M4jdslPackageImpl#getProtocolExitState()
	 * @generated
	 */
    int PROTOCOL_EXIT_STATE = 31;

    /**
	 * The feature id for the '<em><b>EId</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROTOCOL_EXIT_STATE__EID = PROTOCOL_LAYER_EFSM_STATE__EID;

    /**
	 * The number of structural features of the '<em>Protocol Exit State</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROTOCOL_EXIT_STATE_FEATURE_COUNT = PROTOCOL_LAYER_EFSM_STATE_FEATURE_COUNT + 0;

    /**
	 * The number of operations of the '<em>Protocol Exit State</em>' class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
    int PROTOCOL_EXIT_STATE_OPERATION_COUNT = PROTOCOL_LAYER_EFSM_STATE_OPERATION_COUNT + 0;


    /**
	 * The meta object id for the '{@link m4jdsl.impl.GuardActionParameterImpl <em>Guard Action Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m4jdsl.impl.GuardActionParameterImpl
	 * @see m4jdsl.impl.M4jdslPackageImpl#getGuardActionParameter()
	 * @generated
	 */
	int GUARD_ACTION_PARAMETER = 33;

				/**
	 * The feature id for the '<em><b>Guard Action Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_ACTION_PARAMETER__GUARD_ACTION_PARAMETER_NAME = 0;

				/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_ACTION_PARAMETER__PARAMETER_TYPE = 1;

				/**
	 * The feature id for the '<em><b>Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_ACTION_PARAMETER__SOURCE_NAME = 2;

				/**
	 * The feature id for the '<em><b>Target Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_ACTION_PARAMETER__TARGET_NAME = 3;

				/**
	 * The number of structural features of the '<em>Guard Action Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_ACTION_PARAMETER_FEATURE_COUNT = 4;

				/**
	 * The number of operations of the '<em>Guard Action Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_ACTION_PARAMETER_OPERATION_COUNT = 0;

				/**
	 * The meta object id for the '{@link m4jdsl.impl.GuardImpl <em>Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m4jdsl.impl.GuardImpl
	 * @see m4jdsl.impl.M4jdslPackageImpl#getGuard()
	 * @generated
	 */
	int GUARD = 34;

				/**
	 * The feature id for the '<em><b>Guard Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD__GUARD_PARAMETER = 0;

				/**
	 * The feature id for the '<em><b>Negate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD__NEGATE = 1;

				/**
	 * The number of structural features of the '<em>Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_FEATURE_COUNT = 2;

				/**
	 * The number of operations of the '<em>Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_OPERATION_COUNT = 0;

				/**
	 * The meta object id for the '{@link m4jdsl.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m4jdsl.impl.ActionImpl
	 * @see m4jdsl.impl.M4jdslPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 35;

				/**
	 * The feature id for the '<em><b>Action Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTION_PARAMETER = 0;

				/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 1;

				/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

				/**
	 * The meta object id for the '{@link m4jdsl.impl.GuardActionParameterListImpl <em>Guard Action Parameter List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m4jdsl.impl.GuardActionParameterListImpl
	 * @see m4jdsl.impl.M4jdslPackageImpl#getGuardActionParameterList()
	 * @generated
	 */
	int GUARD_ACTION_PARAMETER_LIST = 36;

				/**
	 * The feature id for the '<em><b>Guard Action Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_ACTION_PARAMETER_LIST__GUARD_ACTION_PARAMETERS = 0;

				/**
	 * The number of structural features of the '<em>Guard Action Parameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_ACTION_PARAMETER_LIST_FEATURE_COUNT = 1;

				/**
	 * The number of operations of the '<em>Guard Action Parameter List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GUARD_ACTION_PARAMETER_LIST_OPERATION_COUNT = 0;

				/**
	 * The meta object id for the '{@link m4jdsl.GuardActionParameterType <em>Guard Action Parameter Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see m4jdsl.GuardActionParameterType
	 * @see m4jdsl.impl.M4jdslPackageImpl#getGuardActionParameterType()
	 * @generated
	 */
	int GUARD_ACTION_PARAMETER_TYPE = 37;

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
	 * Returns the meta object for the containment reference '{@link m4jdsl.BehaviorModel#getExitState <em>Exit State</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exit State</em>'.
	 * @see m4jdsl.BehaviorModel#getExitState()
	 * @see #getBehaviorModel()
	 * @generated
	 */
    EReference getBehaviorModel_ExitState();

    /**
	 * Returns the meta object for the reference '{@link m4jdsl.BehaviorModel#getInitialState <em>Initial State</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Initial State</em>'.
	 * @see m4jdsl.BehaviorModel#getInitialState()
	 * @see #getBehaviorModel()
	 * @generated
	 */
    EReference getBehaviorModel_InitialState();

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
	 * Returns the meta object for class '{@link m4jdsl.HTTPRequest <em>HTTP Request</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>HTTP Request</em>'.
	 * @see m4jdsl.HTTPRequest
	 * @generated
	 */
    EClass getHTTPRequest();

    /**
	 * Returns the meta object for class '{@link m4jdsl.JavaRequest <em>Java Request</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java Request</em>'.
	 * @see m4jdsl.JavaRequest
	 * @generated
	 */
    EClass getJavaRequest();

    /**
	 * Returns the meta object for class '{@link m4jdsl.BeanShellRequest <em>Bean Shell Request</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bean Shell Request</em>'.
	 * @see m4jdsl.BeanShellRequest
	 * @generated
	 */
    EClass getBeanShellRequest();

    /**
	 * Returns the meta object for class '{@link m4jdsl.JUnitRequest <em>JUnit Request</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>JUnit Request</em>'.
	 * @see m4jdsl.JUnitRequest
	 * @generated
	 */
    EClass getJUnitRequest();

    /**
	 * Returns the meta object for class '{@link m4jdsl.SOAPRequest <em>SOAP Request</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SOAP Request</em>'.
	 * @see m4jdsl.SOAPRequest
	 * @generated
	 */
    EClass getSOAPRequest();

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
	 * Returns the meta object for the containment reference list '{@link m4jdsl.Request#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see m4jdsl.Request#getProperties()
	 * @see #getRequest()
	 * @generated
	 */
    EReference getRequest_Properties();

    /**
	 * Returns the meta object for the containment reference list '{@link m4jdsl.Request#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see m4jdsl.Request#getParameters()
	 * @see #getRequest()
	 * @generated
	 */
    EReference getRequest_Parameters();

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
	 * Returns the meta object for the containment reference list '{@link m4jdsl.ProtocolLayerEFSM#getProtocolStates <em>Protocol States</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Protocol States</em>'.
	 * @see m4jdsl.ProtocolLayerEFSM#getProtocolStates()
	 * @see #getProtocolLayerEFSM()
	 * @generated
	 */
    EReference getProtocolLayerEFSM_ProtocolStates();

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
	 * Returns the meta object for the containment reference '{@link m4jdsl.ProtocolLayerEFSM#getExitState <em>Exit State</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exit State</em>'.
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
	 * Returns the meta object for the containment reference list '{@link m4jdsl.SessionLayerEFSM#getApplicationStates <em>Application States</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Application States</em>'.
	 * @see m4jdsl.SessionLayerEFSM#getApplicationStates()
	 * @see #getSessionLayerEFSM()
	 * @generated
	 */
    EReference getSessionLayerEFSM_ApplicationStates();

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
	 * Returns the meta object for the containment reference '{@link m4jdsl.SessionLayerEFSM#getExitState <em>Exit State</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Exit State</em>'.
	 * @see m4jdsl.SessionLayerEFSM#getExitState()
	 * @see #getSessionLayerEFSM()
	 * @generated
	 */
    EReference getSessionLayerEFSM_ExitState();

    /**
	 * Returns the meta object for the containment reference '{@link m4jdsl.SessionLayerEFSM#getGuardActionParameterList <em>Guard Action Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard Action Parameter List</em>'.
	 * @see m4jdsl.SessionLayerEFSM#getGuardActionParameterList()
	 * @see #getSessionLayerEFSM()
	 * @generated
	 */
	EReference getSessionLayerEFSM_GuardActionParameterList();

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
	 * Returns the meta object for the containment reference list '{@link m4jdsl.ApplicationTransition#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action</em>'.
	 * @see m4jdsl.ApplicationTransition#getAction()
	 * @see #getApplicationTransition()
	 * @generated
	 */
    EReference getApplicationTransition_Action();

    /**
	 * Returns the meta object for the container reference '{@link m4jdsl.ApplicationTransition#getApplicationState <em>Application State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Application State</em>'.
	 * @see m4jdsl.ApplicationTransition#getApplicationState()
	 * @see #getApplicationTransition()
	 * @generated
	 */
	EReference getApplicationTransition_ApplicationState();

				/**
	 * Returns the meta object for the containment reference list '{@link m4jdsl.ApplicationTransition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guard</em>'.
	 * @see m4jdsl.ApplicationTransition#getGuard()
	 * @see #getApplicationTransition()
	 * @generated
	 */
    EReference getApplicationTransition_Guard();

    /**
	 * Returns the meta object for class '{@link m4jdsl.NormallyDistributedThinkTime <em>Normally Distributed Think Time</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Normally Distributed Think Time</em>'.
	 * @see m4jdsl.NormallyDistributedThinkTime
	 * @generated
	 */
    EClass getNormallyDistributedThinkTime();

    /**
	 * Returns the meta object for the attribute '{@link m4jdsl.NormallyDistributedThinkTime#getMean <em>Mean</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mean</em>'.
	 * @see m4jdsl.NormallyDistributedThinkTime#getMean()
	 * @see #getNormallyDistributedThinkTime()
	 * @generated
	 */
    EAttribute getNormallyDistributedThinkTime_Mean();

    /**
	 * Returns the meta object for the attribute '{@link m4jdsl.NormallyDistributedThinkTime#getDeviation <em>Deviation</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Deviation</em>'.
	 * @see m4jdsl.NormallyDistributedThinkTime#getDeviation()
	 * @see #getNormallyDistributedThinkTime()
	 * @generated
	 */
    EAttribute getNormallyDistributedThinkTime_Deviation();

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
	 * Returns the meta object for class '{@link m4jdsl.ApplicationExitState <em>Application Exit State</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Exit State</em>'.
	 * @see m4jdsl.ApplicationExitState
	 * @generated
	 */
    EClass getApplicationExitState();

    /**
	 * Returns the meta object for class '{@link m4jdsl.SessionLayerEFSMState <em>Session Layer EFSM State</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Session Layer EFSM State</em>'.
	 * @see m4jdsl.SessionLayerEFSMState
	 * @generated
	 */
    EClass getSessionLayerEFSMState();

    /**
	 * Returns the meta object for the attribute '{@link m4jdsl.SessionLayerEFSMState#getEId <em>EId</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EId</em>'.
	 * @see m4jdsl.SessionLayerEFSMState#getEId()
	 * @see #getSessionLayerEFSMState()
	 * @generated
	 */
    EAttribute getSessionLayerEFSMState_EId();

    /**
	 * Returns the meta object for class '{@link m4jdsl.BehaviorModelExitState <em>Behavior Model Exit State</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Model Exit State</em>'.
	 * @see m4jdsl.BehaviorModelExitState
	 * @generated
	 */
    EClass getBehaviorModelExitState();

    /**
	 * Returns the meta object for class '{@link m4jdsl.BehaviorModelState <em>Behavior Model State</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Model State</em>'.
	 * @see m4jdsl.BehaviorModelState
	 * @generated
	 */
    EClass getBehaviorModelState();

    /**
	 * Returns the meta object for the attribute '{@link m4jdsl.BehaviorModelState#getEId <em>EId</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EId</em>'.
	 * @see m4jdsl.BehaviorModelState#getEId()
	 * @see #getBehaviorModelState()
	 * @generated
	 */
    EAttribute getBehaviorModelState_EId();

    /**
	 * Returns the meta object for class '{@link m4jdsl.ProtocolExitState <em>Protocol Exit State</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol Exit State</em>'.
	 * @see m4jdsl.ProtocolExitState
	 * @generated
	 */
    EClass getProtocolExitState();

    /**
	 * Returns the meta object for class '{@link m4jdsl.ProtocolLayerEFSMState <em>Protocol Layer EFSM State</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Protocol Layer EFSM State</em>'.
	 * @see m4jdsl.ProtocolLayerEFSMState
	 * @generated
	 */
    EClass getProtocolLayerEFSMState();

    /**
	 * Returns the meta object for the attribute '{@link m4jdsl.ProtocolLayerEFSMState#getEId <em>EId</em>}'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>EId</em>'.
	 * @see m4jdsl.ProtocolLayerEFSMState#getEId()
	 * @see #getProtocolLayerEFSMState()
	 * @generated
	 */
    EAttribute getProtocolLayerEFSMState_EId();

    /**
	 * Returns the meta object for class '{@link m4jdsl.GuardActionParameter <em>Guard Action Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard Action Parameter</em>'.
	 * @see m4jdsl.GuardActionParameter
	 * @generated
	 */
	EClass getGuardActionParameter();

				/**
	 * Returns the meta object for the attribute '{@link m4jdsl.GuardActionParameter#getGuardActionParameterName <em>Guard Action Parameter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard Action Parameter Name</em>'.
	 * @see m4jdsl.GuardActionParameter#getGuardActionParameterName()
	 * @see #getGuardActionParameter()
	 * @generated
	 */
	EAttribute getGuardActionParameter_GuardActionParameterName();

				/**
	 * Returns the meta object for the attribute '{@link m4jdsl.GuardActionParameter#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Parameter Type</em>'.
	 * @see m4jdsl.GuardActionParameter#getParameterType()
	 * @see #getGuardActionParameter()
	 * @generated
	 */
	EAttribute getGuardActionParameter_ParameterType();

				/**
	 * Returns the meta object for the attribute '{@link m4jdsl.GuardActionParameter#getSourceName <em>Source Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Name</em>'.
	 * @see m4jdsl.GuardActionParameter#getSourceName()
	 * @see #getGuardActionParameter()
	 * @generated
	 */
	EAttribute getGuardActionParameter_SourceName();

				/**
	 * Returns the meta object for the attribute '{@link m4jdsl.GuardActionParameter#getTargetName <em>Target Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Name</em>'.
	 * @see m4jdsl.GuardActionParameter#getTargetName()
	 * @see #getGuardActionParameter()
	 * @generated
	 */
	EAttribute getGuardActionParameter_TargetName();

				/**
	 * Returns the meta object for class '{@link m4jdsl.Guard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard</em>'.
	 * @see m4jdsl.Guard
	 * @generated
	 */
	EClass getGuard();

				/**
	 * Returns the meta object for the reference '{@link m4jdsl.Guard#getGuardParameter <em>Guard Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Guard Parameter</em>'.
	 * @see m4jdsl.Guard#getGuardParameter()
	 * @see #getGuard()
	 * @generated
	 */
	EReference getGuard_GuardParameter();

				/**
	 * Returns the meta object for the attribute '{@link m4jdsl.Guard#isNegate <em>Negate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Negate</em>'.
	 * @see m4jdsl.Guard#isNegate()
	 * @see #getGuard()
	 * @generated
	 */
	EAttribute getGuard_Negate();

				/**
	 * Returns the meta object for class '{@link m4jdsl.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see m4jdsl.Action
	 * @generated
	 */
	EClass getAction();

				/**
	 * Returns the meta object for the reference '{@link m4jdsl.Action#getActionParameter <em>Action Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action Parameter</em>'.
	 * @see m4jdsl.Action#getActionParameter()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_ActionParameter();

				/**
	 * Returns the meta object for class '{@link m4jdsl.GuardActionParameterList <em>Guard Action Parameter List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Guard Action Parameter List</em>'.
	 * @see m4jdsl.GuardActionParameterList
	 * @generated
	 */
	EClass getGuardActionParameterList();

				/**
	 * Returns the meta object for the containment reference list '{@link m4jdsl.GuardActionParameterList#getGuardActionParameters <em>Guard Action Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Guard Action Parameters</em>'.
	 * @see m4jdsl.GuardActionParameterList#getGuardActionParameters()
	 * @see #getGuardActionParameterList()
	 * @generated
	 */
	EReference getGuardActionParameterList_GuardActionParameters();

				/**
	 * Returns the meta object for enum '{@link m4jdsl.GuardActionParameterType <em>Guard Action Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Guard Action Parameter Type</em>'.
	 * @see m4jdsl.GuardActionParameterType
	 * @generated
	 */
	EEnum getGuardActionParameterType();

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
		 * The meta object literal for the '<em><b>Exit State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference BEHAVIOR_MODEL__EXIT_STATE = eINSTANCE.getBehaviorModel_ExitState();

        /**
		 * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference BEHAVIOR_MODEL__INITIAL_STATE = eINSTANCE.getBehaviorModel_InitialState();

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
		 * The meta object literal for the '{@link m4jdsl.impl.HTTPRequestImpl <em>HTTP Request</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see m4jdsl.impl.HTTPRequestImpl
		 * @see m4jdsl.impl.M4jdslPackageImpl#getHTTPRequest()
		 * @generated
		 */
        EClass HTTP_REQUEST = eINSTANCE.getHTTPRequest();

        /**
		 * The meta object literal for the '{@link m4jdsl.impl.JavaRequestImpl <em>Java Request</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see m4jdsl.impl.JavaRequestImpl
		 * @see m4jdsl.impl.M4jdslPackageImpl#getJavaRequest()
		 * @generated
		 */
        EClass JAVA_REQUEST = eINSTANCE.getJavaRequest();

        /**
		 * The meta object literal for the '{@link m4jdsl.impl.BeanShellRequestImpl <em>Bean Shell Request</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see m4jdsl.impl.BeanShellRequestImpl
		 * @see m4jdsl.impl.M4jdslPackageImpl#getBeanShellRequest()
		 * @generated
		 */
        EClass BEAN_SHELL_REQUEST = eINSTANCE.getBeanShellRequest();

        /**
		 * The meta object literal for the '{@link m4jdsl.impl.JUnitRequestImpl <em>JUnit Request</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see m4jdsl.impl.JUnitRequestImpl
		 * @see m4jdsl.impl.M4jdslPackageImpl#getJUnitRequest()
		 * @generated
		 */
        EClass JUNIT_REQUEST = eINSTANCE.getJUnitRequest();

        /**
		 * The meta object literal for the '{@link m4jdsl.impl.SOAPRequestImpl <em>SOAP Request</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see m4jdsl.impl.SOAPRequestImpl
		 * @see m4jdsl.impl.M4jdslPackageImpl#getSOAPRequest()
		 * @generated
		 */
        EClass SOAP_REQUEST = eINSTANCE.getSOAPRequest();

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
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference REQUEST__PROPERTIES = eINSTANCE.getRequest_Properties();

        /**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference REQUEST__PARAMETERS = eINSTANCE.getRequest_Parameters();

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
		 * The meta object literal for the '<em><b>Protocol States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference PROTOCOL_LAYER_EFSM__PROTOCOL_STATES = eINSTANCE.getProtocolLayerEFSM_ProtocolStates();

        /**
		 * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference PROTOCOL_LAYER_EFSM__INITIAL_STATE = eINSTANCE.getProtocolLayerEFSM_InitialState();

        /**
		 * The meta object literal for the '<em><b>Exit State</b></em>' containment reference feature.
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
		 * The meta object literal for the '<em><b>Application States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference SESSION_LAYER_EFSM__APPLICATION_STATES = eINSTANCE.getSessionLayerEFSM_ApplicationStates();

        /**
		 * The meta object literal for the '<em><b>Initial State</b></em>' reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference SESSION_LAYER_EFSM__INITIAL_STATE = eINSTANCE.getSessionLayerEFSM_InitialState();

        /**
		 * The meta object literal for the '<em><b>Exit State</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference SESSION_LAYER_EFSM__EXIT_STATE = eINSTANCE.getSessionLayerEFSM_ExitState();

        /**
		 * The meta object literal for the '<em><b>Guard Action Parameter List</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SESSION_LAYER_EFSM__GUARD_ACTION_PARAMETER_LIST = eINSTANCE.getSessionLayerEFSM_GuardActionParameterList();

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
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference APPLICATION_TRANSITION__ACTION = eINSTANCE.getApplicationTransition_Action();

        /**
		 * The meta object literal for the '<em><b>Application State</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_TRANSITION__APPLICATION_STATE = eINSTANCE.getApplicationTransition_ApplicationState();

								/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EReference APPLICATION_TRANSITION__GUARD = eINSTANCE.getApplicationTransition_Guard();

        /**
		 * The meta object literal for the '{@link m4jdsl.impl.NormallyDistributedThinkTimeImpl <em>Normally Distributed Think Time</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see m4jdsl.impl.NormallyDistributedThinkTimeImpl
		 * @see m4jdsl.impl.M4jdslPackageImpl#getNormallyDistributedThinkTime()
		 * @generated
		 */
        EClass NORMALLY_DISTRIBUTED_THINK_TIME = eINSTANCE.getNormallyDistributedThinkTime();

        /**
		 * The meta object literal for the '<em><b>Mean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute NORMALLY_DISTRIBUTED_THINK_TIME__MEAN = eINSTANCE.getNormallyDistributedThinkTime_Mean();

        /**
		 * The meta object literal for the '<em><b>Deviation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute NORMALLY_DISTRIBUTED_THINK_TIME__DEVIATION = eINSTANCE.getNormallyDistributedThinkTime_Deviation();

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

        /**
		 * The meta object literal for the '{@link m4jdsl.impl.ApplicationExitStateImpl <em>Application Exit State</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see m4jdsl.impl.ApplicationExitStateImpl
		 * @see m4jdsl.impl.M4jdslPackageImpl#getApplicationExitState()
		 * @generated
		 */
        EClass APPLICATION_EXIT_STATE = eINSTANCE.getApplicationExitState();

        /**
		 * The meta object literal for the '{@link m4jdsl.impl.SessionLayerEFSMStateImpl <em>Session Layer EFSM State</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see m4jdsl.impl.SessionLayerEFSMStateImpl
		 * @see m4jdsl.impl.M4jdslPackageImpl#getSessionLayerEFSMState()
		 * @generated
		 */
        EClass SESSION_LAYER_EFSM_STATE = eINSTANCE.getSessionLayerEFSMState();

        /**
		 * The meta object literal for the '<em><b>EId</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute SESSION_LAYER_EFSM_STATE__EID = eINSTANCE.getSessionLayerEFSMState_EId();

        /**
		 * The meta object literal for the '{@link m4jdsl.impl.BehaviorModelExitStateImpl <em>Behavior Model Exit State</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see m4jdsl.impl.BehaviorModelExitStateImpl
		 * @see m4jdsl.impl.M4jdslPackageImpl#getBehaviorModelExitState()
		 * @generated
		 */
        EClass BEHAVIOR_MODEL_EXIT_STATE = eINSTANCE.getBehaviorModelExitState();

        /**
		 * The meta object literal for the '{@link m4jdsl.impl.BehaviorModelStateImpl <em>Behavior Model State</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see m4jdsl.impl.BehaviorModelStateImpl
		 * @see m4jdsl.impl.M4jdslPackageImpl#getBehaviorModelState()
		 * @generated
		 */
        EClass BEHAVIOR_MODEL_STATE = eINSTANCE.getBehaviorModelState();

        /**
		 * The meta object literal for the '<em><b>EId</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute BEHAVIOR_MODEL_STATE__EID = eINSTANCE.getBehaviorModelState_EId();

        /**
		 * The meta object literal for the '{@link m4jdsl.impl.ProtocolExitStateImpl <em>Protocol Exit State</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see m4jdsl.impl.ProtocolExitStateImpl
		 * @see m4jdsl.impl.M4jdslPackageImpl#getProtocolExitState()
		 * @generated
		 */
        EClass PROTOCOL_EXIT_STATE = eINSTANCE.getProtocolExitState();

        /**
		 * The meta object literal for the '{@link m4jdsl.impl.ProtocolLayerEFSMStateImpl <em>Protocol Layer EFSM State</em>}' class.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @see m4jdsl.impl.ProtocolLayerEFSMStateImpl
		 * @see m4jdsl.impl.M4jdslPackageImpl#getProtocolLayerEFSMState()
		 * @generated
		 */
        EClass PROTOCOL_LAYER_EFSM_STATE = eINSTANCE.getProtocolLayerEFSMState();

        /**
		 * The meta object literal for the '<em><b>EId</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
		 * @generated
		 */
        EAttribute PROTOCOL_LAYER_EFSM_STATE__EID = eINSTANCE.getProtocolLayerEFSMState_EId();

								/**
		 * The meta object literal for the '{@link m4jdsl.impl.GuardActionParameterImpl <em>Guard Action Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m4jdsl.impl.GuardActionParameterImpl
		 * @see m4jdsl.impl.M4jdslPackageImpl#getGuardActionParameter()
		 * @generated
		 */
		EClass GUARD_ACTION_PARAMETER = eINSTANCE.getGuardActionParameter();

								/**
		 * The meta object literal for the '<em><b>Guard Action Parameter Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUARD_ACTION_PARAMETER__GUARD_ACTION_PARAMETER_NAME = eINSTANCE.getGuardActionParameter_GuardActionParameterName();

								/**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUARD_ACTION_PARAMETER__PARAMETER_TYPE = eINSTANCE.getGuardActionParameter_ParameterType();

								/**
		 * The meta object literal for the '<em><b>Source Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUARD_ACTION_PARAMETER__SOURCE_NAME = eINSTANCE.getGuardActionParameter_SourceName();

								/**
		 * The meta object literal for the '<em><b>Target Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUARD_ACTION_PARAMETER__TARGET_NAME = eINSTANCE.getGuardActionParameter_TargetName();

								/**
		 * The meta object literal for the '{@link m4jdsl.impl.GuardImpl <em>Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m4jdsl.impl.GuardImpl
		 * @see m4jdsl.impl.M4jdslPackageImpl#getGuard()
		 * @generated
		 */
		EClass GUARD = eINSTANCE.getGuard();

								/**
		 * The meta object literal for the '<em><b>Guard Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUARD__GUARD_PARAMETER = eINSTANCE.getGuard_GuardParameter();

								/**
		 * The meta object literal for the '<em><b>Negate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GUARD__NEGATE = eINSTANCE.getGuard_Negate();

								/**
		 * The meta object literal for the '{@link m4jdsl.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m4jdsl.impl.ActionImpl
		 * @see m4jdsl.impl.M4jdslPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

								/**
		 * The meta object literal for the '<em><b>Action Parameter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__ACTION_PARAMETER = eINSTANCE.getAction_ActionParameter();

								/**
		 * The meta object literal for the '{@link m4jdsl.impl.GuardActionParameterListImpl <em>Guard Action Parameter List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m4jdsl.impl.GuardActionParameterListImpl
		 * @see m4jdsl.impl.M4jdslPackageImpl#getGuardActionParameterList()
		 * @generated
		 */
		EClass GUARD_ACTION_PARAMETER_LIST = eINSTANCE.getGuardActionParameterList();

								/**
		 * The meta object literal for the '<em><b>Guard Action Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GUARD_ACTION_PARAMETER_LIST__GUARD_ACTION_PARAMETERS = eINSTANCE.getGuardActionParameterList_GuardActionParameters();

								/**
		 * The meta object literal for the '{@link m4jdsl.GuardActionParameterType <em>Guard Action Parameter Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see m4jdsl.GuardActionParameterType
		 * @see m4jdsl.impl.M4jdslPackageImpl#getGuardActionParameterType()
		 * @generated
		 */
		EEnum GUARD_ACTION_PARAMETER_TYPE = eINSTANCE.getGuardActionParameterType();

    }

} //M4jdslPackage
