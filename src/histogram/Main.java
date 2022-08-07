package histogram;

import java.util.Map;
/**
 * Class that instantiates an object of type Histogram used
 * to calculate a histogram from an array of integers by
 * calling the getHistogram() method that returns a histogram.
 *
 * @author Brian Suárez Santiago
 * @version 4.0.0
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Map.html">Interface Map</a>
 */
public class Main {

    public static void main(String[] args) {
        Integer[] data = {0, 7, 4, 3, 0, 5, 7, 2, 1, 4, 9, 0, 6, 5, 2, 7, 8, 7, 4, 7};    // Represents the keys
        Histogram histogram = new Histogram(data);
        Map<Integer, Integer> histogr = histogram.getHistogram();

        if(!histogr.isEmpty()) {
            for(Map.Entry<Integer, Integer> entry : histogr.entrySet()) {
                System.out.println(entry.getKey() + " --> " + entry.getValue());
            }
        }
    }
}