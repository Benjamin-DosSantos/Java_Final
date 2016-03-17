import java.util.Scanner;


public class Final_Lab_4 {
	public static void main(String[] args){
		String welcome_message = "Hello, please one number from 1 to 3.",	// Welcome message to tell the user what to do 
			   first_name = "Benjamin",	// First name to be displayed 
			   last_name = "DosSantos",	// Last name to be displayed
			   error_message = "There seems to be an issue with the input you entered, please try again.";	// Erro message for the user
		System.out.println(welcome_message);	// Display of welcome message to the user
			
		Scanner input = new Scanner(System.in);	// Gets the users input via the scanner system in java
		int input_value = input.nextInt();	// converts the input of the user into an int to be tested aginst.
		
		/**
		 * Checks the value of the input and returns an output to the user
		 * if input_value = 1 -> first name
		 * if input_value = 2 -> last name
		 * if input_value = 3 -> first_name + last_name
		 * if the input value is not 1, 2, or 3 then it displays an error message
		 */
		if(input_value == 1){
			System.out.println(first_name); 	// Print the first name to the user
		}else if(input_value == 2){
			System.out.println(last_name);		// Print the last name to the user
		}else if(input_value == 3){
			System.out.println(first_name + " " + last_name);	// Print both the first and last names to the user
		}else{
			System.out.println(error_message);	// Print an error message if needed
		}// End of else
	}// End of main method
}// End of class
