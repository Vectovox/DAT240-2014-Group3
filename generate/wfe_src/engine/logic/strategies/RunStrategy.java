package engine.logic.strategies;

import java.util.logging.Level;
import java.util.logging.Logger;

import engine.gen.Arc;
import engine.gen.Node;

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
		Logger logger = Logger.getLogger("NodeLogger");
		
		if(owner != null && owner instanceof Node) {
			Node node = (Node) owner;
			logger.log(Level.INFO, "ENTERED NODE: "+node.getClass());
			logger.log(Level.INFO, "RESETTING FLAGS for: "+node.getClass());
			
			//Setup flags 
			node.setStarted(true);
			node.setFinished(false);
			
			logger.log(Level.INFO, "STARTING EXECUTION for: "+node.getClass());
			success = node.strategy();
			
			//Teardown
			node.setFinished(true);
			node.setSuccess(success);
			
			if (success){
				logger.log(Level.INFO, "EXECUTION FINISHED for: "+node.getName());
				for (Arc arc : node.getOutgoing()) {
					logger.log(Level.INFO, "STARTING NEW THREAD for: "+arc.getTarget().getName());
					Thread thread = new Thread(arc.getTarget());
					thread.start();
				}
			}
			else{
				logger.log(Level.WARNING, "EXECUTION RETURNED UNSUCCESSFUL, NO NEW THREAD STARTED");
			}
		} else {
			throw new IllegalArgumentException("Parameter must be of class Node.");
		}
		
		return success;
	}

}
