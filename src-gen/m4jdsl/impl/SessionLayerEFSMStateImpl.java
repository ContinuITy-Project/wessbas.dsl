/**
 */
package m4jdsl.impl;

import m4jdsl.M4jdslPackage;
import m4jdsl.SessionLayerEFSMState;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Session Layer EFSM State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link m4jdsl.impl.SessionLayerEFSMStateImpl#getEId <em>EId</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class SessionLayerEFSMStateImpl extends MinimalEObjectImpl.Container implements SessionLayerEFSMState {
    /**
	 * The default value of the '{@link #getEId() <em>EId</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getEId()
	 * @generated
	 * @ordered
	 */
    protected static final String EID_EDEFAULT = null;

    /**
	 * The cached value of the '{@link #getEId() <em>EId</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getEId()
	 * @generated
	 * @ordered
	 */
    protected String eId = EID_EDEFAULT;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected SessionLayerEFSMStateImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return M4jdslPackage.Literals.SESSION_LAYER_EFSM_STATE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public String getEId() {
		return eId;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setEId(String newEId) {
		String oldEId = eId;
		eId = newEId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.SESSION_LAYER_EFSM_STATE__EID, oldEId, eId));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M4jdslPackage.SESSION_LAYER_EFSM_STATE__EID:
				return getEId();
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
			case M4jdslPackage.SESSION_LAYER_EFSM_STATE__EID:
				setEId((String)newValue);
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
			case M4jdslPackage.SESSION_LAYER_EFSM_STATE__EID:
				setEId(EID_EDEFAULT);
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
			case M4jdslPackage.SESSION_LAYER_EFSM_STATE__EID:
				return EID_EDEFAULT == null ? eId != null : !EID_EDEFAULT.equals(eId);
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
		result.append(" (eId: ");
		result.append(eId);
		result.append(')');
		return result.toString();
	}

} //SessionLayerEFSMStateImpl
