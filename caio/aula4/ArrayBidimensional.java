package devinhouse.senai.aula4;

import java.util.Scanner;

public class ArrayBidimensional {
  private static Scanner keyboard;

  public static void main(String[] args) {
    keyboard = new Scanner(System.in);

    System.out.println("Digite a quantidade de alunos para avaliar: ");
    int qtdAlunos = keyboard.nextInt();

    System.out.println("Digite a quantidade de notas: ");
    int qtdNotas = keyboard.nextInt();

    String[] nomes = new String[qtdAlunos];
    int[][] notas = new int[qtdAlunos][qtdNotas];

    for (int i = 0; i < nomes.length; i++) {
      System.out.printf("Digite o nome do aluno %s", i + 1);
      nomes[i] = keyboard.next();
    }

    for (int i = 0; i < notas.length; i++) {
      for (int j = 0; j < notas[i].length; j++) {
        System.out.printf("Digite a nota %s para o aluno %s", j + 1, i + 1);
        notas[i][j] = keyboard.nextInt();
      }
    }

    for (int i = 0; i < notas.length; i++) {
      System.out.println(String.format("Aluno %s - %s", i + 1, nomes[i]));
      System.out.println("Notas: ");
      for (int j = 0; j < notas[i].length; j++) {
        System.out.printf("\tNota(%s): %s", i + 1, notas[i][j]);
      }
    }
  }

}
