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
	 * @throws IllegalArgumentException if input object is not of type AND
	 */
	@Override
	public boolean execute(Object owner){
		boolean outcome = false;
		
		if(owner != null && owner instanceof AND){
			AND n = (AND) owner;
			
			outcome = n.getLhs().calculate() && n.getRhs().calculate();
		} else {
			throw new IllegalArgumentException("The supplied owner is not an AND object");
		}
		return outcome;
	}
}
