package fr.voxi.admin;

public class Oeuvre {
		private int numero ;
		private String titre ;
		private static int nbOeuvre = 0 ;
		
		public  Oeuvre(int numero,String titre ) {
			super();
			this.numero=numero;
			this.titre=titre;
			nbOeuvre+=1;
		}


		public int getNumero() {
			return numero;
		}


		public void setNumero(int numero) {
			this.numero = numero;
		}


		public String getTitre() {
			return titre;
		}


		public void setTitre(String titre) {
			this.titre = titre;
		}

		public String toString() {
			return "Oeuvre [numero=" + numero + ", titre=" + titre + "]";
		}
		



		public static int getNbOeuvre() {
			return Oeuvre.nbOeuvre;
		}


		public static void setNbOeuvre(int nbOeuvre) {
			Oeuvre.nbOeuvre = nbOeuvre;
		}

		
}
