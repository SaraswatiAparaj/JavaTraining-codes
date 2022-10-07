import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression 
{

	public static void main(String[] args) 
	{	
		System.out.println("Hii choose any one option out of 4 \n" + 
	"1.Email\t" + "2.Empid\t" + "3.phone\t" + "4.Address\t");
		
		
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		
		switch (num)
		{
		case 1:
			System.out.print("Enter your Email here\n");
			String email = sc.next();
			String regex="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
			boolean res = email.matches(regex);
			if(res){
				System.out.println("Entered Email is valid");
				}
			else {
				System.out.println("Entered Email is Not valid");
				}
		break;
		
		case 2:
			System.out.print("Enter your Empid here\n");
			String id = sc.next();
			String reg="^[AMT]+[0-9]{4}+$";
			boolean res1=id.matches(reg);
			if(res1){
				System.out.println("Entered Empid is valid");
				}
			else {
				System.out.println("Entered Empid is Not valid");
				}
		break;
			
		case 3:
			System.out.print("Enter your phone number here\n"); 
			String phone=sc.next();
			String regex1="^[+]91[0-9]{10}|[0-9]{10}+$";
			boolean res2=phone.matches(regex1);
			if(res2){
				System.out.println("Entered phone num is valid");
				}
			else {
				System.out.println("Entered phone num is Not valid");
				}
		break;
			
		case 4:
			System.out.print("Enter your Address here\n");
			String add=sc.next();
			String regex2="^[\\a-zA-Z0-9\\s\\,\\''\\-]*$";
			boolean res3=add.matches(regex2);
			if(res3){
				System.out.println("Entered address is valid");
				}
			else {
				System.out.println("Entered address is Not valid");
				}
		break;
		default:
           		System.out.println("You have entered wrong option...");
		}
		
	}
}
