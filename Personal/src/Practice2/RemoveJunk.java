package Practice2;

public class RemoveJunk {

	public static void main(String[] args) {
		String str = "@###$$ hello world **&*&*";
		System.out.println(str.replaceAll("[^0-9,a-z,A-Z, ]", ""));

	}

}
