/*Name
 * Mulualem Hailom
 * Nic Uhlir
 * 
 * This program will calculate the avrage Potions Exam Grade.
 */
import java.util.Scanner;

public class HouseScores {
	public static void main (String[] args) {
		Scanner console = new Scanner (System.in);
		System.out.println("How many student took the Potions Exam? ");
		int totalNumbers= console.nextInt();
		System.out.println("What House do you care about? ");
		String houseOfInterest= console.next();

		int studentFailed=0;
		double sum = 0;
		double highestScore=0;
		int studentNumbers=0;
		String studentHighScore="";

		for (int i=1; i<=totalNumbers; i++) {
			System.out.println("Enter \"<First name> <House name> <score> \" for all students now. ");
			String firstName= console.next(); 
			String houseName=console.next();
			int score = console.nextInt();

			if(houseName.equals(houseOfInterest)  ) {
				sum = sum + score;
				studentNumbers= studentNumbers+1;
				if (score>highestScore) {
					highestScore=score;

				}
				if(score==highestScore) {
					studentHighScore=firstName;
				}

				if (score<60) {
					studentFailed= studentFailed+1;
				}
			}
		}
		double averageScore= (sum/studentNumbers);
		String letterScore="";
		System.out.println("Thank you!");
		System.out.println("# of " + houseOfInterest + " students: " + studentNumbers);
		System.out.println(houseOfInterest +"'s "+"highest score was: "+ (int)highestScore);
		System.out.printf(houseOfInterest +"'s "+"average score was: "+ "%.2f",averageScore);
		System.out.println();


		if (averageScore>=90) { 
			letterScore="A";
		} 
		else if (averageScore>=80) {
			letterScore="B";
		}
		else if (averageScore>=70) {
			letterScore="C";
		}
		else if (averageScore>=60) {
			letterScore="D";
		}
		else if (averageScore<=60) {
			letterScore="F";
		}
		System.out.println(houseOfInterest +"'s "+"average score letter grade: "+ letterScore);
		System.out.println("# of " + houseOfInterest + " students who failed the exam (<60): " + studentFailed);
		System.out.println(houseOfInterest + " 's" + " student with highest score: " + studentHighScore);
		System.out.println();
	}
}



