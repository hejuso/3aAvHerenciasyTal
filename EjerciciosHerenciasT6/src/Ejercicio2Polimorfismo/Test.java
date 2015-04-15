package Ejercicio2Polimorfismo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Medico m = new Medico("Ferran", "Cortés", 54);
		MedicoConPlaza mp = new MedicoConPlaza("Prueba", "Prueba2", 36);
		
		System.out.println(m.mostrarDatos());
		
		System.out.println(mp.mostrarDatos());
		
	}

}
