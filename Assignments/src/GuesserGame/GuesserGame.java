package GuesserGame;

import java.util.Scanner;

// Enhancement: 1. Every player gets three chances.
//				2. if tie b/w two players then whole process repeated to find one winner

class Guesser{
	
	int guessNum;
	int gNum;
	
	void guessNum() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Guesser,Kindly guess a number in range of 1 to 20");
		guessNum = scan.nextInt();
		if(guessNum>20) 
		{
			System.out.println("Guess a number within range");
			guessNum = scan.nextInt();
		}
//		return guessNum;
	}
//		int guessNumForTieBreaker() {
//			
//			Scanner scan = new Scanner(System.in);
//			System.out.println("Guesser,Kindly guess the number for tie breaker round,range 20 to 30");
//			gNum	= scan.nextInt();
//			return gNum;
//		}
	}

class Players{
	
	int guessNum;
	
	int guessNum() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Player,Kindly guess a number in range of 1 to 20");
		guessNum = scan.nextInt();
		if(guessNum>20) 
		{
			System.out.println("Guess a number within range");
			guessNum = scan.nextInt();
			
		}
		return guessNum;
	}
	
}

class Umpire{
	
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	Guesser g = new Guesser();
	
	Players p1 = new Players();
	Players p2 = new Players();
	Players p3 = new Players();
	
	void collectNumFromGuesser() {
		 g.guessNum();
		 numFromGuesser =g.guessNum;
//		 System.out.println(numFromGuesser);
	}		
	void collectNumFromPlayer1() 
	{
		Players p1 = new Players();
		numFromPlayer1 = p1.guessNum();
	}
	void collectNumFromPlayer2() 
	{
		Players p2 = new Players();
		numFromPlayer2 = p2.guessNum();
	}
	void collectNumFromPlayer3() 
	{
		Players p3 = new Players();
		numFromPlayer3 = p3.guessNum();
	}

	void compareNum() {
		
		int chance_counter = 1;
		
		while(chance_counter<=3) {
			
		if (numFromGuesser==numFromPlayer1)
		{
		 if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
		 {
			System.out.println("All win!!");
		 }
		 else if(numFromGuesser==numFromPlayer2)
		 {
//			System.out.println("Player1 and Player2 are the winners!");
			System.out.println("Player1 and Player2 are in tie!");
			tieBreaker();
		 }
		 else if(numFromGuesser==numFromPlayer3)
		 {
//			 System.out.println("Player1 and Player3 are the winners!");
			 System.out.println("Player1 and Player3 are in tie!");
			 tieBreaker();
		 }
		 else {
			 System.out.println("Player1 is the winner!");
			 break;
		 }
		}
		 else if(numFromGuesser==numFromPlayer2)
		 {
			 if(numFromGuesser==numFromPlayer3) {
//				 System.out.println("Player2 and Player3 are the winners!");
				 System.out.println("Player2 and Player3 are in tie!");
				tieBreaker();
			 }
			 else {
				 System.out.println("Player2 is the winner!");
				 break;
			 }
		 }
		 else if (numFromGuesser==numFromPlayer3)
		 {
			 System.out.println("Player3 is the winner!");
			 break;
		 }
		 else
		 {	
			 System.out.println("All lost!!");
			 chance_counter++;
				if(chance_counter==4)
				{
					System.out.println("Sorry,You have all exceeded the num of chances.");
					break;
				}
				else 
				{
				System.out.println(chance_counter+" chance:,Try Again!!");
				collectNumFromPlayer1();
				collectNumFromPlayer2();
				collectNumFromPlayer3();
				}
				}
		 } 
			
	}
	void tieBreaker() {
		
		if(numFromGuesser==numFromPlayer1&&numFromGuesser==numFromPlayer2)
		{
		collectNumFromGuesser();
		collectNumFromPlayer1();
		collectNumFromPlayer2();
		compareNum();
		}
		if(numFromGuesser==numFromPlayer2&&numFromGuesser==numFromPlayer3)
		{
		collectNumFromGuesser();
		collectNumFromPlayer2();
		collectNumFromPlayer3();
		compareNum();
		}
		if(numFromGuesser==numFromPlayer1&&numFromGuesser==numFromPlayer3)
		{
		collectNumFromGuesser();
		collectNumFromPlayer1();
		collectNumFromPlayer3();
		compareNum();
		}
	}
	}

public class GuesserGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Umpire ump = new Umpire();
		ump.collectNumFromGuesser();
		ump.collectNumFromPlayer1();
		ump.collectNumFromPlayer2();
		ump.collectNumFromPlayer3();
		ump.compareNum();
	}

}
