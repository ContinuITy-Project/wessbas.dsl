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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constant Workload Intensity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link m4jdsl.ConstantWorkloadIntensity#getNumberOfSessions <em>Number Of Sessions</em>}</li>
 * </ul>
 * </p>
 *
 * @see m4jdsl.M4jdslPackage#getConstantWorkloadIntensity()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustBeNonnegativeSessionNumber'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustBeNonnegativeSessionNumber='\n           numberOfSessions >= 0'"
 * @generated
 */
public interface ConstantWorkloadIntensity extends WorkloadIntensity {
    /**
	 * Returns the value of the '<em><b>Number Of Sessions</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Number Of Sessions</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Sessions</em>' attribute.
	 * @see #setNumberOfSessions(int)
	 * @see m4jdsl.M4jdslPackage#getConstantWorkloadIntensity_NumberOfSessions()
	 * @model required="true"
	 * @generated
	 */
    int getNumberOfSessions();

    /**
	 * Sets the value of the '{@link m4jdsl.ConstantWorkloadIntensity#getNumberOfSessions <em>Number Of Sessions</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Sessions</em>' attribute.
	 * @see #getNumberOfSessions()
	 * @generated
	 */
    void setNumberOfSessions(int value);

} // ConstantWorkloadIntensity
