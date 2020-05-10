package Practice3;

public class RemoveJunk {

	public static void main(String[] args) {

		String str = "%&%&%%&%Hello World&&(&(";
		System.out.println(str.replaceAll("[^a-z, A-Z]", ""));

	}

}
