package engine.logic.strategies;
public class ConfirmStrategy implements IOperationStrategy {

	@Override
	public boolean execute(Object owner) {
		javax.swing.JOptionPane.showMessageDialog(null, "Confirm to continue!");
		return true;
	}

}
