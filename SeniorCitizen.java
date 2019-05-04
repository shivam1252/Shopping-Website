package ShoppingWebsite;

public class SeniorCitizen extends Customer{
	public SeniorCitizen(String name, String address, int age, String mobNo)
	{
		super( name, address, age, mobNo);
	}

	public void getBillAmount(double amount)
	{
		this.amount = amount;
		double FinalAmount = amount - (amount * 1/10);
		super.getBillAmount(FinalAmount, amount);
	}
	
}
