public static int fator(int num) {
	int result = 1;
	
	if (num == 0) {
		result = 0;
	} else {			
		for (int i = num; i > 0; i--) {
			result = i * result;
		}			
	}
	
	return result;
}

public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	try {
		System.out.print("Digite um número de 0 a 10: ");
		int num = input.nextInt();
		
		while (num > 10 || num < 0) {
			System.out.print("Digite um número de 0 a 10: ");
			num = input.nextInt();
		}
		
		System.out.println("O fatorial de " + num + " é: " + fator(num));
	} catch (Exception ex) {
		ex.printStackTrace();
	} finally {
		input.close();
	}
}