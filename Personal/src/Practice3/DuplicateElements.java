package Practice3;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {

		String[] str = { "java", "python", "perl", "ruby", "java" };

		Set<String> st = new HashSet<>();

		for (String s : str) {
			if (st.add(s) == false) {
				System.out.println("duplicate element is::" + s);
			}
		}

	}

}
