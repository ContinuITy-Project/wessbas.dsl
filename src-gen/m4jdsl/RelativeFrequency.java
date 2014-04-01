/**
 */
package m4jdsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relative Frequency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link m4jdsl.RelativeFrequency#getBehaviorModel <em>Behavior Model</em>}</li>
 *   <li>{@link m4jdsl.RelativeFrequency#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see m4jdsl.M4jdslPackage#getRelativeFrequency()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustBeNonnegativeFrequency'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustBeNonnegativeFrequency='\n            value >= 0.0 and value <= 1.0'"
 * @generated
 */
public interface RelativeFrequency extends EObject {
    /**
     * Returns the value of the '<em><b>Behavior Model</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Behavior Model</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Behavior Model</em>' reference.
     * @see #setBehaviorModel(BehaviorModel)
     * @see m4jdsl.M4jdslPackage#getRelativeFrequency_BehaviorModel()
     * @model required="true"
     * @generated
     */
    BehaviorModel getBehaviorModel();

    /**
     * Sets the value of the '{@link m4jdsl.RelativeFrequency#getBehaviorModel <em>Behavior Model</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Behavior Model</em>' reference.
     * @see #getBehaviorModel()
     * @generated
     */
    void setBehaviorModel(BehaviorModel value);

    /**
     * Returns the value of the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value</em>' attribute.
     * @see #setValue(double)
     * @see m4jdsl.M4jdslPackage#getRelativeFrequency_Value()
     * @model required="true"
     * @generated
     */
    double getValue();

    /**
     * Sets the value of the '{@link m4jdsl.RelativeFrequency#getValue <em>Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value</em>' attribute.
     * @see #getValue()
     * @generated
     */
    void setValue(double value);

} // RelativeFrequency
