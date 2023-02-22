package i201815_Abad_Naseer_Q_Assignment_1_First_SDAFinancials_Ltd_A_Banking_System_for_SDA_Students;

import java.util.ArrayList;
import java.util.List;

public class BankManagementSystem {
	private List<UserLogin > UserList=new ArrayList<UserLogin>();
	private TransactionLedger TL=new TransactionLedger();
	public BankManagementSystem()
	{
		
	}
	public void AddUser(UserLogin u)
	{
		UserList.add(u);
	}
	public void RemoveUser(UserLogin u)
	{
		UserList.remove(u);
	}
	public void ShowUser()
	{
		System.out.print(UserList);
	}
	public void AddTransaction(Transactions T)
	{
		TL.addTransaction(T);
	}
	public void GetTransaction()
	{
		TL.ShowTransactions();
	}
}

//+---------------------------------+
//|        BankManagementSystem     |
//+---------------------------------+
//| - customers: List<Customer>     |
//| - transactions: List<Transaction> |
//+---------------------------------+
//| + BankManagementSystem()        |
//| + addCustomer(customer: Customer): void |
//| + removeCustomer(customer: Customer): void |
//| + getCustomers(): List<Customer> |
//| + getCustomerByName(name: String): Customer |
//| + addTransaction(transaction: Transaction): void |
//| + getTransactions(): List<Transaction> |
//| + getTransactionsForAccount(account: BankAccount): List<Transaction> |
//+---------------------------------+