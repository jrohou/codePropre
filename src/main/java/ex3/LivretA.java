package ex3;

public class LivretA extends CompteBancaire {

	public LivretA(String type, double solde, double tauxRemuneration) {
		super(type, solde, 0, tauxRemuneration);
	}

	@Override
	public void debiterMontant(double montant){
		
		 if (this.solde - montant > 0){
			 
				this.solde = solde - montant;
		}
	}
	
	
	public void appliquerRemuAnnuelle(){
			this.solde = solde + solde*tauxRemuneration/100;
	}
	
	
	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
}
