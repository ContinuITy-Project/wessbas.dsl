/**
 */
package m4jdsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guard Action Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link m4jdsl.GuardActionParameter#getGuardActionParameterName <em>Guard Action Parameter Name</em>}</li>
 *   <li>{@link m4jdsl.GuardActionParameter#getParameterType <em>Parameter Type</em>}</li>
 *   <li>{@link m4jdsl.GuardActionParameter#getSourceName <em>Source Name</em>}</li>
 *   <li>{@link m4jdsl.GuardActionParameter#getTargetName <em>Target Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see m4jdsl.M4jdslPackage#getGuardActionParameter()
 * @model
 * @generated
 */
public interface GuardActionParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Guard Action Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard Action Parameter Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Action Parameter Name</em>' attribute.
	 * @see #setGuardActionParameterName(String)
	 * @see m4jdsl.M4jdslPackage#getGuardActionParameter_GuardActionParameterName()
	 * @model required="true"
	 * @generated
	 */
	String getGuardActionParameterName();

	/**
	 * Sets the value of the '{@link m4jdsl.GuardActionParameter#getGuardActionParameterName <em>Guard Action Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Action Parameter Name</em>' attribute.
	 * @see #getGuardActionParameterName()
	 * @generated
	 */
	void setGuardActionParameterName(String value);

	/**
	 * Returns the value of the '<em><b>Parameter Type</b></em>' attribute.
	 * The default value is <code>"BOOLEAN"</code>.
	 * The literals are from the enumeration {@link m4jdsl.GuardActionParameterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Type</em>' attribute.
	 * @see m4jdsl.GuardActionParameterType
	 * @see #setParameterType(GuardActionParameterType)
	 * @see m4jdsl.M4jdslPackage#getGuardActionParameter_ParameterType()
	 * @model default="BOOLEAN" required="true"
	 * @generated
	 */
	GuardActionParameterType getParameterType();

	/**
	 * Sets the value of the '{@link m4jdsl.GuardActionParameter#getParameterType <em>Parameter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Type</em>' attribute.
	 * @see m4jdsl.GuardActionParameterType
	 * @see #getParameterType()
	 * @generated
	 */
	void setParameterType(GuardActionParameterType value);

	/**
	 * Returns the value of the '<em><b>Source Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Name</em>' attribute.
	 * @see #setSourceName(String)
	 * @see m4jdsl.M4jdslPackage#getGuardActionParameter_SourceName()
	 * @model required="true"
	 * @generated
	 */
	String getSourceName();

	/**
	 * Sets the value of the '{@link m4jdsl.GuardActionParameter#getSourceName <em>Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Name</em>' attribute.
	 * @see #getSourceName()
	 * @generated
	 */
	void setSourceName(String value);

	/**
	 * Returns the value of the '<em><b>Target Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Name</em>' attribute.
	 * @see #setTargetName(String)
	 * @see m4jdsl.M4jdslPackage#getGuardActionParameter_TargetName()
	 * @model
	 * @generated
	 */
	String getTargetName();

	/**
	 * Sets the value of the '{@link m4jdsl.GuardActionParameter#getTargetName <em>Target Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Name</em>' attribute.
	 * @see #getTargetName()
	 * @generated
	 */
	void setTargetName(String value);

} // GuardActionParameter
