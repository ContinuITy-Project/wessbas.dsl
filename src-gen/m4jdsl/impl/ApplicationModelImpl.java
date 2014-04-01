/**
 */
package m4jdsl.impl;

import m4jdsl.ApplicationModel;
import m4jdsl.M4jdslPackage;
import m4jdsl.SessionLayerEFSM;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link m4jdsl.impl.ApplicationModelImpl#getSessionLayerEFSM <em>Session Layer EFSM</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationModelImpl extends MinimalEObjectImpl.Container implements ApplicationModel {
    /**
     * The cached value of the '{@link #getSessionLayerEFSM() <em>Session Layer EFSM</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSessionLayerEFSM()
     * @generated
     * @ordered
     */
    protected SessionLayerEFSM sessionLayerEFSM;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ApplicationModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return M4jdslPackage.Literals.APPLICATION_MODEL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SessionLayerEFSM getSessionLayerEFSM() {
        return sessionLayerEFSM;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSessionLayerEFSM(SessionLayerEFSM newSessionLayerEFSM, NotificationChain msgs) {
        SessionLayerEFSM oldSessionLayerEFSM = sessionLayerEFSM;
        sessionLayerEFSM = newSessionLayerEFSM;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M4jdslPackage.APPLICATION_MODEL__SESSION_LAYER_EFSM, oldSessionLayerEFSM, newSessionLayerEFSM);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSessionLayerEFSM(SessionLayerEFSM newSessionLayerEFSM) {
        if (newSessionLayerEFSM != sessionLayerEFSM) {
            NotificationChain msgs = null;
            if (sessionLayerEFSM != null)
                msgs = ((InternalEObject)sessionLayerEFSM).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M4jdslPackage.APPLICATION_MODEL__SESSION_LAYER_EFSM, null, msgs);
            if (newSessionLayerEFSM != null)
                msgs = ((InternalEObject)newSessionLayerEFSM).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M4jdslPackage.APPLICATION_MODEL__SESSION_LAYER_EFSM, null, msgs);
            msgs = basicSetSessionLayerEFSM(newSessionLayerEFSM, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.APPLICATION_MODEL__SESSION_LAYER_EFSM, newSessionLayerEFSM, newSessionLayerEFSM));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case M4jdslPackage.APPLICATION_MODEL__SESSION_LAYER_EFSM:
                return basicSetSessionLayerEFSM(null, msgs);
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
            case M4jdslPackage.APPLICATION_MODEL__SESSION_LAYER_EFSM:
                return getSessionLayerEFSM();
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
            case M4jdslPackage.APPLICATION_MODEL__SESSION_LAYER_EFSM:
                setSessionLayerEFSM((SessionLayerEFSM)newValue);
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
            case M4jdslPackage.APPLICATION_MODEL__SESSION_LAYER_EFSM:
                setSessionLayerEFSM((SessionLayerEFSM)null);
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
            case M4jdslPackage.APPLICATION_MODEL__SESSION_LAYER_EFSM:
                return sessionLayerEFSM != null;
        }
        return super.eIsSet(featureID);
    }

} //ApplicationModelImpl
