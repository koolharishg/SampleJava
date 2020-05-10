package Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsInString {

	public static void main(String[] args) {

		String str[] = { "java", "python", "java", "ruby", "c++", "python", "java", "python" };

		// O(n2)
//		for (int i = 0; i < str.length; i++) {
//			for (int j = i + 1; j < str.length; j++) {
//				if (str[i].equals(str[j])) {
//					System.out.println("Duplicate element is ::" + str[i]);
//				}
//			}
//		}
//
//		// using set O(n)
//
//		Set<String> a = new HashSet<>();
//		for (String s : str) {
//			if (a.add(s) == false) {
//				System.out.println("duplicate element is ->" + s);
//			}
//		}

		Map<String, Integer> storeMap = new HashMap<>();
		for (String st : str) {
			if (storeMap.containsKey(st)) {
				storeMap.put(st, storeMap.get(st) + 1);
			} else {
				storeMap.put(st, 1);
			}
		}

		Set<Entry<String, Integer>> mp = storeMap.entrySet();
		for (Entry<String, Integer> e : mp) {
			if (e.getValue() > 1) {
				System.out.println("duplicate element is ---" + e.getKey());
			}
		}

	}

}
