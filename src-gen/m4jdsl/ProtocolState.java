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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link m4jdsl.ProtocolState#getRequest <em>Request</em>}</li>
 *   <li>{@link m4jdsl.ProtocolState#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see m4jdsl.M4jdslPackage#getProtocolState()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustBeUniqueOutgoingTransitions'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustBeUniqueOutgoingTransitions='\n            outgoingTransitions->\n                forAll(t1,t2|\n                    (t1 <> t2 and not(t1.targetState.oclIsUndefined() or t2.targetState.oclIsUndefined()))\n                    implies (t1.targetState <> t2.targetState or t1.guard <> t2.guard))'"
 * @generated
 */
public interface ProtocolState extends ProtocolLayerEFSMState {
    /**
	 * Returns the value of the '<em><b>Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Request</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Request</em>' containment reference.
	 * @see #setRequest(Request)
	 * @see m4jdsl.M4jdslPackage#getProtocolState_Request()
	 * @model containment="true" required="true"
	 * @generated
	 */
    Request getRequest();

    /**
	 * Sets the value of the '{@link m4jdsl.ProtocolState#getRequest <em>Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request</em>' containment reference.
	 * @see #getRequest()
	 * @generated
	 */
    void setRequest(Request value);

    /**
	 * Returns the value of the '<em><b>Outgoing Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link m4jdsl.ProtocolTransition}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outgoing Transitions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transitions</em>' containment reference list.
	 * @see m4jdsl.M4jdslPackage#getProtocolState_OutgoingTransitions()
	 * @model containment="true"
	 * @generated
	 */
    EList<ProtocolTransition> getOutgoingTransitions();

} // ProtocolState
