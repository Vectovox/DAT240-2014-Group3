package engine.logic.strategies;

import java.util.List;
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
			logger.log(Level.INFO, "ENTERED NODE: "+node.getName()+" ("+node.getClass()+")");
			logger.log(Level.INFO, "RESETTING FLAGS for: "+node.getName()+" ("+node.getClass()+")");
			
			//Setup flags 
			node.setStarted(true);
			node.setFinished(false);
			
			logger.log(Level.INFO, "STARTING EXECUTION for: "+node.getName()+" ("+node.getClass()+")");
			success = node.strategy();
			
			//Teardown
			node.setFinished(true);
			node.setSuccess(success);
			
			if (success){
				logger.log(Level.INFO, "EXECUTION FINISHED for: "+node.getName()+" ("+node.getClass()+")");
				
				//Get outgoing arcs of (this) finished node
				List<Arc> outgoing = node.getOutgoing();
				if(outgoing != null && outgoing.size() > 0) {
					for (Arc arc : node.getOutgoing()) {
						logger.log(Level.INFO, "STARTING NEW THREAD: "+arc.getTarget().getName()+" ("+arc.getTarget().getClass()+")"+" FROM: "+node.getName()+" ("+node.getClass()+")");
						Thread thread = new Thread(arc.getTarget());
						thread.start();
					}
				} else {
					logger.log(Level.INFO, "NO OUTGOING ARCS, THIS IS THE END");
					//OCL Guarantees that Activities and StartNode have >0 outgoing => This is an EndNode
					// => Exit Workflow. TODO: Terminate in EndNodes Strategy instead?
					System.exit(0);
				}
			}
			else{
				logger.log(Level.WARNING, "EXECUTION RETURNED UNSUCCESSFUL, NO NEW THREAD STARTED in: "+node.getName()+" ("+node.getClass()+")");
			}
		} else {
			throw new IllegalArgumentException("Parameter must be of class Node.");
		}
		
		return success;
	}

}
