package histogram;

import java.util.Map;
import java.util.HashMap;
/**
 * Class implementing a histogram. Starting from an array
 * with integer values, an application of console has been
 * built that returns the frequency/number of occurrences
 * of each value in the array.
 *
 * @author Brian Suárez Santiago
 * @version 3.0.0
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Map.html">Interface Map</a>
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html">Class HashMap</a>
 */
public class Histogram {
	private final int[] data;

	/**
	 * Constructor that initializes the attribute it
	 * represents the keys of the histogram, that is,
	 * the values of integer type for which we are
	 * going to calculate the number of occurrences.
	 *
	 * @param data Array with histogram keys.
	 */
	public Histogram(int[] data) {
		this.data = data;
	}

	/**
	 * Returns the histogram keys.
	 *
	 * @return Array with histogram keys.
	 */
	public int[] getData() {
		return this.data;
	}

	/**
	 * Given an array of integer numbers, the method
	 * returns the amount of occurrences of this value
	 * in the data array.
	 *
	 * @return Histogram. Map with the keys and the number
	 * of occurrences for those keys.
	 */
	public Map<Integer, Integer> getHistogram() {
		Map<Integer, Integer> histogram = new HashMap<>();

		for(int key : data) {
			histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
		}
		return histogram;
	}
}