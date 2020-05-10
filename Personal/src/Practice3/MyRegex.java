package Practice3;

//Write your code here

public class MyRegex {

	String num = "([0|1]\\d{1,2}|2[0-4]\\d|25[0-5])";
	String pattern = num + "." + num + "." + num + "." + num;

}