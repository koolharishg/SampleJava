package Practice3;

import java.util.HashMap;
import java.util.Map;

public class CounteLettersInSentence {

	public static void main(String[] args) {

		String str = "Its raining in Hyderabad";
		char[] ch = str.replaceAll(" ", "").toCharArray();

		Map<Character, Integer> storeMap = new HashMap<>();

		for (char c : ch) {
			if (storeMap.containsKey(c)) {
				storeMap.put(c, storeMap.get(c) + 1);
			} else {
				storeMap.put(c, 1);
			}
		}

		System.out.println(storeMap);

	}

}
