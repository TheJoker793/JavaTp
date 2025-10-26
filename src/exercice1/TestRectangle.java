package exercice1;

public class TestRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r0=new Rectangle();
		r0.afficher();
		Rectangle r1=new Rectangle(2,4);
		r1.afficher();
		Rectangle r2=new Rectangle(r1);
		r2.afficher();
        System.out.println("Nombre total de rectangles créés : " + Rectangle.compteur);


		

	}

}
