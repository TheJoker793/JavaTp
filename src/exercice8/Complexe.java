package exercice8;

public class Complexe {
	double reel;
	double imaginaire;
	public Complexe() {
		this(0,0);
		//Meme chose
		//this.reel=reel;
		//this.imaginaire=imaginaire;
	}
	public Complexe(double reel,double imaginaire) {
		this.reel=reel;
		this.imaginaire=imaginaire;
	}
	public Complexe(Complexe c) {
		this(c.reel,c.imaginaire);
	}
	
	String afficher() {
		String signe = (imaginaire >= 0) ? " + " : " - ";
		double absIm = (imaginaire >= 0) ? imaginaire : -imaginaire;
		return reel+signe+absIm+"i";
		}
	
	public Complexe additionner(Complexe c) {
        
        return new Complexe(reel+c.reel, imaginaire+c.imaginaire);
    }
	public double module() {
        return Math.sqrt(reel * reel + imaginaire * imaginaire);
    }
	


}
