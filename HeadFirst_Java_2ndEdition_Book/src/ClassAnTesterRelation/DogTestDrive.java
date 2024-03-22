package ClassAnTesterRelation;
/*The tester class is where you put
the main method, and in that main() method you create and access objects
of your new class type. The tester class has only one job: to try out the methods
and variables of your new object class type
*/

public class DogTestDrive {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.size = 40;
		d.bark();

	}

}
