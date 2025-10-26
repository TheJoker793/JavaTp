package exercice2;

public class CompteBancaire {
	String Titulaire;
	double Solde;
	static int compteur=1000;
	final int Numero;
	public CompteBancaire(String Titulaire,double Solde) {
		compteur++;
		Numero=compteur;
		this.Titulaire=Titulaire;
		this.Solde=Solde;
	}
	public CompteBancaire(CompteBancaire cb){
		this(cb.Titulaire, cb.Solde);

	}
	void deposer(double solde) {
		this.Solde+=solde;
	}
	
	void retirer(double solde) {
		this.Solde-=solde;
	}
	void afficher() {
		System.out.println("le client "+Titulaire+" ayant le compte numero "+Numero+" a "+Solde);
	}
	

}
