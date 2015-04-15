package Ejercicio2Polimorfismo;

public class Medico {

	private String nombre;
	private String apellido;
	private int edad;

	public Medico(String nombre_, String apellido_, int edad_) {

		setNombre(nombre_);
		setApellido(apellido_);
		setEdad(edad_);

	}

	public String mostrarDatos() {

		String datos = null;

		datos = getNombre() + ", " + getApellido() + ", " + getEdad();

		return datos;
		
	}

	// GETTER AND SETTER

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

}
