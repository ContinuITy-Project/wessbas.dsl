/**
 */
package m4jdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol Layer EFSM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link m4jdsl.ProtocolLayerEFSM#getStates <em>States</em>}</li>
 *   <li>{@link m4jdsl.ProtocolLayerEFSM#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link m4jdsl.ProtocolLayerEFSM#getExitState <em>Exit State</em>}</li>
 * </ul>
 * </p>
 *
 * @see m4jdsl.M4jdslPackage#getProtocolLayerEFSM()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustBeStateListIncludingInitialStateAndExitState mustBeProtocolStatesWithUniqueRequests'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustBeStateListIncludingInitialStateAndExitState='\n            states->includesAll(Set{initialState, exitState})' mustBeProtocolStatesWithUniqueRequests='\n            states->forAll(s1,s2|s1 <> s2 implies s1.request <> s2.request)'"
 * @generated
 */
public interface ProtocolLayerEFSM extends EObject {
    /**
     * Returns the value of the '<em><b>States</b></em>' containment reference list.
     * The list contents are of type {@link m4jdsl.ProtocolState}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>States</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>States</em>' containment reference list.
     * @see m4jdsl.M4jdslPackage#getProtocolLayerEFSM_States()
     * @model containment="true" required="true"
     * @generated
     */
    EList<ProtocolState> getStates();

    /**
     * Returns the value of the '<em><b>Initial State</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Initial State</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Initial State</em>' reference.
     * @see #setInitialState(ProtocolState)
     * @see m4jdsl.M4jdslPackage#getProtocolLayerEFSM_InitialState()
     * @model required="true"
     * @generated
     */
    ProtocolState getInitialState();

    /**
     * Sets the value of the '{@link m4jdsl.ProtocolLayerEFSM#getInitialState <em>Initial State</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Initial State</em>' reference.
     * @see #getInitialState()
     * @generated
     */
    void setInitialState(ProtocolState value);

    /**
     * Returns the value of the '<em><b>Exit State</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Exit State</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Exit State</em>' reference.
     * @see #setExitState(ProtocolState)
     * @see m4jdsl.M4jdslPackage#getProtocolLayerEFSM_ExitState()
     * @model required="true"
     * @generated
     */
    ProtocolState getExitState();

    /**
     * Sets the value of the '{@link m4jdsl.ProtocolLayerEFSM#getExitState <em>Exit State</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Exit State</em>' reference.
     * @see #getExitState()
     * @generated
     */
    void setExitState(ProtocolState value);

} // ProtocolLayerEFSM
