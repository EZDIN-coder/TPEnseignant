
public class Doctorant extends Enseignants {

	public Doctorant() {
		// TODO Auto-generated constructor stub
	}

	public Doctorant(String nom, String prenom, int heuresCours) {
		super(nom, prenom, heuresCours);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cout() {
		// TODO Auto-generated method stub
		 if (this.getHeuresCours() > 96) return (96*35)* this.getCharges();
		 
		 else return (35*this.getHeuresCours()) * ( 1 + this.getCharges());
	}

}
