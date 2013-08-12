package cn.navior.app.location_algorithm;

import java.util.ArrayList;

/**
 * Getting the spot of each locating devices and distance to each of them, return the location of the being located device.
 * The result is rough, as it's only the gravity of some points.
 * @author wangxiayang
 *
 */
public class RoughLocator {
	
	Location getRoughLocation( ArrayList< LocationDistancePair > items ) {
		// TODO calculate the gravity of the points
		return null;
	}
	
	/**
	 * Data model containing location and distance to it.
	 * Only used in this class and the caller.
	 * @author wangxiayang
	 *
	 */
	class LocationDistancePair {
		
		private float x;
		private float y;
		private int floor;
		private float distance;
		
		LocationDistancePair( float x, float y, int floor, float distance ) {
			setX( x );
			setY( y );
			setFloor( floor );
			setDistance( distance );
		}
		
		float getX() {
			return x;
		}
		
		void setX( float x ) {
			this.x = x;
		}
		
		float getY() {
			return y;
		}
		
		void setY( float y ) {
			this.y = y;
		}
		
		int getFloor() {
			return floor;
		}
		
		void setFloor( int floor ) {
			this.floor = floor;
		}
		
		float getDistance() {
			return distance;
		}
		
		void setDistance( float distance ) {
			this.distance = distance;
		}
	}
}
