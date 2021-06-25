package com.snake;

public class SnakeLadder {
	// constants

	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	static int playerPosition = 0;
	int winningPosition = 100;

	// dicecheck method
	public void diceCheck() {
		for(playerPosition = 0; playerPosition < winningPosition; playerPosition++) {
			int diceRoll = (int) (Math.random()*6)+1;
			int option = (int) (Math.random()*3);

			switch(option) {
			case NO_PLAY: 
				playerPosition = 0;
				System.out.println("Player position is: "+playerPosition);
				break;
			case LADDER:
				playerPosition += diceRoll;
				//System.out.println("Player position is: "+playerPosition);
				if(playerPosition > 100) {
					playerPosition -= diceRoll;
					System.out.println("After ladder playerPosition = " +playerPosition);
				}
				
				break;
			case SNAKE:
				playerPosition -= diceRoll;
				System.out.println("After snake playerPosition = " +playerPosition);
				break;

			}
			
		}
		System.out.println("win playerPosition = " +playerPosition);
	}
	

	public static void main(String[] args) {
		SnakeLadder snakeLadder = new SnakeLadder();
		System.out.println("Welcome To Snake Ladder Game : ");
		System.out.println("playerPosition " +playerPosition);
		snakeLadder.diceCheck();
		
		// if completed 100 repeat from start 
		if(playerPosition > 100) {
			snakeLadder.diceCheck();
		}else if(playerPosition == 100) {
			snakeLadder.diceCheck();
		}else {
			snakeLadder.diceCheck();
		}
	}
}
