/**
 */
package m4jdsl.impl;

import java.util.Collection;

import m4jdsl.Assertion;
import m4jdsl.M4jdslPackage;
import m4jdsl.Parameter;
import m4jdsl.Property;
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
 * An implementation of the model object '<em><b>Request</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link m4jdsl.impl.RequestImpl#getEId <em>EId</em>}</li>
 *   <li>{@link m4jdsl.impl.RequestImpl#getAssertions <em>Assertions</em>}</li>
 *   <li>{@link m4jdsl.impl.RequestImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link m4jdsl.impl.RequestImpl#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RequestImpl extends MinimalEObjectImpl.Container implements Request {
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
	 * The cached value of the '{@link #getAssertions() <em>Assertions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getAssertions()
	 * @generated
	 * @ordered
	 */
    protected EList<Assertion> assertions;

    /**
	 * The cached value of the '{@link #getProperties() <em>Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getProperties()
	 * @generated
	 * @ordered
	 */
    protected EList<Property> properties;

    /**
	 * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see #getParameters()
	 * @generated
	 * @ordered
	 */
    protected EList<Parameter> parameters;

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected RequestImpl() {
		super();
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EClass eStaticClass() {
		return M4jdslPackage.Literals.REQUEST;
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
			eNotify(new ENotificationImpl(this, Notification.SET, M4jdslPackage.REQUEST__EID, oldEId, eId));
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Assertion> getAssertions() {
		if (assertions == null) {
			assertions = new EObjectContainmentEList<Assertion>(Assertion.class, this, M4jdslPackage.REQUEST__ASSERTIONS);
		}
		return assertions;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Property> getProperties() {
		if (properties == null) {
			properties = new EObjectContainmentEList<Property>(Property.class, this, M4jdslPackage.REQUEST__PROPERTIES);
		}
		return properties;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public EList<Parameter> getParameters() {
		if (parameters == null) {
			parameters = new EObjectContainmentEList<Parameter>(Parameter.class, this, M4jdslPackage.REQUEST__PARAMETERS);
		}
		return parameters;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case M4jdslPackage.REQUEST__ASSERTIONS:
				return ((InternalEList<?>)getAssertions()).basicRemove(otherEnd, msgs);
			case M4jdslPackage.REQUEST__PROPERTIES:
				return ((InternalEList<?>)getProperties()).basicRemove(otherEnd, msgs);
			case M4jdslPackage.REQUEST__PARAMETERS:
				return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
			case M4jdslPackage.REQUEST__EID:
				return getEId();
			case M4jdslPackage.REQUEST__ASSERTIONS:
				return getAssertions();
			case M4jdslPackage.REQUEST__PROPERTIES:
				return getProperties();
			case M4jdslPackage.REQUEST__PARAMETERS:
				return getParameters();
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
			case M4jdslPackage.REQUEST__EID:
				setEId((String)newValue);
				return;
			case M4jdslPackage.REQUEST__ASSERTIONS:
				getAssertions().clear();
				getAssertions().addAll((Collection<? extends Assertion>)newValue);
				return;
			case M4jdslPackage.REQUEST__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends Property>)newValue);
				return;
			case M4jdslPackage.REQUEST__PARAMETERS:
				getParameters().clear();
				getParameters().addAll((Collection<? extends Parameter>)newValue);
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
			case M4jdslPackage.REQUEST__EID:
				setEId(EID_EDEFAULT);
				return;
			case M4jdslPackage.REQUEST__ASSERTIONS:
				getAssertions().clear();
				return;
			case M4jdslPackage.REQUEST__PROPERTIES:
				getProperties().clear();
				return;
			case M4jdslPackage.REQUEST__PARAMETERS:
				getParameters().clear();
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
			case M4jdslPackage.REQUEST__EID:
				return EID_EDEFAULT == null ? eId != null : !EID_EDEFAULT.equals(eId);
			case M4jdslPackage.REQUEST__ASSERTIONS:
				return assertions != null && !assertions.isEmpty();
			case M4jdslPackage.REQUEST__PROPERTIES:
				return properties != null && !properties.isEmpty();
			case M4jdslPackage.REQUEST__PARAMETERS:
				return parameters != null && !parameters.isEmpty();
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

} //RequestImpl
