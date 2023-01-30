import java.util.Scanner;

public class TestaFunction {

	public static void annouceDeveloperTeaTime() {
		System.out.println("Waiting for developer tea time...");
		System.out.println("Type in a ramdom word ad press Enter to start developer tea time.");
		Scanner input = new Scanner(System.in);
		input.next();
		System.out.println("It's developer tea time!");
		}
	
	public static void main(String[] args) {
		System.out.println("Welcome to your new job!");
		
		annouceDeveloperTeaTime();
		
		System.out.println("Write code.");
		System.out.println("Review code.");
		
		annouceDeveloperTeaTime();
		
		System.out.println("Get promoted!");
		
	}

}
