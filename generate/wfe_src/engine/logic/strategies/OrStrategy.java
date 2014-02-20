package engine.logic.strategies;

import engine.gen.*;

/**
 * Class models a logical OR operation-strategy to be used by a Workflow
 * @author Johannes Westlund
 *
 */
public class OrStrategy implements IOperationStrategy{
	
	/**
	 * Standard injection-method. 
	 * @param owner Object to which the strategy is being injected
	 * @return Success
	 * @throws IllegalArgumentException if input object is not of type OR
	 */
	@Override
	public boolean execute(Object owner){
		boolean outcome = false;
		
		if(owner != null && owner instanceof OR){
			OR n = (OR) owner;
			
			outcome = n.getLhs().calculate() || n.getRhs().calculate();
		} else {
			throw new IllegalArgumentException("The supplied owner is not an OR object");
		}
		return outcome;
	}
}
