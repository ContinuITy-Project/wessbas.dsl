/**
 */
package m4jdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link m4jdsl.ProtocolState#getRequest <em>Request</em>}</li>
 *   <li>{@link m4jdsl.ProtocolState#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link m4jdsl.ProtocolState#getEId <em>EId</em>}</li>
 * </ul>
 * </p>
 *
 * @see m4jdsl.M4jdslPackage#getProtocolState()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustBeUniqueOutgoingTransitionTargetStates mustBeExitStateWithoutTransitions'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustBeUniqueOutgoingTransitionTargetStates='\n            outgoingTransitions->\n                forAll(t1,t2|t1 <> t2 implies t1.targetState <> t2.targetState)' mustBeExitStateWithoutTransitions='\n        ProtocolLayerEFSM.allInstances()->exists(s|s.exitState = self) implies outgoingTransitions->isEmpty()'"
 * @generated
 */
public interface ProtocolState extends EObject {
    /**
     * Returns the value of the '<em><b>Request</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Request</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Request</em>' containment reference.
     * @see #setRequest(Request)
     * @see m4jdsl.M4jdslPackage#getProtocolState_Request()
     * @model containment="true" required="true"
     * @generated
     */
    Request getRequest();

    /**
     * Sets the value of the '{@link m4jdsl.ProtocolState#getRequest <em>Request</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Request</em>' containment reference.
     * @see #getRequest()
     * @generated
     */
    void setRequest(Request value);

    /**
     * Returns the value of the '<em><b>Outgoing Transitions</b></em>' containment reference list.
     * The list contents are of type {@link m4jdsl.ProtocolTransition}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outgoing Transitions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Outgoing Transitions</em>' containment reference list.
     * @see m4jdsl.M4jdslPackage#getProtocolState_OutgoingTransitions()
     * @model containment="true"
     * @generated
     */
    EList<ProtocolTransition> getOutgoingTransitions();

    /**
     * Returns the value of the '<em><b>EId</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EId</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EId</em>' attribute.
     * @see #setEId(String)
     * @see m4jdsl.M4jdslPackage#getProtocolState_EId()
     * @model id="true" required="true"
     * @generated
     */
    String getEId();

    /**
     * Sets the value of the '{@link m4jdsl.ProtocolState#getEId <em>EId</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EId</em>' attribute.
     * @see #getEId()
     * @generated
     */
    void setEId(String value);

} // ProtocolState
