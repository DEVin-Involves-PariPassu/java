package com.github.cacarrara.controlepedidos.entidades;

public class Servico implements Vendivel {
  private String codigo;
  private String nome;
  private double preco;

  public Servico(String codigo, String nome, double preco) {
    super();
    this.codigo = codigo;
    this.nome = nome;
    this.preco = preco;
  }

  public String getCodigo() {
    return codigo;
  }

  public String getNome() {
    return nome;
  }

  public double getPreco() {
    return preco;
  }

  @Override
  public boolean equals(Object obj) {
    Servico outro = (Servico) obj;
    return this.getCodigo().equals(outro.getCodigo());
  }

  @Override
  public String toString() {
    return String.format("%s - %s: %.2f", this.getCodigo(), this.getNome(), this.getPreco());
  }
}
