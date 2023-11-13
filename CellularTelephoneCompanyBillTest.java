/*
 	* Title: Homework2_McCarthyOliveira
 	* By McCarthy Oliveira
 	* Date written: 4/2/2019
 	* 
 	* 
 	* *****************************************************************************************
 	* Enter Service Code: 1 for Regular Service, 2 for Premium Service
 	* 1
 	* 
 	* Phone Plan: Regular
 	* Enter Amount of Minutes Used: 53
 	* Enter Account Number: 123456789
 	* 
 	* Account Number: 123456789
 	* Amount of Minutes Used: 53.0
 	* Amount Due: $10.60
 	* *****************************************************************************************
*/

import java.util.*;

public class CellularTelephoneCompanyBillTest {
	
	static double minutesUsed;

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		//**********Opens Input Stream**********
		//================================================================================================
		System.out.println("Enter Service Code: 1 for Regular Service, 2 for Premium Service");
		int serviceCode = input.nextInt();		//Decides if the plan is regular or premium
		
		switch (serviceCode) {
		case 1: System.out.println("\nPhone Plan: Regular"); break;
		case 2: System.out.println("\nPhone Plan: Premium"); break;
		default: System.out.println("\nError, Enter Valid Service Code"); System.exit(0); break;
		}
		
		System.out.print("Enter Amount of Minutes Used: ");
		minutesUsed = input.nextDouble();		//Entering the amount of minutes used

		System.out.print("Enter Account Number: ");
		long AccN = input.nextLong();		//Entering the Account Number of the Account Holder
		//===============================================================================================
		input.close();		//**********Closes Input Stream**********
		
		//================================================================================================	
		CellularTelephoneCompanyBill bill = new CellularTelephoneCompanyBill(minutesUsed, AccN);
		bill.plan(serviceCode);		//Setter for Service Code provided 
		//================================================================================================		
		}	
}