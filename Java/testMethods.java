/*
 	* Student ID: 50235092
 	* Title: 5-12-19 Test
 	* By McCarthy Oliveira
 	* Date written: 5/2/2019
	********************************************************************************
	*     For: Method One                *     For: Method Two                     *
	*             Enter: "1"             *             Enter: "2"                  *
	********************************************************************************
	*                        *   For: Method Three  *                              *
	*                        *      Enter: "3"      *                              *
	********************************************************************************
	Select Method: 1
	Enter number between 1-30: 5
	Answer: 945
*/
import java.util.Scanner;

public class testMethods {
	
	public static int input;
	public static int menuinput;
	
	public static void main(String[] args) {
		
		System.out.println("********************************************************************************");
		System.out.println("*     For: Method One                *     For: Method Two                     *");
		System.out.println("*             Enter: \"1\"             *             Enter: \"2\"                  *");
		System.out.println("********************************************************************************");
		System.out.println("*                        *   For: Method Three  *                              *");
		System.out.println("*                        *      Enter: \"3\"      *                              *");
		System.out.println("********************************************************************************");
	
		Scanner input1 = new Scanner(System.in);
		System.out.print("Select Method: ");
		menuinput = input1.nextInt();
		
		methods methodType = new methods();
		
		switch (menuinput) {
		case 1: 
			System.out.print("Enter number between 1-30: ");
			input = input1.nextInt();
			if (input >= 1 && input <= 30) {
				methodType.methodOne(input);
			}
			else 
				System.out.println("Error, Enter any number within the range");
			break;
	//==========================================================================================================
		case 2:
			System.out.print("Enter number between 4-9: ");
			input = input1.nextInt();
			if (input >= 4 && input <= 9) {
				methodType.methodTwo(input);
			}
			else 
				System.out.println("Error, Enter any number within the range");
			break;
	//==========================================================================================================
		case 3: 
			System.out.println("Enter number: ");
			input= input1.nextInt();
			methodType.methodThree(input); 
			break;
		default:
			System.out.println("Error, Number Invalid");
			break;
		}
		
		input1.close();
	}
}