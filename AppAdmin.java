package fr.voxi.admin;

public class AppAdmin {
	public static void main(String[] args) {
		
		Oeuvre oeuvre103= new Oeuvre(103,"Le Crépuscule et l'Aube");
		System.out.println(oeuvre103.toString());
		System.out.println(Oeuvre.getNbOeuvre());
		
		Oeuvre oeuvre302= new Oeuvre(302,"Nature Humaine");
		System.out.println(oeuvre302.toString());
		System.out.println(Oeuvre.getNbOeuvre());
		
		Oeuvre oeuvre318= new Oeuvre(318,"L'Anomalie");
		System.out.println(oeuvre318.toString());
		System.out.println(Oeuvre.getNbOeuvre());
		
		System.out.println(oeuvre103.getNbOeuvre());
		
		
	}
}
