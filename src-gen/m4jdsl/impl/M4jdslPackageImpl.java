/**
 */
package m4jdsl.impl;

import m4jdsl.ApplicationExitState;
import m4jdsl.ApplicationModel;
import m4jdsl.ApplicationState;
import m4jdsl.ApplicationTransition;
import m4jdsl.Assertion;
import m4jdsl.BeanShellRequest;
import m4jdsl.BehaviorMix;
import m4jdsl.BehaviorModel;
import m4jdsl.BehaviorModelExitState;
import m4jdsl.BehaviorModelState;
import m4jdsl.ConstantWorkloadIntensity;
import m4jdsl.HTTPRequest;
import m4jdsl.JUnitRequest;
import m4jdsl.JavaRequest;
import m4jdsl.M4jdslFactory;
import m4jdsl.M4jdslPackage;
import m4jdsl.MarkovState;
import m4jdsl.NormallyDistributedThinkTime;
import m4jdsl.Parameter;
import m4jdsl.Property;
import m4jdsl.ProtocolExitState;
import m4jdsl.ProtocolLayerEFSM;
import m4jdsl.ProtocolLayerEFSMState;
import m4jdsl.ProtocolState;
import m4jdsl.ProtocolTransition;
import m4jdsl.RelativeFrequency;
import m4jdsl.Request;
import m4jdsl.SOAPRequest;
import m4jdsl.Service;
import m4jdsl.SessionLayerEFSM;
import m4jdsl.SessionLayerEFSMState;
import m4jdsl.ThinkTime;
import m4jdsl.Transition;
import m4jdsl.WorkloadIntensity;
import m4jdsl.WorkloadModel;
import m4jdsl.util.M4jdslValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class M4jdslPackageImpl extends EPackageImpl implements M4jdslPackage {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass workloadIntensityEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass workloadModelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass applicationModelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass behaviorMixEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass relativeFrequencyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass behaviorModelEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass transitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass markovStateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass serviceEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass applicationStateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass httpRequestEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass javaRequestEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass beanShellRequestEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass jUnitRequestEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass soapRequestEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass requestEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass protocolStateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass protocolTransitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass protocolLayerEFSMEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sessionLayerEFSMEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass constantWorkloadIntensityEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass applicationTransitionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass normallyDistributedThinkTimeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass propertyEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass parameterEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass assertionEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass thinkTimeEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass applicationExitStateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass sessionLayerEFSMStateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass behaviorModelExitStateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass behaviorModelStateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass protocolExitStateEClass = null;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private EClass protocolLayerEFSMStateEClass = null;

    /**
     * Creates an instance of the model <b>Package</b>, registered with
     * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
     * package URI value.
     * <p>Note: the correct way to create the package is via the static
     * factory method {@link #init init()}, which also performs
     * initialization of the package, or returns the registered package,
     * if one already exists.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.emf.ecore.EPackage.Registry
     * @see m4jdsl.M4jdslPackage#eNS_URI
     * @see #init()
     * @generated
     */
    private M4jdslPackageImpl() {
        super(eNS_URI, M4jdslFactory.eINSTANCE);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private static boolean isInited = false;

    /**
     * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
     * 
     * <p>This method is used to initialize {@link M4jdslPackage#eINSTANCE} when that field is accessed.
     * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #eNS_URI
     * @see #createPackageContents()
     * @see #initializePackageContents()
     * @generated
     */
    public static M4jdslPackage init() {
        if (isInited) return (M4jdslPackage)EPackage.Registry.INSTANCE.getEPackage(M4jdslPackage.eNS_URI);

        // Obtain or create and register package
        M4jdslPackageImpl theM4jdslPackage = (M4jdslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof M4jdslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new M4jdslPackageImpl());

        isInited = true;

        // Create package meta-data objects
        theM4jdslPackage.createPackageContents();

        // Initialize created meta-data
        theM4jdslPackage.initializePackageContents();

        // Register package validator
        EValidator.Registry.INSTANCE.put
            (theM4jdslPackage, 
             new EValidator.Descriptor() {
                 public EValidator getEValidator() {
                     return M4jdslValidator.INSTANCE;
                 }
             });

        // Mark meta-data to indicate it can't be changed
        theM4jdslPackage.freeze();

  
        // Update the registry and return the package
        EPackage.Registry.INSTANCE.put(M4jdslPackage.eNS_URI, theM4jdslPackage);
        return theM4jdslPackage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getWorkloadIntensity() {
        return workloadIntensityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getWorkloadIntensity_Formula() {
        return (EAttribute)workloadIntensityEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getWorkloadModel() {
        return workloadModelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getWorkloadModel_WorkloadIntensity() {
        return (EReference)workloadModelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getWorkloadModel_ApplicationModel() {
        return (EReference)workloadModelEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getWorkloadModel_BehaviorMix() {
        return (EReference)workloadModelEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getWorkloadModel_BehaviorModels() {
        return (EReference)workloadModelEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getApplicationModel() {
        return applicationModelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getApplicationModel_SessionLayerEFSM() {
        return (EReference)applicationModelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBehaviorMix() {
        return behaviorMixEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBehaviorMix_RelativeFrequencies() {
        return (EReference)behaviorMixEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRelativeFrequency() {
        return relativeFrequencyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRelativeFrequency_BehaviorModel() {
        return (EReference)relativeFrequencyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getRelativeFrequency_Value() {
        return (EAttribute)relativeFrequencyEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBehaviorModel() {
        return behaviorModelEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBehaviorModel_MarkovStates() {
        return (EReference)behaviorModelEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBehaviorModel_Name() {
        return (EAttribute)behaviorModelEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBehaviorModel_Filename() {
        return (EAttribute)behaviorModelEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBehaviorModel_ExitState() {
        return (EReference)behaviorModelEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getBehaviorModel_InitialState() {
        return (EReference)behaviorModelEClass.getEStructuralFeatures().get(4);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getTransition() {
        return transitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTransition_TargetState() {
        return (EReference)transitionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getTransition_Probability() {
        return (EAttribute)transitionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getTransition_ThinkTime() {
        return (EReference)transitionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getMarkovState() {
        return markovStateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getMarkovState_OutgoingTransitions() {
        return (EReference)markovStateEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getMarkovState_Service() {
        return (EReference)markovStateEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getService() {
        return serviceEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getService_Name() {
        return (EAttribute)serviceEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getApplicationState() {
        return applicationStateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getApplicationState_Service() {
        return (EReference)applicationStateEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getApplicationState_ProtocolDetails() {
        return (EReference)applicationStateEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getApplicationState_OutgoingTransitions() {
        return (EReference)applicationStateEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getHTTPRequest() {
        return httpRequestEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getJavaRequest() {
        return javaRequestEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBeanShellRequest() {
        return beanShellRequestEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getJUnitRequest() {
        return jUnitRequestEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSOAPRequest() {
        return soapRequestEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getRequest() {
        return requestEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getRequest_EId() {
        return (EAttribute)requestEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRequest_Assertions() {
        return (EReference)requestEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRequest_Properties() {
        return (EReference)requestEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getRequest_Parameters() {
        return (EReference)requestEClass.getEStructuralFeatures().get(3);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getProtocolState() {
        return protocolStateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProtocolState_Request() {
        return (EReference)protocolStateEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProtocolState_OutgoingTransitions() {
        return (EReference)protocolStateEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getProtocolTransition() {
        return protocolTransitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getProtocolTransition_Guard() {
        return (EAttribute)protocolTransitionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProtocolTransition_TargetState() {
        return (EReference)protocolTransitionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getProtocolTransition_Action() {
        return (EAttribute)protocolTransitionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getProtocolLayerEFSM() {
        return protocolLayerEFSMEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProtocolLayerEFSM_ProtocolStates() {
        return (EReference)protocolLayerEFSMEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProtocolLayerEFSM_InitialState() {
        return (EReference)protocolLayerEFSMEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getProtocolLayerEFSM_ExitState() {
        return (EReference)protocolLayerEFSMEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSessionLayerEFSM() {
        return sessionLayerEFSMEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSessionLayerEFSM_ApplicationStates() {
        return (EReference)sessionLayerEFSMEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSessionLayerEFSM_InitialState() {
        return (EReference)sessionLayerEFSMEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getSessionLayerEFSM_ExitState() {
        return (EReference)sessionLayerEFSMEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getConstantWorkloadIntensity() {
        return constantWorkloadIntensityEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getConstantWorkloadIntensity_NumberOfSessions() {
        return (EAttribute)constantWorkloadIntensityEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getApplicationTransition() {
        return applicationTransitionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EReference getApplicationTransition_TargetState() {
        return (EReference)applicationTransitionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getApplicationTransition_Action() {
        return (EAttribute)applicationTransitionEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getApplicationTransition_Guard() {
        return (EAttribute)applicationTransitionEClass.getEStructuralFeatures().get(2);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getNormallyDistributedThinkTime() {
        return normallyDistributedThinkTimeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNormallyDistributedThinkTime_Mean() {
        return (EAttribute)normallyDistributedThinkTimeEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getNormallyDistributedThinkTime_Deviation() {
        return (EAttribute)normallyDistributedThinkTimeEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getProperty() {
        return propertyEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getProperty_Key() {
        return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getProperty_Value() {
        return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getParameter() {
        return parameterEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getParameter_Name() {
        return (EAttribute)parameterEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getParameter_Value() {
        return (EAttribute)parameterEClass.getEStructuralFeatures().get(1);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getAssertion() {
        return assertionEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getAssertion_PatternToTest() {
        return (EAttribute)assertionEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getThinkTime() {
        return thinkTimeEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getApplicationExitState() {
        return applicationExitStateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getSessionLayerEFSMState() {
        return sessionLayerEFSMStateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getSessionLayerEFSMState_EId() {
        return (EAttribute)sessionLayerEFSMStateEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBehaviorModelExitState() {
        return behaviorModelExitStateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getBehaviorModelState() {
        return behaviorModelStateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getBehaviorModelState_EId() {
        return (EAttribute)behaviorModelStateEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getProtocolExitState() {
        return protocolExitStateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EClass getProtocolLayerEFSMState() {
        return protocolLayerEFSMStateEClass;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EAttribute getProtocolLayerEFSMState_EId() {
        return (EAttribute)protocolLayerEFSMStateEClass.getEStructuralFeatures().get(0);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public M4jdslFactory getM4jdslFactory() {
        return (M4jdslFactory)getEFactoryInstance();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isCreated = false;

    /**
     * Creates the meta-model objects for the package.  This method is
     * guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void createPackageContents() {
        if (isCreated) return;
        isCreated = true;

        // Create classes and their features
        workloadIntensityEClass = createEClass(WORKLOAD_INTENSITY);
        createEAttribute(workloadIntensityEClass, WORKLOAD_INTENSITY__FORMULA);

        workloadModelEClass = createEClass(WORKLOAD_MODEL);
        createEReference(workloadModelEClass, WORKLOAD_MODEL__WORKLOAD_INTENSITY);
        createEReference(workloadModelEClass, WORKLOAD_MODEL__APPLICATION_MODEL);
        createEReference(workloadModelEClass, WORKLOAD_MODEL__BEHAVIOR_MIX);
        createEReference(workloadModelEClass, WORKLOAD_MODEL__BEHAVIOR_MODELS);

        applicationModelEClass = createEClass(APPLICATION_MODEL);
        createEReference(applicationModelEClass, APPLICATION_MODEL__SESSION_LAYER_EFSM);

        behaviorMixEClass = createEClass(BEHAVIOR_MIX);
        createEReference(behaviorMixEClass, BEHAVIOR_MIX__RELATIVE_FREQUENCIES);

        relativeFrequencyEClass = createEClass(RELATIVE_FREQUENCY);
        createEReference(relativeFrequencyEClass, RELATIVE_FREQUENCY__BEHAVIOR_MODEL);
        createEAttribute(relativeFrequencyEClass, RELATIVE_FREQUENCY__VALUE);

        behaviorModelEClass = createEClass(BEHAVIOR_MODEL);
        createEReference(behaviorModelEClass, BEHAVIOR_MODEL__MARKOV_STATES);
        createEAttribute(behaviorModelEClass, BEHAVIOR_MODEL__NAME);
        createEAttribute(behaviorModelEClass, BEHAVIOR_MODEL__FILENAME);
        createEReference(behaviorModelEClass, BEHAVIOR_MODEL__EXIT_STATE);
        createEReference(behaviorModelEClass, BEHAVIOR_MODEL__INITIAL_STATE);

        transitionEClass = createEClass(TRANSITION);
        createEReference(transitionEClass, TRANSITION__TARGET_STATE);
        createEAttribute(transitionEClass, TRANSITION__PROBABILITY);
        createEReference(transitionEClass, TRANSITION__THINK_TIME);

        markovStateEClass = createEClass(MARKOV_STATE);
        createEReference(markovStateEClass, MARKOV_STATE__OUTGOING_TRANSITIONS);
        createEReference(markovStateEClass, MARKOV_STATE__SERVICE);

        serviceEClass = createEClass(SERVICE);
        createEAttribute(serviceEClass, SERVICE__NAME);

        applicationStateEClass = createEClass(APPLICATION_STATE);
        createEReference(applicationStateEClass, APPLICATION_STATE__SERVICE);
        createEReference(applicationStateEClass, APPLICATION_STATE__PROTOCOL_DETAILS);
        createEReference(applicationStateEClass, APPLICATION_STATE__OUTGOING_TRANSITIONS);

        httpRequestEClass = createEClass(HTTP_REQUEST);

        javaRequestEClass = createEClass(JAVA_REQUEST);

        beanShellRequestEClass = createEClass(BEAN_SHELL_REQUEST);

        jUnitRequestEClass = createEClass(JUNIT_REQUEST);

        soapRequestEClass = createEClass(SOAP_REQUEST);

        requestEClass = createEClass(REQUEST);
        createEAttribute(requestEClass, REQUEST__EID);
        createEReference(requestEClass, REQUEST__ASSERTIONS);
        createEReference(requestEClass, REQUEST__PROPERTIES);
        createEReference(requestEClass, REQUEST__PARAMETERS);

        protocolStateEClass = createEClass(PROTOCOL_STATE);
        createEReference(protocolStateEClass, PROTOCOL_STATE__REQUEST);
        createEReference(protocolStateEClass, PROTOCOL_STATE__OUTGOING_TRANSITIONS);

        protocolTransitionEClass = createEClass(PROTOCOL_TRANSITION);
        createEAttribute(protocolTransitionEClass, PROTOCOL_TRANSITION__GUARD);
        createEReference(protocolTransitionEClass, PROTOCOL_TRANSITION__TARGET_STATE);
        createEAttribute(protocolTransitionEClass, PROTOCOL_TRANSITION__ACTION);

        protocolLayerEFSMEClass = createEClass(PROTOCOL_LAYER_EFSM);
        createEReference(protocolLayerEFSMEClass, PROTOCOL_LAYER_EFSM__PROTOCOL_STATES);
        createEReference(protocolLayerEFSMEClass, PROTOCOL_LAYER_EFSM__INITIAL_STATE);
        createEReference(protocolLayerEFSMEClass, PROTOCOL_LAYER_EFSM__EXIT_STATE);

        sessionLayerEFSMEClass = createEClass(SESSION_LAYER_EFSM);
        createEReference(sessionLayerEFSMEClass, SESSION_LAYER_EFSM__APPLICATION_STATES);
        createEReference(sessionLayerEFSMEClass, SESSION_LAYER_EFSM__INITIAL_STATE);
        createEReference(sessionLayerEFSMEClass, SESSION_LAYER_EFSM__EXIT_STATE);

        constantWorkloadIntensityEClass = createEClass(CONSTANT_WORKLOAD_INTENSITY);
        createEAttribute(constantWorkloadIntensityEClass, CONSTANT_WORKLOAD_INTENSITY__NUMBER_OF_SESSIONS);

        applicationTransitionEClass = createEClass(APPLICATION_TRANSITION);
        createEReference(applicationTransitionEClass, APPLICATION_TRANSITION__TARGET_STATE);
        createEAttribute(applicationTransitionEClass, APPLICATION_TRANSITION__ACTION);
        createEAttribute(applicationTransitionEClass, APPLICATION_TRANSITION__GUARD);

        normallyDistributedThinkTimeEClass = createEClass(NORMALLY_DISTRIBUTED_THINK_TIME);
        createEAttribute(normallyDistributedThinkTimeEClass, NORMALLY_DISTRIBUTED_THINK_TIME__MEAN);
        createEAttribute(normallyDistributedThinkTimeEClass, NORMALLY_DISTRIBUTED_THINK_TIME__DEVIATION);

        propertyEClass = createEClass(PROPERTY);
        createEAttribute(propertyEClass, PROPERTY__KEY);
        createEAttribute(propertyEClass, PROPERTY__VALUE);

        parameterEClass = createEClass(PARAMETER);
        createEAttribute(parameterEClass, PARAMETER__NAME);
        createEAttribute(parameterEClass, PARAMETER__VALUE);

        assertionEClass = createEClass(ASSERTION);
        createEAttribute(assertionEClass, ASSERTION__PATTERN_TO_TEST);

        thinkTimeEClass = createEClass(THINK_TIME);

        applicationExitStateEClass = createEClass(APPLICATION_EXIT_STATE);

        sessionLayerEFSMStateEClass = createEClass(SESSION_LAYER_EFSM_STATE);
        createEAttribute(sessionLayerEFSMStateEClass, SESSION_LAYER_EFSM_STATE__EID);

        behaviorModelExitStateEClass = createEClass(BEHAVIOR_MODEL_EXIT_STATE);

        behaviorModelStateEClass = createEClass(BEHAVIOR_MODEL_STATE);
        createEAttribute(behaviorModelStateEClass, BEHAVIOR_MODEL_STATE__EID);

        protocolExitStateEClass = createEClass(PROTOCOL_EXIT_STATE);

        protocolLayerEFSMStateEClass = createEClass(PROTOCOL_LAYER_EFSM_STATE);
        createEAttribute(protocolLayerEFSMStateEClass, PROTOCOL_LAYER_EFSM_STATE__EID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    private boolean isInitialized = false;

    /**
     * Complete the initialization of the package and its meta-model.  This
     * method is guarded to have no affect on any invocation but its first.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void initializePackageContents() {
        if (isInitialized) return;
        isInitialized = true;

        // Initialize package
        setName(eNAME);
        setNsPrefix(eNS_PREFIX);
        setNsURI(eNS_URI);

        // Create type parameters

        // Set bounds for type parameters

        // Add supertypes to classes
        markovStateEClass.getESuperTypes().add(this.getBehaviorModelState());
        applicationStateEClass.getESuperTypes().add(this.getSessionLayerEFSMState());
        httpRequestEClass.getESuperTypes().add(this.getRequest());
        javaRequestEClass.getESuperTypes().add(this.getRequest());
        beanShellRequestEClass.getESuperTypes().add(this.getRequest());
        jUnitRequestEClass.getESuperTypes().add(this.getRequest());
        soapRequestEClass.getESuperTypes().add(this.getRequest());
        protocolStateEClass.getESuperTypes().add(this.getProtocolLayerEFSMState());
        constantWorkloadIntensityEClass.getESuperTypes().add(this.getWorkloadIntensity());
        normallyDistributedThinkTimeEClass.getESuperTypes().add(this.getThinkTime());
        applicationExitStateEClass.getESuperTypes().add(this.getSessionLayerEFSMState());
        behaviorModelExitStateEClass.getESuperTypes().add(this.getBehaviorModelState());
        protocolExitStateEClass.getESuperTypes().add(this.getProtocolLayerEFSMState());

        // Initialize classes, features, and operations; add parameters
        initEClass(workloadIntensityEClass, WorkloadIntensity.class, "WorkloadIntensity", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getWorkloadIntensity_Formula(), ecorePackage.getEString(), "formula", null, 1, 1, WorkloadIntensity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(workloadModelEClass, WorkloadModel.class, "WorkloadModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getWorkloadModel_WorkloadIntensity(), this.getWorkloadIntensity(), null, "workloadIntensity", null, 1, 1, WorkloadModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getWorkloadModel_ApplicationModel(), this.getApplicationModel(), null, "applicationModel", null, 1, 1, WorkloadModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getWorkloadModel_BehaviorMix(), this.getBehaviorMix(), null, "behaviorMix", null, 1, 1, WorkloadModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getWorkloadModel_BehaviorModels(), this.getBehaviorModel(), null, "behaviorModels", null, 1, -1, WorkloadModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(applicationModelEClass, ApplicationModel.class, "ApplicationModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getApplicationModel_SessionLayerEFSM(), this.getSessionLayerEFSM(), null, "sessionLayerEFSM", null, 1, 1, ApplicationModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(behaviorMixEClass, BehaviorMix.class, "BehaviorMix", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBehaviorMix_RelativeFrequencies(), this.getRelativeFrequency(), null, "relativeFrequencies", null, 1, -1, BehaviorMix.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(relativeFrequencyEClass, RelativeFrequency.class, "RelativeFrequency", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getRelativeFrequency_BehaviorModel(), this.getBehaviorModel(), null, "behaviorModel", null, 1, 1, RelativeFrequency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getRelativeFrequency_Value(), ecorePackage.getEDouble(), "value", null, 1, 1, RelativeFrequency.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(behaviorModelEClass, BehaviorModel.class, "BehaviorModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getBehaviorModel_MarkovStates(), this.getMarkovState(), null, "markovStates", null, 1, -1, BehaviorModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBehaviorModel_Name(), ecorePackage.getEString(), "name", null, 1, 1, BehaviorModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getBehaviorModel_Filename(), ecorePackage.getEString(), "filename", null, 1, 1, BehaviorModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBehaviorModel_ExitState(), this.getBehaviorModelExitState(), null, "exitState", null, 1, 1, BehaviorModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getBehaviorModel_InitialState(), this.getMarkovState(), null, "initialState", null, 1, 1, BehaviorModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getTransition_TargetState(), this.getBehaviorModelState(), null, "targetState", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getTransition_Probability(), ecorePackage.getEDouble(), "probability", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getTransition_ThinkTime(), this.getThinkTime(), null, "thinkTime", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(markovStateEClass, MarkovState.class, "MarkovState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getMarkovState_OutgoingTransitions(), this.getTransition(), null, "outgoingTransitions", null, 0, -1, MarkovState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getMarkovState_Service(), this.getService(), null, "service", null, 1, 1, MarkovState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(serviceEClass, Service.class, "Service", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getService_Name(), ecorePackage.getEString(), "name", null, 1, 1, Service.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(applicationStateEClass, ApplicationState.class, "ApplicationState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getApplicationState_Service(), this.getService(), null, "service", null, 1, 1, ApplicationState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getApplicationState_ProtocolDetails(), this.getProtocolLayerEFSM(), null, "protocolDetails", null, 1, 1, ApplicationState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getApplicationState_OutgoingTransitions(), this.getApplicationTransition(), null, "outgoingTransitions", null, 0, -1, ApplicationState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(httpRequestEClass, HTTPRequest.class, "HTTPRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(javaRequestEClass, JavaRequest.class, "JavaRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(beanShellRequestEClass, BeanShellRequest.class, "BeanShellRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(jUnitRequestEClass, JUnitRequest.class, "JUnitRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(soapRequestEClass, SOAPRequest.class, "SOAPRequest", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(requestEClass, Request.class, "Request", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getRequest_EId(), ecorePackage.getEString(), "eId", null, 1, 1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRequest_Assertions(), this.getAssertion(), null, "assertions", null, 0, -1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRequest_Properties(), this.getProperty(), null, "properties", null, 0, -1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getRequest_Parameters(), this.getParameter(), null, "parameters", null, 0, -1, Request.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(protocolStateEClass, ProtocolState.class, "ProtocolState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getProtocolState_Request(), this.getRequest(), null, "request", null, 1, 1, ProtocolState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProtocolState_OutgoingTransitions(), this.getProtocolTransition(), null, "outgoingTransitions", null, 0, -1, ProtocolState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(protocolTransitionEClass, ProtocolTransition.class, "ProtocolTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProtocolTransition_Guard(), ecorePackage.getEString(), "guard", null, 0, 1, ProtocolTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProtocolTransition_TargetState(), this.getProtocolLayerEFSMState(), null, "targetState", null, 1, 1, ProtocolTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProtocolTransition_Action(), ecorePackage.getEString(), "action", null, 0, 1, ProtocolTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(protocolLayerEFSMEClass, ProtocolLayerEFSM.class, "ProtocolLayerEFSM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getProtocolLayerEFSM_ProtocolStates(), this.getProtocolState(), null, "protocolStates", null, 1, -1, ProtocolLayerEFSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProtocolLayerEFSM_InitialState(), this.getProtocolState(), null, "initialState", null, 1, 1, ProtocolLayerEFSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getProtocolLayerEFSM_ExitState(), this.getProtocolExitState(), null, "exitState", null, 1, 1, ProtocolLayerEFSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(sessionLayerEFSMEClass, SessionLayerEFSM.class, "SessionLayerEFSM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getSessionLayerEFSM_ApplicationStates(), this.getApplicationState(), null, "applicationStates", null, 1, -1, SessionLayerEFSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSessionLayerEFSM_InitialState(), this.getApplicationState(), null, "initialState", null, 1, 1, SessionLayerEFSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEReference(getSessionLayerEFSM_ExitState(), this.getApplicationExitState(), null, "exitState", null, 1, 1, SessionLayerEFSM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(constantWorkloadIntensityEClass, ConstantWorkloadIntensity.class, "ConstantWorkloadIntensity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getConstantWorkloadIntensity_NumberOfSessions(), ecorePackage.getEInt(), "numberOfSessions", null, 1, 1, ConstantWorkloadIntensity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(applicationTransitionEClass, ApplicationTransition.class, "ApplicationTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEReference(getApplicationTransition_TargetState(), this.getSessionLayerEFSMState(), null, "targetState", null, 1, 1, ApplicationTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getApplicationTransition_Action(), ecorePackage.getEString(), "action", null, 0, 1, ApplicationTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getApplicationTransition_Guard(), ecorePackage.getEString(), "guard", null, 0, 1, ApplicationTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(normallyDistributedThinkTimeEClass, NormallyDistributedThinkTime.class, "NormallyDistributedThinkTime", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getNormallyDistributedThinkTime_Mean(), ecorePackage.getEDouble(), "mean", null, 1, 1, NormallyDistributedThinkTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getNormallyDistributedThinkTime_Deviation(), ecorePackage.getEDouble(), "deviation", null, 1, 1, NormallyDistributedThinkTime.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProperty_Key(), ecorePackage.getEString(), "key", null, 1, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getProperty_Value(), ecorePackage.getEString(), "value", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(parameterEClass, Parameter.class, "Parameter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getParameter_Name(), ecorePackage.getEString(), "name", null, 1, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
        initEAttribute(getParameter_Value(), ecorePackage.getEString(), "value", null, 0, 1, Parameter.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(assertionEClass, Assertion.class, "Assertion", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getAssertion_PatternToTest(), ecorePackage.getEString(), "patternToTest", null, 1, 1, Assertion.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(thinkTimeEClass, ThinkTime.class, "ThinkTime", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(applicationExitStateEClass, ApplicationExitState.class, "ApplicationExitState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(sessionLayerEFSMStateEClass, SessionLayerEFSMState.class, "SessionLayerEFSMState", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getSessionLayerEFSMState_EId(), ecorePackage.getEString(), "eId", null, 1, 1, SessionLayerEFSMState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(behaviorModelExitStateEClass, BehaviorModelExitState.class, "BehaviorModelExitState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(behaviorModelStateEClass, BehaviorModelState.class, "BehaviorModelState", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getBehaviorModelState_EId(), ecorePackage.getEString(), "eId", null, 1, 1, BehaviorModelState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        initEClass(protocolExitStateEClass, ProtocolExitState.class, "ProtocolExitState", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

        initEClass(protocolLayerEFSMStateEClass, ProtocolLayerEFSMState.class, "ProtocolLayerEFSMState", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
        initEAttribute(getProtocolLayerEFSMState_EId(), ecorePackage.getEString(), "eId", null, 1, 1, ProtocolLayerEFSMState.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

        // Create resource
        createResource(eNS_URI);

        // Create annotations
        // http://www.eclipse.org/OCL/Import
        createImportAnnotations();
        // http://www.eclipse.org/emf/2002/Ecore
        createEcoreAnnotations();
        // http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot
        createPivotAnnotations();
    }

    /**
     * Initializes the annotations for <b>http://www.eclipse.org/OCL/Import</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createImportAnnotations() {
        String source = "http://www.eclipse.org/OCL/Import";		
        addAnnotation
          (this, 
           source, 
           new String[] {
             "ecore", "http://www.eclipse.org/emf/2002/Ecore#/"
           });																											
    }

    /**
     * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createEcoreAnnotations() {
        String source = "http://www.eclipse.org/emf/2002/Ecore";			
        addAnnotation
          (this, 
           source, 
           new String[] {
             "invocationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
             "settingDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
             "validationDelegates", "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot"
           });		
        addAnnotation
          (behaviorMixEClass, 
           source, 
           new String[] {
             "constraints", "mustBeValidFrequencySum mustBeUniqueBehaviorModels"
           });			
        addAnnotation
          (relativeFrequencyEClass, 
           source, 
           new String[] {
             "constraints", "mustBeValidFrequency"
           });			
        addAnnotation
          (behaviorModelEClass, 
           source, 
           new String[] {
             "constraints", "mustBeUniqueNames mustBeUniqueFilenames mustBeBehaviorModelWithMarkovStatesForAllServices mustBeInitialStateWhichIsIncludedInMarkovStatesList mustBeBehaviorModelWithoutForeignTargetStates mustBeMarkovStatesWithUniqueServices"
           });			
        addAnnotation
          (transitionEClass, 
           source, 
           new String[] {
             "constraints", "mustBeValidProbability mustBeThinkTimesOfSameType"
           });			
        addAnnotation
          (markovStateEClass, 
           source, 
           new String[] {
             "constraints", "mustBeValidProbabilitySum mustBeOutgoingTransitionsWithUniqueTargetStates mustBeOutgoingTransitionsCorrespondingToSessionLayer"
           });			
        addAnnotation
          (serviceEClass, 
           source, 
           new String[] {
             "constraints", "mustBeUniqueNames"
           });			
        addAnnotation
          (applicationStateEClass, 
           source, 
           new String[] {
             "constraints", "mustBeUniqueOutgoingTransitions"
           });			
        addAnnotation
          (requestEClass, 
           source, 
           new String[] {
             "constraints", "mustBeUniquePropertyKeys mustBeUniqueParameterNames mustBeRequestsOfSameType"
           });			
        addAnnotation
          (protocolStateEClass, 
           source, 
           new String[] {
             "constraints", "mustBeUniqueOutgoingTransitions"
           });			
        addAnnotation
          (protocolLayerEFSMEClass, 
           source, 
           new String[] {
             "constraints", "mustBeProtocolStatesWithUniqueRequests mustBeInitialStateWhichIsIncludedInProtocolStatesList mustBeProtocolLayerEFSMWithoutForeignStates"
           });			
        addAnnotation
          (sessionLayerEFSMEClass, 
           source, 
           new String[] {
             "constraints", "mustBeApplicationStatesWithUniqueServices mustBeInitialStateWhichIsIncludedInApplicationStatesList"
           });			
        addAnnotation
          (constantWorkloadIntensityEClass, 
           source, 
           new String[] {
             "constraints", "mustBeNonnegativeSessionNumber"
           });			
        addAnnotation
          (normallyDistributedThinkTimeEClass, 
           source, 
           new String[] {
             "constraints", "mustBeValidThinkTimeValues"
           });	
    }

    /**
     * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot</b>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected void createPivotAnnotations() {
        String source = "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot";					
        addAnnotation
          (behaviorMixEClass, 
           source, 
           new String[] {
             "mustBeValidFrequencySum", "\n            relativeFrequencies.value->sum() = 1.0",
             "mustBeUniqueBehaviorModels", "\n            relativeFrequencies->forAll(f1,f2|\n             (f1 <> f2 and not(f1.behaviorModel.oclIsUndefined() or f2.behaviorModel.oclIsUndefined()))\n                 implies f1.behaviorModel <> f2.behaviorModel)"
           });			
        addAnnotation
          (relativeFrequencyEClass, 
           source, 
           new String[] {
             "mustBeValidFrequency", "\n            value >= 0.0 and value <= 1.0"
           });			
        addAnnotation
          (behaviorModelEClass, 
           source, 
           new String[] {
             "mustBeUniqueNames", "\n            BehaviorModel.allInstances()->forAll(b1,b2|\n                 (b1 <> b2 and not(b1.name.oclIsUndefined() or b2.name.oclIsUndefined()))\n                     implies b1.name <> b2.name\n                )",
             "mustBeUniqueFilenames", "\n            BehaviorModel.allInstances()->forAll(b1,b2 |\n                (b1 <> b2 and not(b1.filename.oclIsUndefined() or b2.filename.oclIsUndefined()))\n                    implies b1.filename <> b2.filename)",
             "mustBeBehaviorModelWithMarkovStatesForAllServices", "\n            Service.allInstances()->\n                forAll(s|markovStates->exists(m|m.service = s))",
             "mustBeInitialStateWhichIsIncludedInMarkovStatesList", "\n            not initialState.oclIsUndefined() implies markovStates->includes(initialState)",
             "mustBeBehaviorModelWithoutForeignTargetStates", "\n            markovStates->forAll(s| \n                s.outgoingTransitions->forAll(t|\n                    not t.targetState.oclIsUndefined() implies\n                    (markovStates->includes(t.targetState)\n                    or t.targetState = exitState)))",
             "mustBeMarkovStatesWithUniqueServices", "\n            markovStates->forAll(s1,s2|\n                (s1 <> s2 and not(s1.service.oclIsUndefined() or s2.service.oclIsUndefined()))\n                    implies s1.service <> s2.service\n                )"
           });			
        addAnnotation
          (transitionEClass, 
           source, 
           new String[] {
             "mustBeValidProbability", "\n            probability >= 0.0 and probability <= 1.0",
             "mustBeThinkTimesOfSameType", "\n            Transition.allInstances()->\n                forAll(t1,t2|\n                    not (t1.thinkTime.oclIsUndefined() or t2.thinkTime.oclIsUndefined()) implies \n                    t1.thinkTime.oclType() = t2.thinkTime.oclType()\n                )"
           });			
        addAnnotation
          (markovStateEClass, 
           source, 
           new String[] {
             "mustBeValidProbabilitySum", "\n            outgoingTransitions.probability->exists(p | p > 0) implies\n            outgoingTransitions.probability->sum() = 1.0",
             "mustBeOutgoingTransitionsWithUniqueTargetStates", "\n            outgoingTransitions->\n                forAll(t1,t2|\n                (t1 <> t2 and not(t1.targetState.oclIsUndefined() or t2.targetState.oclIsUndefined()))\n                     implies t1.targetState <> t2.targetState\n                )",
             "mustBeOutgoingTransitionsCorrespondingToSessionLayer", "\n            not service.oclIsUndefined() implies \n            ApplicationState.allInstances()->exists(as|service = as.service and\n                outgoingTransitions->forAll(t|\n                    not t.targetState.oclIsUndefined() implies as.outgoingTransitions->exists(at|\n                        (at.targetState.oclIsTypeOf(ApplicationExitState) and\n                         t.targetState.oclIsTypeOf(BehaviorModelExitState)) or\n                       ((t.targetState.oclIsTypeOf(MarkovState) and\n                         at.targetState.oclIsTypeOf(ApplicationState) and\n                         at.targetState.oclAsType(ApplicationState).service =\n                         t.targetState.oclAsType(MarkovState).service)))))"
           });			
        addAnnotation
          (serviceEClass, 
           source, 
           new String[] {
             "mustBeUniqueNames", "\n    \t\tService.allInstances()->\n                forAll(s1,s2|\n                    (s1 <> s2 and not(s1.name.oclIsUndefined() or s2.name.oclIsUndefined()))\n                     implies s1.name <> s2.name\n                )"
           });			
        addAnnotation
          (applicationStateEClass, 
           source, 
           new String[] {
             "mustBeUniqueOutgoingTransitions", "\n            outgoingTransitions->\n                forAll(t1,t2|\n                (t1 <> t2 and not(t1.targetState.oclIsUndefined() or t2.targetState.oclIsUndefined()))\n                     implies (t1.targetState <> t2.targetState or t1.guard <> t2.guard))"
           });			
        addAnnotation
          (requestEClass, 
           source, 
           new String[] {
             "mustBeUniquePropertyKeys", "\n         properties->forAll(p1,p2 | \n             (p1 <> p2 and not(p1.key.oclIsUndefined() or p2.key.oclIsUndefined()))\n                implies p1.key <> p2.key\n         )",
             "mustBeUniqueParameterNames", "\n        parameters->forAll(p1,p2 |\n             (p1 <> p2 and not(p1.name.oclIsUndefined() or p2.name.oclIsUndefined()))\n             implies p1.name <> p2.name\n        )",
             "mustBeRequestsOfSameType", "\n        Request.allInstances()->forAll(r1,r2 | r1.oclType() = r2.oclType())"
           });			
        addAnnotation
          (protocolStateEClass, 
           source, 
           new String[] {
             "mustBeUniqueOutgoingTransitions", "\n            outgoingTransitions->\n                forAll(t1,t2|\n                    (t1 <> t2 and not(t1.targetState.oclIsUndefined() or t2.targetState.oclIsUndefined()))\n                    implies (t1.targetState <> t2.targetState or t1.guard <> t2.guard))"
           });			
        addAnnotation
          (protocolLayerEFSMEClass, 
           source, 
           new String[] {
             "mustBeProtocolStatesWithUniqueRequests", "\n            protocolStates->forAll(s1,s2|\n                (s1 <> s2 and not(s1.request.oclIsUndefined() or s2.request.oclIsUndefined()))\n                 implies s1.request <> s2.request\n            )",
             "mustBeInitialStateWhichIsIncludedInProtocolStatesList", "\n            not initialState.oclIsUndefined() implies protocolStates->includes(initialState)",
             "mustBeProtocolLayerEFSMWithoutForeignStates", "\n            protocolStates->forAll(s|\n                s.outgoingTransitions->forAll(t|\n                    not t.targetState.oclIsUndefined() implies\n                    (protocolStates->includes(t.targetState) or t.targetState = exitState)))"
           });			
        addAnnotation
          (sessionLayerEFSMEClass, 
           source, 
           new String[] {
             "mustBeApplicationStatesWithUniqueServices", "\n            applicationStates->forAll(s1,s2|\n                (s1 <> s2 and not(s1.service.oclIsUndefined() or s2.service.oclIsUndefined()))\n                 implies s1.service <> s2.service\n            )",
             "mustBeInitialStateWhichIsIncludedInApplicationStatesList", "\n            not initialState.oclIsUndefined() implies applicationStates->includes(initialState)"
           });			
        addAnnotation
          (constantWorkloadIntensityEClass, 
           source, 
           new String[] {
             "mustBeNonnegativeSessionNumber", "\n           numberOfSessions >= 0"
           });			
        addAnnotation
          (normallyDistributedThinkTimeEClass, 
           source, 
           new String[] {
             "mustBeValidThinkTimeValues", "\n            mean >= 0.0 and deviation >= 0.0 and deviation <= mean"
           });
    }

    @Override
    protected Resource createResource(String uri) {

        // this is necessary for setting the attribute
        //
        //   xsi:schemaLocation="http://m4jdsl/1.0 m4jdsl.ecore"
        //
        // in the XMI file of a serialized EMF model; the attribute will not be
        // be stored otherwise, causing the resulting XMI file to be not
        // readable for the Generic Form Editor;
        return super.createResource("m4jdsl.ecore");
    }

} //M4jdslPackageImpl
