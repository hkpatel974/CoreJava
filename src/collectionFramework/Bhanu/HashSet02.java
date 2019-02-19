package collectionFramework.Bhanu;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet02
{
	public static void main(String[] args) 
	{
		// Creating HashSet object and adding elements
		Set<String> set = new HashSet<String>();
		
		set.add("Test1");
		set.add("Test2");
		set.add("Test3");
		set.add("Test4");
		
		// Traversing elements
		Iterator<String> itr = set.iterator();
		
		while (itr.hasNext())
		{
		   System.out.println(itr.next());
		}
	}

}
