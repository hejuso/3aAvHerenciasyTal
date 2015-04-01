package ejercicio3;

public class DatosTienda {

	private float peso;
	private float d_ancho;
	private float d_alto;
	private float d_grueso;
	private float precio;

	public DatosTienda(float peso_, float ancho_, float alto_, float grueso_,
			float precio_) {

		setD_alto(alto_);
		setD_ancho(ancho_);
		setD_grueso(grueso_);
		setPeso(peso_);
		setPrecio(precio_);

	}

	public void getDescripcion() {

		System.out.println("Precio: ");
		System.out.println("Peso: " + peso);
		System.out.println("Dimensiones:");
		System.out.println("");
		System.out.println("Grueso: "+d_grueso);
		System.out.println("Alto: "+d_alto);
		System.out.println("Ancho: "+d_ancho);

	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getD_ancho() {
		return d_ancho;
	}

	public void setD_ancho(float d_ancho) {
		this.d_ancho = d_ancho;
	}

	public float getD_alto() {
		return d_alto;
	}

	public void setD_alto(float d_alto) {
		this.d_alto = d_alto;
	}

	public float getD_grueso() {
		return d_grueso;
	}

	public void setD_grueso(float d_grueso) {
		this.d_grueso = d_grueso;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

}
