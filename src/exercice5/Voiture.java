package exercice5;

public class Voiture {
	String Model;
	double Vitesse;
	static int NombreTotalVoiture=0;
	static int NombreTotalVitesse=0;
	public Voiture(String model, double vitesse) {
		Model = model;
		Vitesse = vitesse;
		NombreTotalVoiture++;
		NombreTotalVitesse+=vitesse;
	}
	public Voiture(Voiture v) {
		this(v.Model+" (copie)",v.Vitesse);
	}
	static double moyenneVitesseVoiture() {
		return (double)NombreTotalVitesse/NombreTotalVoiture;
	}
	void afficher() {
		System.out.println(Model + " roule a " + Vitesse + " km/h");
	}
	

}
