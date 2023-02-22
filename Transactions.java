package i201815_Abad_Naseer_Q_Assignment_1_First_SDAFinancials_Ltd_A_Banking_System_for_SDA_Students;

import java.time.LocalDate;
import java.util.Date;

public class Transactions {
	private Accounts Acc;
	private String AccountID;//actually account number
	private LocalDate Dat;
	private double amount;
	public Transactions(String ai, double a, LocalDate currentDate)
	{
		this.AccountID=ai;
		this.amount=a;
		this.Dat=currentDate;
	}
//	public void SetAccountNumber(String aid, String d)
//	{
//		this.AccountID=aid;
//		this.Dat=d;
//		if(AccountID.matches(Acc.GetAccountNumber()))
//		{
//			System.out.println("Date: "+this.Date);
//			Acc.ShowAccountHolder();
//			
//		}
//	}
	public LocalDate GetDate()
	{
		return this.Dat;
	}
    public String getAccountID() {
        return this.AccountID;
    }
    public double getAmount() {
        return amount;
    }

    public LocalDate getDate() {
        return this.Dat;
    }
}

//3. Transactions : Bank supports usual transactions of withdraw and deposit. 
//Additionally, bank keeps track of each transaction that takes place. 
//This can be using a "Transaction Ledger" class (implemented by you of course).
//The ledger should support the functionality of locating transactions
//based on Account ID, or Account ID and Date. Each transaction object
//should also record the Date and time of transaction.