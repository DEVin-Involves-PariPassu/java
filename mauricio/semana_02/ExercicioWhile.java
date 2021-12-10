public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	double media;
	
	System.out.println("Novo cálculo (1 - sim 2 - não)");
	int x = entrada.nextInt();
	
	while(x != 2) {
		if (x == 1) {
			System.out.println("Digite a primeira nota");
			float n1 = entrada.nextFloat();
			
			if(n1 < 0.0 || n1 > 10.0) {
				System.out.println("Nota inválida");
				continue;
			}
			
			System.out.println("Digite a segunda nota");
			float n2 = entrada.nextFloat();
			
			if (n2 < 0.0 || n2 > 10.0) {
				System.out.println("Nota inválida");
				continue;
			}
			
			media = (n1 + n2)/2;
			
			System.out.printf("media = %.1f%n", media);
		} else {
			System.out.println("Opção inválida!");	
		}
		
		System.out.println("Deseja fazer novo calculo? (1 - sim 2 - não)");
		
		x = entrada.nextInt();
	}
}