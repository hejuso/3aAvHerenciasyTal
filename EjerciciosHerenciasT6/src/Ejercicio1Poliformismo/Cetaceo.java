package Ejercicio1Poliformismo;

public class Cetaceo extends Mamifero {
	public Cetaceo(String h) {
		super(h);
	}

	public Cetaceo() {
		this("acu�tico");
	}

	public String tipo() {
		return super.tipo() + " (cet�ceo)";
	}
}