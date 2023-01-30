
public class TestaBanco {

	public static void main(String[] args) {
	
		//Criar Cliente
		Cliente vithoria = new Cliente();
		vithoria.nome = "Vithória Eliza Priebe";
		vithoria.cpf = "123.456.789-10";
		vithoria.profissao = "Programador";
		
		//Criar conta
		Conta contaDaVithoria = new Conta();
		//Associar o cliente vithoria na conta anterior
		contaDaVithoria.titular = vithoria;
		
		System.out.println(contaDaVithoria.titular.nome); 
		
		//outra forma: Criar cliente diretamente
		Conta contaClienteDireta = new Conta();
		contaClienteDireta.titular = new Cliente();
		contaClienteDireta.titular.nome = "Cliente.";
		System.out.println(contaClienteDireta.titular.nome);
	}
}
