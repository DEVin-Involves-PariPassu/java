public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String usuario, senha;
	
	System.out.println("Digite o nome de usuario: ");
	usuario = scan.nextLine();
	
	System.out.println("Digite a senha: ");
	senha = scan.nextLine();
   
	while(senha.equals(usuario)) {
		System.out.println("A senha não pode ser igual ao nome de usuario! tente novamente.");
		
		System.out.println("Digite a senha: ");
		senha = scan.nextLine();
	};
}