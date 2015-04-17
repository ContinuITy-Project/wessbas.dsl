/**
 */
package m4jdsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link m4jdsl.ApplicationModel#getSessionLayerEFSM <em>Session Layer EFSM</em>}</li>
 * </ul>
 * </p>
 *
 * @see m4jdsl.M4jdslPackage#getApplicationModel()
 * @model
 * @generated
 */
public interface ApplicationModel extends EObject {
    /**
	 * Returns the value of the '<em><b>Session Layer EFSM</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Session Layer EFSM</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Layer EFSM</em>' containment reference.
	 * @see #setSessionLayerEFSM(SessionLayerEFSM)
	 * @see m4jdsl.M4jdslPackage#getApplicationModel_SessionLayerEFSM()
	 * @model containment="true" required="true"
	 * @generated
	 */
    SessionLayerEFSM getSessionLayerEFSM();

    /**
	 * Sets the value of the '{@link m4jdsl.ApplicationModel#getSessionLayerEFSM <em>Session Layer EFSM</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Layer EFSM</em>' containment reference.
	 * @see #getSessionLayerEFSM()
	 * @generated
	 */
    void setSessionLayerEFSM(SessionLayerEFSM value);

} // ApplicationModel
