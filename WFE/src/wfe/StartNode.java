/**
 */
package wfe;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Start Node</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see wfe.WfePackage#getStartNode()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='at_least_one_outgoing no_incoming_arcs'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot at_least_one_outgoing='\n\t\t\tself.outgoing->size() > 0' no_incoming_arcs='\n\t\t\tself.incoming->size() = 0'"
 * @generated
 */
public interface StartNode extends Node {

} // StartNode
