
public class TestaLacos {
	//Java JRE e JDK: compile e execute o seu programa - Aula 7.9 e 7.10

	public static void main(String[] args) {
		
		//aula 7.9 - tabuada utilizando laço
		for(int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			System.out.println("Tabuada do número " + multiplicador);
			
			for(int contador = 0; contador <= 10; contador++) {
				System.out.print(multiplicador * contador);
				System.out.print(" ");
			}
			
			System.out.println(); //pular linha de uma tabuada para a outra
		}
		System.out.println();
		
		
		//aula 7.10 - matriz triangular
		for(int linha = 0; linha < 10; linha++) {
			for(int coluna = 0; coluna < 10; coluna++) { //poderia simplificar o código para: for(int coluna = 0; coluna <= linha; coluna++) e retirar o if
				if(coluna > linha) {
					break; //sai do laço
				}
				System.out.print("*");
			}		
			System.out.println(); 	
		}
	}
}
