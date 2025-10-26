package exercice5;

public class TestVoiture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voiture v1=new Voiture("Polo",20);
		Voiture v2=new Voiture("Golf",30);
		Voiture v3=new Voiture(v1);
		v1.afficher();
		v2.afficher();
		v3.afficher();
		System.out.println("Vitesse moyenne = " + Voiture.moyenneVitesseVoiture());
		v1.Vitesse=50;
		v1.afficher();
		System.out.println("Vitesse moyenne = " + Voiture.moyenneVitesseVoiture());
		// Pas de changement de la vitesse moyenne car NombreTotalVoiture et NombreTotalVitesse sont des attributs statiques 
		// et ne se changent que lors de la création d'un objet (au niveau de constructeur
		// il faut une méthode qui permet de changer la vitesse moyenne lors du changement de vitesse d'une voiture


		

	}

}
