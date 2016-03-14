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
 * A representation of the model object '<em><b>Markov State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link m4jdsl.MarkovState#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link m4jdsl.MarkovState#getService <em>Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see m4jdsl.M4jdslPackage#getMarkovState()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustBeValidProbabilitySum mustBeOutgoingTransitionsWithUniqueTargetStates mustBeOutgoingTransitionsCorrespondingToSessionLayer'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustBeValidProbabilitySum='\n            outgoingTransitions.probability->exists(p | p > 0) implies\n            outgoingTransitions.probability->sum() = 1.0' mustBeOutgoingTransitionsWithUniqueTargetStates='\n            outgoingTransitions->\n                forAll(t1,t2|\n                (t1 <> t2 and not(t1.targetState.oclIsUndefined() or t2.targetState.oclIsUndefined()))\n                     implies t1.targetState <> t2.targetState\n                )' mustBeOutgoingTransitionsCorrespondingToSessionLayer='\n            not service.oclIsUndefined() implies \n            ApplicationState.allInstances()->exists(as|service = as.service and\n                outgoingTransitions->forAll(t|\n                    not t.targetState.oclIsUndefined() implies as.outgoingTransitions->exists(at|\n                        (at.targetState.oclIsTypeOf(ApplicationExitState) and\n                         t.targetState.oclIsTypeOf(BehaviorModelExitState)) or\n                       ((t.targetState.oclIsTypeOf(MarkovState) and\n                         at.targetState.oclIsTypeOf(ApplicationState) and\n                         at.targetState.oclAsType(ApplicationState).service =\n                         t.targetState.oclAsType(MarkovState).service)))))'"
 * @generated
 */
public interface MarkovState extends BehaviorModelState {
    /**
	 * Returns the value of the '<em><b>Outgoing Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link m4jdsl.Transition}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Outgoing Transitions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transitions</em>' containment reference list.
	 * @see m4jdsl.M4jdslPackage#getMarkovState_OutgoingTransitions()
	 * @model containment="true"
	 * @generated
	 */
    EList<Transition> getOutgoingTransitions();

    /**
	 * Returns the value of the '<em><b>Service</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Service</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' reference.
	 * @see #setService(Service)
	 * @see m4jdsl.M4jdslPackage#getMarkovState_Service()
	 * @model required="true"
	 * @generated
	 */
    Service getService();

    /**
	 * Sets the value of the '{@link m4jdsl.MarkovState#getService <em>Service</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' reference.
	 * @see #getService()
	 * @generated
	 */
    void setService(Service value);

} // MarkovState
