/**
 */
package petrinet;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link petrinet.Transition#getSeconds <em>Seconds</em>}</li>
 * </ul>
 * </p>
 *
 * @see petrinet.PetrinetPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends Node {

	/**
	 * Returns the value of the '<em><b>Seconds</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seconds</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seconds</em>' attribute list.
	 * @see petrinet.PetrinetPackage#getTransition_Seconds()
	 * @model default="0"
	 * @generated
	 */
	EList<Double> getSeconds();
} // Transition
