package colecciones;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Autor a = new Autor("Pepe","ayer",32354);
		Publicacion p = new Publicacion("C�mo leer", 632, "SDF5454DS");
		
		p.toString();
		System.out.println(p.listarAutor());
		
		
	}

}