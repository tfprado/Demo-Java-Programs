package biggestNumber;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Write a function that given a list of non negative integers, arranges them 
 * such that they form the largest possible number.
 * For example, given [50, 2, 1, 9], the largest formed number is 95021.
 * @author Thiago Prado
 *
 */
public class Demo {

	private static Integer[] VALUES = { 5, 50, 56 };

	/**
	 * Using the comparator class in java utilities we are able to 
	 * sort the sample integer array into the biggest number and display it after
	 * @param args
	 */
	public static void main(String[] args) {
		//
		Arrays.sort(VALUES, new Comparator<Integer>() {

			@Override
			public int compare(Integer lhs, Integer rhs) {
				String v1 = lhs.toString();
				String v2 = rhs.toString();
				return (v1 + v2).compareTo(v2 + v1) * -1;
			}
		});

		String result = "";
		for (Integer integer : VALUES) {
			result += integer.toString();
		}

		System.out.println(result);
	}
}