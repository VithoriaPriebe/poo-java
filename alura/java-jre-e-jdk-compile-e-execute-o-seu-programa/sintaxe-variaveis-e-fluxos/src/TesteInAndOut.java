import java.util.Scanner;

public class TesteInAndOut {

	public static void main(String[] args) {

		// First Case
		double studentGPA = 3.45;
		String studentName = "Kayla Hammon";
		System.out.println(studentName + " has a GPA of " + studentGPA);

		System.out.println("What do you want to update it to?");

		Scanner input = new Scanner(System.in);
		studentGPA = input.nextDouble();
		
		System.out.println(studentName + " now has a GPA of " + studentGPA);

		// Second Case

		System.out.println("Pick a number between 1 and 10:");
		Scanner scanner = new Scanner(System.in);
		int inputtedNum = scanner.nextInt();

		if (inputtedNum < 5) {
			System.out.println("Enjoy the good luck a friend brings you.");
		} else {
			System.out.println("Your shoe selection will make you very happy today.");
		}
	}
}
