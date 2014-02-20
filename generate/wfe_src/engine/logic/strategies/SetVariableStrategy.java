package engine.logic.strategies;

import engine.gen.Expression;
import engine.gen.SetVariable;
import engine.gen.Variable;

public class SetVariableStrategy implements IOperationStrategy {

	@Override
	public boolean execute(Object owner) {
		if(owner instanceof SetVariable)
			throw new IllegalArgumentException("The supplied owner is not a SetVariable");
		
		SetVariable sv = (SetVariable)owner;
		sv.setStarted(true);
		
		Variable var = sv.getSets_variable();
		Expression exp = sv.getSets_variable();
		
		if(var != null && exp != null)
			var.setValue(exp.calculate());
		
		sv.setSuccess(true);
		sv.setFinished(true);
		return true; // TODO What is the return value?
	}

}
