/**
 */
package m4jdsl.impl;

import m4jdsl.Action;
import m4jdsl.GuardActionParameter;
import m4jdsl.M4jdslPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link m4jdsl.impl.ActionImpl#getActionParameter <em>Action Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action {
	/**
	 * The cached value of the '{@link #getActionParameter() <em>Action Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionParameter()
	 * @generated
	 * @ordered
	 */
	protected GuardActionParameter actionParameter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return M4jdslPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuardActionParameter getActionParameter() {
		if (actionParameter != null && actionParameter.eIsProxy()) {
			InternalEObject oldActionParameter = (InternalEObject)actionParameter;
			actionParameter = (GuardActionParameter)eResolveProxy(oldActionParameter);
			if (actionParameter != oldActionParameter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, M4jdslPackage.ACTION__ACTION_PARAMETER, oldActionParameter, actionParameter));
			}
		}
		return actionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuardActionParameter basicGetActionParameter() {
		return actionParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionParameter(GuardActionParameter newActionParameter) {
		GuardActionParameter oldActionParameter = actionParameter;
		actionParameter = newActionParameter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.ACTION__ACTION_PARAMETER, oldActionParameter, actionParameter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case M4jdslPackage.ACTION__ACTION_PARAMETER:
				if (resolve) return getActionParameter();
				return basicGetActionParameter();
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
			case M4jdslPackage.ACTION__ACTION_PARAMETER:
				setActionParameter((GuardActionParameter)newValue);
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
			case M4jdslPackage.ACTION__ACTION_PARAMETER:
				setActionParameter((GuardActionParameter)null);
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
			case M4jdslPackage.ACTION__ACTION_PARAMETER:
				return actionParameter != null;
		}
		return super.eIsSet(featureID);
	}

} //ActionImpl
