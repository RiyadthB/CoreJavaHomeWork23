package hw8Inheritance;

public class AnimalTest {
	public static void main(String[] args) {
		System.out.println("\t01------Animal------");
		Animal animal1 = new Animal();
		animal1.animalInfo();

		System.out.println("\t02------Mammal------");
		Mammal mammal2 = new Mammal();
		mammal2.mammalInfo();
		mammal2.animalInfo();

		System.out.println("\t03------Dog------");
		Dog dog9 = new Dog();
		dog9.dogInfo();
		dog9.animalInfo();
		dog9.mammalInfo();

		System.out.println("\t04------BullDog------");
		BullDog bullDog3 = new BullDog();
		bullDog3.bullDogInfo();
		bullDog3.dogInfo();
		bullDog3.animalInfo();
		bullDog3.mammalInfo();

		System.out.println("\t05------Snake------");
		Snake snake7 = new Snake();
		snake7.snakeInfo();
		snake7.animalInfo();

		System.out.println("\t06------Cobra------");
		Cobra cobra4 = new Cobra();
		cobra4.cobraInfo();
		cobra4.snakeInfo();
		cobra4.animalInfo();

		System.out.println("\t07------Brids------");
		Birds birds6 = new Birds();
		birds6.birdsInfo();
		birds6.animalInfo();

		System.out.println("\t08------Robin------");
		Robin robin5 = new Robin();
		robin5.robinInfo();
		robin5.birdsInfo();
		robin5.animalInfo();

		System.out.println("\t09------Repile------");
		Reptile reptile8 = new Reptile();
		reptile8.reptileInfo();
		reptile8.animalInfo();

	}
}
