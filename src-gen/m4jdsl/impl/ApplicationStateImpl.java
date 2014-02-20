/**
 */
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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
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
 *   <li>{@link m4jdsl.impl.ApplicationStateImpl#getEId <em>EId</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationStateImpl extends MinimalEObjectImpl.Container implements ApplicationState {
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
            outgoingTransitions = new EObjectContainmentEList<ApplicationTransition>(ApplicationTransition.class, this, M4jdslPackage.APPLICATION_STATE__OUTGOING_TRANSITIONS);
        }
        return outgoingTransitions;
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
            eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.APPLICATION_STATE__EID, oldEId, eId));
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
            case M4jdslPackage.APPLICATION_STATE__EID:
                return getEId();
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
            case M4jdslPackage.APPLICATION_STATE__EID:
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
            case M4jdslPackage.APPLICATION_STATE__SERVICE:
                setService((Service)null);
                return;
            case M4jdslPackage.APPLICATION_STATE__PROTOCOL_DETAILS:
                setProtocolDetails((ProtocolLayerEFSM)null);
                return;
            case M4jdslPackage.APPLICATION_STATE__OUTGOING_TRANSITIONS:
                getOutgoingTransitions().clear();
                return;
            case M4jdslPackage.APPLICATION_STATE__EID:
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
            case M4jdslPackage.APPLICATION_STATE__SERVICE:
                return service != null;
            case M4jdslPackage.APPLICATION_STATE__PROTOCOL_DETAILS:
                return protocolDetails != null;
            case M4jdslPackage.APPLICATION_STATE__OUTGOING_TRANSITIONS:
                return outgoingTransitions != null && !outgoingTransitions.isEmpty();
            case M4jdslPackage.APPLICATION_STATE__EID:
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

} //ApplicationStateImpl
