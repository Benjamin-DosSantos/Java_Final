import java.util.Random;


public class Final_Lab_11 {
	public static void main(String[] args){
		int golf_score[] = new int[18];	// Creates a new array with a size of 18
		int user_score[] = new int[18]; // Creates a new array with a size of 18
		
		/*
		 * populates the golf_score array with random numbers between 3 and 5
		 */
		Random ran = new Random();
		
		for(int i = 0; i < golf_score.length; i++){
			golf_score[i] = ran.nextInt(2) + 3;
		}// End of for golf_score
		
		/*
		 * populates the user_score array with random values between 2 and 7
		 */
		for(int i = 0; i < user_score.length; i++){
			user_score[i] = ran.nextInt(5) + 2;
		}// End of for golf_score
		
		/*
		 * calculate the golf score
		 */
		int golf_total = 0;
		for(int i = 0; i < golf_score.length; i++){
			golf_total += golf_score[i];
		}
		
		/*
		 * Calculate the user score
		 */
		int user_total = 0;
		for(int i = 0; i < user_score.length; i++){
			user_total += user_score[i];
		}
		
		/*
		 * Print the user and golf scores to the console
		 */
		System.out.println("Totals:");
		System.out.println("Golf Total: " + golf_total);
		System.out.println("User Total: " + user_total);
		
		
		/*
		 * Holes birdied
		 */
		int birdied_total = 0;
		for(int i = 0; i < user_score.length; i++){
			if(user_score[i] <= golf_score[i] - 1){
				birdied_total++;
			}
		}
		
		System.out.println("You Had " + birdied_total + " Birdies.");
		
		/*
		 * Holes eagled
		 */
		int eagled_total = 0;
		for(int i = 0; i < user_score.length; i++){
			if(user_score[i] <= golf_score[i] - 2){
				eagled_total++;
			}
		}
		
		System.out.println("You Had " + eagled_total + " Eagles.");
		
		/*
		 * Holes albatrossed 
		 */
		int albatross_total = 0;
		for(int i = 0; i < user_score.length; i++){
			if(user_score[i] <= golf_score[i] - 3){
				albatross_total++;
			}
		}
		
		System.out.println("You Had " + albatross_total + " Albatrosses.");
		
		/*
		 * Holes parred 
		 */
		int parred_total = 0;
		for(int i = 0; i < user_score.length; i++){
			if(user_score[i] == golf_score[i]){
				parred_total++;
			}
		}
		
		System.out.println("You Had " + parred_total + " Parred.");
		
		/*
		 * Holes bogeyed
		 */
		int bogye_total = 0;
		for(int i = 0; i < user_score.length; i++){
			if(user_score[i] + 1 == golf_score[i]){
				bogye_total++;
			}
		}
		
		System.out.println("You Had " + bogye_total + " Bogeys.");
		
		/*
		 * Holes double bogeyed
		 */
		int double_bogeyed_total = 0;
		for(int i = 0; i < user_score.length; i++){
			if(user_score[i] + 2 == golf_score[i]){
				double_bogeyed_total++;
			}
		}
		
		System.out.println("You Had " + double_bogeyed_total + " Double Bogeys.");
		
		/*
		 * Holes double bogeyed
		 */
		int triple_bogeyed_total = 0;
		for(int i = 0; i < user_score.length; i++){
			if(user_score[i] + 3 == golf_score[i]){
				triple_bogeyed_total++;
			}
		}
		
		System.out.println("You Had " + triple_bogeyed_total + " Triple Bogeys.");
	}// End of main method
}// End of class
