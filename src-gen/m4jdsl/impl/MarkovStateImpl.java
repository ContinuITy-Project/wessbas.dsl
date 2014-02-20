/**
 */
package m4jdsl.impl;

import java.util.Collection;

import m4jdsl.M4jdslPackage;
import m4jdsl.MarkovState;
import m4jdsl.Service;
import m4jdsl.Transition;

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
 * An implementation of the model object '<em><b>Markov State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link m4jdsl.impl.MarkovStateImpl#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 *   <li>{@link m4jdsl.impl.MarkovStateImpl#getService <em>Service</em>}</li>
 *   <li>{@link m4jdsl.impl.MarkovStateImpl#getEId <em>EId</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MarkovStateImpl extends MinimalEObjectImpl.Container implements MarkovState {
    /**
     * The cached value of the '{@link #getOutgoingTransitions() <em>Outgoing Transitions</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOutgoingTransitions()
     * @generated
     * @ordered
     */
    protected EList<Transition> outgoingTransitions;

    /**
     * The cached value of the '{@link #getService() <em>Service</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getService()
     * @generated
     * @ordered
     */
    protected Service service;

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
    protected MarkovStateImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return M4jdslPackage.Literals.MARKOV_STATE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Transition> getOutgoingTransitions() {
        if (outgoingTransitions == null) {
            outgoingTransitions = new EObjectContainmentEList<Transition>(Transition.class, this, M4jdslPackage.MARKOV_STATE__OUTGOING_TRANSITIONS);
        }
        return outgoingTransitions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Service getService() {
        if (service != null && service.eIsProxy()) {
            InternalEObject oldService = (InternalEObject)service;
            service = (Service)eResolveProxy(oldService);
            if (service != oldService) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, M4jdslPackage.MARKOV_STATE__SERVICE, oldService, service));
            }
        }
        return service;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Service basicGetService() {
        return service;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setService(Service newService) {
        Service oldService = service;
        service = newService;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.MARKOV_STATE__SERVICE, oldService, service));
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
            eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.MARKOV_STATE__EID, oldEId, eId));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case M4jdslPackage.MARKOV_STATE__OUTGOING_TRANSITIONS:
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
            case M4jdslPackage.MARKOV_STATE__OUTGOING_TRANSITIONS:
                return getOutgoingTransitions();
            case M4jdslPackage.MARKOV_STATE__SERVICE:
                if (resolve) return getService();
                return basicGetService();
            case M4jdslPackage.MARKOV_STATE__EID:
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
            case M4jdslPackage.MARKOV_STATE__OUTGOING_TRANSITIONS:
                getOutgoingTransitions().clear();
                getOutgoingTransitions().addAll((Collection<? extends Transition>)newValue);
                return;
            case M4jdslPackage.MARKOV_STATE__SERVICE:
                setService((Service)newValue);
                return;
            case M4jdslPackage.MARKOV_STATE__EID:
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
            case M4jdslPackage.MARKOV_STATE__OUTGOING_TRANSITIONS:
                getOutgoingTransitions().clear();
                return;
            case M4jdslPackage.MARKOV_STATE__SERVICE:
                setService((Service)null);
                return;
            case M4jdslPackage.MARKOV_STATE__EID:
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
            case M4jdslPackage.MARKOV_STATE__OUTGOING_TRANSITIONS:
                return outgoingTransitions != null && !outgoingTransitions.isEmpty();
            case M4jdslPackage.MARKOV_STATE__SERVICE:
                return service != null;
            case M4jdslPackage.MARKOV_STATE__EID:
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

} //MarkovStateImpl
