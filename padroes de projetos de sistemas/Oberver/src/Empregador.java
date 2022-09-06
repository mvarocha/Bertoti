package PACKAGE_NAME;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Empregador implements Subject{

    private  ArrayList observers;
    private List<Vaga> vagas = new LinkedList<Vaga>();
    private Usuario user;

    public Empregador(){
        observers = new ArrayList();
    }

    public void addVaga(Vaga vaga){
        vagas.add(vaga);
        notifyObservers("Software");
    }

    public void registerObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        int i = observers.indexOf(o);
        if (i >= 0){
            observers.remove(i);
        }
    }

    public void notifyObservers(String nova_vaga){
        if (nova_vaga.equals("Software")){
            Observer observer = (Observer) observers.get(Integer.parseInt(nova_vaga));
            observer.update(nova_vaga);

        }

    }

}

