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
 * @version 2.0.0
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Map.html">Interface Map</a>
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/HashMap.html">Class HashMap</a>
 */
public class Main {

	public static void main(String[] args) {
		int[] data = {0, 7, 4, 3, 0, 5, 7, 2, 1, 4, 9, 0, 6, 5, 2, 7, 8, 7, 4, 7};    // Represents the keys
		Map<Integer, Integer> histogram = new HashMap<>();

		for(int key : data) {
			histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
		}

		if(!histogram.isEmpty()) {
			for(Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
				System.out.println(entry.getKey() + " --> " + entry.getValue());
			}
		}
	}
}