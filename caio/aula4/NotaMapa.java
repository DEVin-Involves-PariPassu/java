package devinhouse.senai.aula4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NotaMapa {
  /**
   * Recebe o nome de um aluno e a nota e exibe na tela usando Map
   */
  private static Scanner keyboard;

  public static void main(String args[]) {
    keyboard = new Scanner(System.in);

    Map<String, Float> nomesNota = new HashMap<String, Float>();

    System.out.println("Digite o nome do aluno");
    String nomeAluno = keyboard.next();

    System.out.println("Digite a nota do aluno");
    float notaAluno = keyboard.nextFloat();

    nomesNota.put(nomeAluno, notaAluno);

    nomesNota.forEach((nome, nota) -> {
      System.out.printf("A nota do aluno %s é %.2f", nome, nota);
    });

    // for (Map.Entry<String, Float> nomeNota : nomesNota.entrySet()) {
    // System.out.printf("A nota do aluno %s é %.2f", nomeNota.getKey(), nomeNota.getValue());
    // }
  }
}
