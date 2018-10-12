package factorials;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Thiago Prado
 * Class uses recursion to get user input for an integer, then displays the factorial
 * must be run on eclipse or console window
 *
 */
public class RecursiveDemo{
	
	//the "hello world" of recursive function with some system output to display numbers
	private static long factorial(int n) {
		if (n == 1) {
			System.out.print("1 = ");
			return 1;
		}
		else {
			System.out.print(n+"*");
			return n * factorial(n - 1);
		}
	}
	
	//recursive function to ask for user input and check for errors
	private static int getInput (BufferedReader br) {
		String userInput;
		int r=0; // Where integer will be stored
		try {
			System.out.println("Pick a number!");
			userInput = br.readLine(); // We read from user's input
			r = Integer.parseInt(userInput); // We validate if "userInput" is an integer (if so we skip catch call
												// and continue on the next line, otherwise, we go to it (catch
												// call))
		}
		catch (Exception e) {
			System.out.println("NOT A VALID ENTRY!");
			r = getInput(br);
		}
		return r;
		
		
	}

	/**
	 * simple main method to run program.
	 * @param args
	 */
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // Here you declare your BufferedReader object and instance it.
		
		System.out.println("A factorial is a number where n! = n * (n - 1) * (n - 2) * ... * 2 * 1");
		
		int yourNumber = getInput(br);
	
		System.out.println("The Factorial of " + yourNumber + " is:");
		System.out.print(factorial(yourNumber));
		
	}
}
