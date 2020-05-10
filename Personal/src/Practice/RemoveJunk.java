package Practice;

public class RemoveJunk {

	public static void main(String[] args) {

		String str = "$$%%%% Hyderabad Pegasystems &&&&&";
		System.out.println(str.replaceAll("[^a-zA-Z0-9 ]", ""));

	}

}
