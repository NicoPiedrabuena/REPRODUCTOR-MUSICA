package src;
import java.util.ArrayList;

public class Reproductor {
	ArrayList<Escuchante>escuchantes;
	ArrayList <ListaReproduccion>listas;
	
	public Reproductor() {
		escuchantes = new ArrayList<Escuchante>();
		listas= new ArrayList<ListaReproduccion>();
	}

	public ArrayList<Escuchante> getUsuarios() {
		return escuchantes;
	}

	public void setUsuarios(ArrayList<Escuchante> usuarios) {
		this.escuchantes = usuarios;
	}

	public void agregarUsuario(Escuchante escuchante) {
		escuchantes.add(escuchante);		
	}

	public void agregarListaDeReproduccion(ListaReproduccion lista) {
		listas.add(lista);
	}

	public ListaReproduccion reproducirLista(int numeroLista) {
		return listas.get(numeroLista);
		
		
	}
	

	
	
}
