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
		
		private double x;
		private double y;
		private int floor;
		private double distance;
		
		LocationDistancePair( double x, double y, int floor, double distance ) {
			setX( x );
			setY( y );
			setFloor( floor );
			setDistance( distance );
		}
		
		double getX() {
			return x;
		}
		
		void setX( double x ) {
			this.x = x;
		}
		
		double getY() {
			return y;
		}
		
		void setY( double y ) {
			this.y = y;
		}
		
		int getFloor() {
			return floor;
		}
		
		void setFloor( int floor ) {
			this.floor = floor;
		}
		
		double getDistance() {
			return distance;
		}
		
		void setDistance( double distance ) {
			this.distance = distance;
		}
	}
}
