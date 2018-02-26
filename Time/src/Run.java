
public class Run {
	public static void main(String[] args) {
		Main mainObject = new Main();
		Main mainObject2 = new Main(5);
		Main mainObject3 = new Main(5,13);
		Main mainObject4 = new Main(5,13,43);
		System.out.printf("%s\n", mainObject.toMilitary());
		System.out.printf("%s\n", mainObject2.toMilitary());
		System.out.printf("%s\n", mainObject3.toMilitary());
		System.out.printf("%s\n", mainObject4.toMilitary());
	}
}
