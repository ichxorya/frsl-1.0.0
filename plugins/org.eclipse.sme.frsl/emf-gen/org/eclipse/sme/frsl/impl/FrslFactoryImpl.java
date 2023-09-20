/**
 * generated by Xtext 2.25.0
 */
package org.eclipse.sme.frsl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.sme.frsl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FrslFactoryImpl extends EFactoryImpl implements FrslFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FrslFactory init() {
		try {
			FrslFactory theFrslFactory = (FrslFactory) EPackage.Registry.INSTANCE.getEFactory(FrslPackage.eNS_URI);
			if (theFrslFactory != null) {
				return theFrslFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FrslFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrslFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case FrslPackage.FRSL_MODEL:
			return createFrslModel();
		case FrslPackage.USECASE:
			return createUsecase();
		case FrslPackage.USECASE_PRECONDITION:
			return createUsecasePrecondition();
		case FrslPackage.USECASE_POSTCONDITION:
			return createUsecasePostcondition();
		case FrslPackage.STEP:
			return createStep();
		case FrslPackage.INCLUDE:
			return createInclude();
		case FrslPackage.EXTEND:
			return createExtend();
		case FrslPackage.EXTENSION_POINT:
			return createExtensionPoint();
		case FrslPackage.ALT_FLOW:
			return createAltFlow();
		case FrslPackage.SNAPSHOT_PATTERN:
			return createSnapshotPattern();
		case FrslPackage.OBJ_VAR:
			return createObjVar();
		case FrslPackage.VAR_LINK:
			return createVarLink();
		case FrslPackage.ACTOR:
			return createActor();
		case FrslPackage.ACTION:
			return createAction();
		case FrslPackage.ACTOR_ACTION:
			return createActorAction();
		case FrslPackage.SYSTEM_ACTION:
			return createSystemAction();
		case FrslPackage.REJOIN_STEP:
			return createRejoinStep();
		case FrslPackage.UC_STEP:
			return createUCStep();
		case FrslPackage.ACT_STEP:
			return createActStep();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrslModel createFrslModel() {
		FrslModelImpl frslModel = new FrslModelImpl();
		return frslModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usecase createUsecase() {
		UsecaseImpl usecase = new UsecaseImpl();
		return usecase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsecasePrecondition createUsecasePrecondition() {
		UsecasePreconditionImpl usecasePrecondition = new UsecasePreconditionImpl();
		return usecasePrecondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UsecasePostcondition createUsecasePostcondition() {
		UsecasePostconditionImpl usecasePostcondition = new UsecasePostconditionImpl();
		return usecasePostcondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Step createStep() {
		StepImpl step = new StepImpl();
		return step;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Include createInclude() {
		IncludeImpl include = new IncludeImpl();
		return include;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Extend createExtend() {
		ExtendImpl extend = new ExtendImpl();
		return extend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExtensionPoint createExtensionPoint() {
		ExtensionPointImpl extensionPoint = new ExtensionPointImpl();
		return extensionPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AltFlow createAltFlow() {
		AltFlowImpl altFlow = new AltFlowImpl();
		return altFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SnapshotPattern createSnapshotPattern() {
		SnapshotPatternImpl snapshotPattern = new SnapshotPatternImpl();
		return snapshotPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ObjVar createObjVar() {
		ObjVarImpl objVar = new ObjVarImpl();
		return objVar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VarLink createVarLink() {
		VarLinkImpl varLink = new VarLinkImpl();
		return varLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Actor createActor() {
		ActorImpl actor = new ActorImpl();
		return actor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActorAction createActorAction() {
		ActorActionImpl actorAction = new ActorActionImpl();
		return actorAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SystemAction createSystemAction() {
		SystemActionImpl systemAction = new SystemActionImpl();
		return systemAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RejoinStep createRejoinStep() {
		RejoinStepImpl rejoinStep = new RejoinStepImpl();
		return rejoinStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public UCStep createUCStep() {
		UCStepImpl ucStep = new UCStepImpl();
		return ucStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActStep createActStep() {
		ActStepImpl actStep = new ActStepImpl();
		return actStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FrslPackage getFrslPackage() {
		return (FrslPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FrslPackage getPackage() {
		return FrslPackage.eINSTANCE;
	}

} //FrslFactoryImpl
