package ex4;

import java.util.List;

public class Zone {
	
	private String nom;
	
	private List <Animal> animaux;
	
	public int size () {
		return animaux.size();
	}
	
	public void addAnimal(Animal a) {
		
		animaux.add(a);
	}
	
	/**
	 * Prints list of animals
	 */
	public void afficherListeAnimaux() {
		animaux.stream().forEach(animal -> System.out.println(animal.getNoms()));
	}

	public String getNom() {
		return this.nom;
	}
	
	
}
