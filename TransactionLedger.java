package i201815_Abad_Naseer_Q_Assignment_1_First_SDAFinancials_Ltd_A_Banking_System_for_SDA_Students;

import java.util.ArrayList;
import java.util.List;

public class TransactionLedger 
	{
	private List<Transactions> transactions;
	public TransactionLedger() 
	{
		this.transactions = new ArrayList<Transactions>();
	}

    public void addTransaction(Transactions transaction) {
        transactions.add(transaction);
    }

    public List<Transactions> getTransactionsByAccountID(String accountID) {
        List<Transactions> result = new ArrayList<Transactions>();
        for (Transactions transaction : transactions) {
            if (transaction.getAccountID().equals(accountID)) {
                result.add(transaction);
            }
        }
        return result;
    }
    public void ShowTransactions()
    {
    	System.out.println("Transaction History: ");
    	for(Transactions T: transactions)
    	System.out.println("\nAccount ID: "+ T.getAccountID()+"\nAmount: "+T.getAmount()+"\nDate: "+T.getDate());
    }
}
