package collectionFramework.Bhanu;

import java.util.HashSet;
import java.util.Set;

public class CustomerExample05 
{
	public static void main(String[] args)
	{
		
		Customer obj1 = new Customer("Test1", 25, 800, "area1");
		Customer obj2 = new Customer("Test2", 26, 900, "area2");
		Customer obj3 = new Customer("Test3", 27, 950, "area3");
		Customer obj4 = new Customer("Test4", 28, 975, "area4");
		
		
		//Creating list of Customer
		Set<Customer> set=new HashSet<Customer>();
		set.add(obj1);
		set.add(obj2);
		set.add(obj3);
		set.add(obj4);
		
		//Traversing list
		for(Customer c:set)
		{
		      System.out.println(c.name+" "+c.age+" "+c.money+" "+c.area);
		}		
	}
}
