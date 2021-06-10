public class SnakeLadder {

	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static final int WINNING_POSITION = 100;
	public static void main(String[] args) {

		System.out.println("welcome to snake ladder game :");
		// player initial position 
		int playerPosition = 0;
		System.out.println("player start position = " +playerPosition);

		while(playerPosition <= WINNING_POSITION) {

			// generate random dice value 1 to 6
			int diceRoll=(int)Math.floor((Math.random()*(6)+1));
			System.out.println("Dice roll : " +diceRoll);

			int option = (int)((Math.random()*10) %3);
			System.out.println("option : " +option);
			switch(option) {
			case NO_PLAY:
				// player stay in the same position
				playerPosition +=diceRoll;
				break;

			case LADDER:
				// player moves ahead
				playerPosition +=diceRoll;
				break;

			case SNAKE:
				// if player position greater then subtract player position
				if(playerPosition > 0 )
					playerPosition -= diceRoll;
				break;
			}
			System.out.println("player position : " +playerPosition);
		}
	}
}
