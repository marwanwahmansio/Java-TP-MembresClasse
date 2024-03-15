package fr.voxi.admin;
import java.time.LocalDate;

public class AppAdmin {
		public static void main(String[] args) {
			
		Abonnement abn1 = new Abonnement(201, LocalDate.of(2024,1,3)) ;
		Abonnement abn2 = new Abonnement(202, LocalDate.of(2024,1,10)) ;
		
		System.out.println (abn1.toString());
		System.out.println (abn2.toString());
		System.out.println ("La durée d'un abonnement est de "+Abonnement.getDureeAbn()+" mois");
		Abonnement.setDureeAbn(5) ;
		System.out.println ("La durée d'un abonnement est de "+Abonnement.getDureeAbn()+" mois");
		
		abn1.setDureeAbn1(7);
		System.out.println ("La durée de l'abonnement numéro 201 est de "+abn1.getDureeAbn1()+" mois");
		System.out.println ("La durée de l'abonnement numéro 202 est de "+abn2.getDureeAbn2()+" mois");
		System.out.println (Abonnement.getDureeAbn()) ;
		}
	
	
	
}
