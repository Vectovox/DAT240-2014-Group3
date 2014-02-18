/**
 */
package wfe;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>End Node</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see wfe.WfePackage#getEndNode()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='at_least_one_incoming no_outgoing_arcs'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot at_least_one_incoming='\n\t\t\tself.incoming->size() > 0' no_outgoing_arcs='\n\t\t\tself.outgoing->size() = 0'"
 * @generated
 */
public interface EndNode extends Node {

} // EndNode
