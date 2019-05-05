package ShoppingWebsite;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
public class Main {
	
	public static void main(String args[])
	{
	  try {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection conn = null;	
	    conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "DATABASE ADMIN", "1252");
	    if(conn!=null)
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
			  
			  PreparedStatement ps = conn.prepareStatement("INSERT INTO Customer VALUES(?,?,?,?,?,?)");
			  ps.setString(1, name);
			  ps.setString(2, address);
			  ps.setInt(3, age);
			  ps.setString(4, mobNo);
			  ps.setDouble(5, purAmount);
			  ps.setString(6, custType);
			  ps.executeUpdate();
			  break;
			  
		  case 2:
			  SeniorCitizen sc = new SeniorCitizen(name, address, age, mobNo);
			  sc.getBillAmount(purAmount);
			  String customerType = "Senior Citizen";
			  sc.displayCustomer(customerType);
			  
			  PreparedStatement pst= conn.prepareStatement("INSERT INTO Customer VALUES(?,?,?,?,?,?)");
			  pst.setString(1, name);
			  pst.setString(2, address);
			  pst.setInt(3, age);
			  pst.setString(4, mobNo);
			  pst.setDouble(5, purAmount);
			  pst.setString(6, customerType);
			  pst.executeUpdate();
			  break;
		}
	}
		else
		{
			System.out.println("Not Connected");
		}	
}
	  catch(ClassNotFoundException e)
		{
			System.out.println("Driver class not found. Exception occured!!");
		}
		catch(SQLException se)
		{
			System.out.println("Exception occured while making connection");
		}
	}

}
