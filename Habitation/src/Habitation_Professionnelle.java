

public class Habitation_Professionnelle extends Habitation {
	public int Nb_Employees; 

	public Habitation_Professionnelle(String propri�taire, String adresse, float surface, int Nb_Employees) {
		super(propri�taire, adresse, surface);
		this.Nb_Employees = Nb_Employees;
	}
	
	
	
	public float Impot() {
		return super.Impot() + this.Nb_Employees * 1000 / 10;
	}
	
	public int getNb_Employees() {
		return Nb_Employees;
	}



	public void setNb_Employees(int nb_Employees) {
		Nb_Employees = nb_Employees;
	}



	public void Affiche3() {
	     this.Afficher();
	     System.out.println(" " + "Le nombre d'employ�s est :" + this.Nb_Employees);
	     System.out.println("L'impot a payer est: " + Impot());
	}

}
