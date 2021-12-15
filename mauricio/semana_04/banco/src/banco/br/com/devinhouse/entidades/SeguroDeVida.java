package banco.br.com.devinhouse.entidades;

import banco.br.com.devinhouse.interfaces.Tributavel;

public class SeguroDeVida implements Tributavel {
	private double valor;
	Cliente titular;
	private int numeroApolice;
	
	public SeguroDeVida(String nomeTitular, String sobrenomeTitular, String cpfTitular, double valor) {
		this.titular = new Cliente(nomeTitular, sobrenomeTitular, cpfTitular);
		this.valor = valor;
	}

	public double getValorImposto() {
		return this.valor * 0.02;
	}
}
