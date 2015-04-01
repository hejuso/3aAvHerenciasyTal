package ejercicio3;

public class Moviles extends DatosTienda {

	private String operadora;
	private boolean camara;

	public Moviles(float peso_, float ancho_, float alto_, float grueso_,
			float precio_, String operadora_, boolean camara_) {
		// TODO Auto-generated constructor stub
		super(peso_, ancho_, alto_, grueso_, precio_);
		setOperadora(operadora_);
		setCamara(camara_);
	}

	public void getDescripcionMovil() {
		super.getDescripcion();
		System.out.println("Operadora: "+operadora);
		System.out.println("Camara: "+camara);
	}

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

	public boolean isCamara() {
		return camara;
	}

	public void setCamara(boolean camara) {
		this.camara = camara;
	}

}
