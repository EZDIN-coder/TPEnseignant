
public class EnseignantVacataire extends Enseignants {

	  private String organisme;
	  
	public String getOrganisme() {
		return organisme;
	}

	public void setOrganisme(String organisme) {
		this.organisme = organisme;
	}

	public EnseignantVacataire() {
		// TODO Auto-generated constructor stub
	}

	public EnseignantVacataire(String nom, String prenom, int heuresCours, String organisme) {
			super(nom, prenom, heuresCours);
			this.organisme=organisme;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double cout() {
		// TODO Auto-generated method stub
		return  (40 * this.getHeuresCours()) * (1 + this.getCharges());
	}

}
