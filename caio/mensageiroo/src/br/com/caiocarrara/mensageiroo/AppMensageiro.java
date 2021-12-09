package br.com.caiocarrara.mensageiroo;

import java.util.ArrayList;
import java.util.List;
import br.com.caiocarrara.mensageiroo.entidades.Conversa;
import br.com.caiocarrara.mensageiroo.entidades.Mensagem;
import br.com.caiocarrara.mensageiroo.entidades.Pessoa;

public class AppMensageiro {

  public static void main(String[] args) {
    Pessoa eu = new Pessoa("user1");
    Pessoa voce = new Pessoa("user2");

    List<Pessoa> participantesDaConversa = new ArrayList<Pessoa>();

    participantesDaConversa.add(eu);
    participantesDaConversa.add(voce);

    Conversa conversa = new Conversa(participantesDaConversa);

    conversa.enviarMensagem(eu, "Hello World");
    conversa.enviarMensagem(voce, "Foo!");
    conversa.enviarMensagem(eu, "Java Rocks!");

    for (Mensagem mensagem : conversa.getTimeline()) {
      System.out.println(mensagem);
    }
  }

}
