package banco.br.com.devinhouse.entidades;

public class Endereco {
	String logradouro;
	String numero;
	String complemento;
	String cep;
	
	public Endereco(String logradouro, String numero, String complemento, String cep) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.complemento = complemento;
		this.cep = cep;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		
		Endereco that = (Endereco) o;
		return this.logradouro.equals(that.logradouro) &&
			   this.numero.equals(that.numero) &&
			   this.complemento.equals(that.complemento) &&
			   this.cep.equals(that.cep);
	}
}
