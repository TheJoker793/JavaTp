package exercice4;

public class Cercle {
	double Rayon;
	final double pi=3.14;
	public Cercle() {
		this(1);
	}
	public Cercle(double rayon) {
		Rayon= rayon>0?rayon:1;
	}
	double aire() {
		return Rayon*Rayon*pi;
	}
	void afficher() {
		System.out.println("le cercle avec rayon "+this.Rayon+" et aire ="+aire());
	}

}
