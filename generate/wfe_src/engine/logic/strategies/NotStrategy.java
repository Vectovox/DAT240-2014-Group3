package engine.logic.strategies;

import engine.gen.*;

/**
 * Class models a logical NOT operation-strategy to be used by a Workflow
 * @author Johannes Westlund
 *
 */
public class NotStrategy implements IOperationStrategy{
	
	/**
	 * Standard injection-method. 
	 * @param owner Object to which the strategy is being injected
	 * @return Success
	 * @throws IllegalArgumentException if input object is not of type NOT
	 */
	@Override
	public boolean execute(Object owner){
		boolean outcome = false;
		
		if(owner instanceof NOT){
			NOT n = (NOT) owner;
			
			outcome = !n.getLhs().calculate();
		}else{
			throw new IllegalArgumentException("The supplied owner is not a NOT object");
		}
		return outcome;
	}
}
