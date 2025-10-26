package exercice8;

public class TestComplexe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complexe z0 = new Complexe();
		Complexe z1 = new Complexe(2,3);
		Complexe z2 = new Complexe(z1);
		Complexe z3 = z1.additionner(new Complexe(4,3)); 
		
		
		System.out.println(z0.afficher() + " | |z0|=" + z0.module());
		System.out.println(z1.afficher() + " | |z1|=" + z1.module());
		System.out.println(z2.afficher() + " | |z2|=" + z2.module());
		System.out.println(z3.afficher() + " | |z3|=" + z3.module());
		

	}

}
