package exercice3;

public class Livre {
	String Titre;
	String Auteur;
	double Prix;
	static int NbrLivres=0;
	public Livre(String titre, String auteur, double prix) {
		Titre = titre;
		Auteur = auteur;
		Prix = prix;
		NbrLivres++;
	}
	
	public Livre(Livre l) {
		this(l.Titre,l.Auteur,l.Prix);
		
	}   
	void afficher() {
		System.out.println(this.Titre+" est crée par "+this.Auteur+" est de "+this.Prix+"dt");
	}
	

}
