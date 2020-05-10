import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {

		// O(nxn)

		String names[] = { "java", "python", "ruby", "C++", "java" };

		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {
				if (names[i] == names[j]) {
					System.out.println("duplicate element is:::" + names[i]);
				}
			}
		}

		// hash set: stores the unique key O(n)
		Set<String> store = new HashSet<String>();
		for (String name : names) {
			if (store.add(name) == false) {
				System.out.println("duplicate element is ::" + name);
			}
		}

		// hash map O(n)

		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		for (String name : names) {

			if (storeMap.containsKey(name)) {
				storeMap.put(name, storeMap.get(name) + 1);
			} else {
				storeMap.put(name, 1);
			}
		}

		Set<Entry<String, Integer>> entryset = storeMap.entrySet();
		for (Entry<String, Integer> entry : entryset) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate element is:::" + entry.getKey());
			}
		}
	}

}
