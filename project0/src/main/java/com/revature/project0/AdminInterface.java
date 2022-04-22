package com.revature.project0;

public interface AdminInterface extends EmployeeInterface{
	
	//add ability to withdraw, deposit, and transfer customer accounts
	public void withdraw(int WAmt, int AccountID);
	public void deposit(int DAmt, int AccountID);
	public void transfer(int TAmt, int AccountIDa, int AccountIDb);
	
	/* optional: Admin powers to hire, fire, and promote employees
	 * public void hire (Employee NewHire);
	 * public void fire (Employee Todd);
	 * public void promote (Employee NewAdmin);
	 */

}