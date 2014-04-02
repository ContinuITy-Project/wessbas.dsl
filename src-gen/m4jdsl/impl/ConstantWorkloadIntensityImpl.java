/**
 */
package m4jdsl.impl;

import m4jdsl.ConstantWorkloadIntensity;
import m4jdsl.M4jdslPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constant Workload Intensity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link m4jdsl.impl.ConstantWorkloadIntensityImpl#getNumberOfSessions <em>Number Of Sessions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConstantWorkloadIntensityImpl extends WorkloadIntensityImpl implements ConstantWorkloadIntensity {
    /**
     * The default value of the '{@link #getNumberOfSessions() <em>Number Of Sessions</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNumberOfSessions()
     * @generated
     * @ordered
     */
    protected static final int NUMBER_OF_SESSIONS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getNumberOfSessions() <em>Number Of Sessions</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNumberOfSessions()
     * @generated
     * @ordered
     */
    protected int numberOfSessions = NUMBER_OF_SESSIONS_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConstantWorkloadIntensityImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return M4jdslPackage.Literals.CONSTANT_WORKLOAD_INTENSITY;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getNumberOfSessions() {
        return numberOfSessions;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setNumberOfSessions(int newNumberOfSessions) {
        int oldNumberOfSessions = numberOfSessions;
        numberOfSessions = newNumberOfSessions;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.CONSTANT_WORKLOAD_INTENSITY__NUMBER_OF_SESSIONS, oldNumberOfSessions, numberOfSessions));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case M4jdslPackage.CONSTANT_WORKLOAD_INTENSITY__NUMBER_OF_SESSIONS:
                return getNumberOfSessions();
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
            case M4jdslPackage.CONSTANT_WORKLOAD_INTENSITY__NUMBER_OF_SESSIONS:
                setNumberOfSessions((Integer)newValue);
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
            case M4jdslPackage.CONSTANT_WORKLOAD_INTENSITY__NUMBER_OF_SESSIONS:
                setNumberOfSessions(NUMBER_OF_SESSIONS_EDEFAULT);
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
            case M4jdslPackage.CONSTANT_WORKLOAD_INTENSITY__NUMBER_OF_SESSIONS:
                return numberOfSessions != NUMBER_OF_SESSIONS_EDEFAULT;
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
        result.append(" (numberOfSessions: ");
        result.append(numberOfSessions);
        result.append(')');
        return result.toString();
    }

} //ConstantWorkloadIntensityImpl
