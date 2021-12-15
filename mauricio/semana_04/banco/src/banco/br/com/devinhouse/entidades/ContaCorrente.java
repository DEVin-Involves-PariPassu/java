package banco.br.com.devinhouse.entidades;

import banco.br.com.devinhouse.interfaces.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {
private double limite;
	
	public ContaCorrente(String nome, String sobrenome, String cpf, double limite) {
		super(nome, sobrenome, cpf);
		this.limite = limite;
	}

	public double getLimite() {
		return this.limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	@Override
	public double getSaldo() {
		return super.getSaldo() + this.limite;
	}
	
	@Override
	public void imprimeSaldo() {
		super.imprimeSaldo();
		System.out.printf("E possui R$ %.2f de limite.", this.limite);
	}
	
	public double getValorImposto() {
		return super.getSaldo() * 0.01;
	}
}
