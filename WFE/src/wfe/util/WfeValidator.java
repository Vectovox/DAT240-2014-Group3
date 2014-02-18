/**
 */
package wfe.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import wfe.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see wfe.WfePackage
 * @generated
 */
public class WfeValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final WfeValidator INSTANCE = new WfeValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "wfe";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WfeValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return WfePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case WfePackage.ARC:
				return validateArc((Arc)value, diagnostics, context);
			case WfePackage.WORKFLOW:
				return validateWorkflow((Workflow)value, diagnostics, context);
			case WfePackage.ACTIVITY:
				return validateActivity((Activity)value, diagnostics, context);
			case WfePackage.GATE:
				return validateGate((Gate)value, diagnostics, context);
			case WfePackage.CUSTOM:
				return validateCustom((Custom)value, diagnostics, context);
			case WfePackage.SLEEP:
				return validateSleep((Sleep)value, diagnostics, context);
			case WfePackage.START_NODE:
				return validateStartNode((StartNode)value, diagnostics, context);
			case WfePackage.END_NODE:
				return validateEndNode((EndNode)value, diagnostics, context);
			case WfePackage.SYNCHBAR:
				return validateSynchbar((Synchbar)value, diagnostics, context);
			case WfePackage.RESOURCE:
				return validateResource((Resource)value, diagnostics, context);
			case WfePackage.ACTOR:
				return validateActor((Actor)value, diagnostics, context);
			case WfePackage.ITEM:
				return validateItem((Item)value, diagnostics, context);
			case WfePackage.NODE:
				return validateNode((Node)value, diagnostics, context);
			case WfePackage.CONFIRM:
				return validateConfirm((Confirm)value, diagnostics, context);
			case WfePackage.EXPRESSION:
				return validateExpression((Expression)value, diagnostics, context);
			case WfePackage.OPERATOR:
				return validateOperator((Operator)value, diagnostics, context);
			case WfePackage.BINARY_OPERATOR:
				return validateBinaryOperator((BinaryOperator)value, diagnostics, context);
			case WfePackage.NOT:
				return validateNOT((NOT)value, diagnostics, context);
			case WfePackage.AND:
				return validateAND((AND)value, diagnostics, context);
			case WfePackage.OR:
				return validateOR((OR)value, diagnostics, context);
			case WfePackage.XOR:
				return validateXOR((XOR)value, diagnostics, context);
			case WfePackage.NOR:
				return validateNOR((NOR)value, diagnostics, context);
			case WfePackage.NAND:
				return validateNAND((NAND)value, diagnostics, context);
			case WfePackage.VALUE:
				return validateValue((Value)value, diagnostics, context);
			case WfePackage.SET_VARIABLE:
				return validateSetVariable((SetVariable)value, diagnostics, context);
			case WfePackage.TRUE:
				return validateTrue((True)value, diagnostics, context);
			case WfePackage.VARIABLE:
				return validateVariable((Variable)value, diagnostics, context);
			case WfePackage.FALSE:
				return validateFalse((False)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateArc(Arc arc, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(arc, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflow(Workflow workflow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(workflow, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validateWorkflow_exactly_one_startnode(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validateWorkflow_at_least_one_endnode(workflow, diagnostics, context);
		if (result || diagnostics != null) result &= validateWorkflow_too_few_arcs(workflow, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the exactly_one_startnode constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WORKFLOW__EXACTLY_ONE_STARTNODE__EEXPRESSION = "\n" +
		"\t\t\tself.contains_nodes->select(n|n.oclIsTypeOf(StartNode))->size()=1";

	/**
	 * Validates the exactly_one_startnode constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflow_exactly_one_startnode(Workflow workflow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WfePackage.Literals.WORKFLOW,
				 workflow,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "exactly_one_startnode",
				 WORKFLOW__EXACTLY_ONE_STARTNODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the at_least_one_endnode constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WORKFLOW__AT_LEAST_ONE_ENDNODE__EEXPRESSION = "\n" +
		"\t\t\tself.contains_nodes->select(n|n.oclIsTypeOf(EndNode))->size()>0";

	/**
	 * Validates the at_least_one_endnode constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflow_at_least_one_endnode(Workflow workflow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WfePackage.Literals.WORKFLOW,
				 workflow,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "at_least_one_endnode",
				 WORKFLOW__AT_LEAST_ONE_ENDNODE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the too_few_arcs constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String WORKFLOW__TOO_FEW_ARCS__EEXPRESSION = "\n" +
		"\t\t\t (self.contains_arcs->size()) >= (self.contains_nodes->size()-1)";

	/**
	 * Validates the too_few_arcs constraint of '<em>Workflow</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkflow_too_few_arcs(Workflow workflow, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WfePackage.Literals.WORKFLOW,
				 workflow,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "too_few_arcs",
				 WORKFLOW__TOO_FEW_ARCS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVariable(Variable variable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(variable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFalse(False false_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(false_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(false_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(false_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(false_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(false_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(false_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(false_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(false_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(false_, diagnostics, context);
		if (result || diagnostics != null) result &= validateFalse_value_is_false(false_, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the value_is_false constraint of '<em>False</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String FALSE__VALUE_IS_FALSE__EEXPRESSION = "\n" +
		"\t\t\tself.value = false";

	/**
	 * Validates the value_is_false constraint of '<em>False</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFalse_value_is_false(False false_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WfePackage.Literals.FALSE,
				 false_,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "value_is_false",
				 FALSE__VALUE_IS_FALSE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivity(Activity activity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(activity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivity_at_least_one_incoming_arc(activity, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivity_at_least_one_outgoing_arc(activity, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the at_least_one_incoming_arc constraint of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTIVITY__AT_LEAST_ONE_INCOMING_ARC__EEXPRESSION = "\n" +
		"\t\t\tself.incoming->size() > 0";

	/**
	 * Validates the at_least_one_incoming_arc constraint of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivity_at_least_one_incoming_arc(Activity activity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WfePackage.Literals.ACTIVITY,
				 activity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "at_least_one_incoming_arc",
				 ACTIVITY__AT_LEAST_ONE_INCOMING_ARC__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the at_least_one_outgoing_arc constraint of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String ACTIVITY__AT_LEAST_ONE_OUTGOING_ARC__EEXPRESSION = "\n" +
		"\t\t\tself.outgoing->size() > 0";

	/**
	 * Validates the at_least_one_outgoing_arc constraint of '<em>Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActivity_at_least_one_outgoing_arc(Activity activity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WfePackage.Literals.ACTIVITY,
				 activity,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "at_least_one_outgoing_arc",
				 ACTIVITY__AT_LEAST_ONE_OUTGOING_ARC__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGate(Gate gate, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(gate, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivity_at_least_one_incoming_arc(gate, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivity_at_least_one_outgoing_arc(gate, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCustom(Custom custom, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(custom, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(custom, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(custom, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(custom, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(custom, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(custom, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(custom, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(custom, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(custom, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivity_at_least_one_incoming_arc(custom, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivity_at_least_one_outgoing_arc(custom, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSleep(Sleep sleep, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(sleep, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(sleep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(sleep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(sleep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(sleep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(sleep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(sleep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(sleep, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(sleep, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivity_at_least_one_incoming_arc(sleep, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivity_at_least_one_outgoing_arc(sleep, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartNode(StartNode startNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(startNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(startNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(startNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(startNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(startNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(startNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(startNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(startNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(startNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateStartNode_at_least_one_outgoing(startNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateStartNode_no_incoming_arcs(startNode, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the at_least_one_outgoing constraint of '<em>Start Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String START_NODE__AT_LEAST_ONE_OUTGOING__EEXPRESSION = "\n" +
		"\t\t\tself.outgoing->size() > 0";

	/**
	 * Validates the at_least_one_outgoing constraint of '<em>Start Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartNode_at_least_one_outgoing(StartNode startNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WfePackage.Literals.START_NODE,
				 startNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "at_least_one_outgoing",
				 START_NODE__AT_LEAST_ONE_OUTGOING__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the no_incoming_arcs constraint of '<em>Start Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String START_NODE__NO_INCOMING_ARCS__EEXPRESSION = "\n" +
		"\t\t\tself.incoming->size() = 0";

	/**
	 * Validates the no_incoming_arcs constraint of '<em>Start Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStartNode_no_incoming_arcs(StartNode startNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WfePackage.Literals.START_NODE,
				 startNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "no_incoming_arcs",
				 START_NODE__NO_INCOMING_ARCS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndNode(EndNode endNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(endNode, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(endNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(endNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(endNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(endNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(endNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(endNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(endNode, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(endNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndNode_at_least_one_incoming(endNode, diagnostics, context);
		if (result || diagnostics != null) result &= validateEndNode_no_outgoing_arcs(endNode, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the at_least_one_incoming constraint of '<em>End Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String END_NODE__AT_LEAST_ONE_INCOMING__EEXPRESSION = "\n" +
		"\t\t\tself.incoming->size() > 0";

	/**
	 * Validates the at_least_one_incoming constraint of '<em>End Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndNode_at_least_one_incoming(EndNode endNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WfePackage.Literals.END_NODE,
				 endNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "at_least_one_incoming",
				 END_NODE__AT_LEAST_ONE_INCOMING__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * The cached validation expression for the no_outgoing_arcs constraint of '<em>End Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String END_NODE__NO_OUTGOING_ARCS__EEXPRESSION = "\n" +
		"\t\t\tself.outgoing->size() = 0";

	/**
	 * Validates the no_outgoing_arcs constraint of '<em>End Node</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEndNode_no_outgoing_arcs(EndNode endNode, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WfePackage.Literals.END_NODE,
				 endNode,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "no_outgoing_arcs",
				 END_NODE__NO_OUTGOING_ARCS__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSynchbar(Synchbar synchbar, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(synchbar, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(synchbar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(synchbar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(synchbar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(synchbar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(synchbar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(synchbar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(synchbar, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(synchbar, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivity_at_least_one_incoming_arc(synchbar, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivity_at_least_one_outgoing_arc(synchbar, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResource(Resource resource, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resource, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateActor(Actor actor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(actor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateItem(Item item, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(item, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNode(Node node, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(node, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateConfirm(Confirm confirm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(confirm, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(confirm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(confirm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(confirm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(confirm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(confirm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(confirm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(confirm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(confirm, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivity_at_least_one_incoming_arc(confirm, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivity_at_least_one_outgoing_arc(confirm, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpression(Expression expression, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(expression, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOperator(Operator operator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(operator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBinaryOperator(BinaryOperator binaryOperator, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(binaryOperator, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNOT(NOT not, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(not, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAND(AND and, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(and, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateOR(OR or, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(or, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateXOR(XOR xor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(xor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNOR(NOR nor, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nor, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNAND(NAND nand, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(nand, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateValue(Value value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(value, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSetVariable(SetVariable setVariable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(setVariable, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(setVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(setVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(setVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(setVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(setVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(setVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(setVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(setVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivity_at_least_one_incoming_arc(setVariable, diagnostics, context);
		if (result || diagnostics != null) result &= validateActivity_at_least_one_outgoing_arc(setVariable, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrue(True true_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(true_, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(true_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(true_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(true_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(true_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(true_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(true_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(true_, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(true_, diagnostics, context);
		if (result || diagnostics != null) result &= validateTrue_value_is_true(true_, diagnostics, context);
		return result;
	}

	/**
	 * The cached validation expression for the value_is_true constraint of '<em>True</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final String TRUE__VALUE_IS_TRUE__EEXPRESSION = "\n" +
		"\t\t\tself.value=true";

	/**
	 * Validates the value_is_true constraint of '<em>True</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTrue_value_is_true(True true_, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return
			validate
				(WfePackage.Literals.TRUE,
				 true_,
				 diagnostics,
				 context,
				 "http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot",
				 "value_is_true",
				 TRUE__VALUE_IS_TRUE__EEXPRESSION,
				 Diagnostic.ERROR,
				 DIAGNOSTIC_SOURCE,
				 0);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //WfeValidator
