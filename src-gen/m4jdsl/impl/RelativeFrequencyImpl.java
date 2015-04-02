/**
 */
package m4jdsl.impl;

import m4jdsl.BehaviorModel;
import m4jdsl.M4jdslPackage;
import m4jdsl.RelativeFrequency;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relative Frequency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link m4jdsl.impl.RelativeFrequencyImpl#getBehaviorModel <em>Behavior Model</em>}</li>
 *   <li>{@link m4jdsl.impl.RelativeFrequencyImpl#getValue <em>Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RelativeFrequencyImpl extends MinimalEObjectImpl.Container implements RelativeFrequency {
    /**
	 * The cached value of the '{@link #getBehaviorModel() <em>Behavior Model</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getBehaviorModel()
	 * @generated
	 * @ordered
	 */
    protected BehaviorModel behaviorModel;

    /**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
    protected static final double VALUE_EDEFAULT = 0.0;

    /**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
    protected double value = VALUE_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected RelativeFrequencyImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return M4jdslPackage.Literals.RELATIVE_FREQUENCY;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BehaviorModel getBehaviorModel() {
		if (behaviorModel != null && behaviorModel.eIsProxy()) {
			InternalEObject oldBehaviorModel = (InternalEObject)behaviorModel;
			behaviorModel = (BehaviorModel)eResolveProxy(oldBehaviorModel);
			if (behaviorModel != oldBehaviorModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M4jdslPackage.RELATIVE_FREQUENCY__BEHAVIOR_MODEL, oldBehaviorModel, behaviorModel));
			}
		}
		return behaviorModel;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BehaviorModel basicGetBehaviorModel() {
		return behaviorModel;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setBehaviorModel(BehaviorModel newBehaviorModel) {
		BehaviorModel oldBehaviorModel = behaviorModel;
		behaviorModel = newBehaviorModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.RELATIVE_FREQUENCY__BEHAVIOR_MODEL, oldBehaviorModel, behaviorModel));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public double getValue() {
		return value;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setValue(double newValue) {
		double oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.RELATIVE_FREQUENCY__VALUE, oldValue, value));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M4jdslPackage.RELATIVE_FREQUENCY__BEHAVIOR_MODEL:
				if (resolve) return getBehaviorModel();
				return basicGetBehaviorModel();
			case M4jdslPackage.RELATIVE_FREQUENCY__VALUE:
				return getValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case M4jdslPackage.RELATIVE_FREQUENCY__BEHAVIOR_MODEL:
				setBehaviorModel((BehaviorModel)newValue);
				return;
			case M4jdslPackage.RELATIVE_FREQUENCY__VALUE:
				setValue((Double)newValue);
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
			case M4jdslPackage.RELATIVE_FREQUENCY__BEHAVIOR_MODEL:
				setBehaviorModel((BehaviorModel)null);
				return;
			case M4jdslPackage.RELATIVE_FREQUENCY__VALUE:
				setValue(VALUE_EDEFAULT);
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
			case M4jdslPackage.RELATIVE_FREQUENCY__BEHAVIOR_MODEL:
				return behaviorModel != null;
			case M4jdslPackage.RELATIVE_FREQUENCY__VALUE:
				return value != VALUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //RelativeFrequencyImpl
