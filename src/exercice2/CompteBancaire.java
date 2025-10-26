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
		if (solde>=this.Solde) {
			this.Solde-=solde;

		}
		System.out.println("désolé!! votre solde est insuffisant");
	}
	void afficher() {
		System.out.println("le client "+Titulaire+" ayant le compte numero "+Numero+" a "+Solde);
	}
	

}
