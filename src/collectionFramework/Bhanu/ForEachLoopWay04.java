package collectionFramework.Bhanu;

import java.util.ArrayList;

public class ForEachLoopWay04
{
	public static void main(String[] args)
	{
		ArrayList<String> array = new ArrayList<String>();
		array.add("Test1");
		array.add("Test2");
		array.add("Test3");
		array.add("Test4");

		// for-each loop will iterator over array list
		// obj will get element one by one from array list

		for (String obj : array) 
		{
			System.out.println(obj);
		}
	}

}
