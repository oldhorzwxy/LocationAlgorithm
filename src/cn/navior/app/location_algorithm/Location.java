package cn.navior.app.location_algorithm;

/**
* Location model.
* At present, a location is like ( x, y, floor ).
* @author wangxiayang
*
*/
public class Location {
	private double x;
	private double y;
	private int floor;
	
	public Location( double x, double y, int floor ) {
		setX( x );
		setY( y );
		setFloor( floor );
	}
	
	public double getX() {
		return x;
	}
	
	public void setX( double x ) {
		this.x = x;
	}
	
	public double getY() {
		return y;
	}
	
	public void setY( double y ) {
		this.y = y;
	}
	
	/**
	 * Get the floor representation on which the device is.
	 * There is work in defining floor representation.
	 * @return
	 */
	public int getFloor() {
		// TODO floor representation
		return floor;
	}
	
	public void setFloor( int floor ) {
		// TODO floor representation
		this.floor = floor;
	}
}