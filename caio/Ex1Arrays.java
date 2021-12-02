package devinhouse.senai.aula3;

import java.util.Scanner;

public class Ex1Arrays {
  private static Scanner keyboard;

  /**
   * Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.
   * 
   */

  public static void main(String[] args) {
    keyboard = new Scanner(System.in);

    int[] numeros = new int[5]; // numeros = [][][][][]

    for (int i = 0; i < numeros.length; i++) {
      System.out.println("Digite um numero inteiro: ");
      int numeroDigitado = keyboard.nextInt();

      numeros[i] = numeroDigitado;
    }

    System.out.println(numeros);

    for (int numero : numeros) {
      System.out.println(numero);
    }
  }



}
