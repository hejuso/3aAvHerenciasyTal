package Ejercicio1Poliformismo;

public class Mamifero {
	private String habitat;

	public Mamifero(String h) {
		habitat = h;
	}

	public Mamifero() {
		this("terrestre");
	}

	public String tipo() {
		return "mam�fero " + habitat;
	}
}
