package engine.logic.strategies;

import java.util.concurrent.TimeUnit;

import engine.gen.Sleep;

public class SleepStrategy implements IOperationStrategy {

	/**
	 * Sleeps for the number of seconds specified in the provided Sleep-object.
	 * @param owner - Must be of class type Sleep.
	 * @return True if the timeout is executed and uninterrupted.
	 * @throws IllegalArgumentException if owner.getClass() != Sleep.class.
	 * @throws InteruptedException if the sleep is interrupted.
	 */
	@Override
	public boolean execute(Object owner) {
		if(owner != null && owner.getClass() == Sleep.class) {
			Sleep sleep = (Sleep) owner;
			//Convert seconds stored in double to milliseconds 
			long sleepTime = (long) (sleep.getSeconds()*1000+0.5);
			
			try {
				TimeUnit.MILLISECONDS.sleep(sleepTime);
				return true;
			} catch (InterruptedException e) {
				e.printStackTrace();
				return false;
			}
		} else {
			throw new IllegalArgumentException("Parameter must be of class Sleep.");
		}
	}
}
