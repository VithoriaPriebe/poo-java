
public class TestaFor {
	//Java JRE e JDK: compile e execute o seu programa - Aula 7.6

	public static void main(String[] args) {
		
		//for(inicialização da variável; condição booleana; execução) a legibilidade é melhor em comparação ao while
		for(int contador = 0; contador <= 10; contador++) {
			System.out.println(contador);
		}
		//System.out.println(contador); não funciona fora do for
	}
}
