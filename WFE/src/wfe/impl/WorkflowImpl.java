/**
 */
package wfe.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import wfe.Arc;
import wfe.Expression;
import wfe.Node;
import wfe.Resource;
import wfe.WfePackage;
import wfe.Workflow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link wfe.impl.WorkflowImpl#getContains_arcs <em>Contains arcs</em>}</li>
 *   <li>{@link wfe.impl.WorkflowImpl#getHas_resources <em>Has resources</em>}</li>
 *   <li>{@link wfe.impl.WorkflowImpl#getContains_nodes <em>Contains nodes</em>}</li>
 *   <li>{@link wfe.impl.WorkflowImpl#getContains_expressions <em>Contains expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkflowImpl extends MinimalEObjectImpl.Container implements Workflow {
	/**
	 * The cached value of the '{@link #getContains_arcs() <em>Contains arcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains_arcs()
	 * @generated
	 * @ordered
	 */
	protected EList<Arc> contains_arcs;

	/**
	 * The cached value of the '{@link #getHas_resources() <em>Has resources</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas_resources()
	 * @generated
	 * @ordered
	 */
	protected EList<Resource> has_resources;

	/**
	 * The cached value of the '{@link #getContains_nodes() <em>Contains nodes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains_nodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> contains_nodes;

	/**
	 * The cached value of the '{@link #getContains_expressions() <em>Contains expressions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains_expressions()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> contains_expressions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkflowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WfePackage.Literals.WORKFLOW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Arc> getContains_arcs() {
		if (contains_arcs == null) {
			contains_arcs = new EObjectContainmentEList<Arc>(Arc.class, this, WfePackage.WORKFLOW__CONTAINS_ARCS);
		}
		return contains_arcs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Resource> getHas_resources() {
		if (has_resources == null) {
			has_resources = new EObjectContainmentEList<Resource>(Resource.class, this, WfePackage.WORKFLOW__HAS_RESOURCES);
		}
		return has_resources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getContains_nodes() {
		if (contains_nodes == null) {
			contains_nodes = new EObjectContainmentEList<Node>(Node.class, this, WfePackage.WORKFLOW__CONTAINS_NODES);
		}
		return contains_nodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Expression> getContains_expressions() {
		if (contains_expressions == null) {
			contains_expressions = new EObjectContainmentEList<Expression>(Expression.class, this, WfePackage.WORKFLOW__CONTAINS_EXPRESSIONS);
		}
		return contains_expressions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WfePackage.WORKFLOW__CONTAINS_ARCS:
				return ((InternalEList<?>)getContains_arcs()).basicRemove(otherEnd, msgs);
			case WfePackage.WORKFLOW__HAS_RESOURCES:
				return ((InternalEList<?>)getHas_resources()).basicRemove(otherEnd, msgs);
			case WfePackage.WORKFLOW__CONTAINS_NODES:
				return ((InternalEList<?>)getContains_nodes()).basicRemove(otherEnd, msgs);
			case WfePackage.WORKFLOW__CONTAINS_EXPRESSIONS:
				return ((InternalEList<?>)getContains_expressions()).basicRemove(otherEnd, msgs);
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
			case WfePackage.WORKFLOW__CONTAINS_ARCS:
				return getContains_arcs();
			case WfePackage.WORKFLOW__HAS_RESOURCES:
				return getHas_resources();
			case WfePackage.WORKFLOW__CONTAINS_NODES:
				return getContains_nodes();
			case WfePackage.WORKFLOW__CONTAINS_EXPRESSIONS:
				return getContains_expressions();
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
			case WfePackage.WORKFLOW__CONTAINS_ARCS:
				getContains_arcs().clear();
				getContains_arcs().addAll((Collection<? extends Arc>)newValue);
				return;
			case WfePackage.WORKFLOW__HAS_RESOURCES:
				getHas_resources().clear();
				getHas_resources().addAll((Collection<? extends Resource>)newValue);
				return;
			case WfePackage.WORKFLOW__CONTAINS_NODES:
				getContains_nodes().clear();
				getContains_nodes().addAll((Collection<? extends Node>)newValue);
				return;
			case WfePackage.WORKFLOW__CONTAINS_EXPRESSIONS:
				getContains_expressions().clear();
				getContains_expressions().addAll((Collection<? extends Expression>)newValue);
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
			case WfePackage.WORKFLOW__CONTAINS_ARCS:
				getContains_arcs().clear();
				return;
			case WfePackage.WORKFLOW__HAS_RESOURCES:
				getHas_resources().clear();
				return;
			case WfePackage.WORKFLOW__CONTAINS_NODES:
				getContains_nodes().clear();
				return;
			case WfePackage.WORKFLOW__CONTAINS_EXPRESSIONS:
				getContains_expressions().clear();
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
			case WfePackage.WORKFLOW__CONTAINS_ARCS:
				return contains_arcs != null && !contains_arcs.isEmpty();
			case WfePackage.WORKFLOW__HAS_RESOURCES:
				return has_resources != null && !has_resources.isEmpty();
			case WfePackage.WORKFLOW__CONTAINS_NODES:
				return contains_nodes != null && !contains_nodes.isEmpty();
			case WfePackage.WORKFLOW__CONTAINS_EXPRESSIONS:
				return contains_expressions != null && !contains_expressions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //WorkflowImpl
