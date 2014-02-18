/**
 */
package wfe.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wfe.Expression;
import wfe.SetVariable;
import wfe.Variable;
import wfe.WfePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Variable</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link wfe.impl.SetVariableImpl#getSets_variable <em>Sets variable</em>}</li>
 *   <li>{@link wfe.impl.SetVariableImpl#getSets_expression <em>Sets expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetVariableImpl extends ActivityImpl implements SetVariable {
	/**
	 * The cached value of the '{@link #getSets_variable() <em>Sets variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSets_variable()
	 * @generated
	 * @ordered
	 */
	protected Variable sets_variable;

	/**
	 * The cached value of the '{@link #getSets_expression() <em>Sets expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSets_expression()
	 * @generated
	 * @ordered
	 */
	protected Expression sets_expression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetVariableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WfePackage.Literals.SET_VARIABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable getSets_variable() {
		if (sets_variable != null && sets_variable.eIsProxy()) {
			InternalEObject oldSets_variable = (InternalEObject)sets_variable;
			sets_variable = (Variable)eResolveProxy(oldSets_variable);
			if (sets_variable != oldSets_variable) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WfePackage.SET_VARIABLE__SETS_VARIABLE, oldSets_variable, sets_variable));
			}
		}
		return sets_variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable basicGetSets_variable() {
		return sets_variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSets_variable(Variable newSets_variable) {
		Variable oldSets_variable = sets_variable;
		sets_variable = newSets_variable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfePackage.SET_VARIABLE__SETS_VARIABLE, oldSets_variable, sets_variable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getSets_expression() {
		if (sets_expression != null && sets_expression.eIsProxy()) {
			InternalEObject oldSets_expression = (InternalEObject)sets_expression;
			sets_expression = (Expression)eResolveProxy(oldSets_expression);
			if (sets_expression != oldSets_expression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WfePackage.SET_VARIABLE__SETS_EXPRESSION, oldSets_expression, sets_expression));
			}
		}
		return sets_expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetSets_expression() {
		return sets_expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSets_expression(Expression newSets_expression) {
		Expression oldSets_expression = sets_expression;
		sets_expression = newSets_expression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WfePackage.SET_VARIABLE__SETS_EXPRESSION, oldSets_expression, sets_expression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WfePackage.SET_VARIABLE__SETS_VARIABLE:
				if (resolve) return getSets_variable();
				return basicGetSets_variable();
			case WfePackage.SET_VARIABLE__SETS_EXPRESSION:
				if (resolve) return getSets_expression();
				return basicGetSets_expression();
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
			case WfePackage.SET_VARIABLE__SETS_VARIABLE:
				setSets_variable((Variable)newValue);
				return;
			case WfePackage.SET_VARIABLE__SETS_EXPRESSION:
				setSets_expression((Expression)newValue);
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
			case WfePackage.SET_VARIABLE__SETS_VARIABLE:
				setSets_variable((Variable)null);
				return;
			case WfePackage.SET_VARIABLE__SETS_EXPRESSION:
				setSets_expression((Expression)null);
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
			case WfePackage.SET_VARIABLE__SETS_VARIABLE:
				return sets_variable != null;
			case WfePackage.SET_VARIABLE__SETS_EXPRESSION:
				return sets_expression != null;
		}
		return super.eIsSet(featureID);
	}

} //SetVariableImpl
