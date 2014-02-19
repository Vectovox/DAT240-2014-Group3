package engine.logic;

public final class StrategyFactory {
	
	private StrategyFactory() {}
	
	public IOperationStrategy CreateStrategy(Class type, String name){
		return null; // TODO: Make strategies depending on the input
	}
}
