package engine.logic.strategies;

import engine.gen.*;

/**
 * Class models a logical AND operation-strategy to be used by a Workflow
 * @author Johannes Westlund
 *
 */
public class AndStrategy implements IOperationStrategy{
	
	/**
	 * Standard injection-method. 
	 * @param owner Object to which the strategy is being injected
	 * @return Success
	 */
	@Override
	public boolean execute(Object owner){
		boolean outcome = false;
		
		if(owner instanceof Node){
			Node n = (Node) owner;
			n.setStarted(true);
			
			if(this.getLhs().calculate() && this.getRhs().calculate()){
				outcome = true;
			}
			n.setSuccess(outcome);
			n.setFinished(true);
		}else{
			throw new IllegalArgumentException("The supplied owner is not a node");
		}
		return outcome;
	}
}
