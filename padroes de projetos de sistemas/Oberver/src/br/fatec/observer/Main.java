package br.fatec.observer;

public class Main {

	public static void main(String[] args) {
		
		Mensagens mensagens = new Mensagens();
		Contato contato = new Contato("Marcus", "(12)40028922");
		
		TelaLoja telaLoja = new TelaLoja();
		TelaContatos telaContatos = new TelaContatos();
		mensagens.registerObserver(telaLoja);
		mensagens.registerObserver(telaContatos);	
		telaLoja.enviarMensagem("Mensagem teste " + contato.numero);
		telaContatos.enviarMensagem("Mensagem teste");
		
	}
}
