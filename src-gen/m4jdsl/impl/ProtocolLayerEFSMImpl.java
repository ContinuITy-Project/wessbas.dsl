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

import m4jdsl.M4jdslPackage;
import m4jdsl.ProtocolExitState;
import m4jdsl.ProtocolLayerEFSM;
import m4jdsl.ProtocolState;

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
 * An implementation of the model object '<em><b>Protocol Layer EFSM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link m4jdsl.impl.ProtocolLayerEFSMImpl#getProtocolStates <em>Protocol States</em>}</li>
 *   <li>{@link m4jdsl.impl.ProtocolLayerEFSMImpl#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link m4jdsl.impl.ProtocolLayerEFSMImpl#getExitState <em>Exit State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtocolLayerEFSMImpl extends MinimalEObjectImpl.Container implements ProtocolLayerEFSM {
    /**
	 * The cached value of the '{@link #getProtocolStates() <em>Protocol States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getProtocolStates()
	 * @generated
	 * @ordered
	 */
    protected EList<ProtocolState> protocolStates;

    /**
	 * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
    protected ProtocolState initialState;

    /**
	 * The cached value of the '{@link #getExitState() <em>Exit State</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getExitState()
	 * @generated
	 * @ordered
	 */
    protected ProtocolExitState exitState;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ProtocolLayerEFSMImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return M4jdslPackage.Literals.PROTOCOL_LAYER_EFSM;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ProtocolState> getProtocolStates() {
		if (protocolStates == null) {
			protocolStates = new EObjectContainmentEList<ProtocolState>(ProtocolState.class, this, M4jdslPackage.PROTOCOL_LAYER_EFSM__PROTOCOL_STATES);
		}
		return protocolStates;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ProtocolState getInitialState() {
		if (initialState != null && initialState.eIsProxy()) {
			InternalEObject oldInitialState = (InternalEObject)initialState;
			initialState = (ProtocolState)eResolveProxy(oldInitialState);
			if (initialState != oldInitialState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M4jdslPackage.PROTOCOL_LAYER_EFSM__INITIAL_STATE, oldInitialState, initialState));
			}
		}
		return initialState;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ProtocolState basicGetInitialState() {
		return initialState;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setInitialState(ProtocolState newInitialState) {
		ProtocolState oldInitialState = initialState;
		initialState = newInitialState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.PROTOCOL_LAYER_EFSM__INITIAL_STATE, oldInitialState, initialState));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ProtocolExitState getExitState() {
		return exitState;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetExitState(ProtocolExitState newExitState, NotificationChain msgs) {
		ProtocolExitState oldExitState = exitState;
		exitState = newExitState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M4jdslPackage.PROTOCOL_LAYER_EFSM__EXIT_STATE, oldExitState, newExitState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setExitState(ProtocolExitState newExitState) {
		if (newExitState != exitState) {
			NotificationChain msgs = null;
			if (exitState != null)
				msgs = ((InternalEObject)exitState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M4jdslPackage.PROTOCOL_LAYER_EFSM__EXIT_STATE, null, msgs);
			if (newExitState != null)
				msgs = ((InternalEObject)newExitState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M4jdslPackage.PROTOCOL_LAYER_EFSM__EXIT_STATE, null, msgs);
			msgs = basicSetExitState(newExitState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.PROTOCOL_LAYER_EFSM__EXIT_STATE, newExitState, newExitState));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M4jdslPackage.PROTOCOL_LAYER_EFSM__PROTOCOL_STATES:
				return ((InternalEList<?>)getProtocolStates()).basicRemove(otherEnd, msgs);
			case M4jdslPackage.PROTOCOL_LAYER_EFSM__EXIT_STATE:
				return basicSetExitState(null, msgs);
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
			case M4jdslPackage.PROTOCOL_LAYER_EFSM__PROTOCOL_STATES:
				return getProtocolStates();
			case M4jdslPackage.PROTOCOL_LAYER_EFSM__INITIAL_STATE:
				if (resolve) return getInitialState();
				return basicGetInitialState();
			case M4jdslPackage.PROTOCOL_LAYER_EFSM__EXIT_STATE:
				return getExitState();
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
			case M4jdslPackage.PROTOCOL_LAYER_EFSM__PROTOCOL_STATES:
				getProtocolStates().clear();
				getProtocolStates().addAll((Collection<? extends ProtocolState>)newValue);
				return;
			case M4jdslPackage.PROTOCOL_LAYER_EFSM__INITIAL_STATE:
				setInitialState((ProtocolState)newValue);
				return;
			case M4jdslPackage.PROTOCOL_LAYER_EFSM__EXIT_STATE:
				setExitState((ProtocolExitState)newValue);
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
			case M4jdslPackage.PROTOCOL_LAYER_EFSM__PROTOCOL_STATES:
				getProtocolStates().clear();
				return;
			case M4jdslPackage.PROTOCOL_LAYER_EFSM__INITIAL_STATE:
				setInitialState((ProtocolState)null);
				return;
			case M4jdslPackage.PROTOCOL_LAYER_EFSM__EXIT_STATE:
				setExitState((ProtocolExitState)null);
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
			case M4jdslPackage.PROTOCOL_LAYER_EFSM__PROTOCOL_STATES:
				return protocolStates != null && !protocolStates.isEmpty();
			case M4jdslPackage.PROTOCOL_LAYER_EFSM__INITIAL_STATE:
				return initialState != null;
			case M4jdslPackage.PROTOCOL_LAYER_EFSM__EXIT_STATE:
				return exitState != null;
		}
		return super.eIsSet(featureID);
	}

} //ProtocolLayerEFSMImpl
