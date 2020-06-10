package javabasics;

import java.util.Scanner;

public class basic1 

{

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		System.out.println(" I am new to java");
		
		// 1. addition of two numbers
		
		int a = 2; 
		int b = 4;
		
		int c=a+b;
		
		System.out.println(c);
	
		// 2. Entered number is prime or not
		
		/*
		System.out.println("********Enter a number*******");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int Count=0;
		
		for (int i=2; i<=num-1;i++)
			{
				if(num%i==0)
				{
					Count=1;
					break;	     
				} 
			}
		if(Count==0)
			{
				System.out.println("The entered number " + num + " is prime number");
			}
		else
			{
				System.out.println("The entered number is not a prime");
			}
		
		*/
		
		// 3. Entered year is LEAP or not
		
		/*
		System.out.println("********* Enter a year*******");
		
		Scanner sc3 = new Scanner(System.in);
		int k4 = sc3.nextInt();
		
		if((k4 % 400 == 0) || ((k4 % 4 == 0) && (k4 % 100 != 0)))
		{
			System.out.println("The year is leap year");
			
		}
		else
		{
			System.out.println("It is not a leap year");
		}
		
		*/
		
		// 4. Entered number frequency
		
		System.out.println("******Enter a number********");
		
		Scanner sc4 = new Scanner(System.in);
		int num2= sc4.nextInt();
		
		
		
	}
	
	   
}



