package ex4;

public class Zoo {

	private String nom;
	private ZoneSavaneAfricaine savaneAfricaine;
	private ZoneCarnivore zoneCarnivore;
	private ZoneFermeReptile fermeReptile;
	private ZoneAquarium aquarium;
	
	public Zoo(String nom){
		this.nom = nom;
	}
	
	public void addAnimal(Animal animal){
		if (animal.getTypes().equals(TypeAnimal.MAMMIFERE) && animal.getComportements().equals("CARNIVORE")){
			zoneCarnivore.addAnimal(animal);
		}
		else if (animal.getTypes().equals(TypeAnimal.MAMMIFERE) && animal.getComportements().equals("HERBIVORE")){
			savaneAfricaine.addAnimal(animal);
		}
		else if (animal.getTypes().equals(TypeAnimal.SERPENT)){
			fermeReptile.addAnimal(animal);
		}
		else if (animal.getTypes().equals(TypeAnimal.POISSON)){
			aquarium.addAnimal(animal);
		}
	}
	
	public void afficherListeAnimaux(){
		savaneAfricaine.afficherListeAnimaux();
		zoneCarnivore.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
}
