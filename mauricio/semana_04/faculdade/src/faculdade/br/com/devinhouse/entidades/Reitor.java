package faculdade.br.com.devinhouse.entidades;

public class Reitor extends Funcionario {
	private final double BONUS = 2000;
	
	public Reitor(String nome, double salario) {
		super(nome, salario);
	}
	
	@Override
	public double getGastos() {
		return this.getSalario() + BONUS;
	}
	
	@Override
	public String getInfo() {
		return String.format("%s%n… um Reitor", super.getInfo());
	}
}
