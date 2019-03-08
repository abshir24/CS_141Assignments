
public class BankAccount {
	private int id;
	private double balance;
	private String name;
	
	public BankAccount()
	{
		id = 0;
		balance = 0;
		name="unknown";
		
	}
	
	public BankAccount(int id, double balance, String name)
	{
		this.id = id;
		this.balance = balance;
		this.name=name;
	}
	
	public String toString()
	{
		return name+" ["+id+"] = $"+balance;
	}
	
	public String getName()
	{
		return name;
	}
	
	public double getBalance()
	{
		return balance;
	}
	
	public int getID()
	{
		return id;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
	
	public void changeBalance(double amount)
	{
		balance+=amount;
		
		if(balance<0) balance = 0;
	}
	
}




//For this assignment I want you to write a BankAccount class that works with the BankAccountMainProgram above.   You can download the above file, and then it should use your BankAccount.java file to run.
//
//Your BankAccount class should have the following
//
//Fields
//a Private ID  (int)
//a private balance (double)
//a private Name (String)
//Methods
//A default constructor
//that sets the ID to 0
//the balance to 0
//the name to "unknown"
//A full constructor
//That accepts all three values and sets the values accordingly.
//A toString() method
//That returns a string in the format
//Name [ID] = $balance
//Example: Betty  [1233203]  = $105.51
//getName()
////returns the Name of this BankAccount
//getBalance()
//// returns the Balance of this BankAccount
//getID()
//// returns the ID of this BankAccount
//setName(String newName)
//// change the name on the account with newName
//changeBalance(double x)
//// add the amount x to the balance.
//if x is negative you still add it, but the balance should go down.
//If the balance is negative, then set it to zero before finishing.
//Demo your program to me and upload the BankAcount.java file when you are done.