package Practice;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class SortArrayFreqMap {

	public static void main(String[] args) {

		int a[] = { 1, 4, 3, 1, 6, 4, 3, 6, 4 };

		Map<Integer, Integer> storeMap = new TreeMap<>();

		for (int i : a) {
			if (storeMap.containsKey(i)) {
				storeMap.put(i, storeMap.get(i) + 1);
			} else {
				storeMap.put(i, 1);
			}
		}

		Set<Entry<Integer, Integer>> ent = storeMap.entrySet();
		for (Entry<Integer, Integer> e : ent) {
			System.out.println(e.getKey() + "--" + e.getValue());
		}
	}

}
