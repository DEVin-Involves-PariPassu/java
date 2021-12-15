package banco.br.com.devinhouse.entidades;

import java.util.ArrayList;

import banco.br.com.devinhouse.interfaces.Tributavel;

public class ManipuladorDeTributaveis {
	private double total;
	
	public void calculaImposto(ArrayList<Tributavel> tributaveis) {
		for (Tributavel tributavel : tributaveis) {
			total += tributavel.getValorImposto();
		}
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	
}
