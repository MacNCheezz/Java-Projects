import java.math.*;

public class CarTest {

	public static void main(String[] args) {
		
		/*
		 
		 * Title: Homework1_McCarthyOliveira
		 * By McCarthy Oliveira
		 * Date written: 2/22/2019
		 
		 
         * Expected print outcome:
      **********************************************************************
      * Initial Gas: 15.0 gallons                                          *
      * Planned Distance: 150.0 miles                                      *
      *                                                                    *
      * Gas remaining after amount of miles driven:                        *
      *      11.9 gallons                                                  *
      *                                                                    *
      * How many miles with amount of initial gas given:                   *
      *      735 miles remaining                                           *
      *                                                                    *
      * How many miles with amount of gas left AFTER the 150.0 mile trip:  *
      *      585 miles remaining                                           *
      **********************************************************************
    	*/
		
		Car myHybrid = new Car(49); // 49 miles/gallon
		myHybrid.addGas(15); // Tank 15 gallons
		myHybrid.drive(150); // Drive 150 miles
		double a = myHybrid.drive(); //assigning variable a to drive method
		
		//==================================================================================================================================
		
		// rounding amount of remaining gallons
		
		MathContext z = new MathContext(3); // 3 precision 
        MathContext zz = new MathContext(5); // 5 precision       

        BigDecimal a1 = new BigDecimal(myHybrid.getGas()); // Assigning value to BigDecimal object a1        
        BigDecimal a2 = a1.round(z); // a1 is rounded using z
        
        BigDecimal b1 = new BigDecimal(myHybrid.estimateTrip()); // Assigning value to BigDecimal object b1        
        BigDecimal b2 = b1.round(zz); // b1 is rounded using zz
        
        BigDecimal c1 = new BigDecimal(myHybrid.restTrip()); // Assigning value to BigDecimal object c1        
        BigDecimal c2 = c1.round(zz); // c1 is rounded using zz
        
		//==================================================================================================================================
        
        /* printing:
         	* initial gas and planned distance of travel	
         	* remaining gallons
         	* miles with initial amount of gas given 
         	* miles with the remaining gas after the assigned mile trip
        */
        
        System.out.println("Initial Gas: " + myHybrid.addGas() + " gallons");
        System.out.println("Planned Distance: " + myHybrid.drive() + " miles");
        System.out.println();
        
		//=====================================================================
        
        System.out.println("Gas remaining after amount of miles driven: "); 
        System.out.println("    " + a2 + " gallons");
        System.out.println();
        
		//=====================================================================
       
		System.out.println("How many miles with amount of initial gas given: ");  	
        System.out.println("    " + b2 + " miles remaining");
		System.out.println();		
		
		//=====================================================================
		
		System.out.println("How many miles with amount of gas left AFTER the " + myHybrid.printDis(a) + " mile trip: ");
        System.out.println("    " + c2 + " miles remaining");
        System.out.println();

        //==================================================================================================================================
	}
}