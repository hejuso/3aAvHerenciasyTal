package ejerciciosAbstracciones;

public class InstrumentoDeCuerda extends Instrumento{
	
	private String numeroCuerdas;

	public InstrumentoDeCuerda(String nombre_ , String numCuerd) {
		// TODO Auto-generated constructor stub
		
		super(nombre_);
		setNumeroCuerdas(numCuerd);
		
	}
	
	public void tocar(){
		
		System.out.println();

	}

	public String getNumeroCuerdas() {
		return numeroCuerdas;
	}

	public void setNumeroCuerdas(String numeroCuerdas) {
		this.numeroCuerdas = numeroCuerdas;
	}

}
