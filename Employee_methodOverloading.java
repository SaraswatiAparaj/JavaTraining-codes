class EMPLOYEE
{
    int id;
    String name, address;
    String phone;

    public EMPLOYEE(int i, String n, String a, String p)
    {
        this.id = i;
        this.name = n;
        this.address = a;
        this.phone = p;
    }

    public void display(int i)
    {
        System.out.println("Name:"+id+"\tphone:"+phone);
    }

    public void display()
    {
        System.out.println("\nName:"+name+"\tAddress:"+address);
    }

}

class HR extends EMPLOYEE
{

    int salary;

    public HR(int i, String n, String a, String p, int sal) 
    {
        super(i, n, a, p);
        this.salary = sal;
    }

     public void empWithSalary()
     {
        System.out.println("\nEmployee Name: "+name+"\nSalary: "+salary);
    }

    public void empWithSalary(int tax)
    {
        System.out.println("\nEmployee Name: "+name+"\nSalary: "+(salary-tax)+"\nTax Deducted: "+tax);
    }
}



public class Employee_methodOverloading 
{

    public static void main(String args[])
    {

        EMPLOYEE obj1 = new EMPLOYEE(1,"Saraswati","Aparaj", "8880551217");
        HR obj2 = new HR(3,"Ronie","Aparaj", "8880078569", 25000);
        /*obj1.display(1);
        obj1.display();*/

        obj2.empWithSalary();
        obj2.empWithSalary(3000);
    }
}
