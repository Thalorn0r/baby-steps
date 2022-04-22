package com.revature.project0;

public interface CustomerInterface {
	
	//make an application to add to database
	public void apply();
	public void applyJoint(CustomerInterface partner);
	
	//fetch this customer's accounts and balances
	public void getCustomer();
	
	//withdraw, deposit, and transfer with customer's accounts
	public void withdraw(int WAmt);
	public void deposit(int DAmt);
	public void transfer(int TAmt, int AccountIDa, int AccountIDb);
	
	public void logout();

}
