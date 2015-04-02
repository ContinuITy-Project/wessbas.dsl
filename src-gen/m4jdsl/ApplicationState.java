/**
 */
package m4jdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link m4jdsl.ApplicationState#getService <em>Service</em>}</li>
 *   <li>{@link m4jdsl.ApplicationState#getProtocolDetails <em>Protocol Details</em>}</li>
 *   <li>{@link m4jdsl.ApplicationState#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see m4jdsl.M4jdslPackage#getApplicationState()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustBeUniqueOutgoingTransitions'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustBeUniqueOutgoingTransitions='\n            outgoingTransitions->\n                forAll(t1,t2|\n                (t1 <> t2 and not(t1.targetState.oclIsUndefined() or t2.targetState.oclIsUndefined()))\n                     implies (t1.targetState <> t2.targetState or t1.guard <> t2.guard))'"
 * @generated
 */
public interface ApplicationState extends SessionLayerEFSMState {
    /**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference.
	 * @see #setService(Service)
	 * @see m4jdsl.M4jdslPackage#getApplicationState_Service()
	 * @model containment="true" required="true"
	 * @generated
	 */
    Service getService();

    /**
	 * Sets the value of the '{@link m4jdsl.ApplicationState#getService <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' containment reference.
	 * @see #getService()
	 * @generated
	 */
    void setService(Service value);

    /**
	 * Returns the value of the '<em><b>Protocol Details</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Protocol Details</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol Details</em>' containment reference.
	 * @see #setProtocolDetails(ProtocolLayerEFSM)
	 * @see m4jdsl.M4jdslPackage#getApplicationState_ProtocolDetails()
	 * @model containment="true" required="true"
	 * @generated
	 */
    ProtocolLayerEFSM getProtocolDetails();

    /**
	 * Sets the value of the '{@link m4jdsl.ApplicationState#getProtocolDetails <em>Protocol Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Protocol Details</em>' containment reference.
	 * @see #getProtocolDetails()
	 * @generated
	 */
    void setProtocolDetails(ProtocolLayerEFSM value);

    /**
	 * Returns the value of the '<em><b>Outgoing Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link m4jdsl.ApplicationTransition}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outgoing Transitions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transitions</em>' containment reference list.
	 * @see m4jdsl.M4jdslPackage#getApplicationState_OutgoingTransitions()
	 * @model containment="true"
	 * @generated
	 */
    EList<ApplicationTransition> getOutgoingTransitions();

} // ApplicationState
