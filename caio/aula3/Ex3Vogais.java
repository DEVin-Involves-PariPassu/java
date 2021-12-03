package devinhouse.senai.aula3;

import java.util.Scanner;

public class Ex3Vogais {
  private static Scanner keyboard;

  /**
   * Utilizando arrays, faça um programa que receba uma letra e diga se ela é uma vogal
   * 
   * @param args
   */

  public static void main(String[] args) {
    keyboard = new Scanner(System.in);

    // String[] vogais = new String[5];

    String[] vogais = {"A", "E", "I", "O", "U"};

    System.out.println("Digite uma letra");
    String letra = keyboard.next();

    boolean encontrouVogal = false;

    for (String vogal : vogais) {
      if (vogal.equals(letra)) {
        encontrouVogal = true;
        break;
      }
    }

    if (encontrouVogal) {
      System.out.println("Você digitou uma vogal.");
    } else {
      System.out.println("Você digitou uma consoante.");
    }
  }



}
