/**
 */
package wfe;



/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link wfe.Gate#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see wfe.WfePackage#getGate()
 * @model
 * @generated
 */
public interface Gate extends Activity {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' reference.
	 * @see #setCondition(Expression)
	 * @see wfe.WfePackage#getGate_Condition()
	 * @model required="true"
	 * @generated
	 */
	Expression getCondition();

	/**
	 * Sets the value of the '{@link wfe.Gate#getCondition <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(Expression value);

} // Gate
