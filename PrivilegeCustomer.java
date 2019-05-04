package ShoppingWebsite;

public class PrivilegeCustomer extends Customer {
	
	public PrivilegeCustomer(String name, String address, int age, String mobNo)
	{
		super(name, address, age, mobNo);
	}
	
	public void getBillAmount(double amount)
	{
		this.amount = amount;
		double FinalAmount = amount - (amount * 3/10);
		super.getBillAmount(FinalAmount, amount);
	}

}
