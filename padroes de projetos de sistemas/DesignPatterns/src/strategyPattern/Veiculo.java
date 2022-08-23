package strategyPattern;

public class Veiculo {

	private DarRe darRe;
	private String modelo;
	private String cor;
	
	public Veiculo(String modelo, String cor, DarRe darRe) {
		this.setModelo(modelo);
		this.setCor(cor);
		this.darRe = darRe;
	}
	
	
	
	public void setDarRe(DarRe darRe) {
		this.darRe = darRe;
	}
	
	public void darRe() {
		this.darRe.Re();
	}



	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
}
