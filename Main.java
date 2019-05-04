package ShoppingWebsite;
import java.util.Scanner;
public class Main {
	
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.println("1. Privileged Customer\n2. Senior Citizen");
		System.out.println("Enter the Customer Type: ");
		int selection = in.nextInt();
		
		String name, address, mobNo;
		int age;
		double purAmount;
		
		  System.out.println("Enter the Name: ");
		  name = in.next();
		  System.out.println("Enter the Age: ");
		  age = in.nextInt();
		  System.out.println("Enter the address: ");
		  address = in.next();
		  System.out.println("Enter the mobNo: ");
		  mobNo = in.next();
		  System.out.println("Enter the Purchase Amount: ");
		  purAmount = in.nextDouble();
		  
		switch(selection)
		{
		  case 1:
			  PrivilegeCustomer pc = new PrivilegeCustomer(name, address, age, mobNo);
			  pc.getBillAmount(purAmount);
			  String custType = "Privilage Customer";
			  pc.displayCustomer(custType);
			  break;
			  
		  case 2:
			  SeniorCitizen sc = new SeniorCitizen(name, address, age, mobNo);
			  sc.getBillAmount(purAmount);
			  String customerType = "Senior Citizen";
			  sc.displayCustomer(customerType);
			  break;
		}
		
		
	}

}
