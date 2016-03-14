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
import m4jdsl.ApplicationState;
import m4jdsl.ApplicationTransition;
import m4jdsl.M4jdslPackage;
import m4jdsl.ProtocolLayerEFSM;
import m4jdsl.Service;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link m4jdsl.impl.ApplicationStateImpl#getService <em>Service</em>}</li>
 *   <li>{@link m4jdsl.impl.ApplicationStateImpl#getProtocolDetails <em>Protocol Details</em>}</li>
 *   <li>{@link m4jdsl.impl.ApplicationStateImpl#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationStateImpl extends SessionLayerEFSMStateImpl implements ApplicationState {
    /**
	 * The cached value of the '{@link #getService() <em>Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getService()
	 * @generated
	 * @ordered
	 */
    protected Service service;

    /**
	 * The cached value of the '{@link #getProtocolDetails() <em>Protocol Details</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getProtocolDetails()
	 * @generated
	 * @ordered
	 */
    protected ProtocolLayerEFSM protocolDetails;

    /**
	 * The cached value of the '{@link #getOutgoingTransitions() <em>Outgoing Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getOutgoingTransitions()
	 * @generated
	 * @ordered
	 */
    protected EList<ApplicationTransition> outgoingTransitions;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected ApplicationStateImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return M4jdslPackage.Literals.APPLICATION_STATE;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public Service getService() {
		return service;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetService(Service newService, NotificationChain msgs) {
		Service oldService = service;
		service = newService;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M4jdslPackage.APPLICATION_STATE__SERVICE, oldService, newService);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setService(Service newService) {
		if (newService != service) {
			NotificationChain msgs = null;
			if (service != null)
				msgs = ((InternalEObject)service).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M4jdslPackage.APPLICATION_STATE__SERVICE, null, msgs);
			if (newService != null)
				msgs = ((InternalEObject)newService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M4jdslPackage.APPLICATION_STATE__SERVICE, null, msgs);
			msgs = basicSetService(newService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.APPLICATION_STATE__SERVICE, newService, newService));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ProtocolLayerEFSM getProtocolDetails() {
		return protocolDetails;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetProtocolDetails(ProtocolLayerEFSM newProtocolDetails, NotificationChain msgs) {
		ProtocolLayerEFSM oldProtocolDetails = protocolDetails;
		protocolDetails = newProtocolDetails;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M4jdslPackage.APPLICATION_STATE__PROTOCOL_DETAILS, oldProtocolDetails, newProtocolDetails);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setProtocolDetails(ProtocolLayerEFSM newProtocolDetails) {
		if (newProtocolDetails != protocolDetails) {
			NotificationChain msgs = null;
			if (protocolDetails != null)
				msgs = ((InternalEObject)protocolDetails).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M4jdslPackage.APPLICATION_STATE__PROTOCOL_DETAILS, null, msgs);
			if (newProtocolDetails != null)
				msgs = ((InternalEObject)newProtocolDetails).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M4jdslPackage.APPLICATION_STATE__PROTOCOL_DETAILS, null, msgs);
			msgs = basicSetProtocolDetails(newProtocolDetails, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.APPLICATION_STATE__PROTOCOL_DETAILS, newProtocolDetails, newProtocolDetails));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<ApplicationTransition> getOutgoingTransitions() {
		if (outgoingTransitions == null) {
			outgoingTransitions = new EObjectContainmentWithInverseEList<ApplicationTransition>(ApplicationTransition.class, this, M4jdslPackage.APPLICATION_STATE__OUTGOING_TRANSITIONS, M4jdslPackage.APPLICATION_TRANSITION__APPLICATION_STATE);
		}
		return outgoingTransitions;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M4jdslPackage.APPLICATION_STATE__OUTGOING_TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingTransitions()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M4jdslPackage.APPLICATION_STATE__SERVICE:
				return basicSetService(null, msgs);
			case M4jdslPackage.APPLICATION_STATE__PROTOCOL_DETAILS:
				return basicSetProtocolDetails(null, msgs);
			case M4jdslPackage.APPLICATION_STATE__OUTGOING_TRANSITIONS:
				return ((InternalEList<?>)getOutgoingTransitions()).basicRemove(otherEnd, msgs);
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
			case M4jdslPackage.APPLICATION_STATE__SERVICE:
				return getService();
			case M4jdslPackage.APPLICATION_STATE__PROTOCOL_DETAILS:
				return getProtocolDetails();
			case M4jdslPackage.APPLICATION_STATE__OUTGOING_TRANSITIONS:
				return getOutgoingTransitions();
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
			case M4jdslPackage.APPLICATION_STATE__SERVICE:
				setService((Service)newValue);
				return;
			case M4jdslPackage.APPLICATION_STATE__PROTOCOL_DETAILS:
				setProtocolDetails((ProtocolLayerEFSM)newValue);
				return;
			case M4jdslPackage.APPLICATION_STATE__OUTGOING_TRANSITIONS:
				getOutgoingTransitions().clear();
				getOutgoingTransitions().addAll((Collection<? extends ApplicationTransition>)newValue);
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
			case M4jdslPackage.APPLICATION_STATE__SERVICE:
				setService((Service)null);
				return;
			case M4jdslPackage.APPLICATION_STATE__PROTOCOL_DETAILS:
				setProtocolDetails((ProtocolLayerEFSM)null);
				return;
			case M4jdslPackage.APPLICATION_STATE__OUTGOING_TRANSITIONS:
				getOutgoingTransitions().clear();
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
			case M4jdslPackage.APPLICATION_STATE__SERVICE:
				return service != null;
			case M4jdslPackage.APPLICATION_STATE__PROTOCOL_DETAILS:
				return protocolDetails != null;
			case M4jdslPackage.APPLICATION_STATE__OUTGOING_TRANSITIONS:
				return outgoingTransitions != null && !outgoingTransitions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ApplicationStateImpl
