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
		System.out.println("Id:"+id+"\nphone:"+phone);
	}

	public void display()
	{
		System.out.println("\nName:"+name+"\nAddress:"+address);
	}
}


class Employee_displayDetails
{

	public static void main(String args[]){

		EMPLOYEE obj1 = new EMPLOYEE(1,"Saraswati","Aparaj", "8880551217");
	
		obj1.display(1);
		obj1.display();
	}
}
