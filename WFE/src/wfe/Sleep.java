/**
 */
package wfe;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sleep</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link wfe.Sleep#getSeconds <em>Seconds</em>}</li>
 * </ul>
 * </p>
 *
 * @see wfe.WfePackage#getSleep()
 * @model
 * @generated
 */
public interface Sleep extends Activity {
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
	 * @see wfe.WfePackage#getSleep_Seconds()
	 * @model default="0"
	 * @generated
	 */
	EList<Double> getSeconds();

} // Sleep
