package banco.br.com.devinhouse.entidades;

public class Cliente {
	String nome;
	String sobrenome;
	String cpf;
	Endereco endereco;
	
	Cliente(String nome, String sobrenome, String cpf) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.cpf = cpf;
	}
}
