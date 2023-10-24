package u4pp;
/**
* YOUR COMMENTS HERE
*/
import java.util.Scanner;

public class PalindromeTester {

    /**
     * YOUR JAVADOC HERE
     * @param Scanner - make scanner to use this function
     * @author Jeremy John
     * palindrome tester program
     * runs as long as the user wants
     */
    public static void execute(Scanner sc) {
    	
        /* YOUR CODE HERE */
    	int x = 0;
    	
    	String phrase = "";
    	String response = "";
    	boolean test;
    	boolean ignoreStart = false;
    	System.out.println("Welcome to Palindrome Tester");
    	while(x == 0) {
    		
    		//reset variables
    		x = 0;
        	
        	phrase = "";
        	response = "";
        	
    		
    		if(ignoreStart == false) {
	    		System.out.print("Enter a phrase: ");
	    		phrase = sc.nextLine();
	    		test = isPalindrome(phrase);
	    		if(test == true) {
	    			System.out.println(phrase + " is a palindrome");
	    		}else {
	    			System.out.println(phrase + " is not a palindrome");
	    		}
    		}    		
    		System.out.print("Keep testing? (Y)es or (N)o: ");
    		response = sc.nextLine();
    		if(isValid(response) == true) {
    			if(response.equalsIgnoreCase("N")) {
    				x += 1;
    			}
    			ignoreStart = false;
    		}else {
    			System.out.println("Invalid Input, please try again");
    			ignoreStart = true;
    		}
    	}
    }

    /**
     * YOUR JAVADOC HERE
     * @author - Jeremy John
     * @param phrase - enter a phrase to test if it is a palindrome
     * @return - boolean, true = is palindrome, false = not a palindrome
     * 
     */
    public static boolean isPalindrome(String phrase) {
        /* YOUR CODE HERE */
    	//format the original phrase
    	phrase = phrase.toLowerCase();	
    	phrase = removeNumbers(phrase);
    	phrase = removeSpaces(phrase);
    	phrase = removePunctuation(phrase);
    	
    	//makes a flipped version of the inputed phrase
    	String testPhrase;
    	testPhrase = flipPhrase(phrase);
    	
    	//tests if phrase is a palindrome
    	if(phrase.equals(testPhrase)) {
    		return true;
    	}else {
    		return false;
    	}
    }
    
    //removes all digits from the test phrase
    private static String removeNumbers(String palindrome) {
    	//removing 1
    	for(int i = 0;  i < palindrome.length(); i++) {
    		if(palindrome.indexOf("1") >= 0) {
    			palindrome = (palindrome.substring(0,palindrome.indexOf("1")) + palindrome.substring(palindrome.indexOf("1") + 1) );
    		}
    	}
    	//removing 2
    	for(int i = 0;  i < palindrome.length(); i++) {
    		if(palindrome.indexOf("2") >= 0) {
    			palindrome = (palindrome.substring(0,palindrome.indexOf("2")) + palindrome.substring(palindrome.indexOf("2") + 1) );
    		}
    	}
    	//removing 3
    	for(int i = 0;  i < palindrome.length(); i++) {
    		if(palindrome.indexOf("3") >= 0) {
    			palindrome = (palindrome.substring(0,palindrome.indexOf("3")) + palindrome.substring(palindrome.indexOf("3") + 1) );
    		}
    	}
    	//removing 4
    	for(int i = 0;  i < palindrome.length(); i++) {
    		if(palindrome.indexOf("4") >= 0) {
    			palindrome = (palindrome.substring(0,palindrome.indexOf("4")) + palindrome.substring(palindrome.indexOf("4") + 1) );
    		}
    	}
    	//removing 5
    	for(int i = 0;  i < palindrome.length(); i++) {
    		if(palindrome.indexOf("5") >= 0) {
    			palindrome = (palindrome.substring(0,palindrome.indexOf("5")) + palindrome.substring(palindrome.indexOf("5") + 1) );
    		}
    	}
    	//removing 6
    	for(int i = 0;  i < palindrome.length(); i++) {
    		if(palindrome.indexOf("6") >= 0) {
    			palindrome = (palindrome.substring(0,palindrome.indexOf("6")) + palindrome.substring(palindrome.indexOf("6") + 1) );
    		}
    	}
    	//removing 7
    	for(int i = 0;  i < palindrome.length(); i++) {
    		if(palindrome.indexOf("7") >= 0) {
    			palindrome = (palindrome.substring(0,palindrome.indexOf("7")) + palindrome.substring(palindrome.indexOf("7") + 1) );
    		}
    	}
    	//removing 8
    	for(int i = 0;  i < palindrome.length(); i++) {
    		if(palindrome.indexOf("8") >= 0) {
    			palindrome = (palindrome.substring(0,palindrome.indexOf("8")) + palindrome.substring(palindrome.indexOf("8") + 1) );
    		}
    	}
    	//remvoing 9
    	for(int i = 0;  i < palindrome.length(); i++) {
    		if(palindrome.indexOf("9") >= 0) {
    			palindrome = (palindrome.substring(0,palindrome.indexOf("9")) + palindrome.substring(palindrome.indexOf("9") + 1) );
    		}
    	}
    	//removing 0
    	for(int i = 0;  i < palindrome.length(); i++) {
    		if(palindrome.indexOf("0") >= 0) {
    			palindrome = (palindrome.substring(0,palindrome.indexOf("0")) + palindrome.substring(palindrome.indexOf("0") + 1) );
    		}
    	}
    	return palindrome;
    }
    
    //removes all spaces from the test phrase
    private static String removeSpaces(String palindrome) {
    	for(int i = 0;  i < palindrome.length(); i++) {
    		if(palindrome.indexOf(" ") >= 0) {
    			palindrome = (palindrome.substring(0,palindrome.indexOf(" ")) + palindrome.substring(palindrome.indexOf(" ") + 1) );
    		}
    	}
    	//System.out.println("Removed spaces: " + palindrome);
    	return palindrome;
    }
    
    //removes the puctuation from the test phrase
    private static String removePunctuation(String palindrome) {
    	String noPunct = palindrome.replaceAll("\\p{Punct}", "");
    	return noPunct;
    }
    
    //returns a flipped version of the input
    private static String flipPhrase(String palindrome) {
    	String temp = "";
    	for(int i = palindrome.length() -1 ; i >= 0; i--) {
    		 temp = temp + palindrome.substring(i, i+1);
    	}
    	return temp;
    }
    
    //determines if the yes/no input is valid, if yes, then continue as normal, if no, repeat the question
    private static boolean isValid(String response) {
    	if(response.equalsIgnoreCase("N") || response.equalsIgnoreCase("Y")) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
}