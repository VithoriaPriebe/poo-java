
public class TestaCondicional {
	// Java JRE e JDK: compile e execute o seu programa - Aula 6.1, 6.4 e 6.8

	public static void main(String[] args) {

		System.out.println("Testando condicionais."); // sysout + ctrl + espaço

		// Primeira aula
		
		int idade = 20;
		int quantidadePessoas = 3;

		if (idade >= 18) { // boa prática: usar sempre as chaves
			System.out.println("Você tem mais de 18 anos.");
			System.out.println("Seja bem-vindo.");
		} else {
			if (quantidadePessoas >= 2) {
				System.out.println("Você não tem 18, mas pode entrar pois está acompanhado.");
			} else {
				System.out.println("Infelizmente você não pode entrar.");
			}
		}

		// Segunda aula - simplificando código
		
		idade = 16;
		quantidadePessoas = 1;
		if (idade >= 18 || quantidadePessoas >= 2) {
			System.out.println("Seja bem-vindo.");
		} else {
			System.out.println("Infelizmente você não pode entrar.");
		}
		
		
		idade = 21;
		boolean acompanhado = true; // ou boolean acompanhado = quantidadePessoas >= 2;
		if (idade >= 18 && acompanhado) { //Os operadores lógicos devem ter no lado esquerdo e direito uma expressão booleana.
			System.out.println("Seja bem-vindo.");
		} else {
			System.out.println("Infelizmente você não pode entrar.");
		}

		//quando usamos =, estamos atribuindo, quando usamos == estamos comparando
		
		// Terceira Aula - TestaEscopo
		
		boolean comCompanhia;
		quantidadePessoas = 3;
		
		if (quantidadePessoas >= 2) {
			//Uma variável, a partir de sua declaração, passa a valer entre as chaves correspondentes, o que se denomina escopo. 
			//boolean comCompanhia = true; funcionaria somente dentro desse escopo
			comCompanhia = true;
		} else {
			comCompanhia = false;
		}
		
		System.out.println("Valor de acompanhado = " + comCompanhia);
		
		/*Qual o valor default de um boolean?
				No Java, essas variáveis do tipo local, como as que estamos vendo aqui, dentro de main, são temporárias e não possuem valor padrão, 
			sendo necessária sua inicialização antes de sua impressão, acesso, em uma operação, e assim por diante. */
	}
}