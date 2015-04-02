/**
 */
package m4jdsl.impl;

import m4jdsl.BehaviorModelState;
import m4jdsl.M4jdslPackage;
import m4jdsl.ThinkTime;
import m4jdsl.Transition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link m4jdsl.impl.TransitionImpl#getTargetState <em>Target State</em>}</li>
 *   <li>{@link m4jdsl.impl.TransitionImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link m4jdsl.impl.TransitionImpl#getThinkTime <em>Think Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition {
    /**
	 * The cached value of the '{@link #getTargetState() <em>Target State</em>}' reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getTargetState()
	 * @generated
	 * @ordered
	 */
    protected BehaviorModelState targetState;

    /**
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
    protected static final double PROBABILITY_EDEFAULT = 0.0;

    /**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
    protected double probability = PROBABILITY_EDEFAULT;

    /**
	 * The cached value of the '{@link #getThinkTime() <em>Think Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getThinkTime()
	 * @generated
	 * @ordered
	 */
    protected ThinkTime thinkTime;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected TransitionImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return M4jdslPackage.Literals.TRANSITION;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BehaviorModelState getTargetState() {
		if (targetState != null && targetState.eIsProxy()) {
			InternalEObject oldTargetState = (InternalEObject)targetState;
			targetState = (BehaviorModelState)eResolveProxy(oldTargetState);
			if (targetState != oldTargetState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M4jdslPackage.TRANSITION__TARGET_STATE, oldTargetState, targetState));
			}
		}
		return targetState;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public BehaviorModelState basicGetTargetState() {
		return targetState;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setTargetState(BehaviorModelState newTargetState) {
		BehaviorModelState oldTargetState = targetState;
		targetState = newTargetState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.TRANSITION__TARGET_STATE, oldTargetState, targetState));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public double getProbability() {
		return probability;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setProbability(double newProbability) {
		double oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.TRANSITION__PROBABILITY, oldProbability, probability));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public ThinkTime getThinkTime() {
		return thinkTime;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public NotificationChain basicSetThinkTime(ThinkTime newThinkTime, NotificationChain msgs) {
		ThinkTime oldThinkTime = thinkTime;
		thinkTime = newThinkTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M4jdslPackage.TRANSITION__THINK_TIME, oldThinkTime, newThinkTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public void setThinkTime(ThinkTime newThinkTime) {
		if (newThinkTime != thinkTime) {
			NotificationChain msgs = null;
			if (thinkTime != null)
				msgs = ((InternalEObject)thinkTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M4jdslPackage.TRANSITION__THINK_TIME, null, msgs);
			if (newThinkTime != null)
				msgs = ((InternalEObject)newThinkTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M4jdslPackage.TRANSITION__THINK_TIME, null, msgs);
			msgs = basicSetThinkTime(newThinkTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.TRANSITION__THINK_TIME, newThinkTime, newThinkTime));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M4jdslPackage.TRANSITION__THINK_TIME:
				return basicSetThinkTime(null, msgs);
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
			case M4jdslPackage.TRANSITION__TARGET_STATE:
				if (resolve) return getTargetState();
				return basicGetTargetState();
			case M4jdslPackage.TRANSITION__PROBABILITY:
				return getProbability();
			case M4jdslPackage.TRANSITION__THINK_TIME:
				return getThinkTime();
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
			case M4jdslPackage.TRANSITION__TARGET_STATE:
				setTargetState((BehaviorModelState)newValue);
				return;
			case M4jdslPackage.TRANSITION__PROBABILITY:
				setProbability((Double)newValue);
				return;
			case M4jdslPackage.TRANSITION__THINK_TIME:
				setThinkTime((ThinkTime)newValue);
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
			case M4jdslPackage.TRANSITION__TARGET_STATE:
				setTargetState((BehaviorModelState)null);
				return;
			case M4jdslPackage.TRANSITION__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
				return;
			case M4jdslPackage.TRANSITION__THINK_TIME:
				setThinkTime((ThinkTime)null);
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
			case M4jdslPackage.TRANSITION__TARGET_STATE:
				return targetState != null;
			case M4jdslPackage.TRANSITION__PROBABILITY:
				return probability != PROBABILITY_EDEFAULT;
			case M4jdslPackage.TRANSITION__THINK_TIME:
				return thinkTime != null;
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
		result.append(" (probability: ");
		result.append(probability);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
