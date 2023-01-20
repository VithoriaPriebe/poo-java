
public class TestaWhile {
	//Java JRE e JDK: compile e execute o seu programa - Aula 7.1
	
	public static void main(String[] args) {
		
		int contador = 0; //inicializar a variável
		
		while(contador <= 10) {
			System.out.println(contador);
			// contador = contador + 1; não é tão utilizado
			// contador += 1;
			contador++;
		}
		System.out.println(contador);
	}

}
