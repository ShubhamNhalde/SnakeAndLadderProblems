package com.bridgelabz;



public class UC2_PlayerRollsTheDie {

	public static final int startPosition=0;
	public static void main(String[] args){

		System.out.println("Player at Start Position "+ startPosition);

		int diceRoll=((int)Math.floor(Math.random()*10)%6)+1;

		System.out.println("Dice Roll : "+diceRoll);
	}
}
