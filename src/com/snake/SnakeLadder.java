package com.snake;

public class SnakeLadder {
	// constants

	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;

	// main here 
	public static void main(String[] args) {
		System.out.println("Welcome To Snake Ladder Game : ");
		int playerPosition = 0;
		System.out.println("playerPosition " +playerPosition);
		
		int winningPosition = 100;
		for(playerPosition = 0; playerPosition < winningPosition; playerPosition++) {
			int diceRoll = (int) (Math.random()*6)+1;
			int option = (int) (Math.random()*3);

			if(playerPosition < 0) {
				switch(option) {
				case NO_PLAY: 
					playerPosition = 0;
					//System.out.println("Player position is: "+playerPosition);
					break;
				case LADDER:
					playerPosition += diceRoll;
					//System.out.println("Player position is: "+playerPosition);
					break;
				case SNAKE:
					playerPosition -= diceRoll;
					break;

				}

			}

		}
		System.out.println("playerPosition = " +playerPosition);
	}
}

