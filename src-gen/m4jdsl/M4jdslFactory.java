/**
 */
package m4jdsl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see m4jdsl.M4jdslPackage
 * @generated
 */
public interface M4jdslFactory extends EFactory {
    /**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    M4jdslFactory eINSTANCE = m4jdsl.impl.M4jdslFactoryImpl.init();

    /**
     * Returns a new object of class '<em>Workload Model</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Workload Model</em>'.
     * @generated
     */
    WorkloadModel createWorkloadModel();

    /**
     * Returns a new object of class '<em>Application Model</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Application Model</em>'.
     * @generated
     */
    ApplicationModel createApplicationModel();

    /**
     * Returns a new object of class '<em>Behavior Mix</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Behavior Mix</em>'.
     * @generated
     */
    BehaviorMix createBehaviorMix();

    /**
     * Returns a new object of class '<em>Relative Frequency</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Relative Frequency</em>'.
     * @generated
     */
    RelativeFrequency createRelativeFrequency();

    /**
     * Returns a new object of class '<em>Behavior Model</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Behavior Model</em>'.
     * @generated
     */
    BehaviorModel createBehaviorModel();

    /**
     * Returns a new object of class '<em>Transition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Transition</em>'.
     * @generated
     */
    Transition createTransition();

    /**
     * Returns a new object of class '<em>Markov State</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Markov State</em>'.
     * @generated
     */
    MarkovState createMarkovState();

    /**
     * Returns a new object of class '<em>Service</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Service</em>'.
     * @generated
     */
    Service createService();

    /**
     * Returns a new object of class '<em>Application State</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Application State</em>'.
     * @generated
     */
    ApplicationState createApplicationState();

    /**
     * Returns a new object of class '<em>HTTP Request</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>HTTP Request</em>'.
     * @generated
     */
    HTTPRequest createHTTPRequest();

    /**
     * Returns a new object of class '<em>Java Request</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Java Request</em>'.
     * @generated
     */
    JavaRequest createJavaRequest();

    /**
     * Returns a new object of class '<em>Bean Shell Request</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Bean Shell Request</em>'.
     * @generated
     */
    BeanShellRequest createBeanShellRequest();

    /**
     * Returns a new object of class '<em>JUnit Request</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>JUnit Request</em>'.
     * @generated
     */
    JUnitRequest createJUnitRequest();

    /**
     * Returns a new object of class '<em>SOAP Request</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>SOAP Request</em>'.
     * @generated
     */
    SOAPRequest createSOAPRequest();

    /**
     * Returns a new object of class '<em>Protocol State</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Protocol State</em>'.
     * @generated
     */
    ProtocolState createProtocolState();

    /**
     * Returns a new object of class '<em>Protocol Transition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Protocol Transition</em>'.
     * @generated
     */
    ProtocolTransition createProtocolTransition();

    /**
     * Returns a new object of class '<em>Protocol Layer EFSM</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Protocol Layer EFSM</em>'.
     * @generated
     */
    ProtocolLayerEFSM createProtocolLayerEFSM();

    /**
     * Returns a new object of class '<em>Session Layer EFSM</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Session Layer EFSM</em>'.
     * @generated
     */
    SessionLayerEFSM createSessionLayerEFSM();

    /**
     * Returns a new object of class '<em>Constant Workload Intensity</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Constant Workload Intensity</em>'.
     * @generated
     */
    ConstantWorkloadIntensity createConstantWorkloadIntensity();

    /**
     * Returns a new object of class '<em>Application Transition</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Application Transition</em>'.
     * @generated
     */
    ApplicationTransition createApplicationTransition();

    /**
     * Returns a new object of class '<em>Normally Distributed Think Time</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Normally Distributed Think Time</em>'.
     * @generated
     */
    NormallyDistributedThinkTime createNormallyDistributedThinkTime();

    /**
     * Returns a new object of class '<em>Property</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Property</em>'.
     * @generated
     */
    Property createProperty();

    /**
     * Returns a new object of class '<em>Parameter</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Parameter</em>'.
     * @generated
     */
    Parameter createParameter();

    /**
     * Returns a new object of class '<em>Assertion</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Assertion</em>'.
     * @generated
     */
    Assertion createAssertion();

    /**
     * Returns a new object of class '<em>Application Exit State</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Application Exit State</em>'.
     * @generated
     */
    ApplicationExitState createApplicationExitState();

    /**
     * Returns a new object of class '<em>Behavior Model Exit State</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Behavior Model Exit State</em>'.
     * @generated
     */
    BehaviorModelExitState createBehaviorModelExitState();

    /**
     * Returns a new object of class '<em>Protocol Exit State</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Protocol Exit State</em>'.
     * @generated
     */
    ProtocolExitState createProtocolExitState();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
    M4jdslPackage getM4jdslPackage();

} //M4jdslFactory
