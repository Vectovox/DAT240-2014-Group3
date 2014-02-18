/**
 */
package wfe;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link wfe.Workflow#getContains_arcs <em>Contains arcs</em>}</li>
 *   <li>{@link wfe.Workflow#getHas_resources <em>Has resources</em>}</li>
 *   <li>{@link wfe.Workflow#getContains_nodes <em>Contains nodes</em>}</li>
 *   <li>{@link wfe.Workflow#getContains_expressions <em>Contains expressions</em>}</li>
 * </ul>
 * </p>
 *
 * @see wfe.WfePackage#getWorkflow()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='exactly_one_startnode at_least_one_endnode too_few_arcs'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot exactly_one_startnode='\n\t\t\tself.contains_nodes->select(n|n.oclIsTypeOf(StartNode))->size()=1' at_least_one_endnode='\n\t\t\tself.contains_nodes->select(n|n.oclIsTypeOf(EndNode))->size()>0' too_few_arcs='\n\t\t\t (self.contains_arcs->size()) >= (self.contains_nodes->size()-1)'"
 * @generated
 */
public interface Workflow extends EObject {
	/**
	 * Returns the value of the '<em><b>Contains arcs</b></em>' containment reference list.
	 * The list contents are of type {@link wfe.Arc}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains arcs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains arcs</em>' containment reference list.
	 * @see wfe.WfePackage#getWorkflow_Contains_arcs()
	 * @model containment="true"
	 * @generated
	 */
	EList<Arc> getContains_arcs();

	/**
	 * Returns the value of the '<em><b>Has resources</b></em>' containment reference list.
	 * The list contents are of type {@link wfe.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has resources</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has resources</em>' containment reference list.
	 * @see wfe.WfePackage#getWorkflow_Has_resources()
	 * @model containment="true"
	 * @generated
	 */
	EList<Resource> getHas_resources();

	/**
	 * Returns the value of the '<em><b>Contains nodes</b></em>' containment reference list.
	 * The list contents are of type {@link wfe.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains nodes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains nodes</em>' containment reference list.
	 * @see wfe.WfePackage#getWorkflow_Contains_nodes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Node> getContains_nodes();

	/**
	 * Returns the value of the '<em><b>Contains expressions</b></em>' containment reference list.
	 * The list contents are of type {@link wfe.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains expressions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains expressions</em>' containment reference list.
	 * @see wfe.WfePackage#getWorkflow_Contains_expressions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getContains_expressions();

} // Workflow
