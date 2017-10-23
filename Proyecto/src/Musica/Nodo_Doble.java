package Musica;

public class Nodo_Doble {
	
		private Musica Informacion;
		private Nodo_Doble Siguente;
		private Nodo_Doble Anterior;
		
		public Nodo_Doble(Musica informacion, Nodo_Doble siguiente, Nodo_Doble anterior ) {
			siguiente=siguiente;
			anterior=anterior;
		}
		
		public Musica getInformacion() {
			return Informacion;
		}
		public void setInformacion(Musica informacion) {
			Informacion = informacion;
		}
		public Nodo_Doble getSiguente() {
			return Siguente;
		}
		public void setSiguente(Nodo_Doble siguente) {
			Siguente = siguente;
		}
		public Nodo_Doble getAnterior() {
			return Anterior;
		}
		public void setAnterior(Nodo_Doble anterior) {
			Anterior = anterior;
		}

		
		

	}


