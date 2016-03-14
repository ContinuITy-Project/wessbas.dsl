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
 * A representation of the model object '<em><b>Behavior Mix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link m4jdsl.BehaviorMix#getRelativeFrequencies <em>Relative Frequencies</em>}</li>
 * </ul>
 * </p>
 *
 * @see m4jdsl.M4jdslPackage#getBehaviorMix()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustBeValidFrequencySum mustBeUniqueBehaviorModels'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustBeValidFrequencySum='\n            relativeFrequencies.value->sum() = 1.0' mustBeUniqueBehaviorModels='\n            relativeFrequencies->forAll(f1,f2|\n             (f1 <> f2 and not(f1.behaviorModel.oclIsUndefined() or f2.behaviorModel.oclIsUndefined()))\n                 implies f1.behaviorModel <> f2.behaviorModel)'"
 * @generated
 */
public interface BehaviorMix extends EObject {
    /**
	 * Returns the value of the '<em><b>Relative Frequencies</b></em>' containment reference list.
	 * The list contents are of type {@link m4jdsl.RelativeFrequency}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Relative Frequencies</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Relative Frequencies</em>' containment reference list.
	 * @see m4jdsl.M4jdslPackage#getBehaviorMix_RelativeFrequencies()
	 * @model containment="true" required="true"
	 * @generated
	 */
    EList<RelativeFrequency> getRelativeFrequencies();

} // BehaviorMix
