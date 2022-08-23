package strategyPattern;

public class Veiculo {

	private DarRe darRe;
	private String modelo;
	private String cor;
	
	public void setDarRe(DarRe darRe) {
		this.darRe = darRe;
	}
	
	public void darRe() {
		this.darRe.Re();
	}
	
}
