package com.bridgelabz;

public class UC3_TheyAreNoPlayLadderOrSnake {

	public static final int startPosition=0;
	public static final int noPlay=1;
	public static final int Ladder=2;
	public static final int Snake=3;
	
	public static void main(String[] args){

		int playerPosition=startPosition;

		System.out.println("Player at Start Position "+startPosition);
		
		int diceRoll=((int)Math.floor(Math.random()*10)%6)+1;
		
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
		default:
		}

	}

}
