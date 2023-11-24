package classes;

import java.lang.*;
import interfaces.AccountOperations;

public abstract class Account implements AccountOperations
{	
	private int accountId;
    private String accountOwnerName;
	private double bill;
	private double discountRate;
	private double discAmount;

	public Account()
	{
		System.out.println("Empty-Account");
	}
	public Account(int accountId, String accountOwnerName, double bill,double discountRate)
	{
		System.out.println("Parameterized-Account");
		this.accountId = accountId;
		this.accountOwnerName = accountOwnerName;
		this.bill = bill;
		this.discountRate=discountRate;
	}
		
	public void setAccountId(int accountId){ this.accountId = accountId; }
	public void setAccountOwnerName(String accountOwnerName){	this.accountOwnerName = accountOwnerName;	}
	public void setBill(double bill){	this.bill = bill; }
	
	public int getAccountId(){	return accountId; }
	public String getAccountOwnerName(){	return accountOwnerName; }
	public double getBill(){ return bill;	}
	
	public void setDiscountRate(double discountRate){this.discountRate = discountRate;}
	public double getDiscountRate(){return discountRate;}
	public abstract void showDetails();
	
	public boolean deposit(double amount)
	{
		boolean flag = false;
		if(amount>0)
		{
			bill = bill + amount;
			flag = true;
		}
		return flag;
	}
	public boolean withdraw(double amount)
	{
		boolean flag = false;
		if(amount>0 && amount<=bill)
		{
			discAmount=discountRate*0.01;
			bill = (bill-(amount-(amount*(discountRate*0.01))));
			flag = true;
		}
		return flag;
	}
}