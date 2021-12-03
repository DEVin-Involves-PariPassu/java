package devinhouse.senai.aula4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class NotaMapaVariavelMetodos {
  /**
   * Recebe um número variável de nomes de alunos, com um número variável de notas para cada aluno.
   * Exibe as notas junto com a média.
   */
  private static final Double NOTA_DE_CORTE = 7.0;
  private static Scanner keyboard;
  private static Map<String, List<Double>> mapaDeNotas;
  private static int qtdAlunos;
  private static int qtdNotas;


  public static void main(String[] args) {
    keyboard = new Scanner(System.in);
    mapaDeNotas = new HashMap<String, List<Double>>();
    recebeParametrosDeAvaliacao();
    recebeNotasPorAluno();
    exibeResultados();
  }

  private static void exibeResultados() {
    mapaDeNotas.forEach((nome, listaDeNotas) -> {
      System.out.print(String.format("A nota do aluno %s é ", nome));

      listaDeNotas.forEach((nota) -> {
        System.out.printf("%s, ", nota);
      });

      System.out.println("");

      Double mediaAluno = calculaMedia(listaDeNotas);
      Boolean estaAprovado = isAprovado(mediaAluno);

      System.out.println(String.format("\tA média é: %.2f (%s)", mediaAluno,
          estaAprovado ? "aprovado" : "reprovado"));
    });
  }

  private static Boolean isAprovado(Double mediaAluno) {
    Boolean estaAprovado;
    if (mediaAluno >= NOTA_DE_CORTE) {
      estaAprovado = true;
    } else {
      estaAprovado = false;
    }
    return estaAprovado;
  }

  private static Double calculaMedia(List<Double> notas) {
    Double somaNotasAluno = 0.0;

    for (Double nota : notas) {
      somaNotasAluno += nota;
    }

    return somaNotasAluno / (double) notas.size();
  }

  private static void recebeNotasPorAluno() {
    for (int i = 0; i < qtdAlunos; i++) {
      System.out.printf("Digite o nome do aluno %s %n", i + 1);
      String nomeAluno = keyboard.next();

      List<Double> notas = new ArrayList<Double>();

      for (int j = 0; j < qtdNotas; j++) {
        System.out.printf("Digite a nota %s do aluno %s %n", j + 1, nomeAluno);
        Double nota = keyboard.nextDouble();

        notas.add(nota);
      }

      mapaDeNotas.put(nomeAluno, notas);
    }
  }

  private static void recebeParametrosDeAvaliacao() {
    System.out.println("Quantos alunos: ");
    qtdAlunos = keyboard.nextInt();

    System.out.println("Quantas notas: ");
    qtdNotas = keyboard.nextInt();
  }
}
