package histogram;

import java.util.Map;
/**
 * Class that instantiates an object of type Histogram used
 * to calculate a histogram from an array of integers by
 * calling the getHistogram() method that returns a histogram.
 *
 * @author Brian Suárez Santiago
 * @version 5.0.0
 * @see <a href="https://docs.oracle.com/javase/8/docs/api/java/util/Map.html">Interface Map</a>
 */
public class Main {

    public static void main(String[] args) {
        String[] data = {"Harry", "Sophie", "Taylor", "Harry", "Isabella", "Harry"};    // Represents the keys
        Histogram histogram = new Histogram(data);
        Map<String, Integer> histogr = histogram.getHistogram();

        if(!histogr.isEmpty()) {
            for(Map.Entry<String, Integer> entry : histogr.entrySet()) {
                System.out.println(entry.getKey() + " --> " + entry.getValue());
            }
        }
    }
}