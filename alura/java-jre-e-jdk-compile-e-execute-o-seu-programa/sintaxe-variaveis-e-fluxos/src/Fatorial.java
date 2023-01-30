
public class Fatorial {
	//Java JRE e JDK: compile e execute o seu programa - Aula 7.15

	public static void main(String[] args) {
		
		int fatorial = 1;
		for(int i = 1; i <= 10; i++) {
			fatorial *= i;
			System.out.println("Fatorial de " + i + " = " + fatorial);
		}
	}
}
