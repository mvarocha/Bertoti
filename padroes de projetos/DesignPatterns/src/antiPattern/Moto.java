package antiPattern;

public class Moto extends Veiculo {
	
	public Moto(String modelo, String cor) {
		super(modelo, cor);
		// TODO Auto-generated constructor stub
	}
	
	public void darRe() {
		System.out.println("Muda marcha da "+getModelo()+" "+getCor()+" para N e empurra para trás com os pés");
	}

}
