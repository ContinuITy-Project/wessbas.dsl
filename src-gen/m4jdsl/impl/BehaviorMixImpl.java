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

import m4jdsl.BehaviorMix;
import m4jdsl.M4jdslPackage;
import m4jdsl.RelativeFrequency;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior Mix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link m4jdsl.impl.BehaviorMixImpl#getRelativeFrequencies <em>Relative Frequencies</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorMixImpl extends MinimalEObjectImpl.Container implements BehaviorMix {
    /**
	 * The cached value of the '{@link #getRelativeFrequencies() <em>Relative Frequencies</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getRelativeFrequencies()
	 * @generated
	 * @ordered
	 */
    protected EList<RelativeFrequency> relativeFrequencies;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected BehaviorMixImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return M4jdslPackage.Literals.BEHAVIOR_MIX;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<RelativeFrequency> getRelativeFrequencies() {
		if (relativeFrequencies == null) {
			relativeFrequencies = new EObjectContainmentEList<RelativeFrequency>(RelativeFrequency.class, this, M4jdslPackage.BEHAVIOR_MIX__RELATIVE_FREQUENCIES);
		}
		return relativeFrequencies;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M4jdslPackage.BEHAVIOR_MIX__RELATIVE_FREQUENCIES:
				return ((InternalEList<?>)getRelativeFrequencies()).basicRemove(otherEnd, msgs);
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
			case M4jdslPackage.BEHAVIOR_MIX__RELATIVE_FREQUENCIES:
				return getRelativeFrequencies();
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
			case M4jdslPackage.BEHAVIOR_MIX__RELATIVE_FREQUENCIES:
				getRelativeFrequencies().clear();
				getRelativeFrequencies().addAll((Collection<? extends RelativeFrequency>)newValue);
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
			case M4jdslPackage.BEHAVIOR_MIX__RELATIVE_FREQUENCIES:
				getRelativeFrequencies().clear();
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
			case M4jdslPackage.BEHAVIOR_MIX__RELATIVE_FREQUENCIES:
				return relativeFrequencies != null && !relativeFrequencies.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BehaviorMixImpl
