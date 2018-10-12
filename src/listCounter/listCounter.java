/**
 * 
 */
package listCounter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author tfprado
 *
 */
public class listCounter {	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
			
		int r=0;
        String userInput; //We're going to read all user's text into a String and we try to convert it later
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Here you declare your BufferedReader object and instance it.
        boolean listHasValue = false;
        while (listHasValue != true) {
        try{
        	System.out.println("How many integers are in your list?");
            userInput = br.readLine(); //We read from user's input
            r = Integer.parseInt(userInput); //We validate if "userInput" is an integer (if so we skip catch call and continue on the next line, otherwise, we go to it (catch call))
           listHasValue = true;//If all was right, we carry on
        }
        catch(Exception e){
            System.out.println("NOT A VALID ENTRY. TRY AGAIN"); //This is what user will see if he/she write other thing that is not an integer
            //We call this class again, so user can try it again
           //You can also print exception in case you want to see it as follows:
           // e.printStackTrace();
        }
       }
        
        int[] sampleList = new int[r];
        int r2 = 0;
        for (int x = 0;x<r;x++) {
        	System.out.println((x+1) + "st number:");
        	try {
				userInput = br.readLine(); //We read from user's input
				r2 = Integer.parseInt(userInput); //We validate if "userInput" is an integer
				sampleList [x] = r2;
			} catch (Exception e) {
				//e.printStackTrace();
				System.out.println("INPUT NOT VALID. TRY AGAIN");
				x--;
			}
		}
        int sum = 0;
        for (int y : sampleList)
		    sum += y;
		
		System.out.println("The Total Sum of the list is: " + sum);
		

	}
}
	
	

