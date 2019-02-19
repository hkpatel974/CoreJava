package collectionFramework.Bhanu;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListLinkedList
{
	public static void main(String[] args)
	{
		// creating ArrayList
		List<String> al = new ArrayList<String>();
		 
		// adding object in ArrayList
		al.add("Test1");
		al.add("Test2");
		al.add("Test3");
		al.add("Test4");
		
		// creating LinkedList
		List<String> al2 = new LinkedList<String>();
		
		// adding object in LinkedList
		al2.add("Test1");
		al2.add("Test2");
		al2.add("Test3");
		al2.add("Test4");
		System.out.println("ArrayList: " + al);
		System.out.println("LinkedList: " + al2);

	}

}
