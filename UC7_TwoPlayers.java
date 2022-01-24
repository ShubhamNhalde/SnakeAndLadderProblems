package com.bridgelabz;

public class UC7_TwoPlayers {

	public static final int startPosition=0;
	public static final int noPlay=1;
	public static final int Ladder=2;
	public static final int Snake=3;
	public static final int minPosition=0;
	public static final int maxPosition=100;

	public static void main(String[] args){

		int playerPosition=startPosition, player2Position=startPosition;
		int numberOfDiceRolls=0, numberOfDiceRolls2=0, diceRoll=0, diceRoll2=0, optionCheck, optionCheck2;

		System.out.println("Player 1 & 2 at Start Position "+startPosition);

		while(playerPosition<maxPosition && player2Position<maxPosition)
		{

			numberOfDiceRolls++;
			diceRoll=((int)Math.floor(Math.random()*10)%6)+1;
			System.out.println("Dice Roll : "+diceRoll);
			optionCheck=(int)Math.floor(Math.random()*10)%3+1;

			switch(optionCheck){

			case Ladder:
				System.out.println("Ladder");
				playerPosition+=diceRoll;
				break;

			case Snake:
				System.out.println("Snake");
				playerPosition-=diceRoll;
				break;

			case noPlay:
				System.out.println("No Play");
				break;
			}

			if (playerPosition == maxPosition) {
				System.out.println("Player 1 Position : "+playerPosition);
				break;
			} else if (playerPosition > maxPosition) {
				playerPosition -= diceRoll;
				System.out.println("Not valid Dice Face. Player 1 staying on same position.");
			} else if (playerPosition < minPosition) {
				playerPosition = startPosition; 
				System.out.println("Plaayer 1 came back to start.");
			} else {
				System.out.println("New Position: " + playerPosition);
			}

			numberOfDiceRolls2++;
			diceRoll2=((int)Math.floor(Math.random()*10)%6)+1;
			System.out.println("Dice Roll : "+diceRoll2);
			optionCheck2=(int)Math.floor(Math.random()*10)%3+1;

			switch(optionCheck2){

			case Ladder:
				System.out.println("Ladder");
				player2Position+=diceRoll2;
				break;

			case Snake:
				System.out.println("Snake");
				player2Position-=diceRoll2;
				break;

			case noPlay:
				System.out.println("No Play");
				break;
			}

			if (player2Position == maxPosition) {
				System.out.println("Player 2 Position : "+player2Position);
				break;
			} else if (player2Position > maxPosition) {
				player2Position -= diceRoll2;
				System.out.println("Not valid Dice Face. Player 2 staying on same position.");
			} else if (player2Position < minPosition) {
				player2Position = startPosition; 
				System.out.println("Player 2 came back to start.");
			} else {
				System.out.println("New Position: " + player2Position);
			}

		}
		System.out.println("Player1 position : "+playerPosition);
		System.out.println("Number of times game played : "+numberOfDiceRolls);
		System.out.println("Player2 position : "+player2Position);
		System.out.println("Number of times game played : "+numberOfDiceRolls2);

		if (playerPosition==maxPosition) {
			System.out.println("Player 1 Won");
		}
		else {
			System.out.println("Player 2 Won");
		}
	}			
}	
