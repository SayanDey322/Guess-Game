import java.util.Scanner;
public class Guess
{
	public static void main(String[] args) {
	    
	    
		Scanner in = new Scanner(System.in); 
		
		
		System.out.println("NUMBER GUESSING GAME");
		System.out.println();
		
		System.out.println("INSTRUCTIONS:");

		System.out.println("1)Enter the minimum and maximum range of your choice");
		System.out.println("2)Your Aim is to guess the random number generated between the above range");
		System.out.println("3)If you find the random number in minimum number of guesses");
		System.out.println("You WIN or you LOSE the game");
		System.out.println();
		
		System.out.println("OK LET'S BEGIN");
		System.out.println();
		
		 
		int min;
		int max;
		int res;
		int guess_count = 0;
		
		System.out.println("Enter your minimum range");
		min = in.nextInt();
		System.out.println("Enter your maximum range");
		max = in.nextInt();
		System.out.println();
		
		int n = (int)(Math.random()*(max-min+1)+min);   
		int guess;
		
		System.out.println("Enter your guess (between '" + min +"' and '"+ max+ "' range)");
		while(true){ 
		    
		    guess = in.nextInt(); 
		    
		    
 		    if(guess > n){
		        System.out.println("NUMBER is LESS than your GUESS");
		        guess_count++;
		    }
		    
		    
		    if(guess < n){
		        System.out.println("NUMBER is GREATER than your GUESS");
		        guess_count++;
		    }
		    
		    
		    if(guess == n){
		        System.out.println("GUESS is CORRECT");
		        
		        
		        break;
		        
		    }
		    System.out.println();
		    System.out.println("Enter your new GUESS");
		}
		
		System.out.println();
		if(guess_count >= 5){
		    System.out.println("You LOST the game");
		}
		else{
		    System.out.println("You WON the game");
		}
		System.out.println();
		System.out.println("GAME ENDED");
	}
}