
public class Application {

	public Application() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EnseignantChercheur chercheur = new EnseignantChercheur("Samir", "samir", 350);
		EnseignantVacataire vacataire = new EnseignantVacataire("Abdo", "Abdom", 100, "AFPA");
		Doctorant doctorant = new Doctorant("EZDIN","SAA", 120);
		
		System.out.println(" le cout du chercheur est : " +chercheur.cout());
		System.out.println(" le cout du vacataire est : " +vacataire.cout());
		System.out.println(" le cout du doctorant est : " +doctorant.cout());

	}

}
