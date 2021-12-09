package br.com.caiocarrara.mensageiroo.entidades;

import java.util.ArrayList;
import java.util.List;

public class Conversa {
  private List<Mensagem> timeline;
  private List<Pessoa> participantes;

  public Conversa(List<Pessoa> participantes) {
    this.timeline = new ArrayList<Mensagem>();
  }

  public void addPessoa(Pessoa pessoa) {
    this.participantes.add(pessoa);
  }

  public List<Mensagem> getTimeline() {
    return this.timeline;
  }

  public void enviarMensagem(Pessoa rementente, String corpoDeTexto) {
    Mensagem mensagem = new Mensagem(rementente, corpoDeTexto);
    this.timeline.add(mensagem);
  }
}
