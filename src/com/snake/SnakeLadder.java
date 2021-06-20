package com.snake;

public class SnakeLadder {
	
	public static void dice() {
		int diceRoll = (int) (Math.random()*6)+1;
		System.out.println("diceRoll = " +diceRoll);
	}

	public static void main(String[] args) {
		System.out.println("Welcome To Snake Ladder Game : ");
		int playerPosition = 0;
		System.out.println("Single player start position : " +playerPosition);
		dice();
	}

}
