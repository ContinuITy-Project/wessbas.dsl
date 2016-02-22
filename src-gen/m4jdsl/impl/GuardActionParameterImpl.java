/***************************************************************************
 * Copyright (c) 2016 the WESSBAS project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ***************************************************************************/


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
 *   <li>{@link m4jdsl.impl.GuardActionParameterImpl#getSourceName <em>Source Name</em>}</li>
 *   <li>{@link m4jdsl.impl.GuardActionParameterImpl#getTargetName <em>Target Name</em>}</li>
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
	 * The default value of the '{@link #getSourceName() <em>Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceName() <em>Source Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceName()
	 * @generated
	 * @ordered
	 */
	protected String sourceName = SOURCE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTargetName() <em>Target Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetName()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetName() <em>Target Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetName()
	 * @generated
	 * @ordered
	 */
	protected String targetName = TARGET_NAME_EDEFAULT;

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceName() {
		return sourceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceName(String newSourceName) {
		String oldSourceName = sourceName;
		sourceName = newSourceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.GUARD_ACTION_PARAMETER__SOURCE_NAME, oldSourceName, sourceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetName() {
		return targetName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetName(String newTargetName) {
		String oldTargetName = targetName;
		targetName = newTargetName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.GUARD_ACTION_PARAMETER__TARGET_NAME, oldTargetName, targetName));
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
			case M4jdslPackage.GUARD_ACTION_PARAMETER__SOURCE_NAME:
				return getSourceName();
			case M4jdslPackage.GUARD_ACTION_PARAMETER__TARGET_NAME:
				return getTargetName();
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
			case M4jdslPackage.GUARD_ACTION_PARAMETER__SOURCE_NAME:
				setSourceName((String)newValue);
				return;
			case M4jdslPackage.GUARD_ACTION_PARAMETER__TARGET_NAME:
				setTargetName((String)newValue);
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
			case M4jdslPackage.GUARD_ACTION_PARAMETER__SOURCE_NAME:
				setSourceName(SOURCE_NAME_EDEFAULT);
				return;
			case M4jdslPackage.GUARD_ACTION_PARAMETER__TARGET_NAME:
				setTargetName(TARGET_NAME_EDEFAULT);
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
			case M4jdslPackage.GUARD_ACTION_PARAMETER__SOURCE_NAME:
				return SOURCE_NAME_EDEFAULT == null ? sourceName != null : !SOURCE_NAME_EDEFAULT.equals(sourceName);
			case M4jdslPackage.GUARD_ACTION_PARAMETER__TARGET_NAME:
				return TARGET_NAME_EDEFAULT == null ? targetName != null : !TARGET_NAME_EDEFAULT.equals(targetName);
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
		result.append(", sourceName: ");
		result.append(sourceName);
		result.append(", targetName: ");
		result.append(targetName);
		result.append(')');
		return result.toString();
	}

} //GuardActionParameterImpl
