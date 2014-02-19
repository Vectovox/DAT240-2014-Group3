package engine.logic.strategies;

/**
 * 
 * A Strategy that does nothing except returning true.
 *
 */
public class DefaultStrategy implements IOperationStrategy {

	/**
	 * Default injection-method. 
	 * @param owner Object to which the strategy is being injected
	 * @return true
	 */
	@Override
	public boolean execute(Object owner) {
		// Do nothing
		return true;
	}

}
