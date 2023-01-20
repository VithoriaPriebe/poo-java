
public class TestaVariaveis { //CamelCase - convenção de código
//Java JRE e JDK: compile e execute o seu programa - Aula 4.1, 4.4 e 4.7
	
public static void main(String[] args) {
		
		System.out.println("Olá, novo teste.");
		
		int idade; //denominar corretamente a variável
		idade = 37; 
		System.out.println(idade);
		
		idade = 30 + 10;
		System.out.println(idade);
		
		idade = (7 * 2) + 2;
		System.out.println(idade);
		System.out.println("A idade é " + idade); // + vai concatenar valores (string com variável)
		
		
		//Para testar o ponto flutuante:
		
		double salario; //usar double para números do tipo flutuante
		salario = 1250.70; //não vai aparecer o zero do final neste caso
		System.out.println("Meu salário é " + salario);
		
		double divisao = 3.14 / 2;
		System.out.println(divisao);
		
		int outraDivisao = 5 / 2; //dois números inteiros saída é um número inteiro = resultado truncado
		System.out.println(outraDivisao);
		double novaTentativa = 5 / 2;
		System.out.println(novaTentativa); //resultado 2.0 continua errado para consertar isso trocar o 5 para 5.0 em decimal = muda a variável para double
		double novaTentativa2 = 5.0 / 2;
		System.out.println(novaTentativa2);
		
		
		//moldar um double pra encaixar em um inteiro:
		salario = 1270.50;
		int valor = (int) salario; //casting de variável = faz a conversão quando ela não é possível de forma automática = adicionar (int)
		System.out.println(valor);
		
		/* Tipos de variáveis
		int = 32 bits positivos e negativos
		long = 64 bits, número muito grande 69848262895649l precisa colocar um l no final
		short valor pequeno = 16 bits
		byte = 8 bits (-127 a 128)
		float = ponto flutuante, precisa colocar f no final igual o long */
		
		double valor1 = 0.2;
		double valor2 = 0.1;
		double total = valor1 + valor2; //número com um 4 no final (?) / IEEE 754 / isso é um problema quando se utiliza dinheiro
		System.out.println(total); 
		
	}
}