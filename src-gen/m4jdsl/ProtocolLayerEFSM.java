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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Protocol Layer EFSM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link m4jdsl.ProtocolLayerEFSM#getProtocolStates <em>Protocol States</em>}</li>
 *   <li>{@link m4jdsl.ProtocolLayerEFSM#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link m4jdsl.ProtocolLayerEFSM#getExitState <em>Exit State</em>}</li>
 * </ul>
 * </p>
 *
 * @see m4jdsl.M4jdslPackage#getProtocolLayerEFSM()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustBeProtocolStatesWithUniqueRequests mustBeInitialStateWhichIsIncludedInProtocolStatesList mustBeProtocolLayerEFSMWithoutForeignStates'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustBeProtocolStatesWithUniqueRequests='\n            protocolStates->forAll(s1,s2|\n                (s1 <> s2 and not(s1.request.oclIsUndefined() or s2.request.oclIsUndefined()))\n                 implies s1.request <> s2.request\n            )' mustBeInitialStateWhichIsIncludedInProtocolStatesList='\n            not initialState.oclIsUndefined() implies protocolStates->includes(initialState)' mustBeProtocolLayerEFSMWithoutForeignStates='\n            protocolStates->forAll(s|\n                s.outgoingTransitions->forAll(t|\n                    not t.targetState.oclIsUndefined() implies\n                    (protocolStates->includes(t.targetState) or t.targetState = exitState)))'"
 * @generated
 */
public interface ProtocolLayerEFSM extends EObject {
    /**
	 * Returns the value of the '<em><b>Protocol States</b></em>' containment reference list.
	 * The list contents are of type {@link m4jdsl.ProtocolState}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Protocol States</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Protocol States</em>' containment reference list.
	 * @see m4jdsl.M4jdslPackage#getProtocolLayerEFSM_ProtocolStates()
	 * @model containment="true" required="true"
	 * @generated
	 */
    EList<ProtocolState> getProtocolStates();

    /**
	 * Returns the value of the '<em><b>Initial State</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Initial State</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial State</em>' reference.
	 * @see #setInitialState(ProtocolState)
	 * @see m4jdsl.M4jdslPackage#getProtocolLayerEFSM_InitialState()
	 * @model required="true"
	 * @generated
	 */
    ProtocolState getInitialState();

    /**
	 * Sets the value of the '{@link m4jdsl.ProtocolLayerEFSM#getInitialState <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial State</em>' reference.
	 * @see #getInitialState()
	 * @generated
	 */
    void setInitialState(ProtocolState value);

    /**
	 * Returns the value of the '<em><b>Exit State</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Exit State</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit State</em>' containment reference.
	 * @see #setExitState(ProtocolExitState)
	 * @see m4jdsl.M4jdslPackage#getProtocolLayerEFSM_ExitState()
	 * @model containment="true" required="true"
	 * @generated
	 */
    ProtocolExitState getExitState();

    /**
	 * Sets the value of the '{@link m4jdsl.ProtocolLayerEFSM#getExitState <em>Exit State</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exit State</em>' containment reference.
	 * @see #getExitState()
	 * @generated
	 */
    void setExitState(ProtocolExitState value);

} // ProtocolLayerEFSM
