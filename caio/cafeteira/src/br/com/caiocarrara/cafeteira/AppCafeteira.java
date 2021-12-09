package br.com.caiocarrara.cafeteira;

import br.com.caiocarrara.cafeteira.entidades.Cafeteira;

public class AppCafeteira {
  private static final int QTD_MAX_AGUA = 100;
  private static final int QTD_MAX_CAFE = 100;
  private static final int QTD_CAFEZINHO = 10;

  public static void main(String[] args) {
    Cafeteira cafeteira = new Cafeteira(QTD_MAX_AGUA, QTD_MAX_CAFE);

    cafeteira.ligar();
    cafeteira.fazerCafe(QTD_CAFEZINHO);
  }

}
