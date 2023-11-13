/*
 	* Title: Homework2_McCarthyOliveira
 	* By McCarthy Oliveira
 	* Date written: 4/2/2019
*/

public class CellularTelephoneCompanyBill {

	private double minutesUsed;
	final static double regularPrice = 10.00;
	final static double regularFee = 0.20;
	final static double premiumPrice = 20.00;
	final static double premiumFee1 = 0.10;
	final static double premiumFee2 = 0.05;
	private long AccN;		//Account Number
	
	public CellularTelephoneCompanyBill(double minUsed, long accountNumber) {
		this.minutesUsed = minUsed;		//Setting input from Test Class to (minutesUsed) variable in this Class
		AccN = accountNumber;		//Setting input from Test Class to (AccN) variable in this Class
	}
	
	public void plan (int code) {
		System.out.println("\nAccount Number: " + AccN + "\nAmount of Minutes Used: " + minutesUsed);
		switch (code) {
		//================================================================================================
		case 1: //Regular plan
			if (minutesUsed > 50) {
				double minutesLeft = minutesUsed - 50;
				double afterMinuteFee = minutesLeft * regularFee;
				double amountDue = regularPrice + afterMinuteFee;
				System.out.format("Amount Due: $" + "%.2f" , amountDue);
			}
			else if (minutesUsed <= 50) {
				System.out.println("Amount Due: $" + regularPrice);
			} break;
		//================================================================================================
		case 2: //Premium Plan
			if (minutesUsed > 75 && minutesUsed <= 100) {
				double minutesLeft = minutesUsed - 75;
				double afterMinuteFee = minutesLeft * premiumFee1;
				double amountDue = premiumPrice + afterMinuteFee;
				System.out.format("Amount Due: $" + "%.2f" , amountDue);
			}
			else if (minutesUsed > 100) {
				double minutesLeft = minutesUsed - 100;
				double afterMinuteFee = minutesLeft * premiumFee2;
				double amountDue = premiumPrice + afterMinuteFee;
				System.out.format("Amount Due: $" + "%.2f" , amountDue);
			}
			else if (minutesUsed <= 75) {
				System.out.println("Amount Due: $" + premiumPrice);
			} break;
		//================================================================================================
		}
	}
}