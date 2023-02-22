package i201815_Abad_Naseer_Q_Assignment_1_First_SDAFinancials_Ltd_A_Banking_System_for_SDA_Students;

import java.util.Scanner;

class CurrentAccount extends Accounts{
	public CurrentAccount(String a, double b, UserLogin u)
	{
		super(a, b, u);
	}
	public double WithDraw(double t)
	{
		this.AccountBalance+=t;
		return this.AccountBalance=t;
	}
	public double Deposit(double t)
	{
		this.AccountBalance-=t;
		return this.AccountBalance=t;
	}
	public void ShowStatement(String A)
	{
		TL.getTransactionsByAccountID(A);
	}
//	public void OpenAccount(String an)
//	{
//		System.out.println("Account Opening: ");
//		System.out.println("Deposit atleast 100/= to Open an account: ");
//		Scanner S=new Scanner(System.in);
//		double i=S.nextDouble();
//		S.close();
//		if(i>=100)
//		{
//			
//		String date=UniqueNumberGenerator.generateUniqueNumber();
//		Transactions Transaction=new Transactions(AccountNumber, date);
//		TransactionsList.add(Transaction);
//			System.out.println("Funds deposited!\n");
//		}
//	}
//	public void DeleteAccount(String an)
//	{
//		System.out.println("Removing an account: ");
//		if(this.AccountNumber.matches(an))
//		{
//			Accounts Account=new CurrentAccount(an);
//			Account.TransactionsList.clear();
//			System.out.println("Account Removed Sucessfully: ");
//		}
//	}
	public String ShowAccountHolder()
	{
	return UsrLgn.GetId()+UsrLgn.GetAddress();
	} 
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
	}
