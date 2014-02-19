package engine.logic.strategies;

/**
 * The interface that is implemented by all Strategies. 
 *
 */
public interface IOperationStrategy {
	
	public boolean execute(Object owner);

}