package collectionFramework.Bhanu;

import java.util.ArrayList;
import java.util.Iterator;

public class PersonExample4 
{
	public static void main(String[] args) 
	{
		Person s1 = new Person(100, "Test1", 90);
		Person s2 = new Person(101, "Test2", 21);
		Person s3 = new Person(102, "Test3", 80);
		
		ArrayList<Person> al = new ArrayList<Person>();
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Iterator itr = al.iterator();
		
		while (itr.hasNext()) 
		{
			Person st = (Person) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);

		}
	}

}
