package br.com.caiocarrara.cafeteira.entidades;

public class Cafeteira {
  private final int QTD_CAFEZINHO_PADRAO = 5;
  private boolean isLigada;
  private int qtdAgua;
  private int qtdCafe;

  private Filtro filtro;
  private Moedor moedor;

  public Cafeteira(int qtdMaximaDeAgua, int qtdMaximaDeCafe) {
    this.isLigada = false;
    this.qtdAgua = qtdMaximaDeAgua;
    this.qtdCafe = qtdMaximaDeCafe;

    this.filtro = new Filtro();
    this.moedor = new Moedor();
  }


  public void ligar() {
    this.isLigada = true;
  }

  public void fazerCafe() {
    this.fazerCafe(QTD_CAFEZINHO_PADRAO);
  }

  public void fazerCafe(int qtdCafe) {
    if (this.podeFazerCafe()) {
      this.qtdAgua -= this.filtro.filtrarCafe();
      this.qtdCafe -= this.moedor.moerCafe();

      System.out.println("Fazendo café...");
    }
  }

  private boolean podeFazerCafe() {
    // if (this.isLigada && this.qtdAgua > 0 && this.qtdCafe > 0) {
    // return true;
    // } else {
    // return false;
    // }

    // if (this.isLigada && this.qtdAgua > 0 && this.qtdCafe > 0) {
    // return true;
    // }
    //
    // return false;

    return this.isLigada && this.temAgua() && this.temCafe();
  }

  private boolean temAgua() {
    return this.qtdAgua > 0;
  }

  private boolean temCafe() {
    return this.qtdCafe > 0;
  }


}
