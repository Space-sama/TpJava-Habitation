
public  class Habitation {
	// si on fait une classe comme une classe abstraite, il fat pas l'instanciée sur le main!
	
	protected String propriétaire;
	protected String adresse;
	protected float  surface;
	
	
	public Habitation(String propriétaire, String adresse, float surface) {
		this.propriétaire=propriétaire;
		this.adresse=adresse;
		this.surface=surface;	
	}
	public  float Impot() {	
		float p;
		p = this.surface*2;
		return p;
		
	}
	
	public void Afficher() {
		System.out.printf("propriétaire ==>" +this.propriétaire + " Adresse ==>" +this.adresse+ " |Surface est " +this.surface);
	}
	
	public String getPropriétaire() {
		return propriétaire;
	}

	public void setPropriétaire(String propriétaire) {
		this.propriétaire = propriétaire;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public float getSurface() {
		return surface;
	}

	public void setSurface(float surface) {
		this.surface = surface;
	}

	

	
}


		