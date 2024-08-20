package projeto;

public class Video implements AcoesVideo{
	
	//Atributos de Video
	private String titulo;
	private int avaliacao, views;
	private boolean reproduzindo;
	
	//Construtor de Video
	public Video(String titulo) {
		this.titulo = titulo;
		this.avaliacao = 0;
		this.views = 0;
		this.reproduzindo = false;
	}
	
    public static void sleepWithoutTryCatch(long milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            System.err.println("A thread foi interrompida durante o sleep.");
        }
    }
	
	//Getters e Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(int avaliacao) {
		int nova;
		nova = (int) ((this.avaliacao + avaliacao)/this.views);
		
		this.avaliacao = nova;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}


	public boolean isReproduzindo() {
		return reproduzindo;
	}

	public void setReproduzindo(boolean reproduzindo) {
		this.reproduzindo = reproduzindo;
	}
	
	//Ações da interface sobrescrevidas
	@Override
	public void play(){
	     this.reproduzindo = true;
	     System.out.println("\nReproduzindo " + this.titulo + "...");
		 sleepWithoutTryCatch(2000);
	     pause();
	}

	@Override
	public void pause() {
		this.reproduzindo = false;
	    System.out.println("Pausado.");
	}


	@Override
	public String toString() {
		return "\n Vídeo:\n  Título: " + titulo + "\n  Avaliação: " + avaliacao + "\n  Views: " + views + "\n  Reproduzindo: " + reproduzindo;
	}
	
	

}
