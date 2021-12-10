package meuBanco;

public class ObjetoJava {

	public static void main(String[] args) {
		Conta c1 = new Conta();
		c1.saldo = 100;
		
		Conta c2 = new Conta();
		c2.saldo = 100;
		
		//System.out.printf("O saldo de c1 é %f%n", c1.saldo);
		//System.out.printf("O saldo de c2 é %f", c2.saldo);
		
		System.out.println(c2.saldo == c1.saldo);
	}

}