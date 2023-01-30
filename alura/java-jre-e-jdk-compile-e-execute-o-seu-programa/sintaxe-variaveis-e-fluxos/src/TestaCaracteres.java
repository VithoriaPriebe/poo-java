
public class TestaCaracteres {
	//Java JRE e JDK: compile e execute o seu programa - Aula 5.1 e 5.4
	
	public static void main(String[] args) {//ctrl + espaço
		
		char letra = 'a'; //aspas simples pra guardar apenas uma letra
		//char guarda um número da tabela unicode
		System.out.println(letra);
		
		char valor = 65;
		System.out.println(valor);
		
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		//String é do tipo: referência 
		String palavra = "Aspas duplas para guardar a frase";
		System.out.println(palavra);

		palavra = palavra + 2020;
		System.out.println(palavra);
		
		//testaValores
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10; 
		
		System.out.println(segundo); //segundo vai valer 5 e não 10 porque a variável do tipo primitivo guarda o valor que já foi atribuido antes de mudar
	}

}
