/**
 */
package m4jdsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link m4jdsl.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link m4jdsl.Parameter#getValue <em>Value</em>}</li>
 *   <li>{@link m4jdsl.Parameter#getParameterType <em>Parameter Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see m4jdsl.M4jdslPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter extends EObject {
    /**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Name</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see m4jdsl.M4jdslPackage#getParameter_Name()
	 * @model required="true"
	 * @generated
	 */
    String getName();

    /**
	 * Sets the value of the '{@link m4jdsl.Parameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
    void setName(String value);

    /**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(String)
	 * @see m4jdsl.M4jdslPackage#getParameter_Value()
	 * @model
	 * @generated
	 */
    String getValue();

    /**
	 * Sets the value of the '{@link m4jdsl.Parameter#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
    void setValue(String value);

				/**
	 * Returns the value of the '<em><b>Parameter Type</b></em>' attribute.
	 * The default value is <code>"INDEPENDENT"</code>.
	 * The literals are from the enumeration {@link m4jdsl.ParameterType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter Type</em>' attribute.
	 * @see m4jdsl.ParameterType
	 * @see #setParameterType(ParameterType)
	 * @see m4jdsl.M4jdslPackage#getParameter_ParameterType()
	 * @model default="INDEPENDENT"
	 * @generated
	 */
	ParameterType getParameterType();

				/**
	 * Sets the value of the '{@link m4jdsl.Parameter#getParameterType <em>Parameter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter Type</em>' attribute.
	 * @see m4jdsl.ParameterType
	 * @see #getParameterType()
	 * @generated
	 */
	void setParameterType(ParameterType value);

} // Parameter
