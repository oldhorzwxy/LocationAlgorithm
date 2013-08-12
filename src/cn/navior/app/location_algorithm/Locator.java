package cn.navior.app.location_algorithm;

/**
 * Communicator of the package to outside world.
 * @author wangxiayang
 *
 */
public class Locator {
	
	private double currentX;
	private double currentY;
	private int currentFloor;
	
	/**
	 * Create a locator.
	 * This model has no presumption of using which kind of method or device to do locating.
	 * The default location in this model is ( 0, 0, 1 ), which means x = 0, y = 0 and floor = 1.
	 * x and y are double value. floor is int value.
	 */
	public Locator(){
		currentX = 0.0;
		currentY = 0.0;
		currentFloor = 1;
		
		startLocating();
	}
	
	/**
	 * Branch a new thread to do locating. The new thread will regularly update the location attributes in the Locator.
	 */
	private void startLocating() {
		LocatingThread t = new LocatingThread( this );
		t.start();
	}
	
	/**
	 * Automatically pack the location attributes into one object and return to caller.
	 * @return Location object, defined in this class
	 */
	public Location getCurrentLocation() {
		return new Location( currentX, currentY, currentFloor );
	}
	
	/**
	 * Only the background work logic can update the location value.
	 * @param x
	 */
	void setX( double x ) {
		// TODO maybe not thread safe
		this.currentX = x;
	}
	
	/**
	 * Only the background work logic can update the location value.
	 * @param y
	 */
	void setY( double y ) {
		// TODO maybe not thread safe
		this.currentY = y;
	}
	
	/**
	 * Set current floor value.
	 * Only the background work logic can update the location value.
	 * Warning: it's based on floor representation.
	 * @param floor
	 */
	void setFloor( int floor ) {
		// TODO floor representation
		// TODO maybe not thread safe
		this.currentFloor = floor;
	}

	

	/**
	 * Override Thread default implementation to do customized work on locating.
	 * This implementation may not used outside the package.
	 * @author wangxiayang
	 *
	 */
	private class LocatingThread extends Thread {
		
		private Locator locator;
		
		LocatingThread( Locator locator ) {
			this.locator = locator;
		}
		
		@Override
		public void run() {
			// TODO locating steps
		}
	}
}