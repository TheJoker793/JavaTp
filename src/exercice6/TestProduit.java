package exercice6;

public class TestProduit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Produit.fixerRemise(0.5);
		Produit p0=new Produit();
		p0.afficher();
		Produit p1=new Produit("produit1",100);
		p1.afficher();
		Produit p2=new Produit(p1);
		p2.afficher();
		
	}

}
