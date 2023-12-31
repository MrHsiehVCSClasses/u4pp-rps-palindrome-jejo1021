package u4pp;

/**
* JAVADOC HERE
play RPS against a computer until satisfied
*/
import java.util.Scanner;

public class RockPaperScissors {

    /* ANY CODE YOU NEED HERE */
	private static int result = 0;
	private static int wins = 0;
	private static int losses = 0;
	private static int ties = 0;
	private static boolean RPSvalid = true;
	
    /**
     * JAVADOC HERE
     * @author - Jeremy John
     * @param - Scanner: create and use scanner to use method
     */
    public static void play(Scanner sc) {
        /* YOUR CODE HERE */
    	
    	
    	boolean playAgainValid = true;
    	boolean loop = true;
    	boolean run = true;
    	String input;
    	String play;
    	
    	
    	System.out.println("Welcome to Rock Paper Scissors");
    	wins = 0;
    	losses = 0;
    	ties = 0;
    	
    	result = 0;
    	String comp;
    	int x = 0;
    	
    	
    
    	//Looping
    	
    	while(x==0) {
    		
        		//start
    		run = true;
    		if(loop == true) {
    			playAgainValid = true;
    		}
    		
        	if(playAgainValid == true) {
        		System.out.print("Would you like to pick (R)ock, (P)aper, (S)cissors, or (A)ny: ");
        		
        		input = sc.nextLine();
        	
        		
        		if (isValidInput(input)) {
        			// rest of program
        			
        			if(input.equalsIgnoreCase("A")) {
        				input = randomChoice();
        			}
        			comp = randomChoice();
        		
	        		//taking results
	        		result = results(input,comp);
        	
	        		//Output
	        		resultOutput(input,comp);
	        		
	        		while(run == true) {
	        			if(RPSvalid == true) {
	        				System.out.print("Would you like to play again? (Y)es or (N)o: ");
	        				play = sc.nextLine();
	        	
	            
	        				if(!(YNValid(play))) {
	        					System.out.println("Invalid Input, please try again");
	        					playAgainValid = false;
	        					loop = false;
	        					run = true;
	        				}else if(play.equalsIgnoreCase("Y")){
	        					playAgainValid = true;
	        					loop = true;
	        					run = false;
	        				}else if(play.equalsIgnoreCase("N")) {
	        					x += 1;
	        					System.out.println("Thanks for playing!");
	        					run = false;
	           		
	        				}
	        	
	        			}
	        			
	        		}
	        		
        		} else {
        			// do nothing and loop
        			System.out.println("Invalid input, please try again");
        		}	
	        		
	        }		
        }	  	
    }		
    
    	
    	
    //determines if RPS input is valid
    private static boolean isValidInput(String playerInput) {
    	//System.out.println(playerInput);
    	//System.out.println(playerInput.equalsIgnoreCase("R"));
    	if(playerInput.equalsIgnoreCase("R") || playerInput.equalsIgnoreCase("P") || playerInput.equalsIgnoreCase("S") || playerInput.equalsIgnoreCase("A") ) {
    		return true;
    	}else {
    		return false;
    	}
    }
    
    //determines if yes/no input is valid
    private static boolean YNValid(String playerInput) {
    	//System.out.println(playerInput);
    	//System.out.println(playerInput.equalsIgnoreCase("R"));
    	if(playerInput.equalsIgnoreCase("N") || playerInput.equalsIgnoreCase("Y")) {
    		return true;
    	}else {
    		return false;
    	}
    }
    	
    

