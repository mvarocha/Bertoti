package PACKAGE_NAME;
public class Test {

    public static void main(String[] args) {

        Empregador e = new Empregador();
        Notificacao vaga = new Notificacao();
        Vaga vClass = new Vaga();
        e.registerObserver(vaga);
        e.addVaga(vClass);

        Usuario marilia = new Usuario("marilia@feliz", "Marizinha", "Faxineira");

    }
}
