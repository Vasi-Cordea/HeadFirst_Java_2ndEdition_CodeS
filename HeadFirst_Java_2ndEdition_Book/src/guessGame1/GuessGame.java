package guessGame1;

public class GuessGame {
/*uessGame has three instance
	variables for the three Player
	objects*/
	Player p1;
	Player p2;
	Player p3;

	public void startGame() {
		/*
		 * assign them to the three Player
instance variables
*/
		
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();
		/*
		 * three guesses the Players make
		 */
		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0;
		/*
		 * declare three variables to hold a true or
false based on the player’s answer
		 */
		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;
		/*make a ‘target’ number that the
players have to guess
*/
		int targetNumber = (int) (Math.random() * 10);
		System.out.println("I’m thinking of a number between 0 and 9...");
		while (true) {
			System.out.println("Number to guess is " + targetNumber);
			/*
			 * call each player’s guess() method
			 */
			p1.guess();
			p2.guess();
			p3.guess();
			/*
			 * guess() method running) by accessing the
number variable of each player
			 */
			guessp1 = p1.number;
			System.out.println("Player one guessed " + guessp1);
			guessp2 = p2.number;
			System.out.println("Player two guessed " + guessp2);
			guessp3 = p3.number;
			System.out.println("Player three guessed " + guessp3);

			/*
			 * check each player’s guess to see if it matches
the target number. If a player is right,
then set that player’s variable to be true
(remember, we set it false by default)
			 */
			if (guessp1 == targetNumber) {
				p1isRight = true;
			}
			if (guessp2 == targetNumber) {
				p2isRight = true;
			}
			if (guessp3 == targetNumber) {
				p3isRight = true;
			}
			/*
			 * 	if player one OR player two OR player three is right...
			(the || operator means OR)
			 */
		
			if (p1isRight || p2isRight || p3isRight) {
				System.out.println("We have a winner!");
				System.out.println("Player one got it right? " + p1isRight);
				System.out.println("Player two got it right? " + p2isRight);
				System.out.println("Player three got it right? " + p3isRight);
				System.out.println("Game is over.");
				break; // game over, so break out of the loop
				/*
				 * therwise, stay in the loop and ask the
players for another guess.
				 */
			} else {
				// we must keep going because nobody got it right!
				System.out.println("Players will have to try again.");
			} // end if/else
		} // end loop
	} // end method
} // end class