    /**
     * JAVADOC 
     * @author Jeremy John
     * @param player choice - user input or random if a is selected
     * @param computerChoice - computer generated choice
     * determines the result of an RPS match

     */
    public static int results(String playerChoice, String computerChoice) {
        /* YOUR CODE HERE */
    	
    	
    	//ignoring the case:
    	playerChoice.toUpperCase();
    	
    	//determines results
    	if(playerChoice.equalsIgnoreCase("R") || playerChoice.equalsIgnoreCase("P") || playerChoice.equalsIgnoreCase("S")) {
    		//Tie
	    	if(playerChoice.equalsIgnoreCase(computerChoice)) {
	    		return 0;
	    	
	    	// Rock vs Scissors: player wins
	    	}else if(playerChoice.equalsIgnoreCase("R") && computerChoice.equalsIgnoreCase("S")){
	    		return 1;
	    		
	    	//Rock vs Paper: computer wins
	    	}else if(playerChoice.equalsIgnoreCase("R") && computerChoice.equalsIgnoreCase("P")) {
	    		return -1;
	    		
	    	//Paper vs Rock: player wins
	    	}else if(playerChoice.equalsIgnoreCase("P")  && computerChoice.equalsIgnoreCase("R")) {
	    		return 1;
	    		
	    	//Paper vs Scissor: computer wins
	    	}else if(playerChoice.equalsIgnoreCase("P") && computerChoice.equalsIgnoreCase("S")) {
	    		return -1;
	    	
	    	//Scissors vs Paper: player wins
	    	}else if(playerChoice.equalsIgnoreCase("S")  && computerChoice.equalsIgnoreCase("P")) {
	    		return 1;
	    		
	    	//Scissor vs Rock: computer wins
	    	}else if(playerChoice.equalsIgnoreCase("S") && computerChoice.equalsIgnoreCase("R")) {
	    		return -1;
	    		
	    	}else {
	    		return 0;
	    		
	    	}
    	}else {
    		return 2;
    		
    	}
    }
    
    //prints out computer and player choice + the results of the match
    private static void resultOutput(String input, String comp) {
	    if(result >= -1 && result <= 1) {
			RPSvalid = true;
			if(result == -1) {
	       		losses += 1;
	       		if(input.equalsIgnoreCase("R") && comp.equalsIgnoreCase("P")) {
	       			System.out.println("You picked Rock, and the Computer picked Paper. You lose!");
	       		}else if(input.equalsIgnoreCase("P") && comp.equalsIgnoreCase("S")) {
	       			System.out.println("You picked Paper, and the Computer picked Scissors. You lose!");
	       		}else if(input.equalsIgnoreCase("S") && comp.equalsIgnoreCase("R")) {
	       			System.out.println("You picked Scissors, and the Computer picked Rock. You lose!");
	       		}
	    	}else if(result == 0) {
	      		ties += 1;
	    		if(input.equalsIgnoreCase("R")) {
	    			System.out.println("You both picked Rock. It's a tie!");
	        	}else if(input.equalsIgnoreCase("P")) {
	        		System.out.println("You both picked Paper. It's a tie!");
	        	}else if(input.equalsIgnoreCase("S")) {
	        		System.out.println("You both picked Scissors. It's a tie!");
	        	}
	        }else if(result == 1) {
	       		wins += 1;
	       		if(input.equalsIgnoreCase("R") && comp.equalsIgnoreCase("S")) {
	       			System.out.println("You picked Rock, and the Computer picked Scissors. You win!");
	       		}else if(input.equalsIgnoreCase("P") && comp.equalsIgnoreCase("R")) {
	        		System.out.println("You picked Paper, and the Computer picked Rock. You win!");
	        	}else if(input.equalsIgnoreCase("S") && comp.equalsIgnoreCase("P")) {
	        		System.out.println("You picked Scissors, and the Computer picked Paper. You win!");
	        	}
	        }
			System.out.println("You have " + wins + " wins and " + losses + " losses and " + ties + " ties");
			
		}else if(result == 2) {
    		System.out.println("Invalid Input, please try again");
    		RPSvalid = false;
    	}
    }
    
    //returns a random RPS choice for comp/if user selects a
    private static String randomChoice() {
    	
		int tempChoice = (int)(Math.random()*3+1);
    		
		if(tempChoice == 1) {
			return "R";
		}else if(tempChoice == 2) {
    		return "P";
		}else{
    		return "S";
		}
    }    /* any helper methods you might need */    
}
