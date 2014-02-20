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
		
		switch(typename) {
			case "True":
				return new ConstantStrategy(true);
			case "False":
				return new ConstantStrategy(false);
			case "Sleep":
				return new SleepStrategy();
			case "AND":
				return new AndStrategy();
			case "OR":
				return new OrStrategy();
			case "NOT":
				return new NotStrategy();
			case "Gate":
				return new GateStrategy();
			case "Synchbar":
				return new SynchbarStrategy();
			case "Confirm":
				return new ConfirmStrategy();
			case "Node":
				if (operation.equals("execute")) {
					return new NodeStrategy();
				}
				else if (operation.equals("run")) {
					return new RunStrategy();
				}
			default:
				return new DefaultStrategy(); // TODO: Make strategies depending on the input
		}
	}
}
