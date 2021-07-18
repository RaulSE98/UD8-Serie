
public class Serie {
	
	String titulo;
	int n_temporadas = 3;
	boolean entregado = false;
	String genero;
	String creador;
	
	public Serie(String titulo, int n_temporadas, String genero, String creador) {
		super();
		this.titulo = titulo;
		this.n_temporadas = n_temporadas;
		this.genero = genero;
		this.creador = creador;
	}

	public Serie(String titulo, String creador) {
		super();
		this.titulo = titulo;
		this.creador = creador;
	}

	public Serie() {
		super();
	}

}
