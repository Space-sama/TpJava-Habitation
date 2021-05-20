

public class HabitationTest {

	public static void main(String[] args) {
		
		
		
	    // Habitation_Professionnelle h2 = new Habitation_Professionnelle("O1", "Adresse", 30, 50);
	    //h2.Affiche3();
	    //System.out.println("Nombres d'employés est : " + h2.getNb_Employees());
	    //System.out.println("Les Impots est : " + h2.Impot());
	    
	   Habitation_Individuelle h3 = new Habitation_Individuelle("O2", "Adresse2", 3000, 5, false);
	   h3.Affiche();
	   
	   
		Habitation j = new Habitation("O2", "Adresse2", 30);
		System.out.println(j.Impot());
	   
	   

	
		
	}

}
