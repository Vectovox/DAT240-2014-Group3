package engine.logic.strategies;
public class ConfirmStrategy implements IOperationStrategy {

	/**
	 * Shows a message dialog and thereby halts further execution
	 * of the subflow until OK is pressed.  
	 * @param owner Object to which the strategy is being injected
	 * @return true
	 */
	@Override
	public boolean execute(Object owner) {
		javax.swing.JOptionPane.showMessageDialog(null, "Confirm to continue!");
		return true;
	}

}
