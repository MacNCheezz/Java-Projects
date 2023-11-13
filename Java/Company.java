
//By: McCarthy Oliveira
//Student ID: 50235092


public class Company {
	
	private double grossPay;
	private double netPay;
	private double med; //Medicare Contribution
	private long ID;
	private double hourlyWage;
	private double hoursWorked;
	private double rate;
	private String Name;
	
	
	public Company(String Name, long ID, double hourlyWage, double hoursWorked, double rate) {
		this.ID = ID;
		this.hourlyWage = hourlyWage;
		this.hoursWorked = hoursWorked;
		this.rate = rate;
		this.Name = Name;
	}
	
	public double gross() {
		grossPay = hoursWorked * hourlyWage;
		return grossPay;
	}
	
	public double medicare() {
		med = grossPay * rate;
		return med;
	}
	
	public double net() {
		netPay = grossPay - med;
        return netPay;
	}
	
	public String employeeInfo () {
		return "\nName: " + Name + 
				"\nID number: " + ID + 
				" \nHourly Wage: $" + hourlyWage + 
				" \nhoursWorked: " + hoursWorked;
	}
}
