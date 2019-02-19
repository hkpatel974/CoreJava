package collectionFramework.Bhanu;
import java.util.ArrayList;
import java.util.Iterator;

public class AddAllExample 
{
	public static void main(String[] args)
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("Test1");
		al.add("Test2");
		al.add("Test3");
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Test4");
		al2.add("Test5");
		
		// adding second list in first list
		al.addAll(al2);
		
		/*for(String Obj : al)
		{
			System.out.println(Obj);
			
		}*/
		
		Iterator itr = al.iterator();
		while (itr.hasNext()) 
		{
		  System.out.println(itr.next());
		}
	}

}
