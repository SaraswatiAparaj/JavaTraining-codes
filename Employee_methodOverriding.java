class Employee
{

    int id;
    String name, address;
    String phone;

    public Employee(int i, String n, String a, String p)
    {
        this.id = i;
        this.name = n;
        this.address = a;
        this.phone = p;
    }

    //Overriding without parameters
    public void displayPhone()
    {
        System.out.println("ID: "+id+"\nPhone: "+phone);
    }

    /*public void displayPhone(String phone){

        System.out.println("\nPhone: "+phone);
    }*/
}

class HR extends Employee
{
    int salary;

    public HR(int i, String n, String a, String p, int sal) 
    {
        super(i, n, a, p);
        this.salary = sal;
    }
    //Overriding without parameters
    //@Override
    public void displayPhone()
    {
        System.out.println("Name: "+name+"\tPhone: "+phone);
    }
}

class Employee_methodOverriding{

    public static void main(String args[])
    {

        HR obj2 = new HR(1,"Saraswati","Aparaj", "8880551217", 25000);
        
        //Without parameters 
        obj2.displayPhone();

        //with parameters 
        //obj2.displayPhone("8986438922");
    }
}

