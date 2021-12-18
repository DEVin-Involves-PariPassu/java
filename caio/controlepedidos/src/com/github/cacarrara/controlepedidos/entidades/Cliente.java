package com.github.cacarrara.controlepedidos.entidades;

public class Cliente {
  private String nome;
  private String codigo;

  public Cliente(String nome, String codigo) {
    super();
    this.nome = nome;
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public String getCodigo() {
    return codigo;
  }

}
