import java.util.Scanner;


public class Final_Lab_7 {
	public static void main(String[] args){
		String welcome_message = "Hello, please enter three (3) values. ";	// Opening welcome message to the user
		
		int starting_value = 0,	// variable for the starting value
			ending_value = 0,	// Variable for the ending value
			count_value = 0;	// Variable for the count value
		
		System.out.println(welcome_message);	// Prints the welcome message to the user
		
		Scanner input = new Scanner(System.in);		// Creates a scanner for the enterd values
		
		starting_value = input.nextInt();	// Sets the starting value to the first input
		ending_value = input.nextInt();		// Sets the ending value to the second input
		count_value = input.nextInt();		// Sets the count value to the third and final input
		
		for(int i = starting_value; i < ending_value; i += count_value){	
			System.out.println(i);	// Prints the value of i to console
		}// End of for starting value
	}// End of main method
}// End of class
