/**
 */
package wfe;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Set Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link wfe.SetVariable#getSets_variable <em>Sets variable</em>}</li>
 *   <li>{@link wfe.SetVariable#getSets_expression <em>Sets expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see wfe.WfePackage#getSetVariable()
 * @model
 * @generated
 */
public interface SetVariable extends Activity {
	/**
	 * Returns the value of the '<em><b>Sets variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sets variable</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sets variable</em>' reference.
	 * @see #setSets_variable(Variable)
	 * @see wfe.WfePackage#getSetVariable_Sets_variable()
	 * @model required="true"
	 * @generated
	 */
	Variable getSets_variable();

	/**
	 * Sets the value of the '{@link wfe.SetVariable#getSets_variable <em>Sets variable</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sets variable</em>' reference.
	 * @see #getSets_variable()
	 * @generated
	 */
	void setSets_variable(Variable value);

	/**
	 * Returns the value of the '<em><b>Sets expression</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sets expression</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sets expression</em>' reference.
	 * @see #setSets_expression(Expression)
	 * @see wfe.WfePackage#getSetVariable_Sets_expression()
	 * @model
	 * @generated
	 */
	Expression getSets_expression();

	/**
	 * Sets the value of the '{@link wfe.SetVariable#getSets_expression <em>Sets expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sets expression</em>' reference.
	 * @see #getSets_expression()
	 * @generated
	 */
	void setSets_expression(Expression value);

} // SetVariable
