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

import java.util.Collection;
import m4jdsl.GuardActionParameter;
import m4jdsl.GuardActionParameterList;
import m4jdsl.M4jdslPackage;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guard Action Parameter List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link m4jdsl.impl.GuardActionParameterListImpl#getGuardActionParameters <em>Guard Action Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuardActionParameterListImpl extends MinimalEObjectImpl.Container implements GuardActionParameterList {
	/**
	 * The cached value of the '{@link #getGuardActionParameters() <em>Guard Action Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardActionParameters()
	 * @generated
	 * @ordered
	 */
	protected EList<GuardActionParameter> guardActionParameters;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuardActionParameterListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M4jdslPackage.Literals.GUARD_ACTION_PARAMETER_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<GuardActionParameter> getGuardActionParameters() {
		if (guardActionParameters == null) {
			guardActionParameters = new EObjectContainmentEList<GuardActionParameter>(GuardActionParameter.class, this, M4jdslPackage.GUARD_ACTION_PARAMETER_LIST__GUARD_ACTION_PARAMETERS);
		}
		return guardActionParameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M4jdslPackage.GUARD_ACTION_PARAMETER_LIST__GUARD_ACTION_PARAMETERS:
				return ((InternalEList<?>)getGuardActionParameters()).basicRemove(otherEnd, msgs);
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
			case M4jdslPackage.GUARD_ACTION_PARAMETER_LIST__GUARD_ACTION_PARAMETERS:
				return getGuardActionParameters();
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
			case M4jdslPackage.GUARD_ACTION_PARAMETER_LIST__GUARD_ACTION_PARAMETERS:
				getGuardActionParameters().clear();
				getGuardActionParameters().addAll((Collection<? extends GuardActionParameter>)newValue);
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
			case M4jdslPackage.GUARD_ACTION_PARAMETER_LIST__GUARD_ACTION_PARAMETERS:
				getGuardActionParameters().clear();
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
			case M4jdslPackage.GUARD_ACTION_PARAMETER_LIST__GUARD_ACTION_PARAMETERS:
				return guardActionParameters != null && !guardActionParameters.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GuardActionParameterListImpl
