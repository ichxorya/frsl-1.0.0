/**
 * generated by Xtext 2.25.0
 */
package org.eclipse.sme.frsl.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.sme.frsl.AltFlow;
import org.eclipse.sme.frsl.FrslPackage;
import org.eclipse.sme.frsl.RejoinStep;
import org.eclipse.sme.frsl.Step;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.eclipse.sme.frsl.impl.StepImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.sme.frsl.impl.StepImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.sme.frsl.impl.StepImpl#getPreStep <em>Pre Step</em>}</li>
 *   <li>{@link org.eclipse.sme.frsl.impl.StepImpl#getNextStep <em>Next Step</em>}</li>
 *   <li>{@link org.eclipse.sme.frsl.impl.StepImpl#getAltFlow <em>Alt Flow</em>}</li>
 *   <li>{@link org.eclipse.sme.frsl.impl.StepImpl#getRejoinFrom <em>Rejoin From</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StepImpl extends MinimalEObjectImpl.Container implements Step {
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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getNextStep() <em>Next Step</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextStep()
	 * @generated
	 * @ordered
	 */
	protected Step nextStep;

	/**
	 * The cached value of the '{@link #getAltFlow() <em>Alt Flow</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltFlow()
	 * @generated
	 * @ordered
	 */
	protected EList<AltFlow> altFlow;

	/**
	 * The cached value of the '{@link #getRejoinFrom() <em>Rejoin From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRejoinFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<RejoinStep> rejoinFrom;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FrslPackage.Literals.STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrslPackage.STEP__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrslPackage.STEP__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Step getPreStep() {
		if (eContainerFeatureID() != FrslPackage.STEP__PRE_STEP)
			return null;
		return (Step) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreStep(Step newPreStep, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newPreStep, FrslPackage.STEP__PRE_STEP, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPreStep(Step newPreStep) {
		if (newPreStep != eInternalContainer()
				|| (eContainerFeatureID() != FrslPackage.STEP__PRE_STEP && newPreStep != null)) {
			if (EcoreUtil.isAncestor(this, newPreStep))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newPreStep != null)
				msgs = ((InternalEObject) newPreStep).eInverseAdd(this, FrslPackage.STEP__NEXT_STEP, Step.class, msgs);
			msgs = basicSetPreStep(newPreStep, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrslPackage.STEP__PRE_STEP, newPreStep, newPreStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Step getNextStep() {
		return nextStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNextStep(Step newNextStep, NotificationChain msgs) {
		Step oldNextStep = nextStep;
		nextStep = newNextStep;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FrslPackage.STEP__NEXT_STEP,
					oldNextStep, newNextStep);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNextStep(Step newNextStep) {
		if (newNextStep != nextStep) {
			NotificationChain msgs = null;
			if (nextStep != null)
				msgs = ((InternalEObject) nextStep).eInverseRemove(this, FrslPackage.STEP__PRE_STEP, Step.class, msgs);
			if (newNextStep != null)
				msgs = ((InternalEObject) newNextStep).eInverseAdd(this, FrslPackage.STEP__PRE_STEP, Step.class, msgs);
			msgs = basicSetNextStep(newNextStep, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FrslPackage.STEP__NEXT_STEP, newNextStep,
					newNextStep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AltFlow> getAltFlow() {
		if (altFlow == null) {
			altFlow = new EObjectContainmentWithInverseEList<AltFlow>(AltFlow.class, this, FrslPackage.STEP__ALT_FLOW,
					FrslPackage.ALT_FLOW__BASE_STEP);
		}
		return altFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RejoinStep> getRejoinFrom() {
		if (rejoinFrom == null) {
			rejoinFrom = new EObjectWithInverseResolvingEList<RejoinStep>(RejoinStep.class, this,
					FrslPackage.STEP__REJOIN_FROM, FrslPackage.REJOIN_STEP__REJOIN_TO);
		}
		return rejoinFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FrslPackage.STEP__PRE_STEP:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetPreStep((Step) otherEnd, msgs);
		case FrslPackage.STEP__NEXT_STEP:
			if (nextStep != null)
				msgs = ((InternalEObject) nextStep).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - FrslPackage.STEP__NEXT_STEP, null, msgs);
			return basicSetNextStep((Step) otherEnd, msgs);
		case FrslPackage.STEP__ALT_FLOW:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAltFlow()).basicAdd(otherEnd, msgs);
		case FrslPackage.STEP__REJOIN_FROM:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getRejoinFrom()).basicAdd(otherEnd, msgs);
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
		case FrslPackage.STEP__PRE_STEP:
			return basicSetPreStep(null, msgs);
		case FrslPackage.STEP__NEXT_STEP:
			return basicSetNextStep(null, msgs);
		case FrslPackage.STEP__ALT_FLOW:
			return ((InternalEList<?>) getAltFlow()).basicRemove(otherEnd, msgs);
		case FrslPackage.STEP__REJOIN_FROM:
			return ((InternalEList<?>) getRejoinFrom()).basicRemove(otherEnd, msgs);
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
		case FrslPackage.STEP__PRE_STEP:
			return eInternalContainer().eInverseRemove(this, FrslPackage.STEP__NEXT_STEP, Step.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FrslPackage.STEP__NAME:
			return getName();
		case FrslPackage.STEP__DESCRIPTION:
			return getDescription();
		case FrslPackage.STEP__PRE_STEP:
			return getPreStep();
		case FrslPackage.STEP__NEXT_STEP:
			return getNextStep();
		case FrslPackage.STEP__ALT_FLOW:
			return getAltFlow();
		case FrslPackage.STEP__REJOIN_FROM:
			return getRejoinFrom();
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
		case FrslPackage.STEP__NAME:
			setName((String) newValue);
			return;
		case FrslPackage.STEP__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case FrslPackage.STEP__PRE_STEP:
			setPreStep((Step) newValue);
			return;
		case FrslPackage.STEP__NEXT_STEP:
			setNextStep((Step) newValue);
			return;
		case FrslPackage.STEP__ALT_FLOW:
			getAltFlow().clear();
			getAltFlow().addAll((Collection<? extends AltFlow>) newValue);
			return;
		case FrslPackage.STEP__REJOIN_FROM:
			getRejoinFrom().clear();
			getRejoinFrom().addAll((Collection<? extends RejoinStep>) newValue);
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
		case FrslPackage.STEP__NAME:
			setName(NAME_EDEFAULT);
			return;
		case FrslPackage.STEP__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case FrslPackage.STEP__PRE_STEP:
			setPreStep((Step) null);
			return;
		case FrslPackage.STEP__NEXT_STEP:
			setNextStep((Step) null);
			return;
		case FrslPackage.STEP__ALT_FLOW:
			getAltFlow().clear();
			return;
		case FrslPackage.STEP__REJOIN_FROM:
			getRejoinFrom().clear();
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
		case FrslPackage.STEP__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case FrslPackage.STEP__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case FrslPackage.STEP__PRE_STEP:
			return getPreStep() != null;
		case FrslPackage.STEP__NEXT_STEP:
			return nextStep != null;
		case FrslPackage.STEP__ALT_FLOW:
			return altFlow != null && !altFlow.isEmpty();
		case FrslPackage.STEP__REJOIN_FROM:
			return rejoinFrom != null && !rejoinFrom.isEmpty();
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //StepImpl
