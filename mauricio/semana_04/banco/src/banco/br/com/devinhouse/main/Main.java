package banco.br.com.devinhouse.main;

import java.util.ArrayList;

import banco.br.com.devinhouse.entidades.ContaCorrente;
import banco.br.com.devinhouse.entidades.ContaInvestimento;
import banco.br.com.devinhouse.entidades.ContaPoupanca;
import banco.br.com.devinhouse.entidades.ManipuladorDeTributaveis;
import banco.br.com.devinhouse.entidades.SeguroDeVida;
import banco.br.com.devinhouse.interfaces.Tributavel;

public class Main {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente("Mauricio", "Sampaio", "1", 100);
		ContaInvestimento ci = new ContaInvestimento("Lucas", "Bueno", "2");
		SeguroDeVida sv = new SeguroDeVida("João", "Alberto", "3", 300);
		ContaPoupanca cp = new ContaPoupanca("Mauricio", "Sampaio", "1", 100);
		
		ArrayList<Tributavel> tributaveis = new ArrayList<>();
		
		tributaveis.add(sv);
		tributaveis.add(ci);
		tributaveis.add(cc);
		
		ManipuladorDeTributaveis manipulador = new ManipuladorDeTributaveis();
		
		manipulador.calculaImposto(tributaveis);
		
		System.out.printf("O total de tributos é: %.2f", manipulador.getTotal());
	}

}
