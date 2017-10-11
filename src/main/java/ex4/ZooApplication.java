package ex4;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal(new Animal (TypeAnimal.MAMMIFERE, "GAZELLE", "HERBIVORE"));
		zoo.addAnimal(new Animal (TypeAnimal.MAMMIFERE,"Zèbre", "HERBIVORE"));
		zoo.addAnimal(new Animal (TypeAnimal.MAMMIFERE,"Lion", "HERBIVORE"));
		zoo.addAnimal(new Animal (TypeAnimal.MAMMIFERE,"Panthère", "CARNIVORE"));
		zoo.addAnimal(new Animal (TypeAnimal.POISSON,"Requin blanc", "HERBIVORE"));
		zoo.addAnimal(new Animal (TypeAnimal.POISSON,"Truite dorée", "HERBIVORE"));
		zoo.addAnimal(new Animal (TypeAnimal.SERPENT,"Boa constrictor", "CARNIVORE"));
		zoo.addAnimal(new Animal (TypeAnimal.SERPENT,"Python", "CARNIVORE"));
	}

}
