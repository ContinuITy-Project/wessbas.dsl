/**
 */
package m4jdsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Model State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link m4jdsl.BehaviorModelState#getEId <em>EId</em>}</li>
 * </ul>
 * </p>
 *
 * @see m4jdsl.M4jdslPackage#getBehaviorModelState()
 * @model abstract="true"
 * @generated
 */
public interface BehaviorModelState extends EObject {
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
     * @see m4jdsl.M4jdslPackage#getBehaviorModelState_EId()
     * @model required="true"
     * @generated
     */
    String getEId();

    /**
     * Sets the value of the '{@link m4jdsl.BehaviorModelState#getEId <em>EId</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>EId</em>' attribute.
     * @see #getEId()
     * @generated
     */
    void setEId(String value);

} // BehaviorModelState
