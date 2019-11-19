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
		
		int[] arr = getLotteryNumbers();
		
		

	}

	//The following method prints the welcome message for the user
	public static void greetUser()
	{
		
		System.out.println("Welcome to the Lottery Game!\n");
		
		System.out.println("You will pick 5 numbers (0-9) and we will see if you are the Grand Prize Winner!");
		
	}
	
	/*The following method sorts a random set of 5 numbers, whose values are between 0-9 to find '
	 * the set of lottery numbers.
	 * 
	 * @return lotteryWinners
	 * 
	 */
	public static int[] getLotteryNumbers()
	{
		
		Scanner in = new Scanner(System.in);
		
		int[] lotteryNumbers = new int[NUM_DIGITS];
		
		for (int i = 0; i < NUM_DIGITS; i++)
		{
			lotteryNumbers[i] = (int) (Math.random() * (0 - 9));
		}
		
		Arrays.sort(lotteryNumbers);
		
		return lotteryNumbers;
				
	}
	
	/*
	 * The following method obtains the user's number picks and validates the numbers to ensure
	 * they're between 0-9
	 * 
	 * @return numberPicks
	 * 
	 */
	
	public static int[] getUserPicks()
	{
	
		Scanner in = new Scanner(System.in);
		
		int[] numberPicks = new int[NUM_DIGITS];
		
		for (int i = 0; i < NUM_DIGITS; i++)
		{
			System.out.print("");
		}
		
		Arrays.sort(numberPicks);
		
		return numberPicks;
		
	}
	
	/*
	 * The following method finds matches in the Lottery Numbers and in the User's chosen numbers. 
	 * 
	 * 
	 */
	public static int[] findMatches(int[] lotteryNums, int[] userPicks)
	{
		
		int count = 0;
		
		
		
		return count;
		
	}
	
}
