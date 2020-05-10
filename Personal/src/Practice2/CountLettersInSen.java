package Practice2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountLettersInSen {

	public static void main(String[] args) {

		String str = "I do not know what is happening";
		char ch[] = str.replaceAll(" ", "").toCharArray();

		Map<Character, Integer> mp = new HashMap<>();

		for (Character c : ch) {
			if (mp.containsKey(c)) {
				mp.put(c, mp.get(c) + 1);
			} else {
				mp.put(c, 1);
			}
		}

		Set<Entry<Character, Integer>> ent = mp.entrySet();

		for (Entry<Character, Integer> e : ent) {
			System.out.println(e.getKey() + "--->" + e.getValue());
		}

	}

}
