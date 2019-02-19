package collectionFramework.Bhanu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List02
{

	public static void main(String[] args)
	{
		// Creating Array list Object
		List<String> list = new ArrayList<String>(); 
		
		// Adding object in Array list 
		
		list.add("Hemant"); 
		list.add("Kantilal"); 
		list.add("Patel"); 
		list.add("Test1"); 
		
		// Traversing list through Iterator 
		Iterator itr = list.iterator();
		
		while (itr.hasNext())
		{ 
			System.out.println(itr.next());
		}
		

	}

}
