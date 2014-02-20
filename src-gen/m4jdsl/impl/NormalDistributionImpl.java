/**
 */
package m4jdsl.impl;

import m4jdsl.M4jdslPackage;
import m4jdsl.NormalDistribution;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal Distribution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link m4jdsl.impl.NormalDistributionImpl#getMean <em>Mean</em>}</li>
 *   <li>{@link m4jdsl.impl.NormalDistributionImpl#getDeviation <em>Deviation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NormalDistributionImpl extends ThinkTimeImpl implements NormalDistribution {
    /**
     * The default value of the '{@link #getMean() <em>Mean</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMean()
     * @generated
     * @ordered
     */
    protected static final double MEAN_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getMean() <em>Mean</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMean()
     * @generated
     * @ordered
     */
    protected double mean = MEAN_EDEFAULT;

    /**
     * The default value of the '{@link #getDeviation() <em>Deviation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeviation()
     * @generated
     * @ordered
     */
    protected static final double DEVIATION_EDEFAULT = 0.0;

    /**
     * The cached value of the '{@link #getDeviation() <em>Deviation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDeviation()
     * @generated
     * @ordered
     */
    protected double deviation = DEVIATION_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NormalDistributionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return M4jdslPackage.Literals.NORMAL_DISTRIBUTION;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public double getMean() {
        return mean;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setMean(double newMean) {
        double oldMean = mean;
        mean = newMean;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.NORMAL_DISTRIBUTION__MEAN, oldMean, mean));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public double getDeviation() {
        return deviation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDeviation(double newDeviation) {
        double oldDeviation = deviation;
        deviation = newDeviation;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.NORMAL_DISTRIBUTION__DEVIATION, oldDeviation, deviation));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case M4jdslPackage.NORMAL_DISTRIBUTION__MEAN:
                return getMean();
            case M4jdslPackage.NORMAL_DISTRIBUTION__DEVIATION:
                return getDeviation();
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
            case M4jdslPackage.NORMAL_DISTRIBUTION__MEAN:
                setMean((Double)newValue);
                return;
            case M4jdslPackage.NORMAL_DISTRIBUTION__DEVIATION:
                setDeviation((Double)newValue);
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
            case M4jdslPackage.NORMAL_DISTRIBUTION__MEAN:
                setMean(MEAN_EDEFAULT);
                return;
            case M4jdslPackage.NORMAL_DISTRIBUTION__DEVIATION:
                setDeviation(DEVIATION_EDEFAULT);
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
            case M4jdslPackage.NORMAL_DISTRIBUTION__MEAN:
                return mean != MEAN_EDEFAULT;
            case M4jdslPackage.NORMAL_DISTRIBUTION__DEVIATION:
                return deviation != DEVIATION_EDEFAULT;
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
        result.append(" (mean: ");
        result.append(mean);
        result.append(", deviation: ");
        result.append(deviation);
        result.append(')');
        return result.toString();
    }

} //NormalDistributionImpl
