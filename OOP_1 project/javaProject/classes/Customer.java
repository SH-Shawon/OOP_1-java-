package classes;

import java.lang.*;
import interfaces.CustomerOperations;


public class Customer implements CustomerOperations
{
	private int mblNo;
	private String name;
	private String eMail;
	private Account accounts[] = new Account[10];
		
	public Customer()
	{
		System.out.println("E-Customer");
	}
	public Customer(int mblNo, String name, String eMail)
	{
		System.out.println("P-Customer");
		this.mblNo = mblNo;
		this.name = name;
		this.eMail = eMail;
	}
	
	public void setMblno(int mblNo){this.mblNo = mblNo;}
	public void setName(String name){this.name = name;}
	public void setEmail(String eMail){this.eMail = eMail;}
	
	public int getMblno(){return mblNo;}
	public String getName(){return name;}
	public String getEmail(){return eMail;}
	
	public void showDetails()
	{
		System.out.println("Customer NID: " + mblNo);
		System.out.println("Customer Name: " + name);
		System.out.println("Customer Age: " + eMail);
		System.out.println();
	}
	
	public boolean insertAccount(Account a)
	{
		boolean flag = false;
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] == null)
			{
				accounts[i] = a;
				flag = true;
				break;
			}
		}
		return flag;
	}
	public boolean removeAccount(Account a)
	{
		boolean flag = false;
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] == a)
			{
				accounts[i] = null;
				flag = true;
				break;
			}
		}
		return flag;	
	}
	public void showAllAccounts()
	{
		System.out.println("////////////////////");
		for(int i=0; i<accounts.length; i++)
		{
			if(accounts[i] != null)
			{
				accounts[i].showDetails();
				System.out.println();
			}
		}
	}
	public Account searchAccount(int accountId)
	{
		Account a = null;
		for(int i = 0; i<accounts.length; i++)
		{
			if(accounts[i] != null)
			{
				if(accounts[i].getAccountId() == accountId)
				{
					a = accounts[i];
					break;
				}
			}
		}
		return a;
	}
}