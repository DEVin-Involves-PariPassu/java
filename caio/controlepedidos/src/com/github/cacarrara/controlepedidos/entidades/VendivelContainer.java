package com.github.cacarrara.controlepedidos.entidades;

import java.util.ArrayList;
import java.util.List;

public class VendivelContainer {
  protected List<Vendivel> vendiveis;

  public VendivelContainer() {
    this.vendiveis = new ArrayList<Vendivel>();
  }

  public VendivelContainer(List<Vendivel> produtos) {
    this.vendiveis = produtos;
  }

  public Vendivel getItem(String codigo) {
    for (Vendivel vendivel : this.vendiveis) {
      if (vendivel.getCodigo().equals(codigo)) {
        return vendivel;
      }
    }
    return null;
  }

  public List<Vendivel> getItems() {
    List<Vendivel> copiaProdutos = new ArrayList<Vendivel>();

    copiaProdutos.addAll(this.vendiveis);

    return copiaProdutos;
  }

  public void geraListagemTextual() {
    for (Vendivel vendivel : this.vendiveis) {
      System.out.println(vendivel);
    }
  }

  public void addItem(Vendivel vendivel) {
    this.vendiveis.add(vendivel);
  }

  public boolean removeItem(String codigo) {
    Vendivel item = null;

    for (Vendivel itemNaLista : this.vendiveis) {
      if (itemNaLista.getCodigo().equals(codigo)) {
        item = itemNaLista;
      }
    }
    if (item == null) {
      return false;
    }

    this.vendiveis.remove(item);

    return true;
  }

}
