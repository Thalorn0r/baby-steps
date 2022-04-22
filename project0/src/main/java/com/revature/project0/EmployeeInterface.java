package com.revature.project0;

public interface EmployeeInterface {
	
	//fetch account lists from database
	public void getCustomer(int CustomerID);
	public void getAllCustomer();
	
	//fetch applications for approval
	public void getAllApps();
	public void getPendingApps();
	public void getCustomerApp(int CustomerID);
	
	//Approve and deny applications
	public void approve();
	public void deny();
	
	public void logout();

}
