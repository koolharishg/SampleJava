package Practice;

import java.util.Set;
import java.util.TreeSet;

public class GetElementsFromSet {

	public static void main(String[] args) {

		Set<Integer> st = new TreeSet<>();
		st.add(1);
		st.add(25);
		st.add(78);
		st.add(100);
		st.add(87);

		for (int i : st) {
			System.out.println(i);
		}

	}

}
