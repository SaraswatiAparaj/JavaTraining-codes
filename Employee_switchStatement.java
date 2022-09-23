class EMPLOYEE
{

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

		switch(type)
		{
			case "HR": System.out.println("Name: "+name+"\tType: "+type);
			break;
			case "Infra": System.out.println("Name: "+name+"\tType: "+type);
			break;
			default: System.out.println("Name: "+name+"\tType: "+type);
			break;

		}
	}

}


class Employee_switchStatement
{

	public static void main(String args[])
	{

		EMPLOYEE obj1 = new EMPLOYEE(1,"Saraswati","Aparaj", "HR", "8880551217");

		EMPLOYEE obj2 = new EMPLOYEE(2,"Rohan","Aparaj", "Infra", "8880078569");

		EMPLOYEE obj3 = new EMPLOYEE(3,"Rahul","Aparaj", "Admin", "9343142164");

		obj1.testingDecisionMakingStatements();
		obj2.testingDecisionMakingStatements();
		obj3.testingDecisionMakingStatements();

	}
}
