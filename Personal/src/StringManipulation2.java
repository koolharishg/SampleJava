
public class StringManipulation2 {

	public static void main(String[] args) {

		String strx = "It is drizzling zhere in Hyderabad";
		System.out.println(strx.indexOf('z'));
		System.out.println(strx.indexOf('z', strx.indexOf('z') + 1));
		System.out.println(strx.indexOf('z', strx.indexOf('z', strx.indexOf('z') + 1) + 1));
		System.out.println(strx.indexOf("is"));

	}

}
