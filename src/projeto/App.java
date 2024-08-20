package projeto;

public class App {

	public static void main(String[] args) {
		Video v[] = new Video[3];
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 2 de POO");
		v[2] = new Video("Aula 3 de POO");
		
		//System.out.println(v[1].toString());
		
		Viewer vetV[] = new Viewer[2];
		
		vetV[0] = new Viewer("Pedro", "M", 18, "pedrinbolado");
		vetV[1] = new Viewer("Joana", "F", 21, "juba23");
		
		//System.out.println(vetV[0].toString());
		
		Visualizacao vis[] = new Visualizacao[5];
		vis[0] = new Visualizacao(vetV[0], v[0]); //Pedro assiste aula 1
		vis[0].avaliar();
		System.out.println(vis[0].toString());
		
		vis[1] = new Visualizacao(vetV[0], v[1]); //Pedro assiste aula 2
		vis[1].avaliar(87.0f);
		System.out.println(vis[1].toString());
		
		vis[2] = new Visualizacao(vetV[1], v[1]); //Joana assiste aula 2
		vis[2].avaliar();
		System.out.println(vis[2].toString());
	}

}
