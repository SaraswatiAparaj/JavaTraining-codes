import java.util.*;

class Employee
{
    private int id;
    private String name;
    
    public Employee(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public String toString() 
    {
        return "{id=" + id +", name=" + name + '}';
    }

    public int hashCode()
    {
        int hashcode = 31;
        return hashcode;
    }

    public boolean equals(Object obj)
    {
        if(obj instanceof Employee)
        {
            Employee emp = (Employee) obj;
            return (emp.name.equals(this.name) && emp.id == this.id);
        }else 
        {
            return false;
        }
    }
}

public class WithoutDuplicatehashmap 
{
    public static void main(String[] args)
    {
    	
    	Employee e1 = new Employee(1,"saru");
		Employee e2 = new Employee(2,"akshu");
		Employee e3 = new Employee(3,"Aparaj");
		Employee e4 = new Employee(2,"akshu");
		
		
		HashMap<Employee, Integer> map = new HashMap();
		map.put(e1,1);
		map.put(e2,2);
		map.put(e3,3);
		map.put(e3,3);
		map.put(e4,2);

		System.out.println(map);

    }
}
