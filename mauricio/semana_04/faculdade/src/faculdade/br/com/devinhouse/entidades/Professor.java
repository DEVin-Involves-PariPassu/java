package faculdade.br.com.devinhouse.entidades;

public class Professor extends Funcionario {
	private final int VALOR_HORA_AULA = 10;
	private int horasAula;
	
	public Professor(String nome, double salario, int horasAula) {
		super(nome, salario);
		this.horasAula = horasAula;
	}
	
	@Override
	public double getGastos() {
		return this.getSalario() + horasAula * VALOR_HORA_AULA;
	}
	
	@Override
	public String getInfo() {
		return String.format("%s%nTeve %d horas de aula", super.getInfo(), horasAula);
	}
}
