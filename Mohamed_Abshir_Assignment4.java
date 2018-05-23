
public class Mohamed_Abshir_Assignment4 {

	public static void main(String[] args)
	{
		printSalary("Fred", 100000.0);
		
	}
	
	public static void printSalary(String employeeName, double employeeSalary)
	{
		double employeeBonus = employeeSalary * .15;
		double employeeTaxes = employeeSalary * .4;
		double total = employeeSalary + employeeBonus - employeeTaxes;
		System.out.println(employeeName + " has a base salary of $" + employeeSalary );
		System.out.println(employeeName + " get a bonus salary of $ " +employeeBonus);
		System.out.println(employeeName + " has a pays taxes of $ " +employeeTaxes);
		System.out.println(total + " should be payed to " + employeeName);
		
	}
}
