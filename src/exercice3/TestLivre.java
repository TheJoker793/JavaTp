package exercice3;

public class TestLivre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livre liv1=new Livre("livre1","autheur1",5000);
		Livre liv2=new Livre("livre2","autheur2",3500);
		Livre liv3=new Livre("livre3","autheur3",2000);
		Livre liv4=new Livre("livre4","autheur4",1000);
		liv1.afficher();
		liv2.afficher();
		liv3.afficher();
		liv4.afficher();
		System.out.println("Le nombre total est "+Livre.NbrLivres);


	}

}
