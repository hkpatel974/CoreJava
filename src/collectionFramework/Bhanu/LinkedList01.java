package collectionFramework.Bhanu;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList01
{
	public static void main(String[] args)
	{
		LinkedList<String> al = new LinkedList<String>();
		
		al.add("Test1");
		al.add("Test2");
		al.add("Test3");
		al.add("Test4");
		
		Iterator<String> itr = al.iterator();
		
		while (itr.hasNext()) 
		{
		   System.out.println(itr.next());
		}
	}
}
