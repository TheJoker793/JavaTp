package exercice2;

public class TestCompteBancaire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CompteBancaire cb1=new CompteBancaire("Salah",5000);
		CompteBancaire cb2=new CompteBancaire("Ali",2000);
		CompteBancaire cb3=new CompteBancaire(cb1);
		cb1.deposer(200);
		cb1.retirer(400);
		cb1.afficher();
		cb2.afficher();
		cb3.afficher();

	}

}
