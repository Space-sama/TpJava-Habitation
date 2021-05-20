

public class Habitation_Individuelle extends Habitation {
	public int NbPieces;
	public boolean piscine;

	public Habitation_Individuelle(String propriétaire, String adresse, float surface, int NbPieces, boolean piscine) {
		
		super(propriétaire, adresse, surface);
		this.NbPieces = NbPieces;
		this.piscine = piscine;
	}
	
	public int getNbPieces() {
		return NbPieces;
	}

	public void setNbPieces(int nbPieces) {
		NbPieces = nbPieces;
	}

	public boolean isPiscine(boolean piscine) {
		return piscine;
	}

	public void setPiscine(boolean piscine) {
		this.piscine = piscine;
		//if (this.piscine = true) {
			//System.out.println("Piscine est true");
			
		//}else 
			//System.out.println("Piscine est false");
	}
	
	public float impot_Habitation_Individuelle() {
		float k;
		if(piscine ) {
			k = 500 + this.NbPieces;
			return k;
		}
		else 
	     return  super.Impot() + this.NbPieces * 100;
		
		
	}
	
	public void Affiche() {
		super.Afficher() ;
		System.out.println( " Le nombre de pièces : " +this.NbPieces + " Piscine: "+ this.piscine);
		System.out.println("L'impo a payer est: " + impot_Habitation_Individuelle());
	}

	
	
	
	

}
