
public class TestaMultiplo3 {
	//Java JRE e JDK: compile e execute o seu programa - Aula 7.14

	public static void main(String[] args) {
		
		for(int numero = 1; numero <= 100; numero++) {
			if(numero % 3 == 0) { //% se chama módulo
				System.out.println("O número " + numero + " é divisível por 3.");
			}
		}
		
		//ou mais simples sem trabalhar com "resto":
		 for (int i = 3; i < 100; i += 3 ){
	            System.out.println(i);
		 }
	}
}
