package cn.navior.app.location_algorithm;

/**
* Location model.
* At present, a location is like ( x, y, floor ).
* @author wangxiayang
*
*/
public class Location {
	private float x;
	private float y;
	private int floor;
	
	public Location( float x, float y, int floor ) {
		setX( x );
		setY( y );
		setFloor( floor );
	}
	
	public float getX() {
		return x;
	}
	
	public void setX( float x ) {
		this.x = x;
	}
	
	public float getY() {
		return y;
	}
	
	public void setY( float y ) {
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