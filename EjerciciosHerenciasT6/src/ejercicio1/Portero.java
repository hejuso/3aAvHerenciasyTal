package ejercicio1;

public class Portero extends Jugador {

	private int golesRecibidos;
	private int golesParados;

	public Portero(String n, String d, int p, int g, int a, int r, int gr,
			int gp) {
		// TODO Auto-generated constructor stub
		super(n, d, p, g, a, r);
		golesRecibidos = gr;
		golesParados = gp;

	}

	public Portero() {
		this("sin nombre", "sin demarcacion", 0, 0, 0, 0, 0, 0);
	}

	public void imprimir() {

		super.imprimir();
		System.out.println("Goles parados: " + golesParados);
		System.out.println("Goles recibidos: " + golesRecibidos);
	}
}
