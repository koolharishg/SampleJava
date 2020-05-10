
public class RemoveJunk {

	public static void main(String[] args) {
		String s = "%%&&^^ abcd 123 *(*(*";

		System.out.println(s.replaceAll("[^a-z,A-Z,0-9, ]", ""));

	}

}
