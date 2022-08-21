package strategyPattern;

public class Teste {

	public static void main(String[] args) {
		
		Veiculo corsa = new Veiculo();
		corsa.setDarRe(new DarReAutomatico());
		corsa.darRe();
		
		System.out.println("--------------------------------");
		
		Veiculo biz = new Veiculo();
		biz.setDarRe(new DarReEmpurrar());
		biz.darRe();

	}

}
