package fr.voxi.admin;
import java.time.LocalDate;

public class Abonnement {

	private int numéro ;
	private  LocalDate dateSouscription ;
	private static int dureeAbn =3 ;
	private static int dureeAbn1 =5 ;
	private static int dureeAbn2 =5 ;

	public Abonnement(int numéro, LocalDate dateSouscription) {
		super();
		this.numéro = numéro;
		this.dateSouscription = dateSouscription;
	}

	public int getNuméro() {
		return numéro;
		
	}
	
	public void setNuméro(int numéro) {
		this.numéro = numéro;
		
	}
	
	public LocalDate getDateSouscription() {
		return dateSouscription;
		
	}
	
	public void setDateSouscription(LocalDate dateSouscription) {
		this.dateSouscription = dateSouscription;
		
	}

	@Override
	public String toString() {
		return "Abonnement "+ numéro + ", " + dateSouscription + "";
	}

	public static int getDureeAbn() {
		return dureeAbn;
	}

	public static void setDureeAbn(int dureeAbn) {
		Abonnement.dureeAbn = dureeAbn;
	}

	public static int getDureeAbn1() {
		return dureeAbn1;
	}

	public static void setDureeAbn1(int dureeAbn1) {
		Abonnement.dureeAbn1 = dureeAbn1;
	}

	public static int getDureeAbn2() {
		return dureeAbn2;
	}

	public static void setDureeAbn2(int dureeAbn2) {
		Abonnement.dureeAbn2 = dureeAbn2;
	}
	
	 
	
	
	
	
	
	
	
	
}
