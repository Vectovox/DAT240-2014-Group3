package engine.logic.strategies;

import engine.gen.Variable;

public class VariableStrategy implements IOperationStrategy {
	
	@Override
	public boolean execute(Object owner) {
		if(owner instanceof Variable)
			throw new IllegalArgumentException("The supplied owner is not a Variable");
		
		Variable v = (Variable)owner;
		
		return v.getValue();
	}

}
