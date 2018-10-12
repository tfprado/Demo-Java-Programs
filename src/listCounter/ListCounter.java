/**
 * 
 */
package listCounter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * The listCounter class asks user to input size of a list and the items,
 * then displays the sum of all elements of the list.
 * @author Thiago Prado
 */
public class ListCounter {	
	/**
	 * In the main method we are going to declare a new BufferedReader and 
	 * instance it, and an integer where the user input will be parsed. This
	 * method catches exceptions and will ask user to re-input integers 
	 * @param args not used as user is asked to type in input
	 */
	public static void main(String[] args) {
        String userInput;									 						//We're going to read all user's text into a String and we try to convert it later
		int r=0;																	//Where integers will be stored
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 	//Here you declare your BufferedReader object and instance it.
        boolean listHasValue = false;												//To check if list is empty
        //while loop makes sure user inputs an integer, throws custom exception if not
        while (listHasValue != true) {
        try{
        	System.out.println("How many integers are in your list?");
            userInput = br.readLine();											 	//We read from user's input
            r = Integer.parseInt(userInput); 										//We validate if "userInput" is an integer (if so we skip catch call and continue on the next line, otherwise, we go to it (catch call))
           listHasValue = true;														//If all was right, we carry on
        }
        catch(Exception e){
            System.out.println("NOT A VALID ENTRY. TRY AGAIN"); //This is what user will see if he/she write other thing that is not an integer
           //You can also print exception in case you want to see it as follows:
           //e.printStackTrace();
        }
       }
        
        //initialize int array with custom size
        int[] sampleList = new int[r];
        //second temp storage for user input
        int r2 = 0;
        for (int x = 0;x<r;x++) {
        	System.out.println("List Item #"+ (x+1) + ":");
        	try {
				userInput = br.readLine(); //We read from user's input
				r2 = Integer.parseInt(userInput); //We validate if "userInput" is an integer
				sampleList [x] = r2;//populate array with user input
			} catch (Exception e) {
				//for normal error reports remove comment tag below
				//e.printStackTrace();
				System.out.println("INPUT NOT VALID. TRY AGAIN");
				x--;//reduces counter by one so user can try again.
			}
		}
        //calculate and print out sum of items in the list
        int sum = 0;
        for (int y : sampleList)
		    sum += y;
		
		System.out.println("The Total Sum of the list is: " + sum);
		

	}
}
	
	

