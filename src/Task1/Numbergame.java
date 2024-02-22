package Task1;
import java.util.Random;
import java.util.Scanner;

public class Numbergame {
	static int Guessnum;
	static String Name;
	static int score=10;
	static boolean online=true;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
        Random random = new Random();
        int randomnum;
        randomnum = random.nextInt(11);
     
        System.out.println(randomnum); //for testing
        
        System.out.println("Enter your name");
        Name= sc.next();
		System.out.println("Guess the number between 0 to 10");
		
		
		for(int limit=1;limit<6;limit++) {
			Guessnum = sc.nextInt();
			System.out.println("number of attempts remains " + (5-limit) );
			
			
            if (Guessnum == randomnum) {
                System.out.println(" You guessed the correct number!!: " + randomnum);
                break;
            } 
            else {
                System.out.println("Not this Number !!Try again!");
                if(randomnum>Guessnum)
                System.out.println("Hint number is Higher");
                if(randomnum<Guessnum)
                System.out.println("Hint number is Lower");
                	if(limit==3) {
                	System.out.println("Play again");
                	}
            }
            score=10-(limit*2);
		}
		
		
		System.out.println("Player name "+ Name);
		System.out.println("Player score "+ score);
		
		online = false;
		System.out.println("Do you wanna play again?Choice 1 or 2.");
		System.out.println("1. yes");
		System.out.println("2. no");
		
		int play = sc.nextInt();
		if (play==1) {
		    online = true;
		} else {
		    online = false;
		    System.out.println("Going offline....");
		    break;
		}
			
		} while (online);
		
		sc.close();
		
	}
		
}
