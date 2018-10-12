package listConverger;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Write a function that combines two lists by alternatingly taking elements.
 * For example: given the two lists [a, b, c] and [1, 2, 3], the function should
 * return [a, 1, b, 2, c, 3].
 * 
 * @author Thiago Prado
 *
 */

public class ListAlternate{

	// function initializes a demo list by splitting a string of characters
	// separated by "-"
	private static void initializeDemoList1(List<String> l) {
		String demo = "a-b-c-d-e-f-g";
		String[] demoArr = demo.split("-", 0);
		for (String x : demoArr) {
			l.add(x);
		}
	}

	// function initializes a demo list by splitting a string of characters
	// separated by "-"
	private static void initializeDemoList2(List<String> l) {
		String demo = "q-w-e-r-t-y-u";
		String[] demoArr = demo.split("-", 0);
		for (String x : demoArr) {
			l.add(x);
		}
	}

	// recursive function joins two lists into a target list
	// catches exceptions with a custom message
	private static void joinLists (List<String>l1, List<String> l2, List<String> targetList) {
		String temp = new String();
		try {
			temp = l1.get(0) + l2.get(0);
			targetList.add(temp);
			l1.remove(0);
			l2.remove(0);
			joinLists (l1,l2, targetList);
		
		}
		catch(Exception e){
			System.out.println("Something went wrong...");
			System.out.println("Most likely one of your lists was empty!");
		}
	}

	/**
	 * Main method initializes 3 lists then calls previous methods to populate them
	 * and displays them to console
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> l1 = new LinkedList<String>();
		List<String> l2 = new LinkedList<String>();
		List<String> targetList = new LinkedList<String>();

		initializeDemoList1(l1);
		initializeDemoList2(l2);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(targetList);
		joinLists(l1, l2, targetList);
		System.out.println(targetList);

	}

}
