import java.util.Scanner;

public class MovieTicket {
    // Data members
    private String movieName;
    private double ticketPrice;
    private int numberOfTickets;
    private double totalAmount;
    private double discount;
    private double finalAmount;

    // Parameterized constructor
    public MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    // Method to calculate total ticket amount
    public double calculateTotal() {
        totalAmount = ticketPrice * numberOfTickets;
        return totalAmount;
    }

    // Method to calculate 10% discount if tickets are 5 or more
    public double calculateDiscount() {
        if (numberOfTickets >= 5) {
            discount = totalAmount * 0.10;
        } else {
            discount = 0.0;
        }
        return discount;
    }

    
    public double calculateFinalAmount() {
        finalAmount = totalAmount - discount;
        return finalAmount;
    }

    // Method to display the booking details with 2 decimal places for monetary values
    public void displayBill() {
        System.out.println("\n--- Booking Bill ---");
        System.out.println("Movie Name: " + movieName);
        System.out.printf("Ticket Price: %.2f\n", ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.printf("Discount: %.2f\n", discount);
        System.out.printf("Final Amount: %.2f\n", finalAmount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input values from the user
        System.out.print("Enter Movie Name: ");
        String movieName = scanner.nextLine();

        System.out.print("Enter Ticket Price: ");
        double ticketPrice = scanner.nextDouble();

        System.out.print("Enter Number of Tickets: ");
        int numberOfTickets = scanner.nextInt();

        // Creating MovieTicket object using the parameterized constructor
        MovieTicket ticket = new MovieTicket(movieName, ticketPrice, numberOfTickets);

        // Invoking required methods for calculations
        ticket.calculateTotal();
        ticket.calculateDiscount();
        ticket.calculateFinalAmount();

        // Displaying the final complete booking bill
        ticket.displayBill();

        scanner.close();
    }
}
