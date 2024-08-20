package projeto;

public class Visualizacao {
	//Atributos de Visualizacao
	private Viewer espectador;	//agregação
	private Video video;		
	
	
	//Construtor de Visualizacao
	public Visualizacao(Viewer espectador, Video video) {
		this.espectador = espectador;
		this.video = video;
		this.espectador.viuMaisUm();
		this.video.setViews(this.video.getViews()+1);
		this.video.play();
		}
	
	//Método "avaliar" com polimorfismo de sobrecarga
	public void avaliar() {			//passando assinatura vazia
		this.video.setAvaliacao(5);
	}
	
	public void avaliar(int nota) { //passando nota na assinatura
		this.video.setAvaliacao(nota);
	}
	
	public void avaliar(float porc) {//passando porcentagem
		int tot = 0;
		if(porc <= 20) {
			tot = 3;
		} else if (porc <= 50) {
			tot = 5;
		} else if(porc <= 90) {
			tot = 8;
		} else {
			tot = 10;
		}
		this.video.setAvaliacao(tot);
	}
	
	
	//Getters e Setters
	public Viewer getEspectador() {
		return espectador;
	}
	public void setEspectador(Viewer espectador) {
		this.espectador = espectador;
	}
	public Video getVideo() {
		return video;
	}
	public void setVideo(Video video) {
		this.video = video;
	}

	//toString de Visualizacao com respectivo espectador e video
	@Override
	public String toString() {
		return "\nDescrição da visualização:" + espectador + video;
	}
	
	
	
	
}
