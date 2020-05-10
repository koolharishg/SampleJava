package Practice2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class compar {

	public static void main(String[] args) {

		List<Integer> values = new ArrayList<>();
		Vector<String> str = new Vector<>();

		str.add("baz1");
		str.add("baz2");
		str.add("baz3");
		str.add("baz4");
		str.add("baz5");

		System.out.println(str.capacity());

		ArrayList<Integer> al = new ArrayList<>();

		values.add(343);
		values.add(852);
		values.add(129);
		values.add(765);
		values.add(740);
		values.add(1, 853);

		LinkedList<Integer> ll = new LinkedList<>();
		ll.add(0, 1);
		ll.add(1, 1);
		ll.add(2, 21);
		System.out.println(ll.get(2));

//		Comparator<Integer> comp = (o1, o2) ->
//
//		{
//			return o1 % 10 > o2 % 10 ? 1 : -1;
//		};
//
//		Collections.sort(values, comp);

//		for (int i : values) {
//			System.out.println(i);
//		}

	}
}
