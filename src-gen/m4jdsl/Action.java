/**
 */
package m4jdsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link m4jdsl.Action#getActionParameter <em>Action Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see m4jdsl.M4jdslPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Action Parameter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Parameter</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Parameter</em>' reference.
	 * @see #setActionParameter(GuardActionParameter)
	 * @see m4jdsl.M4jdslPackage#getAction_ActionParameter()
	 * @model required="true"
	 * @generated
	 */
	GuardActionParameter getActionParameter();

	/**
	 * Sets the value of the '{@link m4jdsl.Action#getActionParameter <em>Action Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Parameter</em>' reference.
	 * @see #getActionParameter()
	 * @generated
	 */
	void setActionParameter(GuardActionParameter value);

} // Action
