package CollectionsOverview;

class Container<T extends Number> {
	T value;

	public void show() {
		System.out.println(value.getClass().getName());
	}
}

public class Generics {

	public static void main(String[] args) {

//		List<Integer> values = new ArrayList<>();
//		values.add(1);
//		System.out.println(values.get(0));

		Container<Double> obj = new Container<>();
		obj.show();

	}

}
