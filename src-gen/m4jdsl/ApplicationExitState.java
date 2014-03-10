/**
 */
package m4jdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Exit State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link m4jdsl.ApplicationExitState#getNAME <em>NAME</em>}</li>
 * </ul>
 * </p>
 *
 * @see m4jdsl.M4jdslPackage#getApplicationExitState()
 * @model
 * @generated
 */
public interface ApplicationExitState extends SessionLayerEFSMState {
    /**
     * Returns the value of the '<em><b>NAME</b></em>' attribute.
     * The default value is <code>"$"</code>.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>NAME</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>NAME</em>' attribute.
     * @see m4jdsl.M4jdslPackage#getApplicationExitState_NAME()
     * @model default="$" changeable="false"
     * @generated
     */
    String getNAME();

} // ApplicationExitState
