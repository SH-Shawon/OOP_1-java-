package interfaces;
import java.lang.*;
import classes.Employee;

public interface FoodEmployeeOperations
{
	boolean insertEmployee(Employee e);
	boolean removeEmployee(Employee e);
	Employee searchEmployee(String empId);
	void showAllEmployees();
}