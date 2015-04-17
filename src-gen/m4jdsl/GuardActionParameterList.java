/**
 */
package m4jdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guard Action Parameter List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link m4jdsl.GuardActionParameterList#getGuardActionParameters <em>Guard Action Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see m4jdsl.M4jdslPackage#getGuardActionParameterList()
 * @model
 * @generated
 */
public interface GuardActionParameterList extends EObject {
	/**
	 * Returns the value of the '<em><b>Guard Action Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link m4jdsl.GuardActionParameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard Action Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Action Parameters</em>' containment reference list.
	 * @see m4jdsl.M4jdslPackage#getGuardActionParameterList_GuardActionParameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<GuardActionParameter> getGuardActionParameters();

} // GuardActionParameterList
