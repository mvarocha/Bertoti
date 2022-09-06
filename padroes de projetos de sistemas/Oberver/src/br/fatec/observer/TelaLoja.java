package br.fatec.observer;

public class TelaLoja implements Observer{
	
	public void enviarMensagem(String mensagem){
		
		display(mensagem);
		
	}
	
	public void display(String mensagem){
		
		System.out.println("Tela da Loja");
		System.out.println("Enviando mensagem: " + mensagem);
	}

}
