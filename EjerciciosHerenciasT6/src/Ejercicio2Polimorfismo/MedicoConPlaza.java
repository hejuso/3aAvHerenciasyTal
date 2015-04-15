package Ejercicio2Polimorfismo;

public class MedicoConPlaza extends Medico {

	private int id;

	public MedicoConPlaza(String nombre_, String apellido_, int edad_) {

		super(nombre_, apellido_, edad_);

	}

	public String mostrarDatos() {

		String datos = null;

		datos = getNombre() + ", " + getApellido() + ", " + getEdad();

		return datos;

	}

	// GETTER Y SETTER

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}
