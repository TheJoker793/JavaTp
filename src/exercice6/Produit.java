package exercice6;

public class Produit {
	String nom;
	double prix;
	final int identifiantUnique;
	static int compteur=0;
	static double remiseGlobal;
	public Produit() {
		this("inconnu",0);
	}
	public Produit(String nom, double prix) {
		this.nom = nom;
		this.prix = prix;
		compteur++;
		this.identifiantUnique = compteur;
	}
	public Produit(Produit produit) {
		this(produit.nom,produit.prix);
	}
	double calculerAvecRemise() {
		return prix *(1-remiseGlobal);
	}
	static void fixerRemise(double valeurInitial) {
		remiseGlobal=(valeurInitial>=0 && valeurInitial<1)?valeurInitial:0 ;
	}
	void afficher() {
		System.out.println("Avant le remise le produit "+identifiantUnique +" est un produit de nom "+nom +" "+ prix);
		System.out.println("apres le remise le produit "+identifiantUnique +" est un produit de nom "+nom +" "+calculerAvecRemise());

	}
	
	
	

}
