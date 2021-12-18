package com.github.cacarrara.controlepedidos;

import java.util.Scanner;
import com.github.cacarrara.controlepedidos.entidades.Carrinho;
import com.github.cacarrara.controlepedidos.entidades.Catalogo;
import com.github.cacarrara.controlepedidos.entidades.Vendivel;

public class UI {
  private Scanner keyboard;
  private Catalogo catalogo;
  private Carrinho carrinho;

  public UI(Scanner keyboard, Catalogo catalogo, Carrinho carrinho) {
    this.keyboard = keyboard;
    this.catalogo = catalogo;
    this.carrinho = carrinho;
  }

  public void rodar() {
    int opcao = 0;

    do {
      this.criaMenu();
      opcao = this.perguntaOpcaoDesejada();
      this.processaRequisicaoDoUsuario(opcao);

      System.out.println("Continuar?");
      keyboard.next();
    } while (opcao != 0);
  }

  private void criaMenu() {
    System.out.print("\033[H\033[2J");
    System.out.flush();

    System.out.println("1: Listar itens vendiveis");
    System.out.println("2: Listar itens no carrinho");
    System.out.println("3: Colocar item no carrinho");
    System.out.println("4: Remover item do carrinho");
    System.out.println("0: Sair");
  }

  private int perguntaOpcaoDesejada() {
    System.out.println("Digite a opção desejada:");
    return this.keyboard.nextInt();
  }

  private void processaRequisicaoDoUsuario(int opcaoDigitada) {
    switch (opcaoDigitada) {
      case 1: {
        System.out.println("Itens do Catálogo: ");
        catalogo.geraListagemTextual();
        break;
      }
      case 2: {
        System.out.println("Itens do Carrinho: ");
        carrinho.geraListagemTextual();
        break;
      }
      case 3: {
        System.out.println("Informe o código do item: ");
        String codigoItem = keyboard.next();
        Vendivel item = catalogo.getItem(codigoItem);

        if (item == null) {
          System.out.println("Item não encontrado no catálogo.");
          break;
        }

        carrinho.addItem(item);

        break;
      }
      case 4: {
        System.out.println("Informe o código do item: ");
        String codigoProduto = keyboard.next();
        boolean removeu = carrinho.removeItem(codigoProduto);

        if (removeu) {
          System.out.println("Item removido do carrinho");
        } else {
          System.out.println("Item não encontrado no carrinho.");
        }
        break;
      }
      case 0: {
        System.out.println("Obrigado por usar o sistema...");
        break;
      }
      default:
        System.out.println("Opção inválida");
    }
  }

}
