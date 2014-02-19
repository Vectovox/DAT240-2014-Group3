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
		
		switch(typename)
		{
			case "True":
				return new ConstantStrategy(true);
			case "False":
				return new ConstantStrategy(false);
		}
		return new DefaultStrategy(); // TODO: Make strategies depending on the input
	}
}
