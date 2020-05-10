package Practice3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortBasedOnConditionList {

	public static void main(String[] args) {

		List<Integer> values = new ArrayList<>();
		values.add(124);
		values.add(793);
		values.add(989);
		values.add(102);
		values.add(100);
		values.add(358);

		Comparator<Integer> comp = (o1, o2) -> {
			return o1 % 10 > o2 % 10 ? 1 : -1;

		};

		Collections.sort(values, comp);
		System.out.println(values);

	}

}
