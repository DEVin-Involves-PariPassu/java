package meuBanco;

public class Conta {
	private Cliente titular = new Cliente();
	private String nome;
	private double saldo;
	private final double limite = 200;
	private static int totalDeContas;

	public Conta() {
		Conta.totalDeContas++;
	}

	public static int getTotalDeContas() {
		return totalDeContas;
	}

	public static void setTotalDeContas(int totalDeContas) {
		Conta.totalDeContas = totalDeContas;
	}

	public Conta(double saldo) {
		this.saldo = saldo;
	}

	private Conta(String nome, String sobrenome, int cpf) {
		this.titular.nome = nome;
		this.titular.sobrenome = sobrenome;
		this.titular.cpf = cpf;
	}

	public Conta(String nome, String sobrenome, int cpf, double saldo) {
		this(nome, sobrenome, cpf);
		Conta.totalDeContas++;
		this.saldo = saldo;
	}

	private boolean temSaldo(double valorSaque) {
		return valorSaque <= this.getSaldo();
	}

	public boolean sacar(double valorSaque) {
		if (temSaldo(valorSaque)) {
			this.saldo -= valorSaque;
			return true;
		} else {
			return false;
		}
	}

	void depositar(double valorDeposito) {
		this.saldo += valorDeposito;
	}

	public double getSaldo() {
		return this.saldo + this.limite;
	}

	String getSaldoString() {
		return "O saldo atual do cliente " + this.titular.nome + " é: " + this.getSaldo();
	}

	public Cliente getTitular() {
		return titular;
	}

	public void setTitular(Cliente titular) {
		this.titular = titular;
	}

	void transferir(double valorTransferencia, Conta contaDestino) {
		if (temSaldo(valorTransferencia)) {
			this.saldo -= valorTransferencia;
			contaDestino.saldo += valorTransferencia;
		}
	}
}