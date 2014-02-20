/**
 */
package m4jdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Session Layer EFSM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link m4jdsl.SessionLayerEFSM#getStates <em>States</em>}</li>
 *   <li>{@link m4jdsl.SessionLayerEFSM#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link m4jdsl.SessionLayerEFSM#getExitState <em>Exit State</em>}</li>
 * </ul>
 * </p>
 *
 * @see m4jdsl.M4jdslPackage#getSessionLayerEFSM()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustBeStateListIncludingInitialStateAndExitState mustBeApplicationStatesWithUniqueServices'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustBeStateListIncludingInitialStateAndExitState='\n            states->includesAll(Set{initialState, exitState})' mustBeApplicationStatesWithUniqueServices='\n            states->forAll(s1,s2|s1 <> s2 implies s1.service <> s2.service)'"
 * @generated
 */
public interface SessionLayerEFSM extends EObject {
    /**
     * Returns the value of the '<em><b>States</b></em>' containment reference list.
     * The list contents are of type {@link m4jdsl.ApplicationState}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>States</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>States</em>' containment reference list.
     * @see m4jdsl.M4jdslPackage#getSessionLayerEFSM_States()
     * @model containment="true" required="true"
     * @generated
     */
    EList<ApplicationState> getStates();

    /**
     * Returns the value of the '<em><b>Initial State</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Initial State</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Initial State</em>' reference.
     * @see #setInitialState(ApplicationState)
     * @see m4jdsl.M4jdslPackage#getSessionLayerEFSM_InitialState()
     * @model required="true"
     * @generated
     */
    ApplicationState getInitialState();

    /**
     * Sets the value of the '{@link m4jdsl.SessionLayerEFSM#getInitialState <em>Initial State</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Initial State</em>' reference.
     * @see #getInitialState()
     * @generated
     */
    void setInitialState(ApplicationState value);

    /**
     * Returns the value of the '<em><b>Exit State</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Exit State</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Exit State</em>' reference.
     * @see #setExitState(ApplicationState)
     * @see m4jdsl.M4jdslPackage#getSessionLayerEFSM_ExitState()
     * @model required="true"
     * @generated
     */
    ApplicationState getExitState();

    /**
     * Sets the value of the '{@link m4jdsl.SessionLayerEFSM#getExitState <em>Exit State</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Exit State</em>' reference.
     * @see #getExitState()
     * @generated
     */
    void setExitState(ApplicationState value);

} // SessionLayerEFSM
