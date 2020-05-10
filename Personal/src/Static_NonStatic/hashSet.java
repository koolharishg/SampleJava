package Static_NonStatic;

import java.util.HashSet;

public class hashSet {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("Geeks");
		hashSet.add("for");
		hashSet.add("Geeks");
		hashSet.add("GeeksforGeeks");

		System.out.println(hashSet);

	}
}
