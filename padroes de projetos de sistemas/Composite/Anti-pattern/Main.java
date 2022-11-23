import Anti-pattern.Atendente;
import Anti-pattern.Gerente;

public class Main {

	public static void main(String[] args) {
		Atendente atendente = new Atendente("Mario", "atendente");
		GestorComposite gerente = new Gerente("César", "Gerente");
		gerente.add(atendente);
		atendente.add(gerente);
		System.out.println(gerente.getNome());
	}

}