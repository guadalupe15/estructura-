package Musica;


	
	import javax.swing.JOptionPane;


	public class Lista_Doble {
		private Nodo_Doble cabeza;
		private Nodo_Doble cola;
		
		public Lista_Doble() {
			this.cabeza=null;
			
		}
		
		public Nodo_Doble getCabeza() {
			return cabeza;
		}



		public void setCabeza(Nodo_Doble cabeza) {
			this.cabeza = cabeza;
		}



		public boolean isVacio() {
			if(cola==null && cabeza==null) {
				return true;
				
			}else {
				return false;
			}
		}
		
		public void insertarAdelante(Musica informacion) {
			if(cabeza==null) {
				cabeza=new Nodo_Doble(informacion,null,null);
				cola=cabeza;
			}else {
				Nodo_Doble nuevo=new Nodo_Doble(informacion,null,cabeza);
				cabeza.setAnterior(nuevo);
				cabeza=nuevo;
			}
			
		}
		
		public void insertarFinal(Musica informacion) {
			if(cola==null) {
				cola= new Nodo_Doble(informacion,null, null);
				cabeza=cola;
			}else {
				Nodo_Doble nuevo=new Nodo_Doble(informacion,cola,null);
				cola.setAnterior(nuevo);
				cola=nuevo;
			}
			
		}
		
		public void mostrasrInicioaFin() {
			Nodo_Doble recorrer=cabeza;
			while (recorrer!=null) {
				String datos="<=>";
				Nodo_Doble auxiliar=cabeza;
				while (auxiliar!=null) {
					datos=datos+"["+auxiliar.getInformacion()+"]<=>";
					auxiliar=auxiliar.getSiguente();
					
				}
				JOptionPane.showMessageDialog(null, datos,
						"MOSTRANDO LISTA",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}
		

	}


