public abstract class Funcionario {
	String nomeFuncionario;

	public void printNomeDoFuncionario() {
		System.out.println(this.nomeFuncionario);
	}

	protected abstract void adicionar(Funcionario funcionario);

	protected abstract void remover(Funcionario funcionario);
}