package classes;

import java.lang.*;

public class NormalAccount extends Account
{
	private int deliveryCharge;
	
	public NormalAccount()
	{
		super();
		System.out.println("FA-E");
	}
	public NormalAccount(int accountId, String accountOwnerName, double bill,double discountRate, int deliveryCharge)
	{
		super(accountId, accountOwnerName, bill,discountRate);
		System.out.println("FA-P");
		this.deliveryCharge = deliveryCharge;
	}
	
	public void setDeliveryCharge(int deliveryCharge){this.deliveryCharge = deliveryCharge;}
	public int getDeliveryCharge(){return deliveryCharge;}
	
	public void showDetails()
	{
		System.out.println("Account Number : " + this.getAccountId());
		System.out.println("Account Owner Name : " + this.getAccountOwnerName());
		System.out.println("Balance is : " + this.getBill());
		System.out.println("Delivery charge is: "+ deliveryCharge);
	}
	
	
}