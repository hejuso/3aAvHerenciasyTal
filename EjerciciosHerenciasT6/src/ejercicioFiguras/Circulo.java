package ejercicioFiguras;

public class Circulo extends Figura2D{

	private int xCentro;
	private int yCentro;
	private int radio;
	
	public Circulo(String color,String colorRelleno,int xCentro,int yCentro,int radio){
		super(color,colorRelleno);
		this.xCentro = xCentro;
		this.yCentro = yCentro;
		this.radio = radio;
	}

	public int getxCentro() {
		return xCentro;
	}

	public void setxCentro(int xCentro) {
		this.xCentro = xCentro;
	}

	public int getyCentro() {
		return yCentro;
	}

	public void setyCentro(int yCentro) {
		this.yCentro = yCentro;
	}

	public int getRadio() {
		return radio;
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}
	
	public void borra(){
		this.cambiarColor(null);
		this.cambiaColorRelleno(null);
		this.setRadio(0);
		this.setxCentro(0);
		this.setyCentro(0);
	}
	
	public void dibuja(){
		this.cambiarColor(this.getColor());
		this.cambiaColorRelleno(this.getColorRelleno());
		this.setRadio(this.getRadio());
		this.setxCentro(this.getxCentro());
		this.setyCentro(this.getyCentro());
	}
	

}
