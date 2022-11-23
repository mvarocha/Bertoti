import java.util.ArrayList;
import java.util.List;

public class Funcionario {
	
	private String nome;
	private String funcao;
	private List<Funcionario> funcionarios = new ArrayList<>();
	
	public Funcionario(String nome, String funcao) {
		super();
		this.nome = nome;
		this.funcao = funcao;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}

	public void add(Funcionario func) {
		this.funcionarios.add(func);
		
	}
}