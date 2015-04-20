package ejerciciosAbstracciones;

public abstract class Instrumento {
	
	private String nombre;

	public Instrumento(String nombre_) {
		// TODO Auto-generated constructor stub
		
		setNombre(nombre_);
		
	}
	
	public abstract void tocar();
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
