package exercice7;

public class TestEtudiant {

	public static void main(String[] args) {
		Etudiant e0=new Etudiant();
		Etudiant e1=new Etudiant("Salah",22);
		Etudiant e2=new Etudiant("Ali",21);
		Etudiant e3=new Etudiant("Maryem",20);
		Etudiant e4=new Etudiant(e1);
		Etudiant e5=new Etudiant(e2);
		e0.afficher();
		e1.afficher();
		e2.afficher();
		e3.afficher();
		e4.afficher();
		e5.afficher();
		System.out.println("le nombre des etudiants est "+Etudiant.compteur);

	}

}
