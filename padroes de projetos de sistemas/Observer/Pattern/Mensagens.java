package br.fatec.observer;
import java.util.ArrayList;


public class Mensagens implements Subject{
	
	private ArrayList observers;
	private Contato c;
	
	public Mensagens(){
		observers = new ArrayList();
	}
	
	public void registerObserver(Observer o){
		observers.add(o);
	}
	
	public void removeObserver(Observer o){
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers(String mensagem){
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = (Observer)observers.get(i);
			observer.enviarMensagem(mensagem);
		}
	}
	
	public String enviarMensagem(Contato c, String n){
		notifyObservers(c.numero);
		return n;
	}

}