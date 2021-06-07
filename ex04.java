/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Steven Tristan
 */

import java.util.Scanner;

public class example4
{
	public static void main(){
		ex4();
	}

	private static void ex4()
	{
		System.out.println("Enter a noun:");
		Scanner s = new Scanner(System.in);
		String noun = s.nextLine();
		System.out.println("Enter a verb:");
		String verb = s.nextLine();
		System.out.println("Enter an adjective:");
		String adjective = s.nextLine();
		System.out.println("Enter an adverb:");
		String adverb = s.nextLine();
		System.out.println("Dou you " + verb + " your " + adjective + " " + noun + " " + adverb + "? That's hilarious!");
	}

}
