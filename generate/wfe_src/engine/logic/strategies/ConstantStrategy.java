package engine.logic.strategies;

public class ConstantStrategy implements IOperationStrategy {

	private final boolean value;

	public ConstantStrategy(final boolean value) {
		this.value = value;
	}

	@Override
	public boolean execute(Object owner) {
		return this.value;
	}

}
