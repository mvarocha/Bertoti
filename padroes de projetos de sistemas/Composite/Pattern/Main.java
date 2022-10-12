public class Main {
	public static void main(String[] args) {
		Funcionario gerente = new Gerente("Amanda Melo");
	    Funcionario atendente = new Atendente("Maria Vit�ria");
	    Funcionario caixa = new Caixa("Camila Arantes");
	        
	    gerente.adicionar(atendente);
	    gerente.printNomeDoFuncionario();
	    gerente.adicionar(caixa);
	    gerente.printNomeDoFuncionario();
	    gerente.remover(atendente);
	}
}