package engine.logic.strategies;

import engine.gen.Expression;

public class GateStrategy implements IOperationStrategy {

	@Override
	public boolean execute(Object owner) {
		Expression expression = owner.expression;
		if (expression.calculate()) {
			//TODO sätt flaggor
			return true;
		} else {
			//TODO avbryt sub-flow
			return false;
		}
	}

}
