package com.github.cacarrara.controlepedidos.entidades;

import java.util.ArrayList;
import java.util.List;

public class Catalogo extends VendivelContainer {

  public Catalogo(List<Vendivel> vendiveis) {
    super(vendiveis);
  }

  public static Catalogo comVendiveisBasicos() {
    List<Vendivel> vendiveis = new ArrayList<Vendivel>();

    vendiveis.add(new Produto("MS001", "Mouse", "Mouse ótico", 99.0));
    vendiveis.add(new Produto("TM001", "Teclado mecanico", "Teclado mecanico barulhento", 199.0));
    vendiveis.add(new Produto("MO001", "Monitor", "Monitor 27''", 1289.0));
    vendiveis.add(new Produto("LT001", "Limpa telas", "Limpa telas master blaster", 99999.0));

    vendiveis.add(new Servico("MNT001", "Manutencao de PC", 50.0));
    vendiveis.add(new Servico("LPC001", "Limpeza de PC", 150.0));

    return new Catalogo(vendiveis);
  }

}
