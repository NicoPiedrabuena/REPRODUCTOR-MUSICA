package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import src.Cancion;
import src.Escuchante;
import src.ListaReproduccion;
import src.Reproductor;

class testReproductor {
 
	@Test
	void queSePuedaCrearUnUsuarioYAgregarlo() {
		String login = "rukawa001";
		String contraseña = "01234";
		Escuchante escuchante = new Escuchante (login, contraseña);
		Reproductor nuevo = new Reproductor();
		nuevo.agregarUsuario(escuchante);
		assertNotNull(escuchante);
		
		assertEquals(1,nuevo.getUsuarios().size());
	}
	@Test 
	void queSePuedaCrearUnaListaDeReproduccion() {
		String login = "rukawa001";
		String contraseña = "01234";
		Escuchante escuchante = new Escuchante (login, contraseña);
		Reproductor nuevo = new Reproductor();
		nuevo.agregarUsuario(escuchante);
		String nombreLista = "rkt";
		ListaReproduccion lista= new ListaReproduccion(nombreLista);
		
		nuevo.agregarListaDeReproduccion(lista);
		
	}
	@Test
		void queSePuedaAgregarUnaCancionAListaDeReproduccion() {
		
		Reproductor nuevo = new Reproductor();
		String nombreLista = "rkt";
		ListaReproduccion lista= new ListaReproduccion(nombreLista);
		String nombre = "commander tom";
		String genero = "electronica";
		String duracion = "5:30";
		Cancion cancion = new Cancion(nombre,genero,duracion);	
		nuevo.agregarListaDeReproduccion(lista);
		lista.agregarCancion(cancion);
		
		assertNotNull(lista);
		
	}
	@Test
	void queSePuedaReproduccionUnaLista() {
		Reproductor nuevo = new Reproductor();
		String nombreLista = "rkt";
		ListaReproduccion lista= new ListaReproduccion(nombreLista);
		String nombre = "commander tom";
		String genero = "electronica";
		String duracion = "5:30";
		String nombre1="perro loco";
		String genero1= "punk";
		String duracion1= "20:00";
		
		Cancion cancion = new Cancion(nombre,genero,duracion);	
		Cancion cancion2 = new Cancion(nombre1,genero1,duracion1);
		nuevo.agregarListaDeReproduccion(lista);
		lista.agregarCancion(cancion);
		lista.agregarCancion(cancion2);
		int numeroLista= 0;
		System.out.println(nuevo.reproducirLista(numeroLista));
		
	}

}
