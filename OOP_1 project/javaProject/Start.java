import java.lang.*;
import classes.*;
import fileio.*;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Start
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String username = "admin";
		String password = "password";
		System.out.println("\t\t-------------------------------------------------------------------------------");
		System.out.println("\t\t-------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t---To access the program please log in first---");
		System.out.print("\t\t\t\t\tAdmin User Name : ");
		String adminUser = sc.next();
		System.out.print("\t\t\t\t\tAdmin password : ");
		String adminPassword = sc.next();

		if(adminUser.equals(username) && adminPassword.equals(password))
		{
			System.out.println("\t\t-------------------------------------------------------------------------------");
			System.out.println("\t\t-------------------------------------------------------------------------------");
			System.out.println("\t\t\t\t\t---Successfully Logged In!!---");

		
		Food b = new Food();
		FileReadWriteDemo frwd = new FileReadWriteDemo();
		
		System.out.println("\t\t-------------------------------------------------------------------------------");
			System.out.println("\t\t-------------------------------------------------------------------------------");
			System.out.println("\t\t|\t\tWelCome to Food Delivery App Management System                |");
			System.out.println("\t\t-------------------------------------------------------------------------------");
			System.out.println("\t\t-------------------------------------------------------------------------------");
		
		boolean repeat = true;
		
		while(repeat)
		{
			System.out.println("What do you want to do?");
			System.out.println("\t1. Employee Management");
			System.out.println("\t2. Customer Management");
			System.out.println("\t3. Food App Customer-Account Management");
			System.out.println("\t4. Account Transactions");
			System.out.println("\t5. Exit");
			
			int choice=0;

				boolean done=false; 
				while(!done)
				{
					try
					{
						System.out.print("\t\tWhat is you choice: ");
						choice = sc.nextInt();
						done=true;
					}
					catch(InputMismatchException e)
					{
						String str=sc.nextLine();
						System.out.println();
						System.out.println("\t\tThis is a invalid input!!! You entered \""+str+"\" which is a string");
						
						System.out.println("\t\tPleasae Enter a whole number. ");
						System.out.println();
					}
				}
			
			switch(choice)
			{
				case 1:
					
					System.out.println("-------------------------------------------");
					System.out.println("You have chose Employee Management");
					System.out.println("-------------------------------------------");
					
					System.out.println();
					System.out.println("You have the following options:");
					System.out.println("\t1. Insert New Employee");
					System.out.println("\t2. Remove Existing Employee");
					System.out.println("\t3. Search an Employee");
					System.out.println("\t4. Show All Employees");
					System.out.println("\t5. Go Back");
					
					System.out.println();
					System.out.print("Enter you option: ");
					int option1 = sc.nextInt();
					
					switch(option1)
					{
						case 1:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Insert New Employee");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter Employee ID: ");
							String empId1 = sc.next();
							System.out.print("Enter Employee Name: ");
							String name1 = sc.next();
							System.out.print("Enter Employee Salary: ");
							double salary1 = sc.nextDouble();
							
							Employee e1 = new Employee();
							e1.setEmpId(empId1);
							e1.setName(name1);
							e1.setSalary(salary1);
							
							if(b.insertEmployee(e1))
							{
								System.out.println("Employee " + e1.getEmpId() + " has been Inserted");
							}
							else
							{
								System.out.println("Employee " + e1.getEmpId() + " can NOT be Inserted");
							}
							System.out.println();
							break;
							
						case 2:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Remove an Employee");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter an Employee ID for Removing: ");
							String empId2 = sc.next();
							
							Employee e2 = b.searchEmployee(empId2);
							
							if(e2 != null)
							{
								System.out.println("### Employee Found for Removing ###");
								if(b.removeEmployee(e2))
								{
									System.out.println("Employee " + e2.getEmpId() + " has been Removed");
								}
							}
							else
							{
								System.out.println("### Employee NOT Found and Can NOT be Removed ###");
							}
							System.out.println();
							break;
							
						case 3: 
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Search an Employee");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter an Employee ID for searching: ");
							String empId3 = sc.next();
							
							Employee e3 = b.searchEmployee(empId3);
							
							if(e3 != null)
							{
								System.out.println("### Employee Found ###");
								System.out.println("Employee ID Number is : " + e3.getEmpId());
								System.out.println("Employee Name: " + e3.getName());
								System.out.println("Employee Salary: " + e3.getSalary());
							}
							else
							{
								System.out.println("### Employee NOT Found ###");
							}
							System.out.println();
							break;
							
						case 4:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Show All Employees");
							System.out.println("-------------------------------------------");
							
							b.showAllEmployees();
							
							break;
							
						case 5:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Go Back");
							System.out.println("-------------------------------------------");
							break;
							
						default:
						
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option please choose another option");
							System.out.println("-------------------------------------------");
							break;
					}
					System.out.println();
					break;
					
				case 2:
				
					System.out.println("-------------------------------------------");
					System.out.println("You have chose Customer Management");
					System.out.println("-------------------------------------------");
					
					System.out.println();
					System.out.println("You have the following options:");
					System.out.println("\t1. Insert New Customer");
					System.out.println("\t2. Remove Existing Customer");
					System.out.println("\t3. Search a Customer");
					System.out.println("\t4. Show All Customers");
					System.out.println("\t5. Go Back");
					
					System.out.println();
					System.out.print("Enter you option: ");
					int option2 = sc.nextInt();
					
					switch(option2)
					{
						case 1:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Insert New Customer");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter Customer Mobile: ");
							int mblNo1 = sc.nextInt();
							System.out.print("Enter Customer Name: ");
							String name1 = sc.next();
							System.out.print("Enter Customer Email: ");
							String eMail1 = sc.next();
							
							Customer c1 = new Customer(mblNo1, name1, eMail1);
							
							if(b.insertCustomer(c1))
							{
								System.out.println("Customer " + c1.getMblno() + " has been Inserted");
							}
							else
							{
								System.out.println("Customer " + c1.getMblno() + " Can NOT be Inserted");
							}
							System.out.println();
							break;
							
						case 2:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Remove a Customer");
							System.out.println("-------------------------------------------");
							
							
							break;
							
						case 3: 
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Search a Customer");
							System.out.println("-------------------------------------------");
							
							
							
							break;
							
						case 4:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Show All Customers");
							System.out.println("-------------------------------------------");
							
							b.showAllCustomers();
							
							break;
							
						case 5:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Go Back");
							System.out.println("-------------------------------------------");
							break;
							
						default:
						
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option");
							System.out.println("-------------------------------------------");
							break;
					}
					System.out.println();
					
					break;
				
				
				case 3:
					
					System.out.println("-------------------------------------------");
					System.out.println("You have chose Customer Account Management");
					System.out.println("-------------------------------------------");
					
					System.out.println();
					System.out.println("You have the following options:");
					System.out.println("\t1. Insert New Account for a Customer");
					System.out.println("\t2. Remove Existing Account of a Customer");
					System.out.println("\t3. Search an Account for a Customer");
					System.out.println("\t4. Show All Accounts of a Customer");
					System.out.println("\t5. Go Back");
					
					System.out.println();
					System.out.print("Enter you option: ");
					int option3 = sc.nextInt();
					
					switch(option3)
					{
						case 1:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Insert an Account for a Customer");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter Customer Mobile No: ");
							int mblNo1 = sc.nextInt();
							
							Customer c1 = b.searchCustomer(mblNo1);
							
							if(c1 != null)
							{
								System.out.println("### Valid Customer ###");
								
								System.out.println("Which type of Account do you want?");
								System.out.println("\t1. Premium Account");
								System.out.println("\t2. Normal Account");
								System.out.println("\t3. Go Back");
								System.out.println();
								
								System.out.print("Your Type: ");
								int type = sc.nextInt();
								
								Account a = null;
								
								if(type == 1)
								{
									System.out.println("----------------------------------");
									System.out.println("Creating a Premium Account");
									System.out.println("----------------------------------");
									
									System.out.print("Enter Account Id : ");
									int ai = sc.nextInt();
									System.out.print("Enter Account Owner Name : ");
									String aon = sc.next();
									System.out.print("Enter Account Balance : ");
									double bl = sc.nextDouble();
									System.out.print("Enter Account Discount Rate : ");
									double ir = sc.nextDouble();
									
									PremiumAccount pa = new PremiumAccount(ai, aon, bl, ir);
									
									a = pa;
								}
								else if(type == 2)
								{
									System.out.println("----------------------------------");
									System.out.println("Creating a Normal Account");
									System.out.println("----------------------------------");
									
									System.out.print("Enter Account Id : ");
									int ai = sc.nextInt();
									System.out.print("Enter Account Owner Name : ");
									String aon = sc.next();
									System.out.print("Enter Account Balance : ");
									double bl = sc.nextDouble();
									System.out.print("Enter Delivery charge: ");
									int dc = sc.nextInt();
									
									double ir=dc;
									
									NormalAccount na = new NormalAccount(ai, aon, bl,ir,dc);
									
									a = na;
								}
								else if(type == 3)
								{
									System.out.println("----------------------------------");
									System.out.println("Going Back.....");
									System.out.println("----------------------------------");
								}
								else
								{
									System.out.println("----------------------------------");
									System.out.println("Invalid Type");
									System.out.println("----------------------------------");
								}
								
								if(a != null)
								{
									if(c1.insertAccount(a))
									{
										System.out.println("Account "+ a.getAccountId()+" has been inserted for " + c1.getMblno());
									}
									else
									{
										System.out.println("Account "+ a.getAccountId()+" can NOT be inserted for " + c1.getMblno());
									}
								}
							}
							else
							{
								System.out.println("### Invalid Customer.. Account Can NOT be Created ###");
							}
							System.out.println();
							break;
							
						case 2:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Remove an Account for a Customer");
							System.out.println("-------------------------------------------");
							break;
							
						case 3: 
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Search an Account for a Customer");
							System.out.println("-------------------------------------------");
							break;
							
						case 4:
							
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Show All Accounts for a Customer");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter Customer ID: ");
							int mblNo4 = sc.nextInt();
							
							Customer c4 = b.searchCustomer(mblNo4);
							
							if(c4 != null)
							{
								c4.showDetails();
								c4.showAllAccounts();
							}
							else
							{
								System.out.println("### Invalid Customer ###");
							}
							System.out.println();
							break;
							
						case 5:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Go Back");
							System.out.println("-------------------------------------------");
							break;
							
						default:
						
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option");
							System.out.println("-------------------------------------------");
							break;
					}
					System.out.println();
					break;
					
				case 4:
					
					System.out.println("-------------------------------------------");
					System.out.println("You have chose Account Transactions");
					System.out.println("-------------------------------------------");
					
					System.out.println();
					System.out.println("You have the following options:");
					System.out.println("\t1. Deposit Money");
					System.out.println("\t2. Withdraw Money");
					System.out.println("\t3. Show All Transactions");
					System.out.println("\t4. Go Back");
					
					System.out.println();
					System.out.print("Enter you option: ");
					int option4 = sc.nextInt();
					
					switch(option4)
					{
						case 1:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Deposit Money");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter Customer ID: ");
							int mblNo1 = sc.nextInt();
							
							Customer c1 = b.searchCustomer(mblNo1);
							
							if(c1 != null)
							{
								System.out.println("### Valid Customer ###");
								
								System.out.print("Enter Account Number : ");
								int ai = sc.nextInt();
							
								Account a = c1.searchAccount(ai);
								
								if(a != null)
								{
									System.out.println("### Valid Account ###");
									
									System.out.println();
									System.out.println("Current Balance : " + a.getBill());
									
									System.out.print("Enter Deposit Amount: ");
									double am = sc.nextDouble();
									
									if(a.deposit(am))
									{
										System.out.println("### Deposit Successfull ###");
										System.out.println("New Balance : " + a.getBill());
										frwd.writeInFile(c1.getMblno() + " has deposited amount " + am + " in account number " + a.getAccountId());
										
									}
									else
									{
										System.out.println("### Invalid Amount ###");
									}									
								}
								else
								{
									System.out.println("### Invalid Account ###");
								}
							}
							else
							{
								System.out.println("### Invalid Customer ###");
							}
							System.out.println();
							break;
							
						case 2:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Pay Bill");
							System.out.println("-------------------------------------------");
							
							System.out.print("Enter Customer ID: ");
							int mblNo2 = sc.nextInt();
							
							Customer c2 = b.searchCustomer(mblNo2);
							
							if(c2 != null)
							{
								System.out.println("### Valid Customer ###");
								
								System.out.print("Enter Account Id : ");
								int ai = sc.nextInt();
							
								Account a = c2.searchAccount(ai);
								
								if(a != null)
								{
									System.out.println("### Valid Account ###");
									
									System.out.println();
									System.out.println("Current Balance : " + a.getBill());
									
									System.out.print("Enter The Amount Of Bill: ");
									double am = sc.nextDouble();
									
									if(a.withdraw(am))
									{
										System.out.println("### Pay Bil Successfull ###");
										System.out.println("New Balance : " + a.getBill());
										frwd.writeInFile(c2.getMblno() + " has paid amount " + am + " from account number " + a.getAccountId());
									}
									else
									{
										System.out.println("### Invalid Amount ###");
									}									
								}
								else
								{
									System.out.println("### Invalid Account ###");
								}
							}
							else
							{
								System.out.println("### Invalid Customer ###");
							}
							System.out.println();
							break;
							
						case 3: 
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to See Transaction History");
							System.out.println("-------------------------------------------");
							
							frwd.readFromFile();
							
							break;
							
						case 4:
						
							System.out.println("-------------------------------------------");
							System.out.println("You have chose to Go Back");
							System.out.println("-------------------------------------------");
							break;
							
						default:
						
							System.out.println("-------------------------------------------");
							System.out.println("Invalid Option");
							System.out.println("-------------------------------------------");
							break;
					}
					System.out.println();
					
					break;
					
				case 5:
					
					System.out.println("-------------------------------------------");
					System.out.println("You have chose to Exit");
					System.out.println("-------------------------------------------");
					
					repeat = false;
					
					break;
					
				default:
					
					System.out.println("-------------------------------------------");
					System.out.println("Invalid Choice...");
					System.out.println("-------------------------------------------");
					
					break;
			}
		}
		
			
	
		}
		else
		{
			System.out.println("\t\tUser Name or password is incorrect!!!");
		}	
	}
}