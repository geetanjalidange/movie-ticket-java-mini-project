import java.util.Scanner;

public class TheaterTicket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Theater Ticket Booking System!");

        // Movie name (you can modify/add more)
        String[] movieNames = {"ved", "animal", "RRR"};

        // Display movie options
        System.out.println("Select a movie:");
        for (int i = 0; i < movieNames.length; i++) {
            System.out.println((i + 1) + ". " + movieNames[i]);
        }

        // Select movie
        System.out.print("Enter movie number: ");
        int movieChoice = scanner.nextInt();
        String movieName = movieNames[movieChoice - 1];

        System.out.println("You've selected: " + movieName);

        System.out.println("How many tickets would you like to book?");
        int numberOfTickets = scanner.nextInt();

        for (int i = 0; i < numberOfTickets; i++) {
            System.out.println("Enter details for Ticket #" + (i + 1) + ":");
            System.out.println("Enter your age:");
            int age = scanner.nextInt();

            double ticketPrice;
            String ticketType;

            switch (age) {
                case 0:
                case 1:
                case 2:
                    ticketPrice = 0; // Free for infants (0-2 years)
                    ticketType = "Infant";
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    ticketPrice = 100.0; // Child ticket price for ages 3-9
                    ticketType = "Child";
                    break;
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                    ticketPrice = 200.0; // Teen ticket price for ages 10-16
                    ticketType = "Teen";
                    break;
                default:
                    ticketPrice = 350.0; // Adult ticket price for ages 17 and above
                    ticketType = "Adult";
                    break;
            }

            System.out.println("Enter the seat number for Ticket #" + (i + 1) + ":");
            int seatNumber = scanner.nextInt();

            // Print ticket details
            System.out.println("\nMovie: " + movieName);
            System.out.println("Ticket Type: " + ticketType);
            System.out.println("Ticket Price: $" + ticketPrice);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Enjoy the movie!\n");
        }

        scanner.close();
    }
}
