package com.Utility;

import java.util.*;
/**
 * @author admin1
 *
 */


public class utility {

	/**
	 * @return 
	 */
	public int getRandom()
	{
	Random ran=new Random();
	int Dice1=ran.nextInt(6)+1;
	int Dice2=ran.nextInt(6)+1;
	return Dice1+Dice2;
	}
	
	/**
	 * @param a          
	 * @param b
	 * @param c
	 */
	public void getIntOpt(int a,int b,int c)
	{
		int Output1=a+b*c;
		System.out.println(Output1);
		int Output2=a*b+c;
		System.out.println(Output2);
		int Output3=c+a/b;
		System.out.println(Output3);
		int Output4=a%b+c;
		System.out.println(Output4);
	}
	
	/**
	 * @param a
	 * @param b
	 * @param c
	 */
	public void getDoubleOpt(double a,double b,double c)
	{
		double Output1=a+b*c;
		System.out.println(Output1);
		double Output2=a*b+c;
		System.out.println(Output2);
		double Output3=c+a/b;
		System.out.println(Output3);
		double Output4=a%b+c;
		System.out.println(Output4);
	}
	
	
	/**
	 * @param year 
	 */
	public void getLeapYear(int year)
	{
		if(year > 1582)
		{
			if((year%400==0) || (year%4==0) && (year%100!=0))  
			{
				System.out.println("Entered Number is Leap Year");
			}
			else
			{
				System.out.println("Enter number is not leap year");
			}
		}
		else
			System.out.println("Invalid Year");

	}

	
}
