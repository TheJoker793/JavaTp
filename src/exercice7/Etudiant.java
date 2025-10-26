package exercice7;

public class Etudiant {
	String nom;
	int age;
	final int identifiantUnique;
	static int compteur=0;
	public Etudiant() {
		this("inconnu",20);


	}
	public Etudiant(String nom, int age) {
		this.nom = nom;
		this.age = age;
		compteur++;
		identifiantUnique=compteur;
		
	}
	public Etudiant(Etudiant etudiant) {
		this(etudiant.nom,etudiant.age);
	
	}
	void afficher() {
		System.out.println("|"+this.identifiantUnique+"|"+this.nom+"|"+this.age);
	}

	
	

}
