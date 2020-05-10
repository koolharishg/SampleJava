
public class ReverseIntegr {

	public static void main(String[] args) {

		int num = 1234;
		int rev = 0;

		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		System.out.println("reverse of number is ->" + rev);

		int num2 = 1234;

		System.out.println(new StringBuffer(String.valueOf(num2)).reverse());

	}

}
