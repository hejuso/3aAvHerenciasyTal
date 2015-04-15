package EjemploEmpleado;

public class PruebaEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleado[] empleados = new Empleado[3];

		Empleado e = new Empleado("Juan", 1000, 2001);
		// System.out.println("La clase de empleado es " + e.getClass());
		// System.out.println("Empleado: " + e.getNombre());
		Jefe j = new Jefe("Pedro", 1200, 1999, 0.5f);

		Administrativo a = new Administrativo("Daniel", 200, 1634, j);

		e = j;

		int i = 0;

		empleados[0] = e;
		empleados[1] = j;
		empleados[2] = a;

		for (i = 0; i < 3; i++) {
			System.out.println("El salario es: " + empleados[i].getSalario());

		}

		/*
		 * if (e instanceof EjemploEmpleado.Jefe) { Jefe jefe2 = (Jefe) e;
		 * jefe2.setBonificacion(0.5f); System.out.println("Bonification " +
		 * jefe2.getBonificacion()); }
		 */

		// System.out.println("La clase de empleado es " + e.getClass());

		// System.out.println("Jefe: " + j.getNombre());

		/*
		 * System.out.println("Get salario: "+j.getSalario());
		 * System.out.println("Descripcion: "+j.getDescription());
		 */
	}

}