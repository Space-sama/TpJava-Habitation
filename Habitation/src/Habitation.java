
public  class Habitation {
	// si on fait une classe comme une classe abstraite, il fat pas l'instanci�e sur le main!
	
	protected String propri�taire;
	protected String adresse;
	protected float  surface;
	
	
	public Habitation(String propri�taire, String adresse, float surface) {
		this.propri�taire=propri�taire;
		this.adresse=adresse;
		this.surface=surface;	
	}
	public  float Impot() {	
		float p;
		p = this.surface*2;
		return p;
		
	}
	
	public void Afficher() {
		System.out.printf("propri�taire ==>" +this.propri�taire + " Adresse ==>" +this.adresse+ " |Surface est " +this.surface);
	}
	
	public String getPropri�taire() {
		return propri�taire;
	}

	public void setPropri�taire(String propri�taire) {
		this.propri�taire = propri�taire;
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


		