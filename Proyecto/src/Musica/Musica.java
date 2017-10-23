package Musica;

public class Musica {

	public class NodoMusica {
		private String id;
		private String album;
		private String artista;
		private String genero;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getAlbum() {
			return album;
		}
		public void setAlbum(String album) {
			this.album = album;
		}
		public String getArtista() {
			return artista;
		}
		public void setArtista(String artista) {
			this.artista = artista;
		}
		public String getGenero() {
			return genero;
		}
		public void setGenero(String genero) {
			this.genero = genero;
		}
		
		public String toString() {
			return "Id: "+this.id+" | "+"Album: "+this.album+" | "+"Artista: "+this.artista+" | "+"Genero: "+this.genero+" | ";
		}
		
		public int compareto(Object o) {
			NodoMusica temporal=(NodoMusica) o;
			return this.id.compareTo(temporal.getId());
			}
		


	}

	public void setId(String text) {
		// TODO Auto-generated method stub
		
	}

	public void setArtista(String text) {
		// TODO Auto-generated method stub
		
	}

	public void setAlbum(String text) {
		// TODO Auto-generated method stub
		
	}

	public void setGenero(String text) {
		// TODO Auto-generated method stub
		
	}
}
