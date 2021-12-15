package banco.br.com.devinhouse.entidades;

import banco.br.com.devinhouse.interfaces.Tributavel;

public class ContaInvestimento extends Conta implements Tributavel {

	public ContaInvestimento(String nomeTitular, String sobrenomeTitular, String cpfTitular) {
		super(nomeTitular, sobrenomeTitular, cpfTitular);
	}
	
	public double getValorImposto() {
		return super.getSaldo() * 0.02;
	}

}
