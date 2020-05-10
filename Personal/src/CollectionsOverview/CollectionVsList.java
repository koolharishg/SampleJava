package CollectionsOverview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class CollectionVsList {

	public static void main(String[] args) {

		// Collection with generics (here Integer)
		Collection<Integer> values = new ArrayList<>();
		values.add(1);
		values.add(99);
		// values.add("String");

		// ways to print a collection

		// 1. Using Iterator
		Iterator it = values.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// 2. enhanced for loop
		for (Object i : values) {
			System.out.println(i);
		}

		// 3. Stream API, lambda expressions
		values.forEach(System.out::println);

		List<Integer> value = new ArrayList<>();
		value.add(44);
		value.add(22);
		value.add(1, 33);

		for (Object baz : value) {
			System.out.println(baz);
		}
	}

}
