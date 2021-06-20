package com.snake;

public class SnakeLadder {
// constants
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;

	public static int playerPosition = 0;
	
	// dice roll and check conditions
	public void dice() {
		int diceRoll = (int) (Math.random()*6)+1;
		System.out.println("diceRoll = " +diceRoll);

		int option = (int) (Math.random()*3);
		System.out.println("option : " +option);

		switch(option) {
		// no play position 
		case NO_PLAY :
			playerPosition += 0; 
			break;
		
		// if ladder moves ahead 
		case LADDER :
			playerPosition += diceRoll;
			break;
			
		// if snake moves behind
		case SNAKE :
			if(playerPosition < 0)
			playerPosition -= diceRoll;
			break;
		}
		System.out.println("player position : " +playerPosition);
	}

	// main here 
	public static void main(String[] args) {
		System.out.println("Welcome To Snake Ladder Game : ");
		System.out.println("Single player start position : " +playerPosition); 
		SnakeLadder snakeladder = new SnakeLadder();  // object
		
		snakeladder.dice(); // calling d
	}

}
