/**
 */
package wfe;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link wfe.Activity#getHas_assigned <em>Has assigned</em>}</li>
 *   <li>{@link wfe.Activity#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see wfe.WfePackage#getActivity()
 * @model abstract="true"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore constraints='at_least_one_incoming_arc at_least_one_outgoing_arc'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot at_least_one_incoming_arc='\n\t\t\tself.incoming->size() > 0' at_least_one_outgoing_arc='\n\t\t\tself.outgoing->size() > 0'"
 * @generated
 */
public interface Activity extends Node {
	/**
	 * Returns the value of the '<em><b>Has assigned</b></em>' reference list.
	 * The list contents are of type {@link wfe.Resource}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has assigned</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has assigned</em>' reference list.
	 * @see wfe.WfePackage#getActivity_Has_assigned()
	 * @model
	 * @generated
	 */
	EList<Resource> getHas_assigned();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see wfe.WfePackage#getActivity_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link wfe.Activity#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Activity
