package faculdade.br.com.devinhouse.main;

import faculdade.br.com.devinhouse.entidades.GeradorDeRelatorio;
import faculdade.br.com.devinhouse.entidades.Professor;
import faculdade.br.com.devinhouse.entidades.Reitor;

public class Main {

	public static void main(String[] args) {
		Professor professor = new Professor("Mauricio", 300, 20);
		Reitor reitor = new Reitor("Camila", 2000);
		GeradorDeRelatorio gerador = new GeradorDeRelatorio();
		
		gerador.adicionar(professor);
		gerador.adicionar(reitor);
	}

}
