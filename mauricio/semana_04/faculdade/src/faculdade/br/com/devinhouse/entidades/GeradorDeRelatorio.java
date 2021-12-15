package faculdade.br.com.devinhouse.entidades;

public class GeradorDeRelatorio {
	public void adicionar(Funcionario funcionario) {
		System.out.println(funcionario.getInfo());
		System.out.println(funcionario.getGastos());
	}
}
