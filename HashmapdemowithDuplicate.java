package sar;
import java.util.HashMap;
import java.util.Map;


class Employee1
{
	int id;
	String name;
	
	public Employee1(int id,String n) 
	{
		this.id=id;
		this.name=n;
	}
	
		
	public String toString()
	{
		return "{id=" + id +", name=" + name + '}';
	}
}
	
	public class HashmapdemowithDuplicate 
	{
	public static void main(String[] args) 
	{
		Employee1 e1 = new Employee1(1,"saru");
		Employee1 e2 = new Employee1(2,"akshu");
		Employee1 e3 = new Employee1(3,"Aparaj");
		Employee1 e4 = new Employee1(2,"akshu");
		
		//to repeat the values
		//Employee1 e5 = new Employee1(3,"Aparaj");
		
		HashMap<Employee1, Integer> map = new HashMap();
		map.put(e1,1);
		map.put(e2,2);
		map.put(e3,3);
		map.put(e3,3);
		map.put(e4,2);
		//map.put(e1,5);

		System.out.println(map);
}
}
