
public class TestaMetodo {

	public static void main(String[] args) {
		
		//Operações na primeira conta
		Conta contaUm = new Conta();
		contaUm.saldo = 100;
		contaUm.deposita(100);
		System.out.println(contaUm.saldo);
		contaUm.saca(50);
		System.out.println(contaUm.saldo);
		
		//Operações na segunda conta
		Conta contaDois = new Conta();
		contaDois.deposita(1000);
		boolean sucessoTransferencia = contaDois.transfere(300, contaUm);
		if(sucessoTransferencia) {
			System.out.println("Transferência com sucesso");
		} else {
			System.out.println("Dinheiro insuficiente");
		}
		
		//Conferir dinheiro nas contas:
		System.out.println(contaUm.saldo);
		System.out.println(contaDois.saldo);
	}
}
