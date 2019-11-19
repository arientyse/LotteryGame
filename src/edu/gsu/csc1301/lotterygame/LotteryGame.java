package edu.gsu.csc1301.lotterygame;

/**
 * This program will determine if the user is the lottery winner by evaluating if their provided list of numbers
 * matches the set list of winning numbers
 * 
 * @author Ariana Tyson
 * @version 11/19/2019
 *
 */

import java.util.Scanner;
import java.util.Arrays;

public class LotteryGame 
{

	static final int NUM_DIGITS = 5;
	
	public static void main(String[] args) 
	{
		
		Scanner in = new Scanner(System.in);
		
		greetUser(); //Displays the welcome message for the user
		
		//Input
		
		//Computation
		
		//Output
		

	}

	//The following method prints the welcome message for the user
	public static void greetUser()
	{
		
		System.out.println("Welcome to the Lottery Game!\n");
		
		System.out.println("You will pick 5 numbers (0-9) and we will see if you are the Grand Prize Winner!");
		
	}
	
}
