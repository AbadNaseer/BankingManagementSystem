package i201815_Abad_Naseer_Q_Assignment_1_First_SDAFinancials_Ltd_A_Banking_System_for_SDA_Students;

import java.util.ArrayList;
import java.util.List;

abstract class Accounts {
	protected String AccountNumber;
	protected double AccountBalance;
	protected UserLogin UsrLgn;
	TransactionLedger TL;
	//List <Transactions> TransactionsList=new ArrayList<Transactions>();
	public Accounts(String a, double b, UserLogin u)
	{
		this.AccountNumber=a;
		this.AccountBalance=b;
		this.UsrLgn=u;
	}
	public String GetAccountNumber()
	{
		return this.AccountNumber;
	}
	public UserLogin GetUser()
	{
		return this.UsrLgn;
	}
	public double GetAccountBalance()
	{
		return this.AccountBalance;
	}
	public abstract double WithDraw(double t);
	public abstract double Deposit(double t);
//	public abstract void OpenAccount(String an);
//	public abstract void DeleteAccount(String an);
	public abstract String ShowAccountHolder();
	public abstract void ShowStatus();
	public abstract void ShowStatement(String A);
	//public abstract void AddTransaction(Transactions T);
}