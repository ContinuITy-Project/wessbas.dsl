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
 * A representation of the model object '<em><b>Guard Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link m4jdsl.GuardParameter#getGuardParameterName <em>Guard Parameter Name</em>}</li>
 *   <li>{@link m4jdsl.GuardParameter#getParameterType <em>Parameter Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see m4jdsl.M4jdslPackage#getGuardParameter()
 * @model
 * @generated
 */
public interface GuardParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Guard Parameter Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard Parameter Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard Parameter Name</em>' attribute.
	 * @see #setGuardParameterName(String)
	 * @see m4jdsl.M4jdslPackage#getGuardParameter_GuardParameterName()
	 * @model
	 * @generated
	 */
	String getGuardParameterName();

	/**
	 * Sets the value of the '{@link m4jdsl.GuardParameter#getGuardParameterName <em>Guard Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard Parameter Name</em>' attribute.
	 * @see #getGuardParameterName()
	 * @generated
	 */
	void setGuardParameterName(String value);

	/**
	 * Returns the value of the '<em><b>Parameter Type</b></em>' attribute.
	 * The default value is <code>"BOOLEAN"</code>.
	 * The literals are from the enumeration {@link m4jdsl.GuardParameterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Type</em>' attribute.
	 * @see m4jdsl.GuardParameterType
	 * @see #setParameterType(GuardParameterType)
	 * @see m4jdsl.M4jdslPackage#getGuardParameter_ParameterType()
	 * @model default="BOOLEAN"
	 * @generated
	 */
	GuardParameterType getParameterType();

	/**
	 * Sets the value of the '{@link m4jdsl.GuardParameter#getParameterType <em>Parameter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Type</em>' attribute.
	 * @see m4jdsl.GuardParameterType
	 * @see #getParameterType()
	 * @generated
	 */
	void setParameterType(GuardParameterType value);

} // GuardParameter
