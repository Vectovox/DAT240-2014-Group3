package engine.logic.strategies;

import engine.gen.SetVariable;

public class SetVariableStrategy implements IOperationStrategy {

	@Override
	public boolean execute(Object owner) {
		if(owner instanceof SetVariable)
			throw new IllegalArgumentException("The supplied owner is not a SetVariable");
		
		SetVariable sv = (SetVariable)owner;
		sv.setStarted(true);
		
		//TODO Do zhe magic!
		
		sv.setSuccess(true);
		sv.setFinished(true);
		return true;
	}

}
