package CodingExamples;

public class BeerSong {

	public static void main(String[] args) {
		/* Coding a Serious BusinessApplication
		 
		Let’s put all your new Java skills to good use with
		something practical. We need a class with a main(), an int
		and a String variable, a while loop, and an if test. A little
		more polish, and you’ll be building that business backend
		in no time. But before you look at the code on this
		page, think for a moment about how you would code that
		classic children’s favorite, “99 bottles of beer.” */
		
		
		int beerNum = 99;
		String word = " bottles";
		while (beerNum > 0) {
		if (beerNum == 1) {
		word = "bottle"; // singular, as in ONE bottle.
		}
		System.out.println(beerNum +  "" + word + " of beer on the wall");
		System.out.println(beerNum + "" + word + " of beer.");
		System.out.println("Take one down.");
		System.out.println("Pass it around.");
		beerNum = beerNum - 1;
		if (beerNum > 0) {
		System.out.println(beerNum + "" + word + " of beer on the wall");
		} else {
		System.out.println("No more bottles of beer on the wall");
		} // end else
		} // end while loop
		} // end main method
		} // end class

