/**
 */
package m4jdsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guard</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link m4jdsl.Guard#getGuardParameter <em>Guard Parameter</em>}</li>
 *   <li>{@link m4jdsl.Guard#isNegate <em>Negate</em>}</li>
 *   <li>{@link m4jdsl.Guard#getDiffMinimum <em>Diff Minimum</em>}</li>
 * </ul>
 * </p>
 *
 * @see m4jdsl.M4jdslPackage#getGuard()
 * @model
 * @generated
 */
public interface Guard extends EObject {
	/**
	 * Returns the value of the '<em><b>Guard Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Parameter</em>' reference.
	 * @see #setGuardParameter(GuardActionParameter)
	 * @see m4jdsl.M4jdslPackage#getGuard_GuardParameter()
	 * @model required="true"
	 * @generated
	 */
	GuardActionParameter getGuardParameter();

	/**
	 * Sets the value of the '{@link m4jdsl.Guard#getGuardParameter <em>Guard Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Parameter</em>' reference.
	 * @see #getGuardParameter()
	 * @generated
	 */
	void setGuardParameter(GuardActionParameter value);

	/**
	 * Returns the value of the '<em><b>Negate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negate</em>' attribute.
	 * @see #setNegate(boolean)
	 * @see m4jdsl.M4jdslPackage#getGuard_Negate()
	 * @model
	 * @generated
	 */
	boolean isNegate();

	/**
	 * Sets the value of the '{@link m4jdsl.Guard#isNegate <em>Negate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negate</em>' attribute.
	 * @see #isNegate()
	 * @generated
	 */
	void setNegate(boolean value);

	/**
	 * Returns the value of the '<em><b>Diff Minimum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diff Minimum</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diff Minimum</em>' attribute.
	 * @see #setDiffMinimum(int)
	 * @see m4jdsl.M4jdslPackage#getGuard_DiffMinimum()
	 * @model
	 * @generated
	 */
	int getDiffMinimum();

	/**
	 * Sets the value of the '{@link m4jdsl.Guard#getDiffMinimum <em>Diff Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diff Minimum</em>' attribute.
	 * @see #getDiffMinimum()
	 * @generated
	 */
	void setDiffMinimum(int value);

} // Guard
