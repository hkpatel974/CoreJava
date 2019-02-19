package collectionFramework.Bhanu;
import java.util.ArrayList;
import java.util.List;

public class CustomerExample5
{
	public static void main(String[] args) 
	{
		Customer obj1 = new Customer("Test1", 25, 800, "area1");
		Customer obj2 = new Customer("Test2", 26, 900, "area2");
		Customer obj3 = new Customer("Test3", 27, 950, "area3");
		Customer obj4 = new Customer("Test4", 28, 975, "area4");
		
		//Creating list of Customer
		List<Customer> list=new ArrayList<Customer>();
		
		
		list.add(obj1);
		list.add(obj2);
		list.add(obj3);
		list.add(obj4);
		
		//Traversing list
		for(Customer c:list)
		{
		  System.out.println(c.name+" "+c.age+" "+c.money+" "+c.area);
		}
	}
		
	

}
