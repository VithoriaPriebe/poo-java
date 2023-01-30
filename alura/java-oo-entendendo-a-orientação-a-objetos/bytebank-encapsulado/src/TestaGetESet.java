
public class TestaGetESet {

	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente vithoria = new Cliente();
		conta.setTitular(vithoria);
		vithoria.setNome("Vithória Priebe");
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programadora");
	}

}
