/**
 */
package m4jdsl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link m4jdsl.ApplicationTransition#getTargetState <em>Target State</em>}</li>
 *   <li>{@link m4jdsl.ApplicationTransition#getGuard <em>Guard</em>}</li>
 *   <li>{@link m4jdsl.ApplicationTransition#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see m4jdsl.M4jdslPackage#getApplicationTransition()
 * @model
 * @generated
 */
public interface ApplicationTransition extends EObject {
    /**
	 * Returns the value of the '<em><b>Target State</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target State</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Target State</em>' reference.
	 * @see #setTargetState(SessionLayerEFSMState)
	 * @see m4jdsl.M4jdslPackage#getApplicationTransition_TargetState()
	 * @model required="true"
	 * @generated
	 */
    SessionLayerEFSMState getTargetState();

    /**
	 * Sets the value of the '{@link m4jdsl.ApplicationTransition#getTargetState <em>Target State</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target State</em>' reference.
	 * @see #getTargetState()
	 * @generated
	 */
    void setTargetState(SessionLayerEFSMState value);

    /**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference list.
	 * The list contents are of type {@link m4jdsl.Action}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Action</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference list.
	 * @see m4jdsl.M4jdslPackage#getApplicationTransition_Action()
	 * @model containment="true"
	 * @generated
	 */
    EList<Action> getAction();

    /**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference list.
	 * The list contents are of type {@link m4jdsl.Guard}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Guard</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference list.
	 * @see m4jdsl.M4jdslPackage#getApplicationTransition_Guard()
	 * @model containment="true"
	 * @generated
	 */
    EList<Guard> getGuard();

} // ApplicationTransition
