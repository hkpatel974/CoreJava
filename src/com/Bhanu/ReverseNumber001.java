package com.Bhanu;

import java.util.Scanner;

public class ReverseNumber001
{
	public void reverseNumber()
	{
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Enter the number : ");
		
		int number = sc.nextInt();
		
		int reverse = 0;
		
		while(number!=0)
		{
			reverse = reverse * 10;
			
			reverse = reverse + number%10;
			
			number = number/10;
			
		}
		
		System.out.println("Reverse number is : " + reverse);
	}

	public static void main(String[] args)
	{
		ReverseNumber001 obj = new ReverseNumber001();
		
		obj.reverseNumber();
		
	}

}
