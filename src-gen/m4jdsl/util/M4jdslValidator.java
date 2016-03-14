/***************************************************************************
 * Copyright (c) 2016 the WESSBAS project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ***************************************************************************/


package m4jdsl.util;

import java.util.Map;

import m4jdsl.*;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see m4jdsl.M4jdslPackage
 * @generated
 */
public class M4jdslValidator extends EObjectValidator {
    /**
	 * The cached model package
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public static final M4jdslValidator INSTANCE = new M4jdslValidator();

    /**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
    public static final String DIAGNOSTIC_SOURCE = "m4jdsl";

    /**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

    /**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

    /**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public M4jdslValidator() {
		super();
	}

    /**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected EPackage getEPackage() {
	  return M4jdslPackage.eINSTANCE;
	}

    /**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case M4jdslPackage.WORKLOAD_INTENSITY:
				return validateWorkloadIntensity((WorkloadIntensity)value, diagnostics, context);
			case M4jdslPackage.WORKLOAD_MODEL:
				return validateWorkloadModel((WorkloadModel)value, diagnostics, context);
			case M4jdslPackage.APPLICATION_MODEL:
				return validateApplicationModel((ApplicationModel)value, diagnostics, context);
			case M4jdslPackage.BEHAVIOR_MIX:
				return validateBehaviorMix((BehaviorMix)value, diagnostics, context);
			case M4jdslPackage.RELATIVE_FREQUENCY:
				return validateRelativeFrequency((RelativeFrequency)value, diagnostics, context);
			case M4jdslPackage.BEHAVIOR_MODEL:
				return validateBehaviorModel((BehaviorModel)value, diagnostics, context);
			case M4jdslPackage.TRANSITION:
				return validateTransition((Transition)value, diagnostics, context);
			case M4jdslPackage.MARKOV_STATE:
				return validateMarkovState((MarkovState)value, diagnostics, context);
			case M4jdslPackage.SERVICE:
				return validateService((Service)value, diagnostics, context);
			case M4jdslPackage.APPLICATION_STATE:
				return validateApplicationState((ApplicationState)value, diagnostics, context);
			case M4jdslPackage.HTTP_REQUEST:
				return validateHTTPRequest((HTTPRequest)value, diagnostics, context);
			case M4jdslPackage.JAVA_REQUEST:
				return validateJavaRequest((JavaRequest)value, diagnostics, context);
			case M4jdslPackage.BEAN_SHELL_REQUEST:
				return validateBeanShellRequest((BeanShellRequest)value, diagnostics, context);
			case M4jdslPackage.JUNIT_REQUEST:
				return validateJUnitRequest((JUnitRequest)value, diagnostics, context);
			case M4jdslPackage.SOAP_REQUEST:
				return validateSOAPRequest((SOAPRequest)value, diagnostics, context);
			case M4jdslPackage.REQUEST:
				return validateRequest((Request)value, diagnostics, context);
			case M4jdslPackage.PROTOCOL_STATE:
				return validateProtocolState((ProtocolState)value, diagnostics, context);
			case M4jdslPackage.PROTOCOL_TRANSITION:
				return validateProtocolTransition((ProtocolTransition)value, diagnostics, context);
			case M4jdslPackage.PROTOCOL_LAYER_EFSM:
				return validateProtocolLayerEFSM((ProtocolLayerEFSM)value, diagnostics, context);
			case M4jdslPackage.SESSION_LAYER_EFSM:
				return validateSessionLayerEFSM((SessionLayerEFSM)value, diagnostics, context);
			case M4jdslPackage.CONSTANT_WORKLOAD_INTENSITY:
				return validateConstantWorkloadIntensity((ConstantWorkloadIntensity)value, diagnostics, context);
			case M4jdslPackage.APPLICATION_TRANSITION:
				return validateApplicationTransition((ApplicationTransition)value, diagnostics, context);
			case M4jdslPackage.NORMALLY_DISTRIBUTED_THINK_TIME:
				return validateNormallyDistributedThinkTime((NormallyDistributedThinkTime)value, diagnostics, context);
			case M4jdslPackage.PROPERTY:
				return validateProperty((Property)value, diagnostics, context);
			case M4jdslPackage.PARAMETER:
				return validateParameter((Parameter)value, diagnostics, context);
			case M4jdslPackage.ASSERTION:
				return validateAssertion((Assertion)value, diagnostics, context);
			case M4jdslPackage.THINK_TIME:
				return validateThinkTime((ThinkTime)value, diagnostics, context);
			case M4jdslPackage.APPLICATION_EXIT_STATE:
				return validateApplicationExitState((ApplicationExitState)value, diagnostics, context);
			case M4jdslPackage.SESSION_LAYER_EFSM_STATE:
				return validateSessionLayerEFSMState((SessionLayerEFSMState)value, diagnostics, context);
			case M4jdslPackage.BEHAVIOR_MODEL_EXIT_STATE:
				return validateBehaviorModelExitState((BehaviorModelExitState)value, diagnostics, context);
			case M4jdslPackage.BEHAVIOR_MODEL_STATE:
				return validateBehaviorModelState((BehaviorModelState)value, diagnostics, context);
			case M4jdslPackage.PROTOCOL_EXIT_STATE:
				return validateProtocolExitState((ProtocolExitState)value, diagnostics, context);
			case M4jdslPackage.PROTOCOL_LAYER_EFSM_STATE:
				return validateProtocolLayerEFSMState((ProtocolLayerEFSMState)value, diagnostics, context);
			case M4jdslPackage.GUARD_ACTION_PARAMETER:
				return validateGuardActionParameter((GuardActionParameter)value, diagnostics, context);
			case M4jdslPackage.GUARD:
				return validateGuard((Guard)value, diagnostics, context);
			case M4jdslPackage.ACTION:
				return validateAction((Action)value, diagnostics, context);
			case M4jdslPackage.GUARD_ACTION_PARAMETER_LIST:
				return validateGuardActionParameterList((GuardActionParameterList)value, diagnostics, context);
			case M4jdslPackage.GUARD_ACTION_PARAMETER_TYPE:
				return validateGuardActionParameterType((GuardActionParameterType)value, diagnostics, context);
			case M4jdslPackage.PARAMETER_TYPE:
				return validateParameterType((ParameterType)value, diagnostics, context);
			default:
				return true;
		}
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateWorkloadIntensity(WorkloadIntensity workloadIntensity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workloadIntensity, diagnostics, context);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateWorkloadModel(WorkloadModel workloadModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workloadModel, diagnostics, context);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateApplicationModel(ApplicationModel applicationModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(applicationModel, diagnostics, context);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateBehaviorMix(BehaviorMix behaviorMix, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(behaviorMix, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(behaviorMix, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(behaviorMix, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(behaviorMix, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(behaviorMix, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(behaviorMix, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(behaviorMix, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(behaviorMix, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(behaviorMix, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviorMix_mustBeValidFrequencySum(behaviorMix, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviorMix_mustBeUniqueBehaviorModels(behaviorMix, diagnostics, context);
		return result;
	}

    /**
	 * The cached validation expression for the mustBeValidFrequencySum constraint of '<em>Behavior Mix</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static final String BEHAVIOR_MIX__MUST_BE_VALID_FREQUENCY_SUM__EEXPRESSION = "\n" +
		"            relativeFrequencies.value->sum() = 1.0";

    /**
	 * Validates the mustBeValidFrequencySum constraint of '<em>Behavior Mix</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateBehaviorMix_mustBeValidFrequencySum(BehaviorMix behaviorMix, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(M4jdslPackage.Literals.BEHAVIOR_MIX,
				 behaviorMix,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mustBeValidFrequencySum",
				 BEHAVIOR_MIX__MUST_BE_VALID_FREQUENCY_SUM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

    /**
	 * The cached validation expression for the mustBeUniqueBehaviorModels constraint of '<em>Behavior Mix</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static final String BEHAVIOR_MIX__MUST_BE_UNIQUE_BEHAVIOR_MODELS__EEXPRESSION = "\n" +
		"            relativeFrequencies->forAll(f1,f2|\n" +
		"             (f1 <> f2 and not(f1.behaviorModel.oclIsUndefined() or f2.behaviorModel.oclIsUndefined()))\n" +
		"                 implies f1.behaviorModel <> f2.behaviorModel)";

    /**
	 * Validates the mustBeUniqueBehaviorModels constraint of '<em>Behavior Mix</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateBehaviorMix_mustBeUniqueBehaviorModels(BehaviorMix behaviorMix, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(M4jdslPackage.Literals.BEHAVIOR_MIX,
				 behaviorMix,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mustBeUniqueBehaviorModels",
				 BEHAVIOR_MIX__MUST_BE_UNIQUE_BEHAVIOR_MODELS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateRelativeFrequency(RelativeFrequency relativeFrequency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(relativeFrequency, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(relativeFrequency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(relativeFrequency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(relativeFrequency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(relativeFrequency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(relativeFrequency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(relativeFrequency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(relativeFrequency, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(relativeFrequency, diagnostics, context);
		if (result || diagnostics != null) result &= validateRelativeFrequency_mustBeValidFrequency(relativeFrequency, diagnostics, context);
		return result;
	}

    /**
	 * The cached validation expression for the mustBeValidFrequency constraint of '<em>Relative Frequency</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static final String RELATIVE_FREQUENCY__MUST_BE_VALID_FREQUENCY__EEXPRESSION = "\n" +
		"            value >= 0.0 and value <= 1.0";

    /**
	 * Validates the mustBeValidFrequency constraint of '<em>Relative Frequency</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateRelativeFrequency_mustBeValidFrequency(RelativeFrequency relativeFrequency, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(M4jdslPackage.Literals.RELATIVE_FREQUENCY,
				 relativeFrequency,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mustBeValidFrequency",
				 RELATIVE_FREQUENCY__MUST_BE_VALID_FREQUENCY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateBehaviorModel(BehaviorModel behaviorModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(behaviorModel, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(behaviorModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(behaviorModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(behaviorModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(behaviorModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(behaviorModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(behaviorModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(behaviorModel, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(behaviorModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviorModel_mustBeUniqueNames(behaviorModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviorModel_mustBeUniqueFilenames(behaviorModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviorModel_mustBeBehaviorModelWithMarkovStatesForAllServices(behaviorModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviorModel_mustBeInitialStateWhichIsIncludedInMarkovStatesList(behaviorModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviorModel_mustBeBehaviorModelWithoutForeignTargetStates(behaviorModel, diagnostics, context);
		if (result || diagnostics != null) result &= validateBehaviorModel_mustBeMarkovStatesWithUniqueServices(behaviorModel, diagnostics, context);
		return result;
	}

    /**
	 * The cached validation expression for the mustBeUniqueNames constraint of '<em>Behavior Model</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static final String BEHAVIOR_MODEL__MUST_BE_UNIQUE_NAMES__EEXPRESSION = "\n" +
		"            BehaviorModel.allInstances()->forAll(b1,b2|\n" +
		"                 (b1 <> b2 and not(b1.name.oclIsUndefined() or b2.name.oclIsUndefined()))\n" +
		"                     implies b1.name <> b2.name\n" +
		"                )";

    /**
	 * Validates the mustBeUniqueNames constraint of '<em>Behavior Model</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateBehaviorModel_mustBeUniqueNames(BehaviorModel behaviorModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(M4jdslPackage.Literals.BEHAVIOR_MODEL,
				 behaviorModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mustBeUniqueNames",
				 BEHAVIOR_MODEL__MUST_BE_UNIQUE_NAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

    /**
	 * The cached validation expression for the mustBeUniqueFilenames constraint of '<em>Behavior Model</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static final String BEHAVIOR_MODEL__MUST_BE_UNIQUE_FILENAMES__EEXPRESSION = "\n" +
		"            BehaviorModel.allInstances()->forAll(b1,b2 |\n" +
		"                (b1 <> b2 and not(b1.filename.oclIsUndefined() or b2.filename.oclIsUndefined()))\n" +
		"                    implies b1.filename <> b2.filename)";

    /**
	 * Validates the mustBeUniqueFilenames constraint of '<em>Behavior Model</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateBehaviorModel_mustBeUniqueFilenames(BehaviorModel behaviorModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(M4jdslPackage.Literals.BEHAVIOR_MODEL,
				 behaviorModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mustBeUniqueFilenames",
				 BEHAVIOR_MODEL__MUST_BE_UNIQUE_FILENAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

    /**
	 * The cached validation expression for the mustBeBehaviorModelWithMarkovStatesForAllServices constraint of '<em>Behavior Model</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static final String BEHAVIOR_MODEL__MUST_BE_BEHAVIOR_MODEL_WITH_MARKOV_STATES_FOR_ALL_SERVICES__EEXPRESSION = "\n" +
		"            Service.allInstances()->\n" +
		"                forAll(s|markovStates->exists(m|m.service = s))";

    /**
	 * Validates the mustBeBehaviorModelWithMarkovStatesForAllServices constraint of '<em>Behavior Model</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateBehaviorModel_mustBeBehaviorModelWithMarkovStatesForAllServices(BehaviorModel behaviorModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(M4jdslPackage.Literals.BEHAVIOR_MODEL,
				 behaviorModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mustBeBehaviorModelWithMarkovStatesForAllServices",
				 BEHAVIOR_MODEL__MUST_BE_BEHAVIOR_MODEL_WITH_MARKOV_STATES_FOR_ALL_SERVICES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

    /**
	 * The cached validation expression for the mustBeInitialStateWhichIsIncludedInMarkovStatesList constraint of '<em>Behavior Model</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static final String BEHAVIOR_MODEL__MUST_BE_INITIAL_STATE_WHICH_IS_INCLUDED_IN_MARKOV_STATES_LIST__EEXPRESSION = "\n" +
		"            not initialState.oclIsUndefined() implies markovStates->includes(initialState)";

    /**
	 * Validates the mustBeInitialStateWhichIsIncludedInMarkovStatesList constraint of '<em>Behavior Model</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateBehaviorModel_mustBeInitialStateWhichIsIncludedInMarkovStatesList(BehaviorModel behaviorModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(M4jdslPackage.Literals.BEHAVIOR_MODEL,
				 behaviorModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mustBeInitialStateWhichIsIncludedInMarkovStatesList",
				 BEHAVIOR_MODEL__MUST_BE_INITIAL_STATE_WHICH_IS_INCLUDED_IN_MARKOV_STATES_LIST__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

    /**
	 * The cached validation expression for the mustBeBehaviorModelWithoutForeignTargetStates constraint of '<em>Behavior Model</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static final String BEHAVIOR_MODEL__MUST_BE_BEHAVIOR_MODEL_WITHOUT_FOREIGN_TARGET_STATES__EEXPRESSION = "\n" +
		"            markovStates->forAll(s| \n" +
		"                s.outgoingTransitions->forAll(t|\n" +
		"                    not t.targetState.oclIsUndefined() implies\n" +
		"                    (markovStates->includes(t.targetState)\n" +
		"                    or t.targetState = exitState)))";

    /**
	 * Validates the mustBeBehaviorModelWithoutForeignTargetStates constraint of '<em>Behavior Model</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateBehaviorModel_mustBeBehaviorModelWithoutForeignTargetStates(BehaviorModel behaviorModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(M4jdslPackage.Literals.BEHAVIOR_MODEL,
				 behaviorModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mustBeBehaviorModelWithoutForeignTargetStates",
				 BEHAVIOR_MODEL__MUST_BE_BEHAVIOR_MODEL_WITHOUT_FOREIGN_TARGET_STATES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

    /**
	 * The cached validation expression for the mustBeMarkovStatesWithUniqueServices constraint of '<em>Behavior Model</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static final String BEHAVIOR_MODEL__MUST_BE_MARKOV_STATES_WITH_UNIQUE_SERVICES__EEXPRESSION = "\n" +
		"            markovStates->forAll(s1,s2|\n" +
		"                (s1 <> s2 and not(s1.service.oclIsUndefined() or s2.service.oclIsUndefined()))\n" +
		"                    implies s1.service <> s2.service\n" +
		"                )";

    /**
	 * Validates the mustBeMarkovStatesWithUniqueServices constraint of '<em>Behavior Model</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateBehaviorModel_mustBeMarkovStatesWithUniqueServices(BehaviorModel behaviorModel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(M4jdslPackage.Literals.BEHAVIOR_MODEL,
				 behaviorModel,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mustBeMarkovStatesWithUniqueServices",
				 BEHAVIOR_MODEL__MUST_BE_MARKOV_STATES_WITH_UNIQUE_SERVICES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateTransition(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(transition, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_mustBeValidProbability(transition, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransition_mustBeThinkTimesOfSameType(transition, diagnostics, context);
		return result;
	}

    /**
	 * The cached validation expression for the mustBeValidProbability constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static final String TRANSITION__MUST_BE_VALID_PROBABILITY__EEXPRESSION = "\n" +
		"            probability >= 0.0 and probability <= 1.0";

    /**
	 * Validates the mustBeValidProbability constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateTransition_mustBeValidProbability(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(M4jdslPackage.Literals.TRANSITION,
				 transition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mustBeValidProbability",
				 TRANSITION__MUST_BE_VALID_PROBABILITY__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

    /**
	 * The cached validation expression for the mustBeThinkTimesOfSameType constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static final String TRANSITION__MUST_BE_THINK_TIMES_OF_SAME_TYPE__EEXPRESSION = "\n" +
		"            Transition.allInstances()->\n" +
		"                forAll(t1,t2|\n" +
		"                    not (t1.thinkTime.oclIsUndefined() or t2.thinkTime.oclIsUndefined()) implies \n" +
		"                    t1.thinkTime.oclType() = t2.thinkTime.oclType()\n" +
		"                )";

    /**
	 * Validates the mustBeThinkTimesOfSameType constraint of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateTransition_mustBeThinkTimesOfSameType(Transition transition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(M4jdslPackage.Literals.TRANSITION,
				 transition,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mustBeThinkTimesOfSameType",
				 TRANSITION__MUST_BE_THINK_TIMES_OF_SAME_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateMarkovState(MarkovState markovState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(markovState, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(markovState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(markovState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(markovState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(markovState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(markovState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(markovState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(markovState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(markovState, diagnostics, context);
		if (result || diagnostics != null) result &= validateMarkovState_mustBeValidProbabilitySum(markovState, diagnostics, context);
		if (result || diagnostics != null) result &= validateMarkovState_mustBeOutgoingTransitionsWithUniqueTargetStates(markovState, diagnostics, context);
		if (result || diagnostics != null) result &= validateMarkovState_mustBeOutgoingTransitionsCorrespondingToSessionLayer(markovState, diagnostics, context);
		return result;
	}

    /**
	 * The cached validation expression for the mustBeValidProbabilitySum constraint of '<em>Markov State</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static final String MARKOV_STATE__MUST_BE_VALID_PROBABILITY_SUM__EEXPRESSION = "\n" +
		"            outgoingTransitions.probability->exists(p | p > 0) implies\n" +
		"            outgoingTransitions.probability->sum() = 1.0";

    /**
	 * Validates the mustBeValidProbabilitySum constraint of '<em>Markov State</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateMarkovState_mustBeValidProbabilitySum(MarkovState markovState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(M4jdslPackage.Literals.MARKOV_STATE,
				 markovState,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mustBeValidProbabilitySum",
				 MARKOV_STATE__MUST_BE_VALID_PROBABILITY_SUM__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

    /**
	 * The cached validation expression for the mustBeOutgoingTransitionsWithUniqueTargetStates constraint of '<em>Markov State</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static final String MARKOV_STATE__MUST_BE_OUTGOING_TRANSITIONS_WITH_UNIQUE_TARGET_STATES__EEXPRESSION = "\n" +
		"            outgoingTransitions->\n" +
		"                forAll(t1,t2|\n" +
		"                (t1 <> t2 and not(t1.targetState.oclIsUndefined() or t2.targetState.oclIsUndefined()))\n" +
		"                     implies t1.targetState <> t2.targetState\n" +
		"                )";

    /**
	 * Validates the mustBeOutgoingTransitionsWithUniqueTargetStates constraint of '<em>Markov State</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateMarkovState_mustBeOutgoingTransitionsWithUniqueTargetStates(MarkovState markovState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(M4jdslPackage.Literals.MARKOV_STATE,
				 markovState,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mustBeOutgoingTransitionsWithUniqueTargetStates",
				 MARKOV_STATE__MUST_BE_OUTGOING_TRANSITIONS_WITH_UNIQUE_TARGET_STATES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

    /**
	 * The cached validation expression for the mustBeOutgoingTransitionsCorrespondingToSessionLayer constraint of '<em>Markov State</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static final String MARKOV_STATE__MUST_BE_OUTGOING_TRANSITIONS_CORRESPONDING_TO_SESSION_LAYER__EEXPRESSION = "\n" +
		"            not service.oclIsUndefined() implies \n" +
		"            ApplicationState.allInstances()->exists(as|service = as.service and\n" +
		"                outgoingTransitions->forAll(t|\n" +
		"                    not t.targetState.oclIsUndefined() implies as.outgoingTransitions->exists(at|\n" +
		"                        (at.targetState.oclIsTypeOf(ApplicationExitState) and\n" +
		"                         t.targetState.oclIsTypeOf(BehaviorModelExitState)) or\n" +
		"                       ((t.targetState.oclIsTypeOf(MarkovState) and\n" +
		"                         at.targetState.oclIsTypeOf(ApplicationState) and\n" +
		"                         at.targetState.oclAsType(ApplicationState).service =\n" +
		"                         t.targetState.oclAsType(MarkovState).service)))))";

    /**
	 * Validates the mustBeOutgoingTransitionsCorrespondingToSessionLayer constraint of '<em>Markov State</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateMarkovState_mustBeOutgoingTransitionsCorrespondingToSessionLayer(MarkovState markovState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(M4jdslPackage.Literals.MARKOV_STATE,
				 markovState,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mustBeOutgoingTransitionsCorrespondingToSessionLayer",
				 MARKOV_STATE__MUST_BE_OUTGOING_TRANSITIONS_CORRESPONDING_TO_SESSION_LAYER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateService(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(service, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(service, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(service, diagnostics, context);
		if (result || diagnostics != null) result &= validateService_mustBeUniqueNames(service, diagnostics, context);
		return result;
	}

    /**
	 * The cached validation expression for the mustBeUniqueNames constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static final String SERVICE__MUST_BE_UNIQUE_NAMES__EEXPRESSION = "\n" +
		"    \t\tService.allInstances()->\n" +
		"                forAll(s1,s2|\n" +
		"                    (s1 <> s2 and not(s1.name.oclIsUndefined() or s2.name.oclIsUndefined()))\n" +
		"                     implies s1.name <> s2.name\n" +
		"                )";

    /**
	 * Validates the mustBeUniqueNames constraint of '<em>Service</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateService_mustBeUniqueNames(Service service, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(M4jdslPackage.Literals.SERVICE,
				 service,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mustBeUniqueNames",
				 SERVICE__MUST_BE_UNIQUE_NAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateApplicationState(ApplicationState applicationState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(applicationState, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(applicationState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(applicationState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(applicationState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(applicationState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(applicationState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(applicationState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(applicationState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(applicationState, diagnostics, context);
		if (result || diagnostics != null) result &= validateApplicationState_mustBeUniqueOutgoingTransitions(applicationState, diagnostics, context);
		return result;
	}

    /**
	 * The cached validation expression for the mustBeUniqueOutgoingTransitions constraint of '<em>Application State</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static final String APPLICATION_STATE__MUST_BE_UNIQUE_OUTGOING_TRANSITIONS__EEXPRESSION = "\n" +
		"            outgoingTransitions->\n" +
		"                forAll(t1,t2|\n" +
		"                (t1 <> t2 and not(t1.targetState.oclIsUndefined() or t2.targetState.oclIsUndefined()))\n" +
		"                     implies (t1.targetState <> t2.targetState or t1.guard <> t2.guard))";

    /**
	 * Validates the mustBeUniqueOutgoingTransitions constraint of '<em>Application State</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateApplicationState_mustBeUniqueOutgoingTransitions(ApplicationState applicationState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(M4jdslPackage.Literals.APPLICATION_STATE,
				 applicationState,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mustBeUniqueOutgoingTransitions",
				 APPLICATION_STATE__MUST_BE_UNIQUE_OUTGOING_TRANSITIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateHTTPRequest(HTTPRequest httpRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(httpRequest, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(httpRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(httpRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(httpRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(httpRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(httpRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(httpRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(httpRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(httpRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequest_mustBeUniquePropertyKeys(httpRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequest_mustBeUniqueParameterNames(httpRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequest_mustBeRequestsOfSameType(httpRequest, diagnostics, context);
		return result;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateJavaRequest(JavaRequest javaRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(javaRequest, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(javaRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(javaRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(javaRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(javaRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(javaRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(javaRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(javaRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(javaRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequest_mustBeUniquePropertyKeys(javaRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequest_mustBeUniqueParameterNames(javaRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequest_mustBeRequestsOfSameType(javaRequest, diagnostics, context);
		return result;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateBeanShellRequest(BeanShellRequest beanShellRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(beanShellRequest, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(beanShellRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(beanShellRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(beanShellRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(beanShellRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(beanShellRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(beanShellRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(beanShellRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(beanShellRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequest_mustBeUniquePropertyKeys(beanShellRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequest_mustBeUniqueParameterNames(beanShellRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequest_mustBeRequestsOfSameType(beanShellRequest, diagnostics, context);
		return result;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateJUnitRequest(JUnitRequest jUnitRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(jUnitRequest, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(jUnitRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(jUnitRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(jUnitRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(jUnitRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(jUnitRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(jUnitRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(jUnitRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(jUnitRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequest_mustBeUniquePropertyKeys(jUnitRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequest_mustBeUniqueParameterNames(jUnitRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequest_mustBeRequestsOfSameType(jUnitRequest, diagnostics, context);
		return result;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateSOAPRequest(SOAPRequest soapRequest, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(soapRequest, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(soapRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(soapRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(soapRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(soapRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(soapRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(soapRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(soapRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(soapRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequest_mustBeUniquePropertyKeys(soapRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequest_mustBeUniqueParameterNames(soapRequest, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequest_mustBeRequestsOfSameType(soapRequest, diagnostics, context);
		return result;
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateRequest(Request request, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(request, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(request, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(request, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(request, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(request, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(request, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(request, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(request, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(request, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequest_mustBeUniquePropertyKeys(request, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequest_mustBeUniqueParameterNames(request, diagnostics, context);
		if (result || diagnostics != null) result &= validateRequest_mustBeRequestsOfSameType(request, diagnostics, context);
		return result;
	}

    /**
	 * The cached validation expression for the mustBeUniquePropertyKeys constraint of '<em>Request</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static final String REQUEST__MUST_BE_UNIQUE_PROPERTY_KEYS__EEXPRESSION = "\n" +
		"         properties->forAll(p1,p2 | \n" +
		"             (p1 <> p2 and not(p1.key.oclIsUndefined() or p2.key.oclIsUndefined()))\n" +
		"                implies p1.key <> p2.key\n" +
		"         )";

    /**
	 * Validates the mustBeUniquePropertyKeys constraint of '<em>Request</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateRequest_mustBeUniquePropertyKeys(Request request, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(M4jdslPackage.Literals.REQUEST,
				 request,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mustBeUniquePropertyKeys",
				 REQUEST__MUST_BE_UNIQUE_PROPERTY_KEYS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

    /**
	 * The cached validation expression for the mustBeUniqueParameterNames constraint of '<em>Request</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static final String REQUEST__MUST_BE_UNIQUE_PARAMETER_NAMES__EEXPRESSION = "\n" +
		"        parameters->forAll(p1,p2 |\n" +
		"             (p1 <> p2 and not(p1.name.oclIsUndefined() or p2.name.oclIsUndefined()))\n" +
		"             implies p1.name <> p2.name\n" +
		"        )";

    /**
	 * Validates the mustBeUniqueParameterNames constraint of '<em>Request</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateRequest_mustBeUniqueParameterNames(Request request, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(M4jdslPackage.Literals.REQUEST,
				 request,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mustBeUniqueParameterNames",
				 REQUEST__MUST_BE_UNIQUE_PARAMETER_NAMES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

    /**
	 * The cached validation expression for the mustBeRequestsOfSameType constraint of '<em>Request</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static final String REQUEST__MUST_BE_REQUESTS_OF_SAME_TYPE__EEXPRESSION = "\n" +
		"        Request.allInstances()->forAll(r1,r2 | r1.oclType() = r2.oclType())";

    /**
	 * Validates the mustBeRequestsOfSameType constraint of '<em>Request</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateRequest_mustBeRequestsOfSameType(Request request, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(M4jdslPackage.Literals.REQUEST,
				 request,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mustBeRequestsOfSameType",
				 REQUEST__MUST_BE_REQUESTS_OF_SAME_TYPE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateProtocolState(ProtocolState protocolState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(protocolState, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(protocolState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(protocolState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(protocolState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(protocolState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(protocolState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(protocolState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(protocolState, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(protocolState, diagnostics, context);
		if (result || diagnostics != null) result &= validateProtocolState_mustBeUniqueOutgoingTransitions(protocolState, diagnostics, context);
		return result;
	}

    /**
	 * The cached validation expression for the mustBeUniqueOutgoingTransitions constraint of '<em>Protocol State</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static final String PROTOCOL_STATE__MUST_BE_UNIQUE_OUTGOING_TRANSITIONS__EEXPRESSION = "\n" +
		"            outgoingTransitions->\n" +
		"                forAll(t1,t2|\n" +
		"                    (t1 <> t2 and not(t1.targetState.oclIsUndefined() or t2.targetState.oclIsUndefined()))\n" +
		"                    implies (t1.targetState <> t2.targetState or t1.guard <> t2.guard))";

    /**
	 * Validates the mustBeUniqueOutgoingTransitions constraint of '<em>Protocol State</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateProtocolState_mustBeUniqueOutgoingTransitions(ProtocolState protocolState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(M4jdslPackage.Literals.PROTOCOL_STATE,
				 protocolState,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mustBeUniqueOutgoingTransitions",
				 PROTOCOL_STATE__MUST_BE_UNIQUE_OUTGOING_TRANSITIONS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateProtocolTransition(ProtocolTransition protocolTransition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(protocolTransition, diagnostics, context);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateProtocolLayerEFSM(ProtocolLayerEFSM protocolLayerEFSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(protocolLayerEFSM, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(protocolLayerEFSM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(protocolLayerEFSM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(protocolLayerEFSM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(protocolLayerEFSM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(protocolLayerEFSM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(protocolLayerEFSM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(protocolLayerEFSM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(protocolLayerEFSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateProtocolLayerEFSM_mustBeProtocolStatesWithUniqueRequests(protocolLayerEFSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateProtocolLayerEFSM_mustBeInitialStateWhichIsIncludedInProtocolStatesList(protocolLayerEFSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateProtocolLayerEFSM_mustBeProtocolLayerEFSMWithoutForeignStates(protocolLayerEFSM, diagnostics, context);
		return result;
	}

    /**
	 * The cached validation expression for the mustBeProtocolStatesWithUniqueRequests constraint of '<em>Protocol Layer EFSM</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static final String PROTOCOL_LAYER_EFSM__MUST_BE_PROTOCOL_STATES_WITH_UNIQUE_REQUESTS__EEXPRESSION = "\n" +
		"            protocolStates->forAll(s1,s2|\n" +
		"                (s1 <> s2 and not(s1.request.oclIsUndefined() or s2.request.oclIsUndefined()))\n" +
		"                 implies s1.request <> s2.request\n" +
		"            )";

    /**
	 * Validates the mustBeProtocolStatesWithUniqueRequests constraint of '<em>Protocol Layer EFSM</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateProtocolLayerEFSM_mustBeProtocolStatesWithUniqueRequests(ProtocolLayerEFSM protocolLayerEFSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(M4jdslPackage.Literals.PROTOCOL_LAYER_EFSM,
				 protocolLayerEFSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mustBeProtocolStatesWithUniqueRequests",
				 PROTOCOL_LAYER_EFSM__MUST_BE_PROTOCOL_STATES_WITH_UNIQUE_REQUESTS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

    /**
	 * The cached validation expression for the mustBeInitialStateWhichIsIncludedInProtocolStatesList constraint of '<em>Protocol Layer EFSM</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static final String PROTOCOL_LAYER_EFSM__MUST_BE_INITIAL_STATE_WHICH_IS_INCLUDED_IN_PROTOCOL_STATES_LIST__EEXPRESSION = "\n" +
		"            not initialState.oclIsUndefined() implies protocolStates->includes(initialState)";

    /**
	 * Validates the mustBeInitialStateWhichIsIncludedInProtocolStatesList constraint of '<em>Protocol Layer EFSM</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateProtocolLayerEFSM_mustBeInitialStateWhichIsIncludedInProtocolStatesList(ProtocolLayerEFSM protocolLayerEFSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(M4jdslPackage.Literals.PROTOCOL_LAYER_EFSM,
				 protocolLayerEFSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mustBeInitialStateWhichIsIncludedInProtocolStatesList",
				 PROTOCOL_LAYER_EFSM__MUST_BE_INITIAL_STATE_WHICH_IS_INCLUDED_IN_PROTOCOL_STATES_LIST__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

    /**
	 * The cached validation expression for the mustBeProtocolLayerEFSMWithoutForeignStates constraint of '<em>Protocol Layer EFSM</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static final String PROTOCOL_LAYER_EFSM__MUST_BE_PROTOCOL_LAYER_EFSM_WITHOUT_FOREIGN_STATES__EEXPRESSION = "\n" +
		"            protocolStates->forAll(s|\n" +
		"                s.outgoingTransitions->forAll(t|\n" +
		"                    not t.targetState.oclIsUndefined() implies\n" +
		"                    (protocolStates->includes(t.targetState) or t.targetState = exitState)))";

    /**
	 * Validates the mustBeProtocolLayerEFSMWithoutForeignStates constraint of '<em>Protocol Layer EFSM</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateProtocolLayerEFSM_mustBeProtocolLayerEFSMWithoutForeignStates(ProtocolLayerEFSM protocolLayerEFSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(M4jdslPackage.Literals.PROTOCOL_LAYER_EFSM,
				 protocolLayerEFSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mustBeProtocolLayerEFSMWithoutForeignStates",
				 PROTOCOL_LAYER_EFSM__MUST_BE_PROTOCOL_LAYER_EFSM_WITHOUT_FOREIGN_STATES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateSessionLayerEFSM(SessionLayerEFSM sessionLayerEFSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sessionLayerEFSM, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sessionLayerEFSM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sessionLayerEFSM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sessionLayerEFSM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sessionLayerEFSM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sessionLayerEFSM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sessionLayerEFSM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sessionLayerEFSM, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sessionLayerEFSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateSessionLayerEFSM_mustBeApplicationStatesWithUniqueServices(sessionLayerEFSM, diagnostics, context);
		if (result || diagnostics != null) result &= validateSessionLayerEFSM_mustBeInitialStateWhichIsIncludedInApplicationStatesList(sessionLayerEFSM, diagnostics, context);
		return result;
	}

    /**
	 * The cached validation expression for the mustBeApplicationStatesWithUniqueServices constraint of '<em>Session Layer EFSM</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static final String SESSION_LAYER_EFSM__MUST_BE_APPLICATION_STATES_WITH_UNIQUE_SERVICES__EEXPRESSION = "\n" +
		"            applicationStates->forAll(s1,s2|\n" +
		"                (s1 <> s2 and not(s1.service.oclIsUndefined() or s2.service.oclIsUndefined()))\n" +
		"                 implies s1.service <> s2.service\n" +
		"            )";

    /**
	 * Validates the mustBeApplicationStatesWithUniqueServices constraint of '<em>Session Layer EFSM</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateSessionLayerEFSM_mustBeApplicationStatesWithUniqueServices(SessionLayerEFSM sessionLayerEFSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(M4jdslPackage.Literals.SESSION_LAYER_EFSM,
				 sessionLayerEFSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mustBeApplicationStatesWithUniqueServices",
				 SESSION_LAYER_EFSM__MUST_BE_APPLICATION_STATES_WITH_UNIQUE_SERVICES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

    /**
	 * The cached validation expression for the mustBeInitialStateWhichIsIncludedInApplicationStatesList constraint of '<em>Session Layer EFSM</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static final String SESSION_LAYER_EFSM__MUST_BE_INITIAL_STATE_WHICH_IS_INCLUDED_IN_APPLICATION_STATES_LIST__EEXPRESSION = "\n" +
		"            not initialState.oclIsUndefined() implies applicationStates->includes(initialState)";

    /**
	 * Validates the mustBeInitialStateWhichIsIncludedInApplicationStatesList constraint of '<em>Session Layer EFSM</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateSessionLayerEFSM_mustBeInitialStateWhichIsIncludedInApplicationStatesList(SessionLayerEFSM sessionLayerEFSM, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(M4jdslPackage.Literals.SESSION_LAYER_EFSM,
				 sessionLayerEFSM,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mustBeInitialStateWhichIsIncludedInApplicationStatesList",
				 SESSION_LAYER_EFSM__MUST_BE_INITIAL_STATE_WHICH_IS_INCLUDED_IN_APPLICATION_STATES_LIST__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateConstantWorkloadIntensity(ConstantWorkloadIntensity constantWorkloadIntensity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(constantWorkloadIntensity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(constantWorkloadIntensity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(constantWorkloadIntensity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(constantWorkloadIntensity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(constantWorkloadIntensity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(constantWorkloadIntensity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(constantWorkloadIntensity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(constantWorkloadIntensity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(constantWorkloadIntensity, diagnostics, context);
		if (result || diagnostics != null) result &= validateConstantWorkloadIntensity_mustBeNonnegativeSessionNumber(constantWorkloadIntensity, diagnostics, context);
		return result;
	}

    /**
	 * The cached validation expression for the mustBeNonnegativeSessionNumber constraint of '<em>Constant Workload Intensity</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static final String CONSTANT_WORKLOAD_INTENSITY__MUST_BE_NONNEGATIVE_SESSION_NUMBER__EEXPRESSION = "\n" +
		"           numberOfSessions >= 0";

    /**
	 * Validates the mustBeNonnegativeSessionNumber constraint of '<em>Constant Workload Intensity</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateConstantWorkloadIntensity_mustBeNonnegativeSessionNumber(ConstantWorkloadIntensity constantWorkloadIntensity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(M4jdslPackage.Literals.CONSTANT_WORKLOAD_INTENSITY,
				 constantWorkloadIntensity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mustBeNonnegativeSessionNumber",
				 CONSTANT_WORKLOAD_INTENSITY__MUST_BE_NONNEGATIVE_SESSION_NUMBER__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateApplicationTransition(ApplicationTransition applicationTransition, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(applicationTransition, diagnostics, context);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateNormallyDistributedThinkTime(NormallyDistributedThinkTime normallyDistributedThinkTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(normallyDistributedThinkTime, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(normallyDistributedThinkTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(normallyDistributedThinkTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(normallyDistributedThinkTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(normallyDistributedThinkTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(normallyDistributedThinkTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(normallyDistributedThinkTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(normallyDistributedThinkTime, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(normallyDistributedThinkTime, diagnostics, context);
		if (result || diagnostics != null) result &= validateNormallyDistributedThinkTime_mustBeValidThinkTimeValues(normallyDistributedThinkTime, diagnostics, context);
		return result;
	}

    /**
	 * The cached validation expression for the mustBeValidThinkTimeValues constraint of '<em>Normally Distributed Think Time</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    protected static final String NORMALLY_DISTRIBUTED_THINK_TIME__MUST_BE_VALID_THINK_TIME_VALUES__EEXPRESSION = "\n" +
		"            mean >= 0.0 and deviation >= 0.0 and deviation <= mean";

    /**
	 * Validates the mustBeValidThinkTimeValues constraint of '<em>Normally Distributed Think Time</em>'.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateNormallyDistributedThinkTime_mustBeValidThinkTimeValues(NormallyDistributedThinkTime normallyDistributedThinkTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(M4jdslPackage.Literals.NORMALLY_DISTRIBUTED_THINK_TIME,
				 normallyDistributedThinkTime,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "mustBeValidThinkTimeValues",
				 NORMALLY_DISTRIBUTED_THINK_TIME__MUST_BE_VALID_THINK_TIME_VALUES__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateProperty(Property property, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(property, diagnostics, context);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateParameter(Parameter parameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(parameter, diagnostics, context);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateAssertion(Assertion assertion, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(assertion, diagnostics, context);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateThinkTime(ThinkTime thinkTime, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(thinkTime, diagnostics, context);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateApplicationExitState(ApplicationExitState applicationExitState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(applicationExitState, diagnostics, context);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateSessionLayerEFSMState(SessionLayerEFSMState sessionLayerEFSMState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(sessionLayerEFSMState, diagnostics, context);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateBehaviorModelExitState(BehaviorModelExitState behaviorModelExitState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(behaviorModelExitState, diagnostics, context);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateBehaviorModelState(BehaviorModelState behaviorModelState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(behaviorModelState, diagnostics, context);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateProtocolExitState(ProtocolExitState protocolExitState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(protocolExitState, diagnostics, context);
	}

    /**
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    public boolean validateProtocolLayerEFSMState(ProtocolLayerEFSMState protocolLayerEFSMState, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(protocolLayerEFSMState, diagnostics, context);
	}

    /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuardActionParameter(GuardActionParameter guardActionParameter, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(guardActionParameter, diagnostics, context);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuard(Guard guard, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(guard, diagnostics, context);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAction(Action action, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(action, diagnostics, context);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuardActionParameterList(GuardActionParameterList guardActionParameterList, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(guardActionParameterList, diagnostics, context);
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGuardActionParameterType(GuardActionParameterType guardActionParameterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

				/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateParameterType(ParameterType parameterType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

				/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
	 * @generated
	 */
    @Override
    public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //M4jdslValidator
