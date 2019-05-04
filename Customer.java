package ShoppingWebsite;

public class Customer {
	
	
	private String Name;
	private String Address;
	private int Age;
	private String mobileNumber;
	public Customer(String name, String address, int age, String mobNo)
	{
		this.Name = name;
		this.Address = address;
		this.Age = age;
		this.mobileNumber = mobNo;
		
	}
	double amount ;
	double FinalAmount;
	public void getBillAmount(double FinalAmount, double amount)
	{
		this.FinalAmount = FinalAmount;
		this.amount = amount;
	}
	
	public void displayCustomer(String customer)
	{
		System.out.println();
		System.out.println("Bill Details: ");
		System.out.println("Name : " +Name);
		System.out.println("Mobile : " +mobileNumber);
		System.out.println("Age : " +Age);
		System.out.println("Address : " +Address);
		
		System.out.println("Your Bill Amount is Rs. "+amount +". Congratts!! As you are a " +customer+", you are eligible for discount!\nYou have to pay :" +FinalAmount );
	}

}
