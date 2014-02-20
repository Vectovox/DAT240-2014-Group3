package engine.logic.strategies;

import engine.gen.Node;

/**
 * This strategy takes care of setting the appropiate flags of a Node before and after executing its strategy.
 * @author Gustav Sundin
 *
 */
public class NodeStrategy implements IOperationStrategy {

	/**
	 * This method first sets the flags of the Node to indicate that it has begun executing.
	 * Then it calls the strategy method belong to the specific subclass of Node performing this strategy.
	 * Lastly the method sets the flags to indicate that the Node is done.
	 * @param owner the Node executing the strategy
	 * @return true if the called strategy returns true
	 * @throws IllegalArgumentException if input object is not a Node
	 */
	@Override
	public boolean execute(Object owner) {
		boolean success = false; 
		
		if(owner != null && owner instanceof Node) {
			Node node = (Node) owner;
			
			//Setup
			node.setStarted(true);
			node.setFinished(false);
			
			//Execute node-specific strategy
			success = node.strategy();
			
			//Teardown
			node.setFinished(true);
			node.setSuccess(success);			
		} else {
			throw new IllegalArgumentException("The supplied owner is not a node");
		}
		return success;
	}

}
