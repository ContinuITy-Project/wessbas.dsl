/**
 */
package m4jdsl;

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
 *   <li>{@link m4jdsl.ApplicationTransition#getAction <em>Action</em>}</li>
 *   <li>{@link m4jdsl.ApplicationTransition#getGuard <em>Guard</em>}</li>
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
     * @see #setTargetState(ApplicationState)
     * @see m4jdsl.M4jdslPackage#getApplicationTransition_TargetState()
     * @model required="true"
     * @generated
     */
    ApplicationState getTargetState();

    /**
     * Sets the value of the '{@link m4jdsl.ApplicationTransition#getTargetState <em>Target State</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target State</em>' reference.
     * @see #getTargetState()
     * @generated
     */
    void setTargetState(ApplicationState value);

    /**
     * Returns the value of the '<em><b>Action</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Action</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Action</em>' attribute.
     * @see #setAction(String)
     * @see m4jdsl.M4jdslPackage#getApplicationTransition_Action()
     * @model
     * @generated
     */
    String getAction();

    /**
     * Sets the value of the '{@link m4jdsl.ApplicationTransition#getAction <em>Action</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Action</em>' attribute.
     * @see #getAction()
     * @generated
     */
    void setAction(String value);

    /**
     * Returns the value of the '<em><b>Guard</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Guard</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Guard</em>' attribute.
     * @see #setGuard(String)
     * @see m4jdsl.M4jdslPackage#getApplicationTransition_Guard()
     * @model
     * @generated
     */
    String getGuard();

    /**
     * Sets the value of the '{@link m4jdsl.ApplicationTransition#getGuard <em>Guard</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Guard</em>' attribute.
     * @see #getGuard()
     * @generated
     */
    void setGuard(String value);

} // ApplicationTransition
