import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter your age.");

		int userAge = input.nextInt();

		int legalVotingAge = 18;

		if (userAge >= legalVotingAge) {
			System.out.println("You can vote!"); System.out.println("Go do it!");
		} else {
			System.out.println("Sorry, you're not old enough yet.");
		}
		
		//String method
		
		String myName = input.nextLine();
		System.out.println(myName.toLowerCase());
		System.out.println(myName.toUpperCase());
		System.out.println(myName);
		input.close();



	}

}
