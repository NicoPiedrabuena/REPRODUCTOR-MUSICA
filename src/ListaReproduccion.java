package src;
import java.util.ArrayList;

public class ListaReproduccion {
	

	ArrayList<Cancion>listasDeReproduccion;
	
	public ListaReproduccion(String nombreLista) {
		listasDeReproduccion = new ArrayList<Cancion>();
		
	}

	public void agregarCancion(Cancion cancion) {
		listasDeReproduccion.add(cancion);
	}

	@Override
	public String toString() {
		String listaReproduccion = "";
		for (Cancion cancion : listasDeReproduccion) {
			listaReproduccion += cancion.toString() + "\n";
		}
		return listaReproduccion;
	}
	
}
