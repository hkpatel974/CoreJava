package collectionFramework.Bhanu;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList01 
{
	public static void main(String[] args)
	{
		// Creating Array list Object
		ArrayList<String> list = new ArrayList<String>();
		
		// Adding object in Array list
		list.add("Hemant");
		list.add("Kantilal");
		list.add("Patel");
		list.add("Test");
		
		// Traversing list through Iterator
		Iterator itr = list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}

}
