package interfaces;

import java.lang.*;
import classes.Customer;

public interface FoodCustomerOperations
{
	boolean insertCustomer(Customer c);
	boolean removeCustomer(Customer c);
	Customer searchCustomer(int mblNo);
	void showAllCustomers();
}