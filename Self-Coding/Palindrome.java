import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{
		      String original, reverse = ""; // Objects of String class
		      Scanner in = new Scanner(System.in);
		 
		      System.out.print("Enter a string :");
		      original = in.nextLine();
		 
		      int length = original.length();
		 
		      for ( int i = length - 1; i >= 0; i-- )
		         reverse = reverse + original.charAt(i);
		 
		      if (original.equals(reverse))
		         System.out.println("Entered string is a palindrome.");
		      else
		         System.out.println("Entered string is not a palindrome.");
	   }
		}	
	}


