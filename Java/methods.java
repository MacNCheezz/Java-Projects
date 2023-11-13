/*
 	* Student ID: 50235092
 	* Title: 5-12-19 Test
 	* By McCarthy Oliveira
 	* Date written: 5/2/2019
*/
public class methods {
	private static int product = 1;
	private static int sum = 0;
	private static int sum2;
	
	//==========================================================================================================
	public void methodOne(int input) {
		for(int i=1;i<=input*2;i+=2){
	           product = product*i;     
//	           System.out.println(product);
	    }
		System.out.println("Answer: " + product);
	}
	//==========================================================================================================
	public void methodTwo(int input) {
		for(int i = input; i >= 1; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
	}
	//==========================================================================================================
	public void methodThree(int input) {
		sum = (input * (input + 1));
		//=================================
	    for (int i = 1; i <= input; i++) {
	        sum2 = sum2 + 2*i; 
	    }
	    sum2 = sum2 / input;
	   	//=================================
	    System.out.println("The sum: " + sum2);
	    System.out.println("The average: " + sum);
	}
}
