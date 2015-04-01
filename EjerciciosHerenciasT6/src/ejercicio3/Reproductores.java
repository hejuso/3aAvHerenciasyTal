package ejercicio3;

public class Reproductores extends DatosTienda {

	private float almacenamiento;
	private boolean radio;

	public Reproductores(float peso_, float ancho_, float alto_, float grueso_,
			float precio_, float almacenamiento_, boolean radio_) {
		// TODO Auto-generated constructor stub
		super(peso_, ancho_, alto_, grueso_, precio_);
		setAlmacenamiento(almacenamiento_);
		setRadio(radio_);
	}
	
	public void getDescripcionReproductor(){
		super.getDescripcion();
		System.out.println("Almacenamiento: "+almacenamiento+" MB");
		System.out.println("Radio: "+radio);
	}

	public float getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(float almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	public boolean isRadio() {
		return radio;
	}

	public void setRadio(boolean radio) {
		this.radio = radio;
	}

}
