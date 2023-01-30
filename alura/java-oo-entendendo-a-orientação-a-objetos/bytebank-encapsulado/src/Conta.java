
public class Conta {
	//Atributos
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total = 0; //Static = da classe
	
	//Construtores
	public Conta() {}
	
	/*/No Java é possível fazer a chamada de um construtor dentro de outro e faz-se isso para evitar duplicações de códigos e regras. 
	 * Afinal uma regra aplicada em um construtor normalmente será a mesma para o outro caso. Para isso usa-se o this( ) passando os 
	 * parâmetros correspondentes ao construtor que se queira chamar.*/
	
	public Conta(int agencia, int numero) {
		Conta.total++; //Nome da classe pois é dá classe, não da instância
		this.agencia = agencia;
		this.numero = numero;
	}
	
	//Métodos
	public void deposita(double valor) {
		this.saldo += valor;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}

	public boolean transfere(double valor, Conta destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}

	// getter e setter são utilizados para mudar os atributos da classe somente na
	// classe e não se preocupar com eles fora dela
	// Nao necessáriamente se utilizar um get precisa de um set

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) { // normalmente VOID, alteram o atributo e não devolve nada
		if (agencia <= 0) {
			System.out.println("Não pode valor menor ou igual a 0");
			return;
		} else {
			this.numero = numero;
		}
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("Não pode valor menor ou igual a 0");
			return;
		} else {
			this.agencia = agencia;
		}
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	public static int getTotal() { //método da classe precisa usar o static
		return Conta.total;
	}
}
