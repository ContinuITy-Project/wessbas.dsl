/**
 */
package m4jdsl.impl;

import java.util.Collection;

import m4jdsl.BehaviorModel;
import m4jdsl.BehaviorModelExitState;
import m4jdsl.M4jdslPackage;
import m4jdsl.MarkovState;

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
 * An implementation of the model object '<em><b>Behavior Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link m4jdsl.impl.BehaviorModelImpl#getMarkovStates <em>Markov States</em>}</li>
 *   <li>{@link m4jdsl.impl.BehaviorModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link m4jdsl.impl.BehaviorModelImpl#getFilename <em>Filename</em>}</li>
 *   <li>{@link m4jdsl.impl.BehaviorModelImpl#getExitState <em>Exit State</em>}</li>
 *   <li>{@link m4jdsl.impl.BehaviorModelImpl#getInitialState <em>Initial State</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BehaviorModelImpl extends MinimalEObjectImpl.Container implements BehaviorModel {
    /**
     * The cached value of the '{@link #getMarkovStates() <em>Markov States</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMarkovStates()
     * @generated
     * @ordered
     */
    protected EList<MarkovState> markovStates;

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getName()
     * @generated
     * @ordered
     */
    protected String name = NAME_EDEFAULT;

    /**
     * The default value of the '{@link #getFilename() <em>Filename</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFilename()
     * @generated
     * @ordered
     */
    protected static final String FILENAME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFilename() <em>Filename</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFilename()
     * @generated
     * @ordered
     */
    protected String filename = FILENAME_EDEFAULT;

    /**
     * The cached value of the '{@link #getExitState() <em>Exit State</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExitState()
     * @generated
     * @ordered
     */
    protected BehaviorModelExitState exitState;

    /**
     * The cached value of the '{@link #getInitialState() <em>Initial State</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitialState()
     * @generated
     * @ordered
     */
    protected MarkovState initialState;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected BehaviorModelImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return M4jdslPackage.Literals.BEHAVIOR_MODEL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<MarkovState> getMarkovStates() {
        if (markovStates == null) {
            markovStates = new EObjectContainmentEList<MarkovState>(MarkovState.class, this, M4jdslPackage.BEHAVIOR_MODEL__MARKOV_STATES);
        }
        return markovStates;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getName() {
        return name;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setName(String newName) {
        String oldName = name;
        name = newName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.BEHAVIOR_MODEL__NAME, oldName, name));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getFilename() {
        return filename;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFilename(String newFilename) {
        String oldFilename = filename;
        filename = newFilename;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.BEHAVIOR_MODEL__FILENAME, oldFilename, filename));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public BehaviorModelExitState getExitState() {
        return exitState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExitState(BehaviorModelExitState newExitState, NotificationChain msgs) {
        BehaviorModelExitState oldExitState = exitState;
        exitState = newExitState;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, M4jdslPackage.BEHAVIOR_MODEL__EXIT_STATE, oldExitState, newExitState);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExitState(BehaviorModelExitState newExitState) {
        if (newExitState != exitState) {
            NotificationChain msgs = null;
            if (exitState != null)
                msgs = ((InternalEObject)exitState).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - M4jdslPackage.BEHAVIOR_MODEL__EXIT_STATE, null, msgs);
            if (newExitState != null)
                msgs = ((InternalEObject)newExitState).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - M4jdslPackage.BEHAVIOR_MODEL__EXIT_STATE, null, msgs);
            msgs = basicSetExitState(newExitState, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.BEHAVIOR_MODEL__EXIT_STATE, newExitState, newExitState));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MarkovState getInitialState() {
        if (initialState != null && initialState.eIsProxy()) {
            InternalEObject oldInitialState = (InternalEObject)initialState;
            initialState = (MarkovState)eResolveProxy(oldInitialState);
            if (initialState != oldInitialState) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, M4jdslPackage.BEHAVIOR_MODEL__INITIAL_STATE, oldInitialState, initialState));
            }
        }
        return initialState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MarkovState basicGetInitialState() {
        return initialState;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInitialState(MarkovState newInitialState) {
        MarkovState oldInitialState = initialState;
        initialState = newInitialState;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.BEHAVIOR_MODEL__INITIAL_STATE, oldInitialState, initialState));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case M4jdslPackage.BEHAVIOR_MODEL__MARKOV_STATES:
                return ((InternalEList<?>)getMarkovStates()).basicRemove(otherEnd, msgs);
            case M4jdslPackage.BEHAVIOR_MODEL__EXIT_STATE:
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
            case M4jdslPackage.BEHAVIOR_MODEL__MARKOV_STATES:
                return getMarkovStates();
            case M4jdslPackage.BEHAVIOR_MODEL__NAME:
                return getName();
            case M4jdslPackage.BEHAVIOR_MODEL__FILENAME:
                return getFilename();
            case M4jdslPackage.BEHAVIOR_MODEL__EXIT_STATE:
                return getExitState();
            case M4jdslPackage.BEHAVIOR_MODEL__INITIAL_STATE:
                if (resolve) return getInitialState();
                return basicGetInitialState();
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
            case M4jdslPackage.BEHAVIOR_MODEL__MARKOV_STATES:
                getMarkovStates().clear();
                getMarkovStates().addAll((Collection<? extends MarkovState>)newValue);
                return;
            case M4jdslPackage.BEHAVIOR_MODEL__NAME:
                setName((String)newValue);
                return;
            case M4jdslPackage.BEHAVIOR_MODEL__FILENAME:
                setFilename((String)newValue);
                return;
            case M4jdslPackage.BEHAVIOR_MODEL__EXIT_STATE:
                setExitState((BehaviorModelExitState)newValue);
                return;
            case M4jdslPackage.BEHAVIOR_MODEL__INITIAL_STATE:
                setInitialState((MarkovState)newValue);
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
            case M4jdslPackage.BEHAVIOR_MODEL__MARKOV_STATES:
                getMarkovStates().clear();
                return;
            case M4jdslPackage.BEHAVIOR_MODEL__NAME:
                setName(NAME_EDEFAULT);
                return;
            case M4jdslPackage.BEHAVIOR_MODEL__FILENAME:
                setFilename(FILENAME_EDEFAULT);
                return;
            case M4jdslPackage.BEHAVIOR_MODEL__EXIT_STATE:
                setExitState((BehaviorModelExitState)null);
                return;
            case M4jdslPackage.BEHAVIOR_MODEL__INITIAL_STATE:
                setInitialState((MarkovState)null);
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
            case M4jdslPackage.BEHAVIOR_MODEL__MARKOV_STATES:
                return markovStates != null && !markovStates.isEmpty();
            case M4jdslPackage.BEHAVIOR_MODEL__NAME:
                return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
            case M4jdslPackage.BEHAVIOR_MODEL__FILENAME:
                return FILENAME_EDEFAULT == null ? filename != null : !FILENAME_EDEFAULT.equals(filename);
            case M4jdslPackage.BEHAVIOR_MODEL__EXIT_STATE:
                return exitState != null;
            case M4jdslPackage.BEHAVIOR_MODEL__INITIAL_STATE:
                return initialState != null;
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
        result.append(" (name: ");
        result.append(name);
        result.append(", filename: ");
        result.append(filename);
        result.append(')');
        return result.toString();
    }

} //BehaviorModelImpl
