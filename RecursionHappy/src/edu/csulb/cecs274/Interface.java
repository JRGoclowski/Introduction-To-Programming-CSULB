package edu.csulb.cecs274;

import java.util.Scanner;
import java.util.Arrays;
import java.util.InputMismatchException;

//gives the option for short hand user input and scanner methods
public class Interface {
	
	Scanner s;
	
	//constructor for the interface, just makes a scanner
	public Interface()
	{
		s = new Scanner(System.in);
	}
	
	//Allows for user string input. Also checks the user input against
	//an array of acceptable inputs, and returns an error message
	//if the input is not one of the desired inputs
	public String stringIn(String[] a)
	{
		String response = s.next();
		while (!Arrays.asList(a).contains(response))
		{
			println("That is not an acceptable input.");
			println("Please input one of the following options:");
			for (int i = 0; i < a.length; i++)
			{
				println(a[i]);
			}
			response = s.next();
		}
		return response;
	}
	
	//Allows for user integer input. If the input is not an integer
	//returns an error message and requires the user input an integer
	public int intIn()
	{
		while(true)
		{
			try
			{
			  return s.nextInt();
			}
			catch(InputMismatchException/*remember to imp*/
					exception)
			{
			  s.next();
			  println("This is not an integer");
			  println("Please input an integer");
			}

		}
		

		/*while (!Arrays.asList(a).contains(response))
		{
			print("That is not an acceptable input.");
			print("Please input one of the following options:");
			print(a[0] + " - " a [length])
			response = s.next();
		}*/
	}
	
	//System.out.println short hand
	public void print(String output)
	{
		System.out.print(output);
	}
	
	public void println(String output)
	{
		System.out.println(output);
	}

}
