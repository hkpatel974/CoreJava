package collectionFramework.Bhanu;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorWay03
{
	public static void main(String[] args) 
	{
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("Test1");
		array.add("Test2");
		array.add("Test3"); 
		array.add("Test4"); 
		
		Iterator<String> itr = array.iterator();
		
		while(itr.hasNext())
		{ 
			System.out.println(itr.next()); 
		}		
	}

}
