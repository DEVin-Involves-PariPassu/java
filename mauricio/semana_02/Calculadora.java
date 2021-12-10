package aula02;

import java.util.Scanner;

public class Calculadora {
  public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
    
  System.out.print("Digite o primeiro número: ");
  int num1 = input.nextInt();
  System.out.print("Digite o segundo número: ");
  int num2 = input.nextInt();
  input.nextLine();
  System.out.print("Digite o operador: ");
  String op = input.nextLine();
  int result = 0;

  switch (op) {
  case "somar":
    result = num1 + num2;
    break;
  case "subtrair":
    result = num1 - num2;
    break;
  case "multiplicar":
    result = num1 * num2;
    break;
  case "dividir":
    result = num1 / num2;
    break;
  default:
    System.out.println("Não foi possível identificar o operador!");
  }

  if (result != 0) {
    System.out.println("O resultado é: " + result);
  }
}
}