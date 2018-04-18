import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Client {

	public static void main (String[] args) {
		
		Map<Integer, String> test = new TreeMap<Integer, String>();
		test.put(1, "Adam");
		test.put(2, "Rage");
		test.put(3, "Katrina");
		test.put(4, "Vega");
		test.put(5, "Granegore");
		
		System.out.println(test.keySet());
		System.out.println(test.values());
	}
}
