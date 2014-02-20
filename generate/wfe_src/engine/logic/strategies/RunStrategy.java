package engine.logic.strategies;

import engine.gen.Node;
import engine.gen.Arc;

public class RunStrategy implements IOperationStrategy {

	@Override
	public boolean execute(Object owner) {
		if(owner != null && owner instanceof Node) {
			Node node = (Node) owner;
			Boolean success = node.execute();
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
		return false;
	}

}
