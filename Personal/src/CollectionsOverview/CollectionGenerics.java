package CollectionsOverview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class CollectionGenerics {

	public static void main(String[] args) {

		// default type is Object

		Collection values = new ArrayList();
		values.add(1);
		values.add(2); // collection does not work with index
		values.add("Test String"); // etc...

		// Generics
		Collection<Integer> value = new ArrayList<Integer>();
		Collection<Integer> value2 = new ArrayList<>();
		value.add(10);

		// ----------LIST-------------- //
		// drawback of collections: does not work with indexes
		// cannot add value in between
		// Instead of using collections, use List(extends Collection)
		// every elements in List has unique index
		// List : can have duplicate values
		// order to get elements is fixed

		List<Integer> number = new ArrayList<>();
		number.add(9);
		number.add(10);
		number.add(10);

		// ------------SET--------------//

		// Set: cannot have duplicate values
		// Set is interface & HashSet is a class
		// order to get elements is random
		Set<Integer> numbers = new HashSet<>();

		// Tree set: get elements in sorted format
		Set<Integer> treset = new TreeSet<>();

		// -------------MAP------------//
		// <Key,Value> Map is an Interface
		// HashMap & HashTable are classes
		// HashMap -> Synchronized (thread safe)
		// HashTable -> Asyncronized (non thread safe)
		Map<Integer, String> m = new HashMap<>();

	}

}
