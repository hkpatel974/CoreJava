package collectionFramework.Bhanu;

import java.util.ArrayList;
import java.util.Iterator;

public class RetainAllMethod {

	public static void main(String[] args) 
	{
		ArrayList<String> array1 = new ArrayList<String>();
		array1.add("Test1");
		array1.add("Test2");
		array1.add("Test3");
		
		ArrayList<String> array2 = new ArrayList<String>();
		array2.add("Test1");
		array2.add("Test3");
		
		array1.retainAll(array2);
		
		System.out.println("iterating the elements after retaining the elements of array2...");
		
		Iterator itr = array1.iterator();
		
		while (itr.hasNext()) 
		{
		   System.out.println(itr.next());
		}
	}
		
	

}
