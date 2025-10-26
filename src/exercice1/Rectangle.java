package exercice1;

 class Rectangle {
	 double Longueur;
	 double Largeur;
	 final int id;
	 static int compteur=0;


	public Rectangle() {
		//this.Longueur=1;
		//this.Largeur=1;
        //compteur++;
        //this.id=compteur;
		this(1,1);
 	}
	public Rectangle(double Longuer,double Largeur) {
		this.Longueur=Longuer;
		this.Largeur=Largeur;
        compteur++;
        this.id=compteur;
	}
	public Rectangle(Rectangle r) {
		//this.Longueur=r.Longueur;
		//this.Largeur=r.Largeur;
        //compteur++;
        //this.id=compteur;
		this(r.Longueur,r.Largeur);
	}
	public double aire() 
	{
		return this.Longueur*this.Largeur;
	}
	public double perimetre() {
		return 2*(this.Longueur+this.Largeur);
	}
    public void afficher() {
        System.out.println("Rectangle"+id+": " + this.Largeur + " x " + this.Longueur);
        System.out.println("Aire = " + aire());
        System.out.println("Périmètre = " + perimetre());
        System.out.println();
    }


	
	
	

}
