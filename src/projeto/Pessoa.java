package projeto;

public abstract class Pessoa {
	//Atributos da classe Pessoa
	protected String nome, sexo;
	protected int idade;
	
	//Construtor de Pessoa
	public Pessoa(String nome, String sexo, int idade) {
		this.nome = nome;
		this.sexo = sexo;
		this.idade = idade;
	}
	
	//Getters e Setters
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	//toString
	@Override
	public String toString() {
		return "\n  Nome: " + nome + "\n  Sexo: " + sexo + "\n  Idade: " + idade;
	}
	
	
	
	
}
