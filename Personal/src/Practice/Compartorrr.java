package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Compartorrr {

	public static void main(String[] args) {

		List<Integer> values = new ArrayList<>();

		values.add(343);
		values.add(852);
		values.add(129);
		values.add(765);
		values.add(740);

		// Collections.sort(values);
		// Collections.reverse(values);

		// implementing method in comparator

		Comparator com = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if (o1 % 10 > o2 % 10)
					return 1;

				return -1;
			}

		};

		// using lambda expression

//		Comparator<Integer> co = (o1, o2) -> {
//			if (o1 % 10 > o2 % 10)
//				return 1;
//
//			return -1;
//		};

		Collections.sort(values, com);

		for (int i : values) {
			System.out.println(i);
		}
	}

}
