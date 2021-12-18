package com.github.cacarrara.controlepedidos;

import java.util.Scanner;
import com.github.cacarrara.controlepedidos.entidades.Carrinho;
import com.github.cacarrara.controlepedidos.entidades.Catalogo;
import com.github.cacarrara.controlepedidos.entidades.Cliente;

public class AppControlePedido {

  private static Scanner keyboard;

  public static void main(String[] args) {
    keyboard = new Scanner(System.in);

    Catalogo catalogoPadrao = Catalogo.comVendiveisBasicos();
    Cliente cliente = new Cliente("Josefina", "CL001");
    Carrinho carrinho = new Carrinho(cliente);

    UI ui = new UI(keyboard, catalogoPadrao, carrinho);
    ui.rodar();
  }

}
