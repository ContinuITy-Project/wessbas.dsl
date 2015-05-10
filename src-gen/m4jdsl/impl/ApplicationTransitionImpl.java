/**
 */
package m4jdsl.impl;

import java.util.Collection;
import m4jdsl.Action;
import m4jdsl.ApplicationState;
import m4jdsl.ApplicationTransition;
import m4jdsl.Guard;
import m4jdsl.M4jdslPackage;
import m4jdsl.SessionLayerEFSMState;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link m4jdsl.impl.ApplicationTransitionImpl#getTargetState <em>Target State</em>}</li>
 *   <li>{@link m4jdsl.impl.ApplicationTransitionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link m4jdsl.impl.ApplicationTransitionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link m4jdsl.impl.ApplicationTransitionImpl#getApplicationState <em>Application State</em>}</li>
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
    protected SessionLayerEFSMState targetState;

    /**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
    protected EList<Guard> guard;

				/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
    protected EList<Action> action;

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
    public SessionLayerEFSMState getTargetState() {
		if (targetState != null && targetState.eIsProxy()) {
			InternalEObject oldTargetState = (InternalEObject)targetState;
			targetState = (SessionLayerEFSMState)eResolveProxy(oldTargetState);
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
    public SessionLayerEFSMState basicGetTargetState() {
		return targetState;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setTargetState(SessionLayerEFSMState newTargetState) {
		SessionLayerEFSMState oldTargetState = targetState;
		targetState = newTargetState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.APPLICATION_TRANSITION__TARGET_STATE, oldTargetState, targetState));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Action> getAction() {
		if (action == null) {
			action = new EObjectContainmentEList<Action>(Action.class, this, M4jdslPackage.APPLICATION_TRANSITION__ACTION);
		}
		return action;
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationState getApplicationState() {
		if (eContainerFeatureID() != M4jdslPackage.APPLICATION_TRANSITION__APPLICATION_STATE) return null;
		return (ApplicationState)eInternalContainer();
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicationState(ApplicationState newApplicationState, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newApplicationState, M4jdslPackage.APPLICATION_TRANSITION__APPLICATION_STATE, msgs);
		return msgs;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationState(ApplicationState newApplicationState) {
		if (newApplicationState != eInternalContainer() || (eContainerFeatureID() != M4jdslPackage.APPLICATION_TRANSITION__APPLICATION_STATE && newApplicationState != null)) {
			if (EcoreUtil.isAncestor(this, newApplicationState))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newApplicationState != null)
				msgs = ((InternalEObject)newApplicationState).eInverseAdd(this, M4jdslPackage.APPLICATION_STATE__OUTGOING_TRANSITIONS, ApplicationState.class, msgs);
			msgs = basicSetApplicationState(newApplicationState, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.APPLICATION_TRANSITION__APPLICATION_STATE, newApplicationState, newApplicationState));
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M4jdslPackage.APPLICATION_TRANSITION__APPLICATION_STATE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetApplicationState((ApplicationState)otherEnd, msgs);
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
			case M4jdslPackage.APPLICATION_TRANSITION__GUARD:
				return ((InternalEList<?>)getGuard()).basicRemove(otherEnd, msgs);
			case M4jdslPackage.APPLICATION_TRANSITION__ACTION:
				return ((InternalEList<?>)getAction()).basicRemove(otherEnd, msgs);
			case M4jdslPackage.APPLICATION_TRANSITION__APPLICATION_STATE:
				return basicSetApplicationState(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case M4jdslPackage.APPLICATION_TRANSITION__APPLICATION_STATE:
				return eInternalContainer().eInverseRemove(this, M4jdslPackage.APPLICATION_STATE__OUTGOING_TRANSITIONS, ApplicationState.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

				/**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Guard> getGuard() {
		if (guard == null) {
			guard = new EObjectContainmentEList<Guard>(Guard.class, this, M4jdslPackage.APPLICATION_TRANSITION__GUARD);
		}
		return guard;
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
			case M4jdslPackage.APPLICATION_TRANSITION__GUARD:
				return getGuard();
			case M4jdslPackage.APPLICATION_TRANSITION__ACTION:
				return getAction();
			case M4jdslPackage.APPLICATION_TRANSITION__APPLICATION_STATE:
				return getApplicationState();
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
			case M4jdslPackage.APPLICATION_TRANSITION__TARGET_STATE:
				setTargetState((SessionLayerEFSMState)newValue);
				return;
			case M4jdslPackage.APPLICATION_TRANSITION__GUARD:
				getGuard().clear();
				getGuard().addAll((Collection<? extends Guard>)newValue);
				return;
			case M4jdslPackage.APPLICATION_TRANSITION__ACTION:
				getAction().clear();
				getAction().addAll((Collection<? extends Action>)newValue);
				return;
			case M4jdslPackage.APPLICATION_TRANSITION__APPLICATION_STATE:
				setApplicationState((ApplicationState)newValue);
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
				setTargetState((SessionLayerEFSMState)null);
				return;
			case M4jdslPackage.APPLICATION_TRANSITION__GUARD:
				getGuard().clear();
				return;
			case M4jdslPackage.APPLICATION_TRANSITION__ACTION:
				getAction().clear();
				return;
			case M4jdslPackage.APPLICATION_TRANSITION__APPLICATION_STATE:
				setApplicationState((ApplicationState)null);
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
			case M4jdslPackage.APPLICATION_TRANSITION__GUARD:
				return guard != null && !guard.isEmpty();
			case M4jdslPackage.APPLICATION_TRANSITION__ACTION:
				return action != null && !action.isEmpty();
			case M4jdslPackage.APPLICATION_TRANSITION__APPLICATION_STATE:
				return getApplicationState() != null;
		}
		return super.eIsSet(featureID);
	}

} //ApplicationTransitionImpl
