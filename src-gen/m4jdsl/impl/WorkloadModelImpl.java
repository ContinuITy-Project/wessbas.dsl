/**
 */
package m4jdsl.impl;

import java.util.Collection;

import m4jdsl.ApplicationModel;
import m4jdsl.BehaviorMix;
import m4jdsl.BehaviorModel;
import m4jdsl.M4jdslPackage;
import m4jdsl.WorkloadIntensity;
import m4jdsl.WorkloadModel;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workload Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link m4jdsl.impl.WorkloadModelImpl#getWorkloadIntensity <em>Workload Intensity</em>}</li>
 *   <li>{@link m4jdsl.impl.WorkloadModelImpl#getApplicationModel <em>Application Model</em>}</li>
 *   <li>{@link m4jdsl.impl.WorkloadModelImpl#getBehaviorMix <em>Behavior Mix</em>}</li>
 *   <li>{@link m4jdsl.impl.WorkloadModelImpl#getBehaviorModels <em>Behavior Models</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkloadModelImpl extends MinimalEObjectImpl.Container implements WorkloadModel {
    /**
	 * The cached value of the '{@link #getWorkloadIntensity() <em>Workload Intensity</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getWorkloadIntensity()
	 * @generated
	 * @ordered
	 */
    protected WorkloadIntensity workloadIntensity;

    /**
	 * The cached value of the '{@link #getApplicationModel() <em>Application Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getApplicationModel()
	 * @generated
	 * @ordered
	 */
    protected ApplicationModel applicationModel;

    /**
	 * The cached value of the '{@link #getBehaviorMix() <em>Behavior Mix</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getBehaviorMix()
	 * @generated
	 * @ordered
	 */
    protected BehaviorMix behaviorMix;

    /**
	 * The cached value of the '{@link #getBehaviorModels() <em>Behavior Models</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getBehaviorModels()
	 * @generated
	 * @ordered
	 */
    protected EList<BehaviorModel> behaviorModels;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected WorkloadModelImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return M4jdslPackage.Literals.WORKLOAD_MODEL;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public WorkloadIntensity getWorkloadIntensity() {
		return workloadIntensity;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetWorkloadIntensity(WorkloadIntensity newWorkloadIntensity, NotificationChain msgs) {
		WorkloadIntensity oldWorkloadIntensity = workloadIntensity;
		workloadIntensity = newWorkloadIntensity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M4jdslPackage.WORKLOAD_MODEL__WORKLOAD_INTENSITY, oldWorkloadIntensity, newWorkloadIntensity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setWorkloadIntensity(WorkloadIntensity newWorkloadIntensity) {
		if (newWorkloadIntensity != workloadIntensity) {
			NotificationChain msgs = null;
			if (workloadIntensity != null)
				msgs = ((InternalEObject)workloadIntensity).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M4jdslPackage.WORKLOAD_MODEL__WORKLOAD_INTENSITY, null, msgs);
			if (newWorkloadIntensity != null)
				msgs = ((InternalEObject)newWorkloadIntensity).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M4jdslPackage.WORKLOAD_MODEL__WORKLOAD_INTENSITY, null, msgs);
			msgs = basicSetWorkloadIntensity(newWorkloadIntensity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.WORKLOAD_MODEL__WORKLOAD_INTENSITY, newWorkloadIntensity, newWorkloadIntensity));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ApplicationModel getApplicationModel() {
		return applicationModel;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetApplicationModel(ApplicationModel newApplicationModel, NotificationChain msgs) {
		ApplicationModel oldApplicationModel = applicationModel;
		applicationModel = newApplicationModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M4jdslPackage.WORKLOAD_MODEL__APPLICATION_MODEL, oldApplicationModel, newApplicationModel);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setApplicationModel(ApplicationModel newApplicationModel) {
		if (newApplicationModel != applicationModel) {
			NotificationChain msgs = null;
			if (applicationModel != null)
				msgs = ((InternalEObject)applicationModel).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M4jdslPackage.WORKLOAD_MODEL__APPLICATION_MODEL, null, msgs);
			if (newApplicationModel != null)
				msgs = ((InternalEObject)newApplicationModel).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M4jdslPackage.WORKLOAD_MODEL__APPLICATION_MODEL, null, msgs);
			msgs = basicSetApplicationModel(newApplicationModel, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.WORKLOAD_MODEL__APPLICATION_MODEL, newApplicationModel, newApplicationModel));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BehaviorMix getBehaviorMix() {
		return behaviorMix;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetBehaviorMix(BehaviorMix newBehaviorMix, NotificationChain msgs) {
		BehaviorMix oldBehaviorMix = behaviorMix;
		behaviorMix = newBehaviorMix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M4jdslPackage.WORKLOAD_MODEL__BEHAVIOR_MIX, oldBehaviorMix, newBehaviorMix);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setBehaviorMix(BehaviorMix newBehaviorMix) {
		if (newBehaviorMix != behaviorMix) {
			NotificationChain msgs = null;
			if (behaviorMix != null)
				msgs = ((InternalEObject)behaviorMix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M4jdslPackage.WORKLOAD_MODEL__BEHAVIOR_MIX, null, msgs);
			if (newBehaviorMix != null)
				msgs = ((InternalEObject)newBehaviorMix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M4jdslPackage.WORKLOAD_MODEL__BEHAVIOR_MIX, null, msgs);
			msgs = basicSetBehaviorMix(newBehaviorMix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.WORKLOAD_MODEL__BEHAVIOR_MIX, newBehaviorMix, newBehaviorMix));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<BehaviorModel> getBehaviorModels() {
		if (behaviorModels == null) {
			behaviorModels = new EObjectContainmentEList<BehaviorModel>(BehaviorModel.class, this, M4jdslPackage.WORKLOAD_MODEL__BEHAVIOR_MODELS);
		}
		return behaviorModels;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M4jdslPackage.WORKLOAD_MODEL__WORKLOAD_INTENSITY:
				return basicSetWorkloadIntensity(null, msgs);
			case M4jdslPackage.WORKLOAD_MODEL__APPLICATION_MODEL:
				return basicSetApplicationModel(null, msgs);
			case M4jdslPackage.WORKLOAD_MODEL__BEHAVIOR_MIX:
				return basicSetBehaviorMix(null, msgs);
			case M4jdslPackage.WORKLOAD_MODEL__BEHAVIOR_MODELS:
				return ((InternalEList<?>)getBehaviorModels()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M4jdslPackage.WORKLOAD_MODEL__WORKLOAD_INTENSITY:
				return getWorkloadIntensity();
			case M4jdslPackage.WORKLOAD_MODEL__APPLICATION_MODEL:
				return getApplicationModel();
			case M4jdslPackage.WORKLOAD_MODEL__BEHAVIOR_MIX:
				return getBehaviorMix();
			case M4jdslPackage.WORKLOAD_MODEL__BEHAVIOR_MODELS:
				return getBehaviorModels();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case M4jdslPackage.WORKLOAD_MODEL__WORKLOAD_INTENSITY:
				setWorkloadIntensity((WorkloadIntensity)newValue);
				return;
			case M4jdslPackage.WORKLOAD_MODEL__APPLICATION_MODEL:
				setApplicationModel((ApplicationModel)newValue);
				return;
			case M4jdslPackage.WORKLOAD_MODEL__BEHAVIOR_MIX:
				setBehaviorMix((BehaviorMix)newValue);
				return;
			case M4jdslPackage.WORKLOAD_MODEL__BEHAVIOR_MODELS:
				getBehaviorModels().clear();
				getBehaviorModels().addAll((Collection<? extends BehaviorModel>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eUnset(int featureID) {
		switch (featureID) {
			case M4jdslPackage.WORKLOAD_MODEL__WORKLOAD_INTENSITY:
				setWorkloadIntensity((WorkloadIntensity)null);
				return;
			case M4jdslPackage.WORKLOAD_MODEL__APPLICATION_MODEL:
				setApplicationModel((ApplicationModel)null);
				return;
			case M4jdslPackage.WORKLOAD_MODEL__BEHAVIOR_MIX:
				setBehaviorMix((BehaviorMix)null);
				return;
			case M4jdslPackage.WORKLOAD_MODEL__BEHAVIOR_MODELS:
				getBehaviorModels().clear();
				return;
		}
		super.eUnset(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public boolean eIsSet(int featureID) {
		switch (featureID) {
			case M4jdslPackage.WORKLOAD_MODEL__WORKLOAD_INTENSITY:
				return workloadIntensity != null;
			case M4jdslPackage.WORKLOAD_MODEL__APPLICATION_MODEL:
				return applicationModel != null;
			case M4jdslPackage.WORKLOAD_MODEL__BEHAVIOR_MIX:
				return behaviorMix != null;
			case M4jdslPackage.WORKLOAD_MODEL__BEHAVIOR_MODELS:
				return behaviorModels != null && !behaviorModels.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorkloadModelImpl
