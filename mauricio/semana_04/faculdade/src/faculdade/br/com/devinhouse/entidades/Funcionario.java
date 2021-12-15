package faculdade.br.com.devinhouse.entidades;

public abstract class Funcionario {
	private String nome;
	private double salario;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}

	public abstract double getGastos();
	
	public String getInfo() {
		return String.format("Nome: %s com salário de %.2f", this.nome, this.salario);
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
}
