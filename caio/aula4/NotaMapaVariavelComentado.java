package devinhouse.senai.aula4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class NotaMapaVariavelComentado {
  /**
   * Recebe um número variável de nomes de alunos, com um número variável de notas para cada aluno.
   * Exibe as notas junto com a média.
   */
  // Aqui definimos uma constante para a nota de corte
  private static final Double NOTA_DE_CORTE = 7.0;
  private static Scanner keyboard;

  public static void main(String[] args) {
    keyboard = new Scanner(System.in);

    // Inicializamos o nosso mapa de notas. Lembrar que é importante
    // usarmos a interface para designar o tipo da variável. Por isso usamos o Map.
    // Já a instanciação do objeto precisa ser com um tipo (Classe) concreta que
    // implemente aquela interface.
    Map<String, List<Double>> mapaDeNotas = new HashMap<String, List<Double>>();

    // Recebe a quantidade de alunos
    System.out.println("Quantos alunos: ");
    int qtdAlunos = keyboard.nextInt();

    // Recebe a quantidade de notas
    System.out.println("Quantas notas: ");
    int qtdNotas = keyboard.nextInt();

    // For dos alunos. Vamos receber os dados de um aluno por vez
    for (int i = 0; i < qtdAlunos; i++) {

      // Recebe os dados de um aluno, começando pelo nome
      System.out.printf("Digite o nome do aluno %s %n", i + 1);
      String nomeAluno = keyboard.next();

      // Criamos a lista de notas do aluno. Por enquanto vazia.
      // A cada iteração (novo aluno), uma nova lista vazia será criada.
      List<Double> notas = new ArrayList<Double>();

      // For das notas. Vamos receber as notas do aluno
      for (int j = 0; j < qtdNotas; j++) {
        System.out.printf("Digite a nota %s do aluno %s %n", j + 1, nomeAluno);
        Double nota = keyboard.nextDouble();

        // Acabamos de receber a nota. Adicionamos ela na lista
        notas.add(nota);
      }

      // Nesse momento temos todas as notas, bem como o nome do aluno. Logo
      // podemos inserir o par <nome, listaDeNotas> no nosso mapa de notas.
      mapaDeNotas.put(nomeAluno, notas);
    }

    // Vamos começar a exibição das informações, iterando para
    // cada elemento do nosso mapa de notas.
    mapaDeNotas.forEach((nome, listaDeNotas) -> {
      System.out.print(String.format("A nota do aluno %s é ", nome));

      listaDeNotas.forEach((nota) -> {
        System.out.printf("%s, ", nota);
      });

      System.out.println("");

      // Vamos calular a média do aluno. Para isso precisamos somar todas as notas.
      // Começamos definindo uma variável para guardar o somatório.
      Double somaNotasAluno = 0.0;

      // Passamos nota por nota somando-a a variável somatória.
      for (Double nota : listaDeNotas) {
        somaNotasAluno += nota;
      }

      // Fazemos a divisão do total das notas pela quantidade de notas que é
      // igual ao tamanho da lista de notas (size).
      Double mediaAluno = somaNotasAluno / (double) listaDeNotas.size();

      // Vamos saber se o aluno está aprovado
      Boolean estaAprovado;
      if (mediaAluno >= NOTA_DE_CORTE) {
        estaAprovado = true;
      } else {
        estaAprovado = false;
      }

      // Usamos o operador ternário para saber o que mostrar quanto a
      // aprovação do aluno
      System.out.println(String.format("\tA média é: %.2f (%s)", mediaAluno,
          estaAprovado ? "aprovado" : "reprovado"));
    });
  }
}
