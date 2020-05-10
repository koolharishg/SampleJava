import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElements1 {

	public static void main(String[] args) {

		String coding[] = { "java", "python", "python", "pearl", "java" };
//     O(n x n)
//		for (int i = 0; i < coding.length; i++) {
//			for (int j = i + 1; j < coding.length; j++) {
//				if (coding[i] == coding[j])
//					System.out.println("duplicate elements is ::" + coding[i]);
//			}
//		}

		// using set O(n)
//		Set<String> values = new HashSet<>();
//		for (String str : coding) {
//			if (values.add(str) == false) {
//				System.out.println("duplicate elements is::" + str);
//			}
//		}

		// map O(2n)
		Map<String, Integer> storeMap = new HashMap<>();

		for (String str1 : coding) {

			if (storeMap.containsKey(str1)) {
				storeMap.put(str1, storeMap.get(str1) + 1);
			} else {
				storeMap.put(str1, 1);
			}
		}

		Set<Entry<String, Integer>> ent = storeMap.entrySet();
		for (Entry<String, Integer> en : ent) {
			if (en.getValue() > 1) {
				System.out.println("duplicate element is::" + en.getKey());
			}
		}

	}

}
