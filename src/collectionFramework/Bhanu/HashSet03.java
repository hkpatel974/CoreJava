package collectionFramework.Bhanu;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet03 
{
	public static void main(String[] args)
	{
		// Creating HashSet object and adding elements
		Set<Object> set = new HashSet<Object>();
		
		set.add("Test1");
		set.add("Test2");
		set.add("Test3");
		set.add("Test4");
		set.add(4);
		set.add(true);
		set.add(4.900);
		
		// Traversing elements
		Iterator<Object> itr = set.iterator();
		
		while (itr.hasNext())
		{
		   System.out.println(itr.next());
		}

	}

}
