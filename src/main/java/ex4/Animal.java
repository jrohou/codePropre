package ex4;

public class Animal {

	/**
	 * Type of animal with enum TypeAnimal
	 */
	protected TypeAnimal types;
	/**
	 * name of animal
	 */
	protected String noms;
	/**
	 * details for animal
	 */
	protected String comportements;

	
	/** Constructor ANIMAL
	 * @param types
	 * @param noms
	 * @param comportements
	 */
	public Animal(TypeAnimal types, String noms, String comportements) {
		this.types = types;
		this.noms = noms;
		this.comportements = comportements;
	}

	

	/**
	 * @return
	 */
	public TypeAnimal getTypes() {
		return types;
	}

	/**
	 * @param types
	 */
	public void setTypes(TypeAnimal types) {
		this.types = types;
	}

	/**
	 * @return
	 */
	public String getNoms() {
		return noms;
	}

	/**
	 * @param noms
	 */
	public void setNoms(String noms) {
		this.noms = noms;
	}

	/**
	 * @return
	 */
	public String getComportements() {
		return comportements;
	}

	/**
	 * @param comportements
	 */
	public void setComportements(String comportements) {
		this.comportements = comportements;
	}

}
