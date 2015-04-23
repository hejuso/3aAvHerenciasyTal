package colecciones;

import java.util.ArrayList;

public class Autor {

	private String nombre;
	private String inicioContrato;
	private int dni;

	public Autor(String nombre_, String inicioContrato_, int dni_) {

		this.setNombre(nombre_);
		this.setInicioContrato(inicioContrato_);
		this.setDni(dni_);
	}

	// GETTER AND SETTER

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getInicioContrato() {
		return inicioContrato;
	}

	public void setInicioContrato(String inicioContrato) {
		this.inicioContrato = inicioContrato;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public static void add(Autor a) {
		// TODO Auto-generated method stub

	}

}
