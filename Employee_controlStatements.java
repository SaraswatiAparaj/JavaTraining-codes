class EMPLOYEE{

	int id;  
	String name, address, type;
	String phone;

	public EMPLOYEE(int i, String n, String a, String t, String p)
	{
		this.id = i;
		this.name = n;
		this.address = a;
		this.type = t;
		this.phone = p;

	}

	public void testingDecisionMakingStatements()
	{

		if(type.equals("HR"))
		{
			System.out.println("\nEMP ID: "+id+"\tEMP Type: "+type);
		}
		else if (type.equals("Infra")) 
		{
			System.out.println("\nEMP ID: "+id+"\tEMP Type: "+type);	
		}
		else
		{
			System.out.println("\nEMP ID: "+id+"\tEMP Type: "+type);
		}
	}


	/*public void display(int i){
		System.out.println("Id:"+id+"\nphone:"+phone);
	}

	public void display(){
		System.out.println("\nName:"+name+"\nAddress:"+address);
	}*/
}


class Employee_controlStatements
{

	public static void main(String args[])
	{

		EMPLOYEE obj1 = new EMPLOYEE(1,"Saraswati","Aparaj", "HR", "8880551217");

		EMPLOYEE obj2 = new EMPLOYEE(2,"Rohan","Aparaj", "Infra", "8880078569");

		EMPLOYEE obj3 = new EMPLOYEE(3,"Rahul","Aparaj", "Admin", "9343142164");

		obj1.testingDecisionMakingStatements();
		obj2.testingDecisionMakingStatements();
		obj3.testingDecisionMakingStatements();
	
		/*obj1.display(1);
		obj1.display();*/
	}
}
