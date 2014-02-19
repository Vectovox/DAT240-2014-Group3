package engine.logic;

import engine.logic.strategies.*;

public final class StrategyFactory {
	private static StrategyFactory instance = null;
	
	private StrategyFactory() {}
	
	public static StrategyFactory getInstance () {
		if (instance == null) {
			instance = new StrategyFactory();
		}
		return instance;
	}
	
	public IOperationStrategy getStrategy(String typename, String operation){
		return new DefaultStrategy(); // TODO: Make strategies depending on the input
	}
}
