package cn.navior.app.location_algorithm;

/**
 * A calculator, works out distance from RSSI value, based on some model.
 * Two attributes are necessary. They should be passed in as default value when the class is being constructing.
 * This class is only used in this package. There is no public field and method here.
 * @author wangxiayang
 *
 */
public class Rssi2Distance {

	private float a;
	private float n;
	
	/**
	 * Constructor with default attribute values.
	 * @param a float value of A in the model
	 * @param n float value of n in the model
	 */
	Rssi2Distance( float a, float n ) {
		setA( a );
		setN( n );
	}

	float getA() {
		return a;
	}

	/**
	 * The setter is reserved to make the A value able to be updated in practice.
	 * @param a
	 */
	void setA( float a ) {
		// TODO check for validity of A
		this.a = a;
	}

	float getN() {
		return n;
	}

	/**
	 * The setter is reserved to make the n value able to be updated in practice.
	 * @param n
	 */
	void setN( float n ) {
		// TODO check for validity of n
		this.n = n;
	}
	
	/**
	 * Calculate the distance from rssi value.
	 * In this kind of interface, no Gauss-filtering is performed.
	 * @param rssi RSSI value
	 * @return float type distance in centimeter
	 */
	float getDistance( int rssi ) {
		// TODO calculate distance
		return 0.0f;
	}
}
