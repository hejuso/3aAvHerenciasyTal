package coleccion;


	import java.util.ArrayList;

	public class Main {
		
		public static void main(String args[]) {

			Autor aa = new Autor("Miquel", 2008, "2345234S");
			Autor ab = new Autor("Pepe", 2009, "23456434Y");
			
			Autor ac = new Autor("Paco", 2010, "154345345E");
			
			
			Publicacion publi = new Publicacion("Teletabis", 1995, "ISB12");
			Publicacion publi2 = new Publicacion("Los cabeza cono", 2005, "ISB10");
			
			publi.addAutor(aa);
			publi.addAutor(ab);
			
			publi2.addAutor(ac);
			
			//System.out.println(publi.toString());
			
			Editorial bromera = new Editorial();
			
			bromera.addPublicacion(publi);
			bromera.addPublicacion(publi2);
			
			System.out.println(bromera.getInfoPublicacion());
		}
}
