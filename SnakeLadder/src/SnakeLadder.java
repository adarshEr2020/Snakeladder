import java.util.Random;
public class SnakeLadder {
	
	public static void main(String[] args) {

		System.out.println("welcome to snake ladder game :");
		// player initial position 
		int playerPosition = 0;
		System.out.println("player start position = " +playerPosition);
		
		// generate random dice value 1 to 6
		int diceRoll=(int)Math.floor((Math.random()*(6)+1));
		System.out.println("Dice roll : " +diceRoll);
	}

}
