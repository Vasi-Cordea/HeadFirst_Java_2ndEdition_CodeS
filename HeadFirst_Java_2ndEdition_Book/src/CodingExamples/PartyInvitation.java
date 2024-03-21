package CodingExamples;

public class PartyInvitation {

	public static void main(String[] args) {
		  // Declare an int variable
        int numberOfGuests = 10;

        // Declare a String variable
        String eventName = "Business Networking Event";

        // Print a welcome message
        System.out.println("Welcome to the " + eventName + "!");
        System.out.println("You are invited to a party with " + numberOfGuests + " guests.");

        // Simulate a while loop (for demonstration purposes)
        int count = 1;
        while (count <= numberOfGuests) {
            System.out.println("Guest #" + count + ": Enjoy the event!");
            count++;
        }

        // Simulate an if test (for demonstration purposes)
        if (numberOfGuests > 20) {
            System.out.println("This is a large gathering!");
        } else {
            System.out.println("It's an intimate gathering.");
        }
    }
}