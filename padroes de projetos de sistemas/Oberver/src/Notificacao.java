package PACKAGE_NAME;
public class Notificacao implements Observer{

        public void update(String vaga){

            display(vaga);

        }

        public void display(String v){

            System.out.println("Nova vaga disponível: ");
            System.out.println(v);
        }
}
