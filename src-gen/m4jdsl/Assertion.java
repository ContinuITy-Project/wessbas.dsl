/**
 */
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
