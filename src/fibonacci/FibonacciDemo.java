package fibonacci;

import java.util.ArrayList;
import java.util.List;

/**
 * Write a function that computes the list of the first 100 Fibonacci numbers.
 * By definition, the first two numbers in the Fibonacci sequence are 0 and 1,
 * and each subsequent number is the sum of the previous two. As an example,
 * here are the first 10 Fibonnaci numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, and 34.
 * 
 * @author Thiago Prado
 *
 */
public class FibonacciDemo {	

	static void initializeFibonacciList(List<Long> l) {
		long temp = 0;
		l.add((long) 0);
		l.add((long) 1);
		for (int x = 0; x < 98; x++) {
			temp = (l.get(x))+(l.get(x+1));
			l.add(temp);
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Long> l = new ArrayList<Long>();
		
		System.out.println("Here is a list of the first 100 number of the Fibonacci sequence:");
		initializeFibonacciList(l);
		System.out.println(l + "\r\n");

		System.out.println("By definition, the first two numbers in the Fibonacci sequence are 0 and 1, " + 
		"and each subsequent number is the sum of the previous two.\r\n");

		System.out.println("Notice that after list item 93 the values go negative");
		System.out.println("This is a classic overflow problem in java");

	}
}