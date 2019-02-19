package collectionFramework.Bhanu;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet04 
{
	public static void main(String[] args)
	{
		// Creating HashSet object and adding elements
		HashSet<Integer> set = new HashSet<Integer>();
		
		set.add(1);
		set.add(2);
		set.add(3);
		
		// Traversing elements
		Iterator<Integer> itr = set.iterator();
		while (itr.hasNext())
		{
		   System.out.println(itr.next());
		}
	}
}
