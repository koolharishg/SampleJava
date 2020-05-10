package Practice2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GetElementsFromSet {

	public static void main(String[] args) {

		Set<Integer> s = new HashSet<>();

		s.add(1);
		s.add(2);
		s.add(3);
		s.add(4);
		s.add(5);

//		for (int i : s) {
//			System.out.println(i);
//		}

		Iterator it = s.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
