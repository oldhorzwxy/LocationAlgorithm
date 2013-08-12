package cn.navior.app.location_algorithm;

import java.util.ArrayList;

/**
 * This class just do Bayes filtering.
 * It needs some parameters to build up distribution models to calculate the Bayes probabilities.
 * Two kinds of distribution models are needed now. One is defined in LocationDistribution. The other is defined in DistanceDistribution.
 * @author wangxiayang
 *
 */
public class RefiningLocator {
	
	private LocationDistribution ld;
	private ArrayList< DistanceDistribution > dds;
	
	RefiningLocator() {
		dds = new ArrayList< DistanceDistribution >();
	}
	
	LocationDistribution getLd() {
		return ld;
	}

	void setLd(LocationDistribution ld) {
		this.ld = ld;
	}

	ArrayList< DistanceDistribution > getDds() {
		return dds;
	}

	void addDd( DistanceDistribution dd ) {
		this.dds.add( dd );
	}
	
	Location doBayesFiltering() {
		// TODO doing filtering algorithm
		return null;
	}

	/**
	 * Data model for distribution, used in calculating prior probability.
	 * @author wangxiayang
	 *
	 */
	class LocationDistribution {
		private float x;
		private float y;
		private float sd;
		
		/**
		 * 
		 * @param x the x coordinate of star
		 * @param y the y coordinate of star
		 * @param sd the standard derivation of the locations
		 */
		LocationDistribution( float x, float y, float sd ) {
			this.x = x;
			this.y = y;
			this.sd = sd;
		}
		
		float getX() {
			return x;
		}
		
		float getY() {
			return y;
		}
		
		float getSd() {
			return sd;
		}
	}
	
	/**
	 * Data model for distribution, used in calculating posterior probability.
	 * @author wangxiayang
	 *
	 */
	class DistanceDistribution {
		private float sd;
		private float mean;
		private float x;
		private float y;
		
		/**
		 * 
		 * @param sd standard derivation of distances to a certain star
		 * @param mean mean of the distances to a certain star
		 * @param x the star's x coordinate
		 * @param y the star's y coordinate
		 */
		DistanceDistribution( float sd, float mean, float x, float y ) {
			this.sd = sd;
			this.mean = mean;
			this.x = x;
			this.y = y;
		}
		
		float getSd() {
			return sd;
		}
		
		float getMean() {
			return mean;
		}
		
		float getX() {
			return x;
		}
		
		float getY() {
			return y;
		}
	}
}
