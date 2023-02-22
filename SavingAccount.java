package i201815_Abad_Naseer_Q_Assignment_1_First_SDAFinancials_Ltd_A_Banking_System_for_SDA_Students;

import java.util.Scanner;

public class SavingAccount extends Accounts{
	public SavingAccount(String a, double b, UserLogin u)
	{
		super(a, b, u);
	}
	public double WithDraw(double t)
	{
		
		this.AccountBalance+=t*0.01;
		return this.AccountBalance=t;
	}
	public double Deposit(double t)
	{
		this.AccountBalance-=t;
		return this.AccountBalance=t;
	}
	public String ShowAccountHolder()
	{
	return UsrLgn.GetId()+UsrLgn.GetAddress();
	} 
//	public void ShowStatus()
//	{
//		for(Transactions Transaction: TransactionsList)
//		{
//			double Amount=Transaction.GetBalance();
//			double Sum=0;
//			Sum=Sum+Amount;
//			if(Sum<0)
//			{
//				System.out.println("We are Sorry! Your Account is Dormant: ");
//				System.out.println("Visit Branch or Call at Bank Official NUmber, Thank you, ");
//			}
//			else
//			{
//				System.out.println("Congrats! Your Account is Active: ");
//			}
//		}
//	}
	public void ShowStatus()
	{
		if(AccountBalance<0)	
		{
//			double Amount=Transaction.GetBalance();
//			double Sum=0;
//			Sum=Sum+Amount;
//			if(Sum<0)
//			{
				System.out.println("We are Sorry! Your Account is Dormant: ");
				System.out.println("Visit Branch or Call at Bank Official NUmber, Thank you, ");
			}
			else
			{
				System.out.println("Congrats! Your Account is Active: ");
			}
		}
	public void ShowStatement(String A)
	{
		TL.getTransactionsByAccountID(A);
	}
//	public void AddTransaction(Transactions T)
//	{
//		TransactionsList.add(T);
//	}
}
