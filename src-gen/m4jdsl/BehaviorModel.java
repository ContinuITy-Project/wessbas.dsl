/**
 */
package m4jdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link m4jdsl.BehaviorModel#getMarkovStates <em>Markov States</em>}</li>
 *   <li>{@link m4jdsl.BehaviorModel#getName <em>Name</em>}</li>
 *   <li>{@link m4jdsl.BehaviorModel#getFilename <em>Filename</em>}</li>
 *   <li>{@link m4jdsl.BehaviorModel#getExitState <em>Exit State</em>}</li>
 *   <li>{@link m4jdsl.BehaviorModel#getInitialState <em>Initial State</em>}</li>
 * </ul>
 * </p>
 *
 * @see m4jdsl.M4jdslPackage#getBehaviorModel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustBeUniqueNames mustBeBehaviorModelWithMarkovStatesForAllServices mustBeInitialStateWhichIsIncludedInMarkovStatesList mustBeBehaviorModelWithoutForeignTargetStates'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustBeUniqueNames='\n            BehaviorModel.allInstances()->\n                forAll(b1,b2|\n                 (b1 <> b2 and not(b1.name.oclIsUndefined() or b2.name.oclIsUndefined()))\n                     implies b1.name <> b2.name\n                )' mustBeBehaviorModelWithMarkovStatesForAllServices='\n            Service.allInstances()->\n                forAll(s|markovStates->exists(m|m.service = s))' mustBeInitialStateWhichIsIncludedInMarkovStatesList='\n            not initialState.oclIsUndefined() implies markovStates->includes(initialState)' mustBeBehaviorModelWithoutForeignTargetStates='\n            markovStates->forAll(s| \n                s.outgoingTransitions->forAll(t|\n                    not t.targetState.oclIsUndefined() implies\n                    (markovStates->includes(t.targetState)\n                    or t.targetState = exitState)))'"
 * @generated
 */
public interface BehaviorModel extends EObject {
    /**
     * Returns the value of the '<em><b>Markov States</b></em>' containment reference list.
     * The list contents are of type {@link m4jdsl.MarkovState}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Markov States</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Markov States</em>' containment reference list.
     * @see m4jdsl.M4jdslPackage#getBehaviorModel_MarkovStates()
     * @model containment="true" required="true"
     * @generated
     */
    EList<MarkovState> getMarkovStates();

    /**
     * Returns the value of the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Name</em>' attribute.
     * @see #setName(String)
     * @see m4jdsl.M4jdslPackage#getBehaviorModel_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link m4jdsl.BehaviorModel#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Filename</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Filename</em>' attribute.
     * @see #setFilename(String)
     * @see m4jdsl.M4jdslPackage#getBehaviorModel_Filename()
     * @model required="true"
     * @generated
     */
    String getFilename();

    /**
     * Sets the value of the '{@link m4jdsl.BehaviorModel#getFilename <em>Filename</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Filename</em>' attribute.
     * @see #getFilename()
     * @generated
     */
    void setFilename(String value);

    /**
     * Returns the value of the '<em><b>Exit State</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Exit State</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Exit State</em>' containment reference.
     * @see #setExitState(BehaviorModelExitState)
     * @see m4jdsl.M4jdslPackage#getBehaviorModel_ExitState()
     * @model containment="true" required="true"
     * @generated
     */
    BehaviorModelExitState getExitState();

    /**
     * Sets the value of the '{@link m4jdsl.BehaviorModel#getExitState <em>Exit State</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Exit State</em>' containment reference.
     * @see #getExitState()
     * @generated
     */
    void setExitState(BehaviorModelExitState value);

    /**
     * Returns the value of the '<em><b>Initial State</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Initial State</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Initial State</em>' reference.
     * @see #setInitialState(MarkovState)
     * @see m4jdsl.M4jdslPackage#getBehaviorModel_InitialState()
     * @model required="true"
     * @generated
     */
    MarkovState getInitialState();

    /**
     * Sets the value of the '{@link m4jdsl.BehaviorModel#getInitialState <em>Initial State</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Initial State</em>' reference.
     * @see #getInitialState()
     * @generated
     */
    void setInitialState(MarkovState value);

} // BehaviorModel
