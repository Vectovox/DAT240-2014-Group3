package engine.logic.strategies;

import engine.gen.*;

/**
 * Strategy for deciding whether as synchbar should let the subflow pass or not.
 * @author Gustav Sundin
 *
 */
public class SynchbarStrategy implements IOperationStrategy {

	/**
	 * Execute method. 
	 * @param owner Object to which the strategy is being injected (needs to be of type Synchbar)
	 * @return true if all ingoing nodes to the synchbar are finished.
	 */
	@Override
	public boolean execute(Object owner) {
		//TODO repeat until true? or do this elsewhere?
		if (owner instanceof Synchbar) {
			Synchbar s = (Synchbar) owner;
			
			for (Arc arc : s.getIncoming()) {
				if (!arc.getSource().getFinished()) {
					//if at least one source node is not finished, return false.
					return false; 
				}
			}
			
			//all source nodes were finished.
			return true;
		} else {
			throw new IllegalArgumentException("The supplied owner is not a synchbar");
		}
	}

}
