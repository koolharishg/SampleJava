import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class strReverse {

	public static void main(String[] args) {
		String str = "Hello";
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println("reverse of string is " + rev);

		int num = 12345;

		System.out.println(new StringBuffer(String.valueOf(num)).reverse());

		int a[] = { 1, 2, 4, 5, 6, 7, 8 };
		int maxValue = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > maxValue) {
				maxValue = a[i];
			}
		}

		int totalsum = maxValue * (maxValue + 1) / 2;

		int arraysum = 0;
		for (int j = 0; j < a.length; j++) {
			arraysum = arraysum + a[j];
		}

		System.out.println("missing number is " + (totalsum - arraysum));

		String progs[] = { "java", "ruby", "C++", "python", "java" };

		for (int i = 0; i < progs.length; i++) {
			for (int j = i + 1; j < progs.length; j++) {
				if (progs[i] == progs[j]) {
					System.out.println("duplicate string is " + progs[i]);
				}
			}
		}
		// O(n)
		Set<String> test = new HashSet<String>();
		for (int i = 0; i < progs.length; i++) {
			if (test.add(progs[i]) == false) {
				System.out.println("duplicate item is ->" + progs[i]);
			}
		}

		// hash map
		Map<String, Integer> storeMap = new HashMap<String, Integer>();
		for (String name : progs) {
			Integer count = storeMap.get(name);
			if (count == null) {
				storeMap.put(name, 1);
			} else {
				storeMap.put(name, ++count);
			}
		}

		Set<Entry<String, Integer>> entryset = storeMap.entrySet();
		for (Entry<String, Integer> ent : entryset) {
			if (ent.getValue() > 1) {
				System.out.println("duplicate element is ->" + ent.getKey());
			}
		}

		String junk = "%&%&%&%& testing selenium &^(&^(^*";
		System.out.println(junk.replaceAll("[^a-z,A-Z,0-9, ]", ""));

	}

}
