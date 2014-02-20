/**
 */
package m4jdsl;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>HTTP Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link m4jdsl.HTTPRequest#getProperties <em>Properties</em>}</li>
 *   <li>{@link m4jdsl.HTTPRequest#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see m4jdsl.M4jdslPackage#getHTTPRequest()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustBeUniquePropertyNames mustBeUniqueParameterNames'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustBeUniquePropertyNames='\n         properties->forAll(p1,p2 | p1 <> p2 implies p1.key <> p2.key)' mustBeUniqueParameterNames='\n        parameters-> forAll(p1,p2 | p1 <> p2 implies p1.name <> p2.name)'"
 * @generated
 */
public interface HTTPRequest extends Request {
    /**
     * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
     * The list contents are of type {@link m4jdsl.Property}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Properties</em>' containment reference list.
     * @see m4jdsl.M4jdslPackage#getHTTPRequest_Properties()
     * @model containment="true"
     * @generated
     */
    EList<Property> getProperties();

    /**
     * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
     * The list contents are of type {@link m4jdsl.Parameter}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameters</em>' containment reference list.
     * @see m4jdsl.M4jdslPackage#getHTTPRequest_Parameters()
     * @model containment="true"
     * @generated
     */
    EList<Parameter> getParameters();

} // HTTPRequest
