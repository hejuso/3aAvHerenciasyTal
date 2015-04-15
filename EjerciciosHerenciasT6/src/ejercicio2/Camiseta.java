package ejercicio2;

public class Camiseta extends Ropa {

	private String mangas;
	private boolean dibujo;

	public Camiseta(String c, String f, float p, String t, String man,
			boolean dib) {
		// TODO Auto-generated constructor stub

		super();
		mangas = man;
		dibujo = dib;

	}

	public Camiseta() {
		this("sin color", "sin fabricante", 0, "sin tejido", "nada", false);
	}
	
	public void imprimir(){
		
		super.imprimir();
		System.out.println("Mangas: "+mangas);
		System.out.println("Dibujo: "+dibujo);
		
	}

}