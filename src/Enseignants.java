
public abstract class Enseignants {
 private String nom;
 private String prenom;
 private int heuresCours;
 private static int charges = 1;
	public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getPrenom() {
	return prenom;
}
public void setPrenom(String prenom) {
	this.prenom = prenom;
}
public int getHeuresCours() {
	return heuresCours;
}
public void setHeuresCours(int heuresCours) {
	this.heuresCours = heuresCours;
}
public static int getCharges() {
	return charges;
}
public static void setCharges(int charges) {
	Enseignants.charges = charges;
}
	public Enseignants() {
		// TODO Auto-generated constructor stub
	}
	public Enseignants (String nom,String prenom,int heuresCours) {
		this.nom=nom;
		this.prenom=prenom;
		this.heuresCours=heuresCours;
	}
	public abstract double cout() ;
		
	

}
