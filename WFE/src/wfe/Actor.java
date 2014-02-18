/**
 */
package wfe;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link wfe.Actor#getFirst_name <em>First name</em>}</li>
 *   <li>{@link wfe.Actor#getLast_name <em>Last name</em>}</li>
 * </ul>
 * </p>
 *
 * @see wfe.WfePackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends Resource {
	/**
	 * Returns the value of the '<em><b>First name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First name</em>' attribute.
	 * @see #setFirst_name(String)
	 * @see wfe.WfePackage#getActor_First_name()
	 * @model
	 * @generated
	 */
	String getFirst_name();

	/**
	 * Sets the value of the '{@link wfe.Actor#getFirst_name <em>First name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First name</em>' attribute.
	 * @see #getFirst_name()
	 * @generated
	 */
	void setFirst_name(String value);

	/**
	 * Returns the value of the '<em><b>Last name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last name</em>' attribute.
	 * @see #setLast_name(String)
	 * @see wfe.WfePackage#getActor_Last_name()
	 * @model
	 * @generated
	 */
	String getLast_name();

	/**
	 * Sets the value of the '{@link wfe.Actor#getLast_name <em>Last name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last name</em>' attribute.
	 * @see #getLast_name()
	 * @generated
	 */
	void setLast_name(String value);

} // Actor
