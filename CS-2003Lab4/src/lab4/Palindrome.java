package lab4;
import java.util.*;

public class Palindrome {
	public Palindrome() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		isaPalindrome(input);
	}
	public static boolean isaPalindrome(String expr) {
		if(expr.length() == 0) { System.out.println("This string is a palindrome");return true;}
		else if(expr.length() == 1) {System.out.println("This string is a palindrome"); return true;}
		else if(expr.charAt(0) != expr.charAt(expr.length()-1)) {
			System.out.println("This String is not a Palindrome... try another one");
			Palindrome palindrome = new Palindrome();
			return false;}
		else return isaPalindrome(expr.substring(1, expr.length()-1));
			
	}
	public static void main(String[] args) {
		System.out.println("please put in a string\n");
		Palindrome palindrome = new Palindrome();
	}
}
