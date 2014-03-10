/**
 */
package m4jdsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workload Intensity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link m4jdsl.WorkloadIntensity#getFormula <em>Formula</em>}</li>
 * </ul>
 * </p>
 *
 * @see m4jdsl.M4jdslPackage#getWorkloadIntensity()
 * @model abstract="true"
 * @generated
 */
public interface WorkloadIntensity extends EObject {
    /**
     * Returns the value of the '<em><b>Formula</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Formula</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Formula</em>' attribute.
     * @see #setFormula(String)
     * @see m4jdsl.M4jdslPackage#getWorkloadIntensity_Formula()
     * @model required="true"
     * @generated
     */
    String getFormula();

    /**
     * Sets the value of the '{@link m4jdsl.WorkloadIntensity#getFormula <em>Formula</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Formula</em>' attribute.
     * @see #getFormula()
     * @generated
     */
    void setFormula(String value);

} // WorkloadIntensity
