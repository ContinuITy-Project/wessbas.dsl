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
 * A representation of the model object '<em><b>Application Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link m4jdsl.ApplicationModel#getSessionLayerEFSM <em>Session Layer EFSM</em>}</li>
 * </ul>
 * </p>
 *
 * @see m4jdsl.M4jdslPackage#getApplicationModel()
 * @model
 * @generated
 */
public interface ApplicationModel extends EObject {
    /**
	 * Returns the value of the '<em><b>Session Layer EFSM</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Session Layer EFSM</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Session Layer EFSM</em>' containment reference.
	 * @see #setSessionLayerEFSM(SessionLayerEFSM)
	 * @see m4jdsl.M4jdslPackage#getApplicationModel_SessionLayerEFSM()
	 * @model containment="true" required="true"
	 * @generated
	 */
    SessionLayerEFSM getSessionLayerEFSM();

    /**
	 * Sets the value of the '{@link m4jdsl.ApplicationModel#getSessionLayerEFSM <em>Session Layer EFSM</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Session Layer EFSM</em>' containment reference.
	 * @see #getSessionLayerEFSM()
	 * @generated
	 */
    void setSessionLayerEFSM(SessionLayerEFSM value);

} // ApplicationModel
