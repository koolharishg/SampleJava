
public class StringManipulation {

	public static void main(String[] args) {

		String str = "The rains have started here";
		String str1 = "The rains Have started here";

		System.out.println(str.length());

		System.out.println(str.charAt(5));

		System.out.println(str.indexOf('s')); // first occurence of s

		System.out.println(str.indexOf('s', str.indexOf('s') + 1)); // second occurence

		System.out.println(str.indexOf('e', (str.indexOf('e', str.indexOf('e') + 1)) + 1));

		System.out.println(str.indexOf("have"));

		System.out.println(str.indexOf("hello"));

		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));

		// substring

		System.out.println(str.substring(0, 9));

		// trim removes before & after space

		String str2 = "    Hello World   ";
		System.out.println(str2.trim());

		// replace to remove in between space
		System.out.println(str2.replace(" ", ""));
		String date = "02/02/2017";
		System.out.println(date.replace("/", "-"));

		// split

		String test = "Hello_World_Selenium";
		String splitted[] = test.split("_");
		for (int i = 0; i < splitted.length; i++) {
			System.out.println(splitted[i]);
		}

		int x = 10;
		int y = 20;

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("x=" + x + "\n" + "y=" + y);

		String a = "Hello";
		String b = "World";

		a = a + b; // HelloWorld - 10
		System.out.println(a.length());
		b = a.substring(0, a.length() - b.length()); // 1
		System.out.println(b.length());
		a = a.substring(b.length());

		System.out.println("After Swap: a=" + a + " b=" + b);

	}

}
