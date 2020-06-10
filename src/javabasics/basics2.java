package javabasics;

import java.util.Scanner;

public class basics2 {

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub

	/*	
	    //1) For Reverse of string / palindrome
	     
		System.out.println("******* Enter Any String ******");
		
		Scanner sc = new Scanner(System.in);
		String k= sc.next();
		
		System.out.println("The number of Characters in string are: " + k.length());
		
		for(int i=k.length()-1; i>=0; i--)
		{
			
				System.out.print(k.charAt(i));
			
		}
		*/	
		
		 //2) To find number of vowels in a string
		/*
		System.out.println("Enter a String to find number of vowels");
			Scanner sc1 = new Scanner(System.in);
			
			int temp = 0;
		String k1= sc1.next();
	
		
		System.out.println(k1);
		
		for(int i=0; i<=k1.length()-1; i++)
		{
		
		if(k1.charAt(i)=='a'||k1.charAt(i)=='e'||k1.charAt(i)=='i'||k1.charAt(i)=='o'||k1.charAt(i)=='u')
		{
			temp++;
				
	    }
		}
		System.out.println("Number of vowels :" + temp);
		*/
		
		// 3. to find how many repeated letters
		
		System.out.println("******* Number of repeated letters********");
				
		String a = "india";
		int count = 0;
		
		for(int i=0; i<=a.length()-1; i++)
		{
			for(int j=0; j<a.length()-1; j++)
			{
				if(a.charAt(i)==a.charAt(j))
				{
					count ++;
				}
			}
			System.out.println(a.charAt(i) + "is " + count);
		}
		
		
		
		
	}
	

}
