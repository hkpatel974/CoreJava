package collectionFramework.Bhanu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListwithObject 
{
	public static void main(String[] args)
	{
		// Creating Array list Object
		List<Object> list = new ArrayList<Object>();
		
		// Adding object in Array list
		list.add("Bhanu");
		list.add("Pratap");
		list.add(4);
		list.add(true);
		
		// Traversing list through Iterator
		Iterator itr = list.iterator();
		while (itr.hasNext())
		{
		    System.out.println(itr.next());
		}		
	}
}
