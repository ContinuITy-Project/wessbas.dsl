/**
 */
package m4jdsl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workload Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link m4jdsl.WorkloadModel#getWorkloadIntensity <em>Workload Intensity</em>}</li>
 *   <li>{@link m4jdsl.WorkloadModel#getApplicationModel <em>Application Model</em>}</li>
 *   <li>{@link m4jdsl.WorkloadModel#getBehaviorMix <em>Behavior Mix</em>}</li>
 *   <li>{@link m4jdsl.WorkloadModel#getBehaviorModels <em>Behavior Models</em>}</li>
 * </ul>
 * </p>
 *
 * @see m4jdsl.M4jdslPackage#getWorkloadModel()
 * @model
 * @generated
 */
public interface WorkloadModel extends EObject {
    /**
	 * Returns the value of the '<em><b>Workload Intensity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Workload Intensity</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Workload Intensity</em>' containment reference.
	 * @see #setWorkloadIntensity(WorkloadIntensity)
	 * @see m4jdsl.M4jdslPackage#getWorkloadModel_WorkloadIntensity()
	 * @model containment="true" required="true"
	 * @generated
	 */
    WorkloadIntensity getWorkloadIntensity();

    /**
	 * Sets the value of the '{@link m4jdsl.WorkloadModel#getWorkloadIntensity <em>Workload Intensity</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workload Intensity</em>' containment reference.
	 * @see #getWorkloadIntensity()
	 * @generated
	 */
    void setWorkloadIntensity(WorkloadIntensity value);

    /**
	 * Returns the value of the '<em><b>Application Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Application Model</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Application Model</em>' containment reference.
	 * @see #setApplicationModel(ApplicationModel)
	 * @see m4jdsl.M4jdslPackage#getWorkloadModel_ApplicationModel()
	 * @model containment="true" required="true"
	 * @generated
	 */
    ApplicationModel getApplicationModel();

    /**
	 * Sets the value of the '{@link m4jdsl.WorkloadModel#getApplicationModel <em>Application Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Model</em>' containment reference.
	 * @see #getApplicationModel()
	 * @generated
	 */
    void setApplicationModel(ApplicationModel value);

    /**
	 * Returns the value of the '<em><b>Behavior Mix</b></em>' containment reference.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Behavior Mix</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior Mix</em>' containment reference.
	 * @see #setBehaviorMix(BehaviorMix)
	 * @see m4jdsl.M4jdslPackage#getWorkloadModel_BehaviorMix()
	 * @model containment="true" required="true"
	 * @generated
	 */
    BehaviorMix getBehaviorMix();

    /**
	 * Sets the value of the '{@link m4jdsl.WorkloadModel#getBehaviorMix <em>Behavior Mix</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Behavior Mix</em>' containment reference.
	 * @see #getBehaviorMix()
	 * @generated
	 */
    void setBehaviorMix(BehaviorMix value);

    /**
	 * Returns the value of the '<em><b>Behavior Models</b></em>' containment reference list.
	 * The list contents are of type {@link m4jdsl.BehaviorModel}.
	 * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Behavior Models</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
	 * @return the value of the '<em>Behavior Models</em>' containment reference list.
	 * @see m4jdsl.M4jdslPackage#getWorkloadModel_BehaviorModels()
	 * @model containment="true" required="true"
	 * @generated
	 */
    EList<BehaviorModel> getBehaviorModels();

} // WorkloadModel
