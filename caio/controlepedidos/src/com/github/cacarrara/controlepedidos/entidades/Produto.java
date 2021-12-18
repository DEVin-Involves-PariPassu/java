package com.github.cacarrara.controlepedidos.entidades;

public class Produto implements Vendivel {
  private String codigo;
  private String nome;
  private String descricao;
  private double preco;

  public Produto(String codigo, String nome, String descricao, double preco) {
    super();
    this.codigo = codigo;
    this.nome = nome;
    this.descricao = descricao;
    this.preco = preco;
  }

  public String getNome() {
    return nome;
  }

  public String getDescricao() {
    return descricao;
  }

  public double getPreco() {
    return preco;
  }

  public String getCodigo() {
    return this.codigo;
  }

  @Override
  public boolean equals(Object obj) {
    Produto outro = (Produto) obj;
    return this.getCodigo().equals(outro.getCodigo());
  }

  @Override
  public String toString() {
    return String.format("%s - %s: %.2f", this.getCodigo(), this.getNome(), this.getPreco());
  }

}
