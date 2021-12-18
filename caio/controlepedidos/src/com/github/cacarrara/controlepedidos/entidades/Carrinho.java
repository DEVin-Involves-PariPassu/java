package com.github.cacarrara.controlepedidos.entidades;

public class Carrinho extends VendivelContainer {
  private Cliente cliente;

  public Carrinho(Cliente cliente) {
    super();
    this.cliente = cliente;
  }

  public Cliente getCliente() {
    return cliente;
  }

}
