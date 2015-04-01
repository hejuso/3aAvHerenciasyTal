package ejercicio3;

public class Camaras extends DatosTienda {

	private int resolucionVertical;
	private int resolucionHorizontal;
	private boolean flash;

	// Constructor

	public Camaras(float peso_, float ancho_, float alto_, float grueso_,
			float precio_, int resolucionHorizontal_, int resolucionVertical_,
			boolean flash_) {
		// TODO Auto-generated constructor stub
		super(peso_, ancho_, alto_, grueso_, precio_);
		setResolucionHorizontal(resolucionHorizontal_);
		setResolucionVertical(resolucionVertical_);
		setFlash(flash_);
	}

	// Descripcion

	public void getDescripcionCamara() {
		super.getDescripcion();
		System.out.println("Resoluciones: ");
		System.out.println("Horizontal: " + resolucionHorizontal);
		System.out.println("Vertical: " + resolucionVertical);
	}

	// Precio con descuento

	public float getPrecio() {

		float descuento = super.getPrecio() * 0.10f;
		return descuento;
		
	}

	// SETS Y GETS

	public int getResolucionVertical() {
		return resolucionVertical;
	}

	public void setResolucionVertical(int resolucionVertical) {
		this.resolucionVertical = resolucionVertical;
	}

	public int getResolucionHorizontal() {
		return resolucionHorizontal;
	}

	public void setResolucionHorizontal(int resolucionHorizontal) {
		this.resolucionHorizontal = resolucionHorizontal;
	}

	public boolean isFlash() {
		return flash;
	}

	public void setFlash(boolean flash) {
		this.flash = flash;
	}

}
