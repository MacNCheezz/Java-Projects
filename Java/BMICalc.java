package bmi;

import java.util.Scanner;
import java.lang.Math;

public class Calc {
	public static void main(String[]args) {

		int a;			//weight in pounds
		double aa;		//lbs to kg
		int b;			//height in feet
		int c;			//height in inch
		int d;			//ft to inch
		int e;			//combining "b" and "d"
		double f;		//inch to ft			 			 (ft = in * 0.083333)
		double g;		//feet to meters					 (m  = ft / 3.2808)
		double h;		//square root meters	
		double z;		//answer				 		   	 (weight in kg / meters squared)
		double zz;		//answer rounded by 1 decimal

		Scanner input = new Scanner(System.in);
		System.out.println("Weight in Pounds: ");
	    	a = input.nextInt();
	    		aa = a/2.2046;
	    			//System.out.println(a + "/2.2046 = " + aa); 		//(Spacing for debugging)
	    			//System.out.println(); 							//(Spacing for debugging)
				
		System.out.println("Height in Feet: ");
			b = input.nextInt();
		System.out.println("Height in Inch: ");
			c = input.nextInt();
				//System.out.println(); 		//(Spacing for debugging)
			
		input.close();
		
			d = b * 12;
				//System.out.println(d); 		//(Spacing for debugging)
				//System.out.println(); 		//(Spacing for debugging)
			
			e = c + d;
				//System.out.println(e); 		//(Spacing for debugging)
				//System.out.println(); 		//(Spacing for debugging)
			
			f = e * 0.083333;
				//System.out.println(f); 		//(Spacing for debugging)
				//System.out.println(); 		//(Spacing for debugging)
			
			g = f / 3.2808;
				//System.out.println(g); 		//(Spacing for debugging)
				//System.out.println(); 		//(Spacing for debugging)
			
			h = Math.pow(g,2);
				//System.out.println(h); 		//(Spacing for debugging)
				//System.out.println(); 		//(Spacing for debugging)
		
			z = aa/h;
			zz = Math.round(z * 10.0) / 10.0;
				System.out.println("BMI: " + zz);
				System.out.println();
				
			if (zz >= 18.5 && zz <= 24.9) {
				System.out.println("Your Healthy");	
			}else if (zz < 18.5) {
				System.out.println("Your Underweight");
			}else if (zz >= 25 && zz <= 29.9) {
				System.out.println("Your Overweight");
			}else {
				System.out.println("Your Obese");
			}
			
			System.out.println();
			System.out.println("Underweight = <18.5");
			System.out.println("Normal weight = 18.5–24.9");
			System.out.println("Overweight = 25–29.9");
			System.out.println("Obesity = BMI of 30 or greater");		
			
		
	}
}