package i201815_Abad_Naseer_Q_Assignment_1_First_SDAFinancials_Ltd_A_Banking_System_for_SDA_Students;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Bank {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BankManagementSystem BMS=new BankManagementSystem();
		System.out.println("-----------------Welcome to Banking Management System---------------------");
		System.out.println("-----------------Enter 1. Account Management:---------------------");
		System.out.println("-----------------Enter 2. User Management:---------------------");
		System.out.println("-----------------Enter 3. Transactions:---------------------");
		System.out.println("-----------------Enter 4. Statement:---------------------");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String InputForFeature=br.readLine();
		switch(InputForFeature)
		{
		case "1":
			String ID=UniqueNumberGenerator.generateUniqueNumber();//Id of the student
		
			System.out.println("Login Page Opened: ");
			System.out.println("Enter Your Address: ");
	    	String Address="";
	    	Address=br.readLine();
	    	System.out.println(Address+" Address Entered: ");
	    	System.out.println("Enter University ID of the Student: ");
	    	String UniID=br.readLine();
	    	String AccountNumbr=UniqueNumberGenerator.generateUniqueNumber();//Account Number of the student 	    	
	    	UserLogin User=new UserLogin(Address, UniID);
	    	boolean Choice=true;
	    	while(Choice)
	    	{
			System.out.println("Press 1. Open an account:");
			System.out.println("Press 2. Delete an account:");
			System.out.println("Press 3. Status of an account");
			System.out.println("Press 4. Exit Account Management Menu");
			String InputForOpeningAnAccountAndDeleting=br.readLine();
			
			if(InputForOpeningAnAccountAndDeleting.matches("1"))
			{
				//switch(InputForOpeningAnAccountAndDeleting)
				//{
				//}case "1":
				System.out.println("Enter 1. For Saving Account: ");
				System.out.println("Enter 2. For Current Account: ");
				String InputForAccountChoosing;
				InputForAccountChoosing=br.readLine();
				System.out.println(InputForAccountChoosing+" Digit picked");
				if(InputForAccountChoosing.matches("1"))
				{
					System.out.println("Deposit atleast 100 pkr to open an account: ");
					double InputForMoney=br.read();
					int result = (int) Math.round(InputForMoney);
					if(result>=100)
					{
					Accounts Account=new SavingAccount(AccountNumbr, InputForMoney, User);
					System.out.println("Saving Account Opened sucessfully: ");
					User.SetAccount(Account);
					
					}
					else
					{
						System.out.println("Enter atleast 100 pkr to open an account, thank you");
					}
				}
				else if(InputForAccountChoosing.matches("2"))
				{
				System.out.println("Deposit atleast 100 pkr to open an account: ");
				double InputForMoney=br.read();
				Accounts Account=new SavingAccount(AccountNumbr, InputForMoney, User);
				System.out.println("Current Account Opened sucessfully: ");
				}
				BMS.AddUser(User);
			}
			//case "2":
			else if(InputForOpeningAnAccountAndDeleting.matches("2"))
			{
				User.AccountsList.remove(0);
			}
			else if(InputForOpeningAnAccountAndDeleting.matches("3"))
			{
				User.A.ShowStatus();
			}
			else 
			{
				Choice=false;
			}
	    	}
		case "2":
			String InputUniID=br.readLine();
			UserLogin User1=new UserLogin("abc", InputUniID);
			System.out.println("User Account Management Setting is opened:");
			System.out.println("Change address of the user:"+"With University ID"+InputUniID);
			System.out.println("User Account Management Setting is opened:");
			System.out.println("Update Address:");
			String UpdateAddress=br.readLine();
			User1.SetUserAddress(UpdateAddress);
			System.out.println("Address of the user with University ID:"+InputUniID+" has been successfully updated");
			System.out.println("New Address is of the student having University ID is : "+User1.GetAddress());
			BMS.AddUser(User1);
		case "3":
			
			System.out.println("Make a transaction: ");	
			System.out.println("Enter 1. Deposit Fund into an Account:");
			System.out.println("Enter 2. Withdraw Fund from an Account:");
			String InputForTransaction=br.readLine();
			switch(InputForTransaction)
			{
			case "1":
				String ANbr=UniqueNumberGenerator.generateUniqueNumber();
				UserLogin User2=new UserLogin("abc", "20i-1815");
				Accounts Account=new SavingAccount(ANbr, 200, User2);
				System.out.print("Enter Deposit amount into this account with account number : "+ANbr);
				String InputForBalance=br.readLine();
				int Num1 = Integer.parseInt(InputForBalance);
				double AccountBalanceForTransaction = Double.parseDouble(InputForBalance);
				if(Num1<100)
				{
					System.out.print("Deposited amount should not be Negative and should not be less than 100: ");
					System.out.print("Please try again: ");
					break;
				}
				else {
				double Num = Double.parseDouble(InputForBalance);
				Account.Deposit(Num);
				System.out.println("Amount Deposited Sucessfully:");
				User2.SetAccount(Account);
				BMS.AddUser(User2);
				LocalDate currentDate = LocalDate.now();
				Transactions Transaction=new Transactions(ANbr, AccountBalanceForTransaction,currentDate);
				BMS.AddTransaction(Transaction);
				}
			case "2":
				ANbr=null;
				ANbr=UniqueNumberGenerator.generateUniqueNumber();
				User2=new UserLogin("abc", "20i-1815");
				Account=new CurrentAccount(ANbr, 200, User2);
				InputForBalance=null;
				System.out.print("Enter Withdraw amount from this account with account number : "+ANbr);
				InputForBalance=br.readLine();
				//System.out.print(InputForBalance);
				double Num = Double.parseDouble(InputForBalance);
				Num1 = Integer.parseInt(InputForBalance);
				double Balance=Account.GetAccountBalance();
				int Num2=(int)Balance;//for balance in int
				AccountBalanceForTransaction = Double.parseDouble(InputForBalance);
				if(Num2<Num1)
				{
					System.out.println("Your Account Balance is less than withdrawal amount entered: ");
					break;
				}
				else if(Num1<100)
				{
						System.out.print("Your Account Balance withdrawal request is below 100, try again: ");
				}
				else 
				{
				Num = Double.parseDouble(InputForBalance);
				Account.WithDraw(Num);
				User2.SetAccount(Account);
				System.out.println("Amount Withdraw Sucessfully:");
				User2.SetAccount(Account);
				BMS.AddUser(User2);
				LocalDate currentDate = LocalDate.now();
				Transactions Transaction=new Transactions(ANbr, AccountBalanceForTransaction,currentDate);
				BMS.AddTransaction(Transaction);
				break;
				}
			}
			break;
		case "4":
			LocalDate currentDate1 = LocalDate.now();
			String AccNum=UniqueNumberGenerator.generateUniqueNumber();
			UserLogin Abad=new UserLogin("G-13/2", "20i-1815");
			Accounts Account=new CurrentAccount(AccNum, 500, Abad);
			Abad.SetAccount(Account);
			Transactions T=new Transactions(AccNum, 200, currentDate1);
			BMS.AddUser(Abad);
			BMS.AddTransaction(T);
			BMS.GetTransaction();
		}
}
}