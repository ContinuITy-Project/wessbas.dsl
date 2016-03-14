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

import m4jdsl.Guard;
import m4jdsl.GuardActionParameter;
import m4jdsl.M4jdslPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guard</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link m4jdsl.impl.GuardImpl#getGuardParameter <em>Guard Parameter</em>}</li>
 *   <li>{@link m4jdsl.impl.GuardImpl#isNegate <em>Negate</em>}</li>
 *   <li>{@link m4jdsl.impl.GuardImpl#getDiffMinimum <em>Diff Minimum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuardImpl extends MinimalEObjectImpl.Container implements Guard {
	/**
	 * The cached value of the '{@link #getGuardParameter() <em>Guard Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardParameter()
	 * @generated
	 * @ordered
	 */
	protected GuardActionParameter guardParameter;

	/**
	 * The default value of the '{@link #isNegate() <em>Negate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean NEGATE_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isNegate() <em>Negate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNegate()
	 * @generated
	 * @ordered
	 */
	protected boolean negate = NEGATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiffMinimum() <em>Diff Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final int DIFF_MINIMUM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDiffMinimum() <em>Diff Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiffMinimum()
	 * @generated
	 * @ordered
	 */
	protected int diffMinimum = DIFF_MINIMUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuardImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M4jdslPackage.Literals.GUARD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuardActionParameter getGuardParameter() {
		if (guardParameter != null && guardParameter.eIsProxy()) {
			InternalEObject oldGuardParameter = (InternalEObject)guardParameter;
			guardParameter = (GuardActionParameter)eResolveProxy(oldGuardParameter);
			if (guardParameter != oldGuardParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M4jdslPackage.GUARD__GUARD_PARAMETER, oldGuardParameter, guardParameter));
			}
		}
		return guardParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuardActionParameter basicGetGuardParameter() {
		return guardParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardParameter(GuardActionParameter newGuardParameter) {
		GuardActionParameter oldGuardParameter = guardParameter;
		guardParameter = newGuardParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.GUARD__GUARD_PARAMETER, oldGuardParameter, guardParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isNegate() {
		return negate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegate(boolean newNegate) {
		boolean oldNegate = negate;
		negate = newNegate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.GUARD__NEGATE, oldNegate, negate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDiffMinimum() {
		return diffMinimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiffMinimum(int newDiffMinimum) {
		int oldDiffMinimum = diffMinimum;
		diffMinimum = newDiffMinimum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.GUARD__DIFF_MINIMUM, oldDiffMinimum, diffMinimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M4jdslPackage.GUARD__GUARD_PARAMETER:
				if (resolve) return getGuardParameter();
				return basicGetGuardParameter();
			case M4jdslPackage.GUARD__NEGATE:
				return isNegate();
			case M4jdslPackage.GUARD__DIFF_MINIMUM:
				return getDiffMinimum();
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
			case M4jdslPackage.GUARD__GUARD_PARAMETER:
				setGuardParameter((GuardActionParameter)newValue);
				return;
			case M4jdslPackage.GUARD__NEGATE:
				setNegate((Boolean)newValue);
				return;
			case M4jdslPackage.GUARD__DIFF_MINIMUM:
				setDiffMinimum((Integer)newValue);
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
			case M4jdslPackage.GUARD__GUARD_PARAMETER:
				setGuardParameter((GuardActionParameter)null);
				return;
			case M4jdslPackage.GUARD__NEGATE:
				setNegate(NEGATE_EDEFAULT);
				return;
			case M4jdslPackage.GUARD__DIFF_MINIMUM:
				setDiffMinimum(DIFF_MINIMUM_EDEFAULT);
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
			case M4jdslPackage.GUARD__GUARD_PARAMETER:
				return guardParameter != null;
			case M4jdslPackage.GUARD__NEGATE:
				return negate != NEGATE_EDEFAULT;
			case M4jdslPackage.GUARD__DIFF_MINIMUM:
				return diffMinimum != DIFF_MINIMUM_EDEFAULT;
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
		result.append(" (negate: ");
		result.append(negate);
		result.append(", diffMinimum: ");
		result.append(diffMinimum);
		result.append(')');
		return result.toString();
	}

} //GuardImpl
