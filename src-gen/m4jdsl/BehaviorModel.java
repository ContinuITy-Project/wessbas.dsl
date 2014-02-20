/**
 */
package m4jdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Behavior Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link m4jdsl.BehaviorModel#getMarkovStates <em>Markov States</em>}</li>
 *   <li>{@link m4jdsl.BehaviorModel#getName <em>Name</em>}</li>
 *   <li>{@link m4jdsl.BehaviorModel#getFilename <em>Filename</em>}</li>
 * </ul>
 * </p>
 *
 * @see m4jdsl.M4jdslPackage#getBehaviorModel()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='mustBeUniqueNames mustBeBehaviorModelWithMarkovStatesForAllServices'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot mustBeUniqueNames='\n            BehaviorModel.allInstances()->\n                forAll(b1,b2|b1 <> b2 implies b1.name <> b2.name)' mustBeBehaviorModelWithMarkovStatesForAllServices='\n            Service.allInstances()->\n                forAll(s|markovStates->exists(m|m.service = s))'"
 * @generated
 */
public interface BehaviorModel extends EObject {
    /**
     * Returns the value of the '<em><b>Markov States</b></em>' containment reference list.
     * The list contents are of type {@link m4jdsl.MarkovState}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Markov States</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Markov States</em>' containment reference list.
     * @see m4jdsl.M4jdslPackage#getBehaviorModel_MarkovStates()
     * @model containment="true" required="true"
     * @generated
     */
    EList<MarkovState> getMarkovStates();

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
     * @see m4jdsl.M4jdslPackage#getBehaviorModel_Name()
     * @model required="true"
     * @generated
     */
    String getName();

    /**
     * Sets the value of the '{@link m4jdsl.BehaviorModel#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
    void setName(String value);

    /**
     * Returns the value of the '<em><b>Filename</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Filename</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Filename</em>' attribute.
     * @see #setFilename(String)
     * @see m4jdsl.M4jdslPackage#getBehaviorModel_Filename()
     * @model required="true"
     * @generated
     */
    String getFilename();

    /**
     * Sets the value of the '{@link m4jdsl.BehaviorModel#getFilename <em>Filename</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Filename</em>' attribute.
     * @see #getFilename()
     * @generated
     */
    void setFilename(String value);

} // BehaviorModel
