
public class TesteReferencias {

	public static void main(String[] args) {
		Conta primeiraConta = new Conta(); //Variável primeiraConta não é um objeto conta! Ele é uma referência para uma Conta.
		primeiraConta.saldo = 300;
		
		System.out.println("Saldo da primeira conta: " + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta; //segunda conta vai receber a mesma referência que tem na primeira (código do valor na memória)
		System.out.println(primeiraConta);
		System.out.println(segundaConta);
		
		System.out.println("Saldo da segunda conta: " + segundaConta.saldo);
	}
}
