package projeto;

public class Viewer extends Pessoa{
	//Atributos de Viewer
	private String login;
	private int totAssistido;
	
	//Construtor de Viewer
	public Viewer(String nome, String sexo, int idade, String login) {
		super(nome, sexo, idade);
		this.login = login;
		this.totAssistido = 0;
	}
	
	public int viuMaisUm() {
		return totAssistido++;
	}

	//Getters e Setters
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public int getTotAssistido() {
		return totAssistido;
	}

	public void setTotAssistido(int totAssistido) {
		this.totAssistido = totAssistido;
	}
	
	//toString de Pessoa + Viewer
	@Override
	public String toString() {
		return "\n Viewer: " + super.toString() + "\n  Login: " + login + "\n  Total Assistido: " + totAssistido;
	}
	
	
	
	
	
}
