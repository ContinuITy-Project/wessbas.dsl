/**
 */
package m4jdsl.impl;

import m4jdsl.ApplicationState;
import m4jdsl.ApplicationTransition;
import m4jdsl.M4jdslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link m4jdsl.impl.ApplicationTransitionImpl#getTargetState <em>Target State</em>}</li>
 *   <li>{@link m4jdsl.impl.ApplicationTransitionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link m4jdsl.impl.ApplicationTransitionImpl#getGuard <em>Guard</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationTransitionImpl extends MinimalEObjectImpl.Container implements ApplicationTransition {
    /**
     * The cached value of the '{@link #getTargetState() <em>Target State</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTargetState()
     * @generated
     * @ordered
     */
    protected ApplicationState targetState;

    /**
     * The default value of the '{@link #getAction() <em>Action</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAction()
     * @generated
     * @ordered
     */
    protected static final String ACTION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAction() <em>Action</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAction()
     * @generated
     * @ordered
     */
    protected String action = ACTION_EDEFAULT;

    /**
     * The default value of the '{@link #getGuard() <em>Guard</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGuard()
     * @generated
     * @ordered
     */
    protected static final String GUARD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGuard() <em>Guard</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGuard()
     * @generated
     * @ordered
     */
    protected String guard = GUARD_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ApplicationTransitionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return M4jdslPackage.Literals.APPLICATION_TRANSITION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ApplicationState getTargetState() {
        if (targetState != null && targetState.eIsProxy()) {
            InternalEObject oldTargetState = (InternalEObject)targetState;
            targetState = (ApplicationState)eResolveProxy(oldTargetState);
            if (targetState != oldTargetState) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, M4jdslPackage.APPLICATION_TRANSITION__TARGET_STATE, oldTargetState, targetState));
            }
        }
        return targetState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ApplicationState basicGetTargetState() {
        return targetState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setTargetState(ApplicationState newTargetState) {
        ApplicationState oldTargetState = targetState;
        targetState = newTargetState;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.APPLICATION_TRANSITION__TARGET_STATE, oldTargetState, targetState));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getAction() {
        return action;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAction(String newAction) {
        String oldAction = action;
        action = newAction;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.APPLICATION_TRANSITION__ACTION, oldAction, action));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getGuard() {
        return guard;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setGuard(String newGuard) {
        String oldGuard = guard;
        guard = newGuard;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.APPLICATION_TRANSITION__GUARD, oldGuard, guard));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case M4jdslPackage.APPLICATION_TRANSITION__TARGET_STATE:
                if (resolve) return getTargetState();
                return basicGetTargetState();
            case M4jdslPackage.APPLICATION_TRANSITION__ACTION:
                return getAction();
            case M4jdslPackage.APPLICATION_TRANSITION__GUARD:
                return getGuard();
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
            case M4jdslPackage.APPLICATION_TRANSITION__TARGET_STATE:
                setTargetState((ApplicationState)newValue);
                return;
            case M4jdslPackage.APPLICATION_TRANSITION__ACTION:
                setAction((String)newValue);
                return;
            case M4jdslPackage.APPLICATION_TRANSITION__GUARD:
                setGuard((String)newValue);
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
            case M4jdslPackage.APPLICATION_TRANSITION__TARGET_STATE:
                setTargetState((ApplicationState)null);
                return;
            case M4jdslPackage.APPLICATION_TRANSITION__ACTION:
                setAction(ACTION_EDEFAULT);
                return;
            case M4jdslPackage.APPLICATION_TRANSITION__GUARD:
                setGuard(GUARD_EDEFAULT);
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
            case M4jdslPackage.APPLICATION_TRANSITION__TARGET_STATE:
                return targetState != null;
            case M4jdslPackage.APPLICATION_TRANSITION__ACTION:
                return ACTION_EDEFAULT == null ? action != null : !ACTION_EDEFAULT.equals(action);
            case M4jdslPackage.APPLICATION_TRANSITION__GUARD:
                return GUARD_EDEFAULT == null ? guard != null : !GUARD_EDEFAULT.equals(guard);
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
        result.append(" (action: ");
        result.append(action);
        result.append(", guard: ");
        result.append(guard);
        result.append(')');
        return result.toString();
    }

} //ApplicationTransitionImpl
