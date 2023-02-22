package i201815_Abad_Naseer_Q_Assignment_1_First_SDAFinancials_Ltd_A_Banking_System_for_SDA_Students;

import java.util.ArrayList;

public class UserLogin {
	private String IdNumber;//ID of the student
	private String Address;//address of the student
	ArrayList<Accounts> AccountsList = new ArrayList<Accounts>(3);
	public Accounts A;
	//private Accounts Account[]=new Accounts[3];//accounts of the student
	//private static_int i=0;
	public UserLogin(String add, String idn)
	{
		this.Address=add;
		this.IdNumber=idn;
	}
	public void SetUserAddress(String add)
	{
		this.Address=add;
	}
	public void SetAccount(Accounts A)
	{
		if(this.AccountsList.size()<=3)
		{
			this.AccountsList.add(A);
		}
		else
		{
			System.out.println("You have reached maximum Account limit: \n"+"Try again");
		}
	}
	public void GetAccount()
	{
		for(Accounts A: AccountsList)
		{
			System.out.println(A);
		}
	}
	public void DeleteAccount(Accounts A)
	{
		AccountsList.remove(A);
	}
	public String GetAddress()
	{
		return this.Address;
	}
	public String GetId()
	{
		return this.IdNumber;
	}

}