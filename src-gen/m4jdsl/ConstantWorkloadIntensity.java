/**
 */
package m4jdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Workload Intensity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link m4jdsl.ConstantWorkloadIntensity#getNumberOfSessions <em>Number Of Sessions</em>}</li>
 * </ul>
 * </p>
 *
 * @see m4jdsl.M4jdslPackage#getConstantWorkloadIntensity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustBeNonnegativeSessionNumber'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustBeNonnegativeSessionNumber='\n           numberOfSessions >= 0'"
 * @generated
 */
public interface ConstantWorkloadIntensity extends WorkloadIntensity {
    /**
	 * Returns the value of the '<em><b>Number Of Sessions</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Number Of Sessions</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Sessions</em>' attribute.
	 * @see #setNumberOfSessions(int)
	 * @see m4jdsl.M4jdslPackage#getConstantWorkloadIntensity_NumberOfSessions()
	 * @model required="true"
	 * @generated
	 */
    int getNumberOfSessions();

    /**
	 * Sets the value of the '{@link m4jdsl.ConstantWorkloadIntensity#getNumberOfSessions <em>Number Of Sessions</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Sessions</em>' attribute.
	 * @see #getNumberOfSessions()
	 * @generated
	 */
    void setNumberOfSessions(int value);

} // ConstantWorkloadIntensity
