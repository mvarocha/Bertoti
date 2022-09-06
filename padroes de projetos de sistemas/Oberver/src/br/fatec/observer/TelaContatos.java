package br.fatec.observer;

public class TelaContatos implements Observer{
	
	public void enviarMensagem(String mensagem){
		
		display(mensagem);
		
	}
	
	public void display(String mensagem){
		
		System.out.println("Tela do Contato");
		System.out.println("Recebendo mensagem: " + mensagem);
	}

}
