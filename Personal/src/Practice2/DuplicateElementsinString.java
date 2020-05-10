package Practice2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsinString {

	public static void main(String[] args) {

		String str[] = { "java", "python", "java", "ruby", "c++", "python", "java", "python" };

		Map<String, Integer> mp = new HashMap<>();

		for (String s : str) {
			if (mp.containsKey(s)) {
				mp.put(s, mp.get(s) + 1);
			} else {
				mp.put(s, 1);
			}
		}

		Set<Entry<String, Integer>> st = mp.entrySet();
		for (Entry<String, Integer> s : st) {
			if (s.getValue() > 2) {
				System.out.println("duplicate element is -->" + s.getKey());
			}
		}
	}

}
