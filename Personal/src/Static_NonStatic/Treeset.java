package Static_NonStatic;

import java.util.Set;
import java.util.TreeSet;

public class Treeset {
	public static void main(String[] args) {
		Set<String> treeSet = new TreeSet<>();

		treeSet.add("geeks");
		treeSet.add("for");
		treeSet.add("Zubin");

		System.out.println(treeSet);
	}
}