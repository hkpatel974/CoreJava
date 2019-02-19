package com.Bakkapa;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList01 
{

	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Hematnt");
		list.add("K");
		list.add("Patel");
		list.add("Test");
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
