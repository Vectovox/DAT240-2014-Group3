package engine.logic.strategies;

import engine.gen.Expression;
import engine.gen.Gate;

public class GateStrategy implements IOperationStrategy {

	/**
	 * 
	 * @param owner - Must be of class type Gate.
	 * @return The value that the expression referenced by the Gate is evaluated to.
	 * @throws IllegalArgumentException if owner.getClass() != Gate.class.
	 */
	@Override
	public boolean execute(Object owner) {
		if(owner instanceof Gate){
			Gate g = (Gate) owner;
			g.setStarted(true);
			
			Expression expression = g.getCondition();
			if (expression.calculate()) {
				//TODO sätt flaggor
				g.setSuccess(true);
				g.setFinished(true);
				return true;
			} else {
				//TODO avbryt sub-flow
				g.setSuccess(true);
				g.setFinished(true);
				return false;
			}
		}else{
			throw new IllegalArgumentException("The supplied owner is not a Gate");
		}
		
		
	}

}
