package Practice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparrrLambda {

	public static void main(String[] args) {

		List<Integer> values = new ArrayList<Integer>();
		values.add(689);
		values.add(134);
		values.add(561);
		values.add(847);
		values.add(232);

		Comparator<Integer> comp = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {

				return o1 % 10 > o2 % 10 ? 1 : -1;
			}

		};

		Collections.sort(values, comp);
		for (int i : values) {
			System.out.println(i);
		}
	}

}
