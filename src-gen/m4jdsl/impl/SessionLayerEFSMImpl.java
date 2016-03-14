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
import m4jdsl.ApplicationExitState;
import m4jdsl.ApplicationState;
import m4jdsl.GuardActionParameterList;
import m4jdsl.M4jdslPackage;
import m4jdsl.SessionLayerEFSM;
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
 * An implementation of the model object '<em><b>Session Layer EFSM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link m4jdsl.impl.SessionLayerEFSMImpl#getApplicationStates <em>Application States</em>}</li>
 *   <li>{@link m4jdsl.impl.SessionLayerEFSMImpl#getInitialState <em>Initial State</em>}</li>
 *   <li>{@link m4jdsl.impl.SessionLayerEFSMImpl#getExitState <em>Exit State</em>}</li>
 *   <li>{@link m4jdsl.impl.SessionLayerEFSMImpl#getGuardActionParameterList <em>Guard Action Parameter List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SessionLayerEFSMImpl extends MinimalEObjectImpl.Container implements SessionLayerEFSM {
    /**
	 * The cached value of the '{@link #getApplicationStates() <em>Application States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getApplicationStates()
	 * @generated
	 * @ordered
	 */
    protected EList<ApplicationState> applicationStates;

    /**
	 * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getInitialState()
	 * @generated
	 * @ordered
	 */
    protected ApplicationState initialState;

    /**
	 * The cached value of the '{@link #getExitState() <em>Exit State</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getExitState()
	 * @generated
	 * @ordered
	 */
    protected ApplicationExitState exitState;

    /**
	 * The cached value of the '{@link #getGuardActionParameterList() <em>Guard Action Parameter List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuardActionParameterList()
	 * @generated
	 * @ordered
	 */
	protected GuardActionParameterList guardActionParameterList;

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected SessionLayerEFSMImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return M4jdslPackage.Literals.SESSION_LAYER_EFSM;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ApplicationState> getApplicationStates() {
		if (applicationStates == null) {
			applicationStates = new EObjectContainmentEList<ApplicationState>(ApplicationState.class, this, M4jdslPackage.SESSION_LAYER_EFSM__APPLICATION_STATES);
		}
		return applicationStates;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ApplicationState getInitialState() {
		if (initialState != null && initialState.eIsProxy()) {
			InternalEObject oldInitialState = (InternalEObject)initialState;
			initialState = (ApplicationState)eResolveProxy(oldInitialState);
			if (initialState != oldInitialState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M4jdslPackage.SESSION_LAYER_EFSM__INITIAL_STATE, oldInitialState, initialState));
			}
		}
		return initialState;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ApplicationState basicGetInitialState() {
		return initialState;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setInitialState(ApplicationState newInitialState) {
		ApplicationState oldInitialState = initialState;
		initialState = newInitialState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.SESSION_LAYER_EFSM__INITIAL_STATE, oldInitialState, initialState));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ApplicationExitState getExitState() {
		return exitState;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetExitState(ApplicationExitState newExitState, NotificationChain msgs) {
		ApplicationExitState oldExitState = exitState;
		exitState = newExitState;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M4jdslPackage.SESSION_LAYER_EFSM__EXIT_STATE, oldExitState, newExitState);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setExitState(ApplicationExitState newExitState) {
		if (newExitState != exitState) {
			NotificationChain msgs = null;
			if (exitState != null)
				msgs = ((InternalEObject)exitState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M4jdslPackage.SESSION_LAYER_EFSM__EXIT_STATE, null, msgs);
			if (newExitState != null)
				msgs = ((InternalEObject)newExitState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M4jdslPackage.SESSION_LAYER_EFSM__EXIT_STATE, null, msgs);
			msgs = basicSetExitState(newExitState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.SESSION_LAYER_EFSM__EXIT_STATE, newExitState, newExitState));
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuardActionParameterList getGuardActionParameterList() {
		return guardActionParameterList;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuardActionParameterList(GuardActionParameterList newGuardActionParameterList, NotificationChain msgs) {
		GuardActionParameterList oldGuardActionParameterList = guardActionParameterList;
		guardActionParameterList = newGuardActionParameterList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M4jdslPackage.SESSION_LAYER_EFSM__GUARD_ACTION_PARAMETER_LIST, oldGuardActionParameterList, newGuardActionParameterList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuardActionParameterList(GuardActionParameterList newGuardActionParameterList) {
		if (newGuardActionParameterList != guardActionParameterList) {
			NotificationChain msgs = null;
			if (guardActionParameterList != null)
				msgs = ((InternalEObject)guardActionParameterList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M4jdslPackage.SESSION_LAYER_EFSM__GUARD_ACTION_PARAMETER_LIST, null, msgs);
			if (newGuardActionParameterList != null)
				msgs = ((InternalEObject)newGuardActionParameterList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M4jdslPackage.SESSION_LAYER_EFSM__GUARD_ACTION_PARAMETER_LIST, null, msgs);
			msgs = basicSetGuardActionParameterList(newGuardActionParameterList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.SESSION_LAYER_EFSM__GUARD_ACTION_PARAMETER_LIST, newGuardActionParameterList, newGuardActionParameterList));
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M4jdslPackage.SESSION_LAYER_EFSM__APPLICATION_STATES:
				return ((InternalEList<?>)getApplicationStates()).basicRemove(otherEnd, msgs);
			case M4jdslPackage.SESSION_LAYER_EFSM__EXIT_STATE:
				return basicSetExitState(null, msgs);
			case M4jdslPackage.SESSION_LAYER_EFSM__GUARD_ACTION_PARAMETER_LIST:
				return basicSetGuardActionParameterList(null, msgs);
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
			case M4jdslPackage.SESSION_LAYER_EFSM__APPLICATION_STATES:
				return getApplicationStates();
			case M4jdslPackage.SESSION_LAYER_EFSM__INITIAL_STATE:
				if (resolve) return getInitialState();
				return basicGetInitialState();
			case M4jdslPackage.SESSION_LAYER_EFSM__EXIT_STATE:
				return getExitState();
			case M4jdslPackage.SESSION_LAYER_EFSM__GUARD_ACTION_PARAMETER_LIST:
				return getGuardActionParameterList();
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
			case M4jdslPackage.SESSION_LAYER_EFSM__APPLICATION_STATES:
				getApplicationStates().clear();
				getApplicationStates().addAll((Collection<? extends ApplicationState>)newValue);
				return;
			case M4jdslPackage.SESSION_LAYER_EFSM__INITIAL_STATE:
				setInitialState((ApplicationState)newValue);
				return;
			case M4jdslPackage.SESSION_LAYER_EFSM__EXIT_STATE:
				setExitState((ApplicationExitState)newValue);
				return;
			case M4jdslPackage.SESSION_LAYER_EFSM__GUARD_ACTION_PARAMETER_LIST:
				setGuardActionParameterList((GuardActionParameterList)newValue);
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
			case M4jdslPackage.SESSION_LAYER_EFSM__APPLICATION_STATES:
				getApplicationStates().clear();
				return;
			case M4jdslPackage.SESSION_LAYER_EFSM__INITIAL_STATE:
				setInitialState((ApplicationState)null);
				return;
			case M4jdslPackage.SESSION_LAYER_EFSM__EXIT_STATE:
				setExitState((ApplicationExitState)null);
				return;
			case M4jdslPackage.SESSION_LAYER_EFSM__GUARD_ACTION_PARAMETER_LIST:
				setGuardActionParameterList((GuardActionParameterList)null);
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
			case M4jdslPackage.SESSION_LAYER_EFSM__APPLICATION_STATES:
				return applicationStates != null && !applicationStates.isEmpty();
			case M4jdslPackage.SESSION_LAYER_EFSM__INITIAL_STATE:
				return initialState != null;
			case M4jdslPackage.SESSION_LAYER_EFSM__EXIT_STATE:
				return exitState != null;
			case M4jdslPackage.SESSION_LAYER_EFSM__GUARD_ACTION_PARAMETER_LIST:
				return guardActionParameterList != null;
		}
		return super.eIsSet(featureID);
	}

} //SessionLayerEFSMImpl
