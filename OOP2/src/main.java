
public class main {
	public static void main(String[] args) {
		Animal[] thelist = new Animal[3];
		Animal animal = new Animal();
		Animal dog = new Dog();
		Animal fish = new Fish();
		thelist[0] = dog;
		thelist[1] = fish;
		thelist[2] = animal;
		for(Animal A: thelist) {
			A.noise();
		}
	}
}
 