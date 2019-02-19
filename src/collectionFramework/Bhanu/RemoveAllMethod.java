package collectionFramework.Bhanu;
import java.util.ArrayList;
import java.util.Iterator;

public class RemoveAllMethod 
{
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("Test1");
		al.add("Test3");
		al.add("Test2");
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Test1");
		al2.add("Test5");
		
		al.removeAll(al2);
		
		System.out.println("Iterating the elements after removing the elements of al2...");
		
		Iterator itr = al.iterator();
		
		while (itr.hasNext()) 
		{
		    System.out.println(itr.next());
		}
	}
		

}
