import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class GetElementsFromSet {

	public static void main(String[] args) {

		Set<String> str = new TreeSet<>();
		str.add("Harish");
		str.add("Vibha");
		str.add("Sumit");
		str.add("Amit");

		List<Integer> l = new ArrayList<>();
		l.add(0, 0);
		l.add(1, 10);
		l.add(34);
		l.add(2, 80);
		l.add(3, 83);
		System.out.println(l.get(4));

//		Iterator it = str.iterator();
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}

//		for (String s : str) {
//			System.out.println(s);
//		}
	}

}
