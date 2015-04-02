/**
 */
package m4jdsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link m4jdsl.Transition#getTargetState <em>Target State</em>}</li>
 *   <li>{@link m4jdsl.Transition#getProbability <em>Probability</em>}</li>
 *   <li>{@link m4jdsl.Transition#getThinkTime <em>Think Time</em>}</li>
 * </ul>
 * </p>
 *
 * @see m4jdsl.M4jdslPackage#getTransition()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustBeValidProbability mustBeThinkTimesOfSameType'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustBeValidProbability='\n            probability >= 0.0 and probability <= 1.0' mustBeThinkTimesOfSameType='\n            Transition.allInstances()->\n                forAll(t1,t2|\n                    not (t1.thinkTime.oclIsUndefined() or t2.thinkTime.oclIsUndefined()) implies \n                    t1.thinkTime.oclType() = t2.thinkTime.oclType()\n                )'"
 * @generated
 */
public interface Transition extends EObject {
    /**
	 * Returns the value of the '<em><b>Target State</b></em>' reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target State</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Target State</em>' reference.
	 * @see #setTargetState(BehaviorModelState)
	 * @see m4jdsl.M4jdslPackage#getTransition_TargetState()
	 * @model required="true"
	 * @generated
	 */
    BehaviorModelState getTargetState();

    /**
	 * Sets the value of the '{@link m4jdsl.Transition#getTargetState <em>Target State</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target State</em>' reference.
	 * @see #getTargetState()
	 * @generated
	 */
    void setTargetState(BehaviorModelState value);

    /**
	 * Returns the value of the '<em><b>Probability</b></em>' attribute.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Probability</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Probability</em>' attribute.
	 * @see #setProbability(double)
	 * @see m4jdsl.M4jdslPackage#getTransition_Probability()
	 * @model required="true"
	 * @generated
	 */
    double getProbability();

    /**
	 * Sets the value of the '{@link m4jdsl.Transition#getProbability <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Probability</em>' attribute.
	 * @see #getProbability()
	 * @generated
	 */
    void setProbability(double value);

    /**
	 * Returns the value of the '<em><b>Think Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Think Time</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Think Time</em>' containment reference.
	 * @see #setThinkTime(ThinkTime)
	 * @see m4jdsl.M4jdslPackage#getTransition_ThinkTime()
	 * @model containment="true" required="true"
	 * @generated
	 */
    ThinkTime getThinkTime();

    /**
	 * Sets the value of the '{@link m4jdsl.Transition#getThinkTime <em>Think Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Think Time</em>' containment reference.
	 * @see #getThinkTime()
	 * @generated
	 */
    void setThinkTime(ThinkTime value);

} // Transition
