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
 * A representation of the model object '<em><b>Protocol Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link m4jdsl.ProtocolTransition#getGuard <em>Guard</em>}</li>
 *   <li>{@link m4jdsl.ProtocolTransition#getTargetState <em>Target State</em>}</li>
 *   <li>{@link m4jdsl.ProtocolTransition#getAction <em>Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see m4jdsl.M4jdslPackage#getProtocolTransition()
 * @model
 * @generated
 */
public interface ProtocolTransition extends EObject {
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
	 * @see m4jdsl.M4jdslPackage#getProtocolTransition_Guard()
	 * @model
	 * @generated
	 */
    String getGuard();

    /**
	 * Sets the value of the '{@link m4jdsl.ProtocolTransition#getGuard <em>Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' attribute.
	 * @see #getGuard()
	 * @generated
	 */
    void setGuard(String value);

    /**
	 * Returns the value of the '<em><b>Target State</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target State</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Target State</em>' reference.
	 * @see #setTargetState(ProtocolLayerEFSMState)
	 * @see m4jdsl.M4jdslPackage#getProtocolTransition_TargetState()
	 * @model required="true"
	 * @generated
	 */
    ProtocolLayerEFSMState getTargetState();

    /**
	 * Sets the value of the '{@link m4jdsl.ProtocolTransition#getTargetState <em>Target State</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target State</em>' reference.
	 * @see #getTargetState()
	 * @generated
	 */
    void setTargetState(ProtocolLayerEFSMState value);

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
	 * @see m4jdsl.M4jdslPackage#getProtocolTransition_Action()
	 * @model
	 * @generated
	 */
    String getAction();

    /**
	 * Sets the value of the '{@link m4jdsl.ProtocolTransition#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
    void setAction(String value);

} // ProtocolTransition
