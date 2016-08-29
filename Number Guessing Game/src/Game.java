import java.util.Scanner;
import java.util.Random;

public class Game {
	public static void main(String args[])	{
		Random apples = new Random();
		Scanner input = new Scanner(System.in);
		int number;
		int guess;
		int tries = 10;
		number = 1 + apples.nextInt(100);
		
		while(tries > 0) {
			System.out.println("Guess the number between 1 and 100, you have " + tries + " tries left.");
			guess = input.nextInt();
				if(guess == number) 
					System.out.println("You win, congratulations");
				else if (guess > number)
					System.out.println("Go lower");
				else
					System.out.println("Go higher");
				tries--;
				if(tries == 0){
					System.out.println("Haha, you lose! The answer was " + number);
				}else{
			
				}
				if (guess== number){
					tries = 0;
				}else{
					
				}
				
				
			}
		
		
	}
	

}


