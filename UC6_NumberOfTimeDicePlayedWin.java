package com.bridgelabz;

public class UC6_NumberOfTimeDicePlayedWin {

	public static final int startPosition=0;
	public static final int noPlay=1;
	public static final int Ladder=2;
	public static final int Snake=3;
	public static final int minPosition=0;
	public static final int maxPosition=100;

	public static void main(String[] args){

		int playerPosition=startPosition;
		int numberOfDiceRolls=0;

		System.out.println("Player at Start Position "+startPosition);

		while(playerPosition<maxPosition)
		{
			int diceRoll=((int)Math.floor(Math.random()*10)%6)+1;

			numberOfDiceRolls++;
			System.out.println("Dice Roll : "+diceRoll);
			int optionCheck=(int)Math.floor(Math.random()*10)%3+1;

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
				System.out.println("Player Position : "+playerPosition);
				break;
			} else if (playerPosition > maxPosition) {
				playerPosition -= diceRoll;
				System.out.println("Not valid Dice Face. You are staying on same position.");
			} else if (playerPosition < minPosition) {
				playerPosition = startPosition; 
				System.out.println("You came back to start.");
			} else {
				System.out.println("New Position: " + playerPosition);
			}

		}
		System.out.println("You have Won.");
		System.out.println("The Dice was rolled "+numberOfDiceRolls+" times to win the game.");		
	}

}
