package CollectionsOverview;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapInterf {

	public static void main(String[] args) {

		Map<String, String> values = new HashMap<>();
		values.put("name", "Harish");
		values.put("city", "Hyd");
		values.put("zip", "500018");

		System.out.println(values.keySet());
		Set<Entry<String, String>> value = values.entrySet();
		for (Entry<String, String> val : value) {
			System.out.println(val.getKey() + "---" + val.getValue());
		}
	}

}
