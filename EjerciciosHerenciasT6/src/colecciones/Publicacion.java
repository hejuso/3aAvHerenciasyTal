package colecciones;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Publicacion {
	
	private String titulo;
	private int anyo;
	private Autor autores;
	private ArrayList<Autor> autoresList;
	private String isbn;

	public Publicacion(String titulo_, int anyo_, String isbn_, ArrayList<Autor> autoresList_) {
		// TODO Auto-generated constructor stub
		
		this.setTitulo(titulo_);
		this.setAnyo(anyo_);
		this.setIsbn(isbn_);
		this.autoresList = autoresList_;
	}
	
	public Publicacion(String titulo_, int anyo_, String isbn_) {
		// TODO Auto-generated constructor stub
		
		this.setTitulo(titulo_);
		this.setAnyo(anyo_);
		this.setIsbn(isbn_);
		this.autoresList = new ArrayList<Autor>();
		
	}
	
	public void anyadirAutor(Autor a){
		
		autoresList.add(a);
		
	}
	
	public void quitarAutor(Autor a){
		
		autoresList.remove(a);
		
	}
	
	public String listarAutor(){
		
		String listado= "";
		
		for (Autor lista : autoresList ){
			
			listado = listado +" " + lista+ "\n";

		}
		
		return listado;
	}
	
	public String toString(){
		
		String autor="";
		
		autor = autores.getNombre() + " " + autores.getInicioContrato() + " " + autores.getDni();
		
		return autor;
		
	}
	
	//GETTER AND SETTER

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public ArrayList<Autor> getAutores() {
		return autoresList;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

}
