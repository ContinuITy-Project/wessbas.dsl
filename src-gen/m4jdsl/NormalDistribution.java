/**
 */
package m4jdsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Distribution</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link m4jdsl.NormalDistribution#getMean <em>Mean</em>}</li>
 *   <li>{@link m4jdsl.NormalDistribution#getDeviation <em>Deviation</em>}</li>
 * </ul>
 * </p>
 *
 * @see m4jdsl.M4jdslPackage#getNormalDistribution()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustBeValidThinkTimeValues'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustBeValidThinkTimeValues='\n            mean >= 0.0 and deviation >= 0.0 and deviation <= mean'"
 * @generated
 */
public interface NormalDistribution extends ThinkTime {
    /**
     * Returns the value of the '<em><b>Mean</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mean</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mean</em>' attribute.
     * @see #setMean(double)
     * @see m4jdsl.M4jdslPackage#getNormalDistribution_Mean()
     * @model required="true"
     * @generated
     */
    double getMean();

    /**
     * Sets the value of the '{@link m4jdsl.NormalDistribution#getMean <em>Mean</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mean</em>' attribute.
     * @see #getMean()
     * @generated
     */
    void setMean(double value);

    /**
     * Returns the value of the '<em><b>Deviation</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Deviation</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Deviation</em>' attribute.
     * @see #setDeviation(double)
     * @see m4jdsl.M4jdslPackage#getNormalDistribution_Deviation()
     * @model required="true"
     * @generated
     */
    double getDeviation();

    /**
     * Sets the value of the '{@link m4jdsl.NormalDistribution#getDeviation <em>Deviation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Deviation</em>' attribute.
     * @see #getDeviation()
     * @generated
     */
    void setDeviation(double value);

} // NormalDistribution
