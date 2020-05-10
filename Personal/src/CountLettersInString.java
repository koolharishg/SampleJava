import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountLettersInString {

	public static void main(String[] args) {
		String str = "Hello Amazon";
		char ch[] = str.replaceAll(" ", "").toCharArray();

		Map<Character, Integer> storeMap = new HashMap<>();

		for (char c : ch) {
			if (storeMap.containsKey(c)) {
				storeMap.put(c, storeMap.get(c) + 1);
			} else {
				storeMap.put(c, 1);
			}
		}

		Set<Entry<Character, Integer>> ent = storeMap.entrySet();
		for (Entry<Character, Integer> e : ent) {
			System.out.println(e.getKey() + "=" + e.getValue());
		}

	}

}
