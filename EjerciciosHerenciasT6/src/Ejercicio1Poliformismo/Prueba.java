package Ejercicio1Poliformismo;

public class Prueba {
	
	public static void imprimirTipo(Mamifero m){
		System.out.println(m.tipo());
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mamifero elefante = new Mamifero();
		Cetaceo delfin = new Cetaceo();
		imprimirTipo(elefante);
		imprimirTipo(delfin);
		
	}

}