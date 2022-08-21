package strategyPattern;

public class Veiculo {

	private DarRe darRe;
	
	public void setDarRe(DarRe darRe) {
		this.darRe = darRe;
	}
	
	public void darRe() {
		this.darRe.Re();
	}
	
}
