package engine.logic.strategies;

import engine.gen.Variable;

public class VariableStrategy implements IOperationStrategy {

	private final boolean value;
	private final String name;

	public VariableStrategy(final String name, final boolean value) {
		this.name = name;
		this.value = value;
	}
	
	@Override
	public boolean execute(Object owner) {
		if(owner instanceof Variable)
			throw new IllegalArgumentException("The supplied owner is not a Variable");
		
		Variable v = (Variable)owner;
		v.setName(name);
		v.setValue(value);
		
		return true;
	}

}
