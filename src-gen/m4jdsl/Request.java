/**
 */
package m4jdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link m4jdsl.Request#getEId <em>EId</em>}</li>
 *   <li>{@link m4jdsl.Request#getAssertions <em>Assertions</em>}</li>
 *   <li>{@link m4jdsl.Request#getProperties <em>Properties</em>}</li>
 *   <li>{@link m4jdsl.Request#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see m4jdsl.M4jdslPackage#getRequest()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustBeUniquePropertyKeys mustBeUniqueParameterNames mustBeRequestsOfSameType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustBeUniquePropertyKeys='\n         properties->forAll(p1,p2 | \n             (p1 <> p2 and not(p1.key.oclIsUndefined() or p2.key.oclIsUndefined()))\n                implies p1.key <> p2.key\n         )' mustBeUniqueParameterNames='\n        parameters->forAll(p1,p2 |\n             (p1 <> p2 and not(p1.name.oclIsUndefined() or p2.name.oclIsUndefined()))\n             implies p1.name <> p2.name\n        )' mustBeRequestsOfSameType='\n        Request.allInstances()->forAll(r1,r2 | r1.oclType() = r2.oclType())'"
 * @generated
 */
public interface Request extends EObject {
    /**
     * Returns the value of the '<em><b>EId</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>EId</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>EId</em>' attribute.
     * @see #setEId(String)
     * @see m4jdsl.M4jdslPackage#getRequest_EId()
     * @model id="true" required="true"
     * @generated
     */
    String getEId();

    /**
     * Sets the value of the '{@link m4jdsl.Request#getEId <em>EId</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EId</em>' attribute.
     * @see #getEId()
     * @generated
     */
    void setEId(String value);

    /**
     * Returns the value of the '<em><b>Assertions</b></em>' containment reference list.
     * The list contents are of type {@link m4jdsl.Assertion}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Assertions</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Assertions</em>' containment reference list.
     * @see m4jdsl.M4jdslPackage#getRequest_Assertions()
     * @model containment="true"
     * @generated
     */
    EList<Assertion> getAssertions();

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
     * @see m4jdsl.M4jdslPackage#getRequest_Properties()
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
     * @see m4jdsl.M4jdslPackage#getRequest_Parameters()
     * @model containment="true"
     * @generated
     */
    EList<Parameter> getParameters();

} // Request
