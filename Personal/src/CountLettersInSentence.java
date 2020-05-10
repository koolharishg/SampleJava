import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountLettersInSentence {

	public static void main(String[] args) {
		String str = "Its raining is Hyderabad";

		Map<Character, Integer> storeMap = new HashMap<>();

		char ch[] = str.replaceAll(" ", "").toCharArray();

		for (char c : ch) {
			if (storeMap.containsKey(c)) {
				storeMap.put(c, storeMap.get(c) + 1);
			} else {
				storeMap.put(c, 1);
			}
		}

		Set<Entry<Character, Integer>> en = storeMap.entrySet();
		for (Entry<Character, Integer> e : en) {
			System.out.println(e.getKey() + "=" + e.getValue());
		}

	}

}
