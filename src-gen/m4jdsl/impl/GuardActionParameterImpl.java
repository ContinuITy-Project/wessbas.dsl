/**
 */
package m4jdsl.impl;

import m4jdsl.GuardActionParameter;
import m4jdsl.GuardActionParameterType;
import m4jdsl.M4jdslPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guard Action Parameter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link m4jdsl.impl.GuardActionParameterImpl#getGuardActionParameterName <em>Guard Action Parameter Name</em>}</li>
 *   <li>{@link m4jdsl.impl.GuardActionParameterImpl#getParameterType <em>Parameter Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuardActionParameterImpl extends MinimalEObjectImpl.Container implements GuardActionParameter {
	/**
	 * The default value of the '{@link #getGuardActionParameterName() <em>Guard Action Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardActionParameterName()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_ACTION_PARAMETER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuardActionParameterName() <em>Guard Action Parameter Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardActionParameterName()
	 * @generated
	 * @ordered
	 */
	protected String guardActionParameterName = GUARD_ACTION_PARAMETER_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getParameterType() <em>Parameter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterType()
	 * @generated
	 * @ordered
	 */
	protected static final GuardActionParameterType PARAMETER_TYPE_EDEFAULT = GuardActionParameterType.BOOLEAN;

	/**
	 * The cached value of the '{@link #getParameterType() <em>Parameter Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParameterType()
	 * @generated
	 * @ordered
	 */
	protected GuardActionParameterType parameterType = PARAMETER_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuardActionParameterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M4jdslPackage.Literals.GUARD_ACTION_PARAMETER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuardActionParameterName() {
		return guardActionParameterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardActionParameterName(String newGuardActionParameterName) {
		String oldGuardActionParameterName = guardActionParameterName;
		guardActionParameterName = newGuardActionParameterName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.GUARD_ACTION_PARAMETER__GUARD_ACTION_PARAMETER_NAME, oldGuardActionParameterName, guardActionParameterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuardActionParameterType getParameterType() {
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameterType(GuardActionParameterType newParameterType) {
		GuardActionParameterType oldParameterType = parameterType;
		parameterType = newParameterType == null ? PARAMETER_TYPE_EDEFAULT : newParameterType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.GUARD_ACTION_PARAMETER__PARAMETER_TYPE, oldParameterType, parameterType));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((guardActionParameterName == null) ? 0
						: guardActionParameterName.hashCode());
		result = prime * result
				+ ((parameterType == null) ? 0 : parameterType.hashCode());
		return result;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M4jdslPackage.GUARD_ACTION_PARAMETER__GUARD_ACTION_PARAMETER_NAME:
				return getGuardActionParameterName();
			case M4jdslPackage.GUARD_ACTION_PARAMETER__PARAMETER_TYPE:
				return getParameterType();
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
			case M4jdslPackage.GUARD_ACTION_PARAMETER__GUARD_ACTION_PARAMETER_NAME:
				setGuardActionParameterName((String)newValue);
				return;
			case M4jdslPackage.GUARD_ACTION_PARAMETER__PARAMETER_TYPE:
				setParameterType((GuardActionParameterType)newValue);
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
			case M4jdslPackage.GUARD_ACTION_PARAMETER__GUARD_ACTION_PARAMETER_NAME:
				setGuardActionParameterName(GUARD_ACTION_PARAMETER_NAME_EDEFAULT);
				return;
			case M4jdslPackage.GUARD_ACTION_PARAMETER__PARAMETER_TYPE:
				setParameterType(PARAMETER_TYPE_EDEFAULT);
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
			case M4jdslPackage.GUARD_ACTION_PARAMETER__GUARD_ACTION_PARAMETER_NAME:
				return GUARD_ACTION_PARAMETER_NAME_EDEFAULT == null ? guardActionParameterName != null : !GUARD_ACTION_PARAMETER_NAME_EDEFAULT.equals(guardActionParameterName);
			case M4jdslPackage.GUARD_ACTION_PARAMETER__PARAMETER_TYPE:
				return parameterType != PARAMETER_TYPE_EDEFAULT;
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
		result.append(" (guardActionParameterName: ");
		result.append(guardActionParameterName);
		result.append(", parameterType: ");
		result.append(parameterType);
		result.append(')');
		return result.toString();
	}

} //GuardActionParameterImpl
