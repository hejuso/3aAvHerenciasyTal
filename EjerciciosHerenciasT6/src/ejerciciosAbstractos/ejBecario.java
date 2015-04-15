package ejerciciosAbstractos;

public class ejBecario {

	private String nombre;
	private String departamento;
	private int anyoAlta;
	
	public ejBecario(String nombre_, String departamento_, int anyoAlta_){
		
		this.setAnyoAlta(anyoAlta_);
		this.setDepartamento(departamento_);
		this.setNombre(nombre_);
		
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public int getAnyoAlta() {
		return anyoAlta;
	}
	public void setAnyoAlta(int anyoAlta) {
		this.anyoAlta = anyoAlta;
	}
	
}
