package collectionFramework.Bhanu;
import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample
{
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>(); 
		al.add("Test1"); 
		al.add("Test2"); 
		al.add("Test3");
		al.add(1, "Test4"); 
		System.out.println("Element at 2nd position: " + al.get(2)); 
		
		ListIterator<String> itr = al.listIterator();
		
		System.out.println("Traversing elements in forward direction"); 
		
		while (itr.hasNext())
		{ 
			System.out.println(itr.next()); 
		} 
		System.out.println("Traversing elements in backward direction");
		
		while (itr.hasPrevious()) 
		{
			System.out.println(itr.previous());
		} 
		

	}

}
