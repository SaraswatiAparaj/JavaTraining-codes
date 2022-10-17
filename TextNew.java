import java.util.HashMap;
import java.util.Scanner;

class Thread12 extends Thread
{
    public void run()
    {

    }
}

class Thread22 extends Thread
{
    public void run()
    {

    }
}

class EMPLOYEE1
{
    int id;
    String name, Team;
    String Desciption;

    public EMPLOYEE1(int i, String n, String t, String d)
    {
        this.id = i;
        this.name = n;
        this.Team = t;
        this.Desciption = d;

    }

    public void Function()
    {
      /*  if (Team == "IT") {
            // System.out.println("\nEMP ID: "+id+"\tEMP Type: "+Team);
            */
        System.out.println("\nPlease select the any one of the team 1.IT  2.HR  3.Finance  4.Facility\n");

        String Status = null,TWOI = null,TO=null,D=null,S=null;
        Scanner sc = new Scanner(System.in);
        String team = sc.next();


        System.out.println("Plese enter the Emp ID " +id);



        switch (team)
        {
            case "IT": System.out.println("Ticket is creating");

                System.out.println("Plese enter the Emp ID"+id);
                /*Scanner sc1 = new Scanner(System.in);
                String Emp_id = sc.next();*/

                System.out.println("Emp id :" + id + "\tname :" + name + "\tDesc :" + Desciption);

                for (int i=101;i<102;i++)
                {
                    System.out.println("Ticket is confirmed");
                    System.out.println("Ticket num is " + i);
                    if (i == 101)
                    {
                        System.out.println("Assigned team is Team_IT");
                    }

                }
                try {


                    if (Status == TWOI) {
                        System.out.println("status is Team Working on the issue");
                    } else if (Status == TO) {
                        System.out.println("status is Ticket Owner");
                    } else if (Status == D) {
                        System.out.println("status is Description");
                    } else if (Status == S) {
                        System.out.println("Severity");
                    }
                }catch (Exception e) {
                }
                break;

            case "HR":
                System.out.println("Ticket is creating");
                System.out.println("Emp id :" + id + "\tname :" + name + "\tDesc :" + Desciption);

                Status = TO;
                for (int i=102;i<103;i++) {
                    System.out.println("Ticket is confirmed");
                    System.out.println("Ticket num is " + i);
                    if (i == 102) {
                        System.out.println("Assigned team is Team_HR");
                    }
                }

                try {
                    if (Status == TO) {
                        System.out.println("status is Ticket Owner");
                    } else if (Status == D) {
                        System.out.println("status is Description");
                    } else if (Status == S) {
                        System.out.println("Severity");
                    }
                }catch (Exception e) {
                }
                break;

            case "Finance":
                System.out.println("Ticket is creating");
                System.out.println("Emp id :" + id + "\tname :" + name + "\tDesc :" + Desciption);

                for (int i=103;i<104;i++) {
                    System.out.println("Ticket is confirmed");
                    System.out.println("Ticket num is " +i);
                    if(i==103)
                    {
                        System.out.println( "Assigned team is Team_Finance");
                    }
                }
                try {
                    if (Status == D) {
                        System.out.println("status is Description");
                    } else if (Status == S) {
                        System.out.println("Severity");
                    }
                }catch (Exception e) {
                }
                break;

            case "Facility":
                System.out.println("Ticket is creating");
                System.out.println("Emp id :" + id + "\tname :" + name + " F\tDesc :" + Desciption);

                for (int i=104;i<105;i++) {
                    System.out.println("Ticket is confirmed");
                    System.out.println("Ticket num is " +i);
                    if(i==104)
                    {
                        System.out.println( "Assigned team is Team_Facility");
                    }
                }
                try
                {
                    if (Status == S)
                    {
                        System.out.println("status is Severity");
                    }
                }
                catch (Exception e) {
                }
                break;

            default:
                System.out.println("Return to Main Menu & Quit application");
                break;
        }
    }
}

public class TextNew
{
    public static void main(String[] args)
    {
        EMPLOYEE ob = new EMPLOYEE(1,"Nick","IT","Description about Management");
        EMPLOYEE ob1 = new EMPLOYEE(2,"Mike","HR","Description about Management");
        EMPLOYEE ob2 = new EMPLOYEE(3,"John","Finance","Description about Management");
        EMPLOYEE ob3 = new EMPLOYEE(4,"Kelly","Facility","Description about Management");
        EMPLOYEE ob4 = new EMPLOYEE(5,"Nicholas","IT","Description about Management");
        EMPLOYEE ob5 = new EMPLOYEE(6,"Tim","HR","Description about Management");
        EMPLOYEE ob6 = new EMPLOYEE(7,"Micheal","HR","Description about Management");
        EMPLOYEE ob7 = new EMPLOYEE(8,"Jade","IT","Description about Management");
        EMPLOYEE ob8 = new EMPLOYEE(9,"Paula","Finance","Description about Management");
        EMPLOYEE ob9 = new EMPLOYEE(10,"Charles","Finance","Description about Management");

        HashMap<Employee,Integer> map=new HashMap<>();

        ob.Function();
        ob1.Function();
        ob2.Function();
        ob3.Function();
        ob4.Function();ob5.Function();ob6.Function();ob7.Function();ob8.Function();ob9.Function();

    }
}

