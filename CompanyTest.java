
//By: McCarthy Oliveira
//Student ID: 50235092


import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;

public class CompanyTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("input Name: ");
		String a = input.next();
		System.out.print("input ID number: ");
		long b = input.nextLong();
		System.out.print("input Hourly Wage: ");
		double c = input.nextDouble();
		System.out.print("input Hours Worked: ");
		double d = input.nextDouble();
		System.out.print("input Medicare Contribution Rate Pecentage: ");
		double e = input.nextDouble();
		input.close();
		
		float f = (float) (e / 100.0); //converting whole percentage into decimal
		
		
		Company employee = new Company(a, b, c, d, f);
		System.out.println(employee.employeeInfo());
		
		MathContext z = new MathContext(5); // 5 precision      

        BigDecimal a1 = new BigDecimal(employee.gross()); // Assigning value to BigDecimal object a1        
        BigDecimal a2 = a1.round(z); // a1 is rounded using z
        
        BigDecimal b1 = new BigDecimal(employee.medicare()); // Assigning value to BigDecimal object b1        
        BigDecimal b2 = b1.round(z); // b1 is rounded using z
        
        BigDecimal c1 = new BigDecimal(employee.net()); // Assigning value to BigDecimal object c1        
        BigDecimal c2 = c1.round(z); // c1 is rounded using z
        
		System.out.println("\nGrossPay: $" + a2 + 
							" \nMedicare Contribution: $" + b2 + 
							" \nNet Pay: $" + c2);
		
	}

}
