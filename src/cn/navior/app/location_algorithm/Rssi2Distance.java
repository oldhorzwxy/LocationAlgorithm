package cn.navior.app.location_algorithm;

/**
 * A calculator, works out distance from RSSI value, based on some model.
 * Two attributes are necessary. They should be passed in as default value when the class is being constructing.
 * This class is only used in this package. There is no public field and method here.
 * @author wangxiayang
 *
 */
public class Rssi2Distance {

	private double a;
	private double n;
	
	/**
	 * Constructor with default attribute values.
	 * @param a double value of A in the model
	 * @param n double value of n in the model
	 */
	Rssi2Distance( double a, double n ) {
		setA( a );
		setN( n );
	}

	double getA() {
		return a;
	}

	/**
	 * The setter is reserved to make the A value able to be updated in practice.
	 * @param a
	 */
	void setA( double a ) {
		// TODO check for validity of A
		this.a = a;
	}

	double getN() {
		return n;
	}

	/**
	 * The setter is reserved to make the n value able to be updated in practice.
	 * @param n
	 */
	void setN( double n ) {
		// TODO check for validity of n
		this.n = n;
	}
	
	/**
	 * Calculate the distance from rssi value.
	 * @param rssi RSSI value
	 * @return double type distance in centimeter
	 */
	double getDistance( int rssi ) {
		// TODO calculate distance
		return 0.0;
	}
}
