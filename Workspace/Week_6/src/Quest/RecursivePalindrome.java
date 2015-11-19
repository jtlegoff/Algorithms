package Quest;

import java.util.Scanner;

public class RecursivePalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		String input = "";
		while(!input.equalsIgnoreCase("exit")){
			System.out.println("Enter word or sentence to check if it is a palindrome.  Type 'exit' to exit.");
			input = keyboard.nextLine();
			if(input.equalsIgnoreCase("exit"))
				break;
			Palindrome(input.toString());
		}
		keyboard.close();
		System.out.println("Goodbye!");
	}

	static boolean Palindrome(String s){
		
		s = s.toLowerCase().replace(" ", "").trim().replaceAll("\\p{Punct}", "");
		
		if(s.length() <= 1){
			System.out.println("Palindrome!");
			return true;			
		}
		
		if(s.charAt(0) == s.charAt(s.length() - 1) && s.length() > 1){
			s = (s.substring(1, s.length() - 1));
			Palindrome(s);
			return true;
		}

		System.out.println("Not a palindrome!");
		return false;

	}
	
}
