/**
 */
package m4jdsl.impl;

import java.util.Collection;

import m4jdsl.M4jdslPackage;
import m4jdsl.ProtocolState;
import m4jdsl.ProtocolTransition;
import m4jdsl.Request;

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
 * An implementation of the model object '<em><b>Protocol State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link m4jdsl.impl.ProtocolStateImpl#getRequest <em>Request</em>}</li>
 *   <li>{@link m4jdsl.impl.ProtocolStateImpl#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link m4jdsl.impl.ProtocolStateImpl#getEId <em>EId</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ProtocolStateImpl extends MinimalEObjectImpl.Container implements ProtocolState {
    /**
     * The cached value of the '{@link #getRequest() <em>Request</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRequest()
     * @generated
     * @ordered
     */
    protected Request request;

    /**
     * The cached value of the '{@link #getOutgoingTransitions() <em>Outgoing Transitions</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutgoingTransitions()
     * @generated
     * @ordered
     */
    protected EList<ProtocolTransition> outgoingTransitions;

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
    protected ProtocolStateImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return M4jdslPackage.Literals.PROTOCOL_STATE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Request getRequest() {
        return request;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetRequest(Request newRequest, NotificationChain msgs) {
        Request oldRequest = request;
        request = newRequest;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M4jdslPackage.PROTOCOL_STATE__REQUEST, oldRequest, newRequest);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setRequest(Request newRequest) {
        if (newRequest != request) {
            NotificationChain msgs = null;
            if (request != null)
                msgs = ((InternalEObject)request).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M4jdslPackage.PROTOCOL_STATE__REQUEST, null, msgs);
            if (newRequest != null)
                msgs = ((InternalEObject)newRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M4jdslPackage.PROTOCOL_STATE__REQUEST, null, msgs);
            msgs = basicSetRequest(newRequest, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.PROTOCOL_STATE__REQUEST, newRequest, newRequest));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<ProtocolTransition> getOutgoingTransitions() {
        if (outgoingTransitions == null) {
            outgoingTransitions = new EObjectContainmentEList<ProtocolTransition>(ProtocolTransition.class, this, M4jdslPackage.PROTOCOL_STATE__OUTGOING_TRANSITIONS);
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
            eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.PROTOCOL_STATE__EID, oldEId, eId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case M4jdslPackage.PROTOCOL_STATE__REQUEST:
                return basicSetRequest(null, msgs);
            case M4jdslPackage.PROTOCOL_STATE__OUTGOING_TRANSITIONS:
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
            case M4jdslPackage.PROTOCOL_STATE__REQUEST:
                return getRequest();
            case M4jdslPackage.PROTOCOL_STATE__OUTGOING_TRANSITIONS:
                return getOutgoingTransitions();
            case M4jdslPackage.PROTOCOL_STATE__EID:
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
            case M4jdslPackage.PROTOCOL_STATE__REQUEST:
                setRequest((Request)newValue);
                return;
            case M4jdslPackage.PROTOCOL_STATE__OUTGOING_TRANSITIONS:
                getOutgoingTransitions().clear();
                getOutgoingTransitions().addAll((Collection<? extends ProtocolTransition>)newValue);
                return;
            case M4jdslPackage.PROTOCOL_STATE__EID:
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
            case M4jdslPackage.PROTOCOL_STATE__REQUEST:
                setRequest((Request)null);
                return;
            case M4jdslPackage.PROTOCOL_STATE__OUTGOING_TRANSITIONS:
                getOutgoingTransitions().clear();
                return;
            case M4jdslPackage.PROTOCOL_STATE__EID:
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
            case M4jdslPackage.PROTOCOL_STATE__REQUEST:
                return request != null;
            case M4jdslPackage.PROTOCOL_STATE__OUTGOING_TRANSITIONS:
                return outgoingTransitions != null && !outgoingTransitions.isEmpty();
            case M4jdslPackage.PROTOCOL_STATE__EID:
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

} //ProtocolStateImpl
