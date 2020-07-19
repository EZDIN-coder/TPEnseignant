
public class EnseignantChercheur extends Enseignants {

	public EnseignantChercheur() {
		// TODO Auto-generated constructor stub
	}

	public EnseignantChercheur(String nom, String prenom, int heuresCours) {
		super(nom, prenom, heuresCours);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cout() {
		// TODO Auto-generated method stub
	 return (2000*12+(this.getHeuresCours()-192)*40)* (1 + this.getCharges());
	}

}
