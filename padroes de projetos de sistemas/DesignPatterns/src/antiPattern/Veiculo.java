package antiPattern;

public abstract class Veiculo {
	
	private String modelo;
	private String cor;
	
	public Veiculo(String modelo, String cor) {
		this.setModelo(modelo);
		this.setCor(cor);
	}
	
	public void andarParaFrente() {
		System.out.println("Muda marcha do "+getModelo()+" "+getCor()+" para 1 e acelera");
	}
	public void darRe() {
		System.out.println("Muda marcha do "+getModelo()+" "+getCor()+" para R e acelera");
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
