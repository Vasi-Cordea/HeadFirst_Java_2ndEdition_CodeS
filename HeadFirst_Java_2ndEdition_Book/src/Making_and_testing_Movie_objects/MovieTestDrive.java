package Making_and_testing_Movie_objects;

/*The MovieTestDrive class creates objects (instances) of
the Movie class and uses the dot operator (.) to set the
instance variables to a specific value. The MovieTestDrive
class also invokes (calls) a method on one of the objects.
*/
public class MovieTestDrive {

	public static void main(String[] args) {
		Movie one = new Movie();
		one.title ="Gone with the Stock";
		one.genre ="Tragic";
		one.rating = -2;
		Movie two = new Movie();
		two.title ="Lost in Cubicle Space";
		two.genre ="Comedy";
		two.rating = 5;
		two.playIt();
		Movie three = new Movie();
		three.title ="Byte Club";
		three.genre ="Tragic but ultimately uplifting";
		three.rating = 127;
		
		System.out.println(one.title);
		}
		}
