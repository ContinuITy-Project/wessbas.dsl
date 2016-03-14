/***************************************************************************
 * Copyright (c) 2016 the WESSBAS project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ***************************************************************************/


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
