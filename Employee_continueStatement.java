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

	public void displayEmpDetails()
	{

			System.out.println("EMP_ID: "+id+"\tName: "+name+"\tAddress: "+address+"\tType: "+type+"\tPhone: "+phone);
	
	}

}


class Employee_continueStatement
{

	public static void main(String args[])
	{

		EMPLOYEE e1 = new EMPLOYEE(1,"Saraswati","Aparaj", "HR", "8880551217");

		EMPLOYEE e2 = new EMPLOYEE(2,"Rohan","MJ", "Infra", "8880078569");

		EMPLOYEE e3 = new EMPLOYEE(3,"Suresh","HS", "Admin", "897548395347");

		EMPLOYEE e4 = new EMPLOYEE(4,"Banu","HM", "Infra", "9880792917");
		EMPLOYEE e5 = new EMPLOYEE(5,"Rahul","KH", "SE", "76584354");
		EMPLOYEE e6 = new EMPLOYEE(6,"Rops","GH", "TE", "7896543212");
		EMPLOYEE e7 = new EMPLOYEE(7,"Mahi","DF", "BDA", "578853473");
		EMPLOYEE e8 = new EMPLOYEE(8,"Vivek","SJ", "DS", "9900779587");
		EMPLOYEE e9 = new EMPLOYEE(9,"Rohan","MM", "DA", "037983493438");
		EMPLOYEE e10 = new EMPLOYEE(10,"Virat","NM", "PM", "9343142164");


		ArrayList<EMPLOYEE> empArr = new ArrayList<>();

		empArr.add(e1);
		empArr.add(e2);
		empArr.add(e3);
		empArr.add(e4);
		empArr.add(e5);
		empArr.add(e6);
		empArr.add(e7);
		empArr.add(e8);
		empArr.add(e9);
		empArr.add(e10);

		for (EMPLOYEE employee: empArr)
		{
			if(employee.id%2 != 0)
				continue;
			employee.displayEmpDetails();
		}

	}
}
