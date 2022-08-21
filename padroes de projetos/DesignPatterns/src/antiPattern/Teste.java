package antiPattern;

public class Teste {

	public static void main(String[] args) {
		
		Caminhao caminhao = new Caminhao("L111", "laranja");
		Carro carro = new Carro("corsa", "cinza");
		Moto moto = new Moto("biz", "branca");
		
		System.out.println("INDO PARA A FRENTE");
		caminhao.andarParaFrente();
		carro.andarParaFrente();
		moto.andarParaFrente();
		
		System.out.println("INDO PARA TRÁS");
		caminhao.darRe();
		carro.darRe();
		moto.darRe();

	}

}
