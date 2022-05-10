package src;

public class Cancion {
	String nombre;
	String genero;
	String duracion;
	
	public Cancion (String nombre, String genero,String duracion) {
		this.nombre = nombre;
		this.duracion = duracion;
		this.genero = genero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Cancion [nombre= " + nombre + ", genero= " + genero + ", duracion= " + duracion + "]";
	}
	
}
