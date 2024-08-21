package Personas;

import java.util.*;

public class ListaPersonas {
	
	Vector listaPersonas; // Atributo que identifica un vector de personas
	
	public ListaPersonas() { //constructor
		
		listaPersonas = new Vector(); // Crea el vector de personas
	}
	
	//Método que permite agregar una persona al vector de personas
	public void añadirPersona(Persona p) {
		
		listaPersonas.add(p);
	}
	
	//Método que permite eliminar una persona del vector de personas
	public void eliminarPersona(int i) {
		listaPersonas.removeElementAt(i);
	}
	
	//Método que permite eliminar todos los elementos del vector de personas
	public void borrarLista() {
		listaPersonas.removeAllElements();
	}
}
