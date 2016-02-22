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
 * A representation of the model object '<em><b>Assertion</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link m4jdsl.Assertion#getPatternToTest <em>Pattern To Test</em>}</li>
 * </ul>
 * </p>
 *
 * @see m4jdsl.M4jdslPackage#getAssertion()
 * @model
 * @generated
 */
public interface Assertion extends EObject {
    /**
	 * Returns the value of the '<em><b>Pattern To Test</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Pattern To Test</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern To Test</em>' attribute.
	 * @see #setPatternToTest(String)
	 * @see m4jdsl.M4jdslPackage#getAssertion_PatternToTest()
	 * @model required="true"
	 * @generated
	 */
    String getPatternToTest();

    /**
	 * Sets the value of the '{@link m4jdsl.Assertion#getPatternToTest <em>Pattern To Test</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern To Test</em>' attribute.
	 * @see #getPatternToTest()
	 * @generated
	 */
    void setPatternToTest(String value);

} // Assertion
