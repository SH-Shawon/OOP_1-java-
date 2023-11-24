package classes;

import java.lang.*;

public class PremiumAccount extends Account
{
	private double discountRate;
	
	public PremiumAccount()
	{
		super();
		System.out.println("SA-E");
	}
	public PremiumAccount(int accountId, String accountOwnerName, double bill, double discountRate)
	{
		super(accountId, accountOwnerName, bill,discountRate);
		System.out.println("SA-P");
		
	}

	
	
	public void showDetails()
	{
		System.out.println("Account Id is : " + this.getAccountId());
		System.out.println("Account Owner Name : " + this.getAccountOwnerName());
		System.out.println("Amount to be paid  : " + this.getBill());
		System.out.println("Discount Rate is : "+ discountRate);
	}
}