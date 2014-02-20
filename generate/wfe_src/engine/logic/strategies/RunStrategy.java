package engine.logic.strategies;

import engine.gen.Node;
import engine.gen.Arc;

/**
 * This class takes care of the execution of a Node by setting flags and calling the appropiate strategy.
 *
 */
public class RunStrategy implements IOperationStrategy {

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
			
			//Setup flags 
			node.setStarted(true);
			node.setFinished(false);
			
			success = node.strategy();
			
			//Teardown
			node.setFinished(true);
			node.setSuccess(success);
			
			if (success){
				for (Arc arc : node.getOutgoing()) {
					new Thread(arc.getTarget());			
				}
			}
			else{
				//TODO log message
			}
		} else {
			throw new IllegalArgumentException("Parameter must be of class Node.");
		}
		
		return success;
	}

}
