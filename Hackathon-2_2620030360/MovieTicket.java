import java.util.Scanner;
 class MovieTicket {
    String movieName;
    double ticketPrice;
        int numberOfTickets;

    MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
         this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    public double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    public double calculateDiscount() {
        if (numberOfTickets >= 5) {
            return calculateTotal() * 0.10;
        }
        return 0.0;
    }

    public double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

    public void displayBill() {
        double rawTotal = calculateTotal();
            double discountVal = calculateDiscount();
        double finalPayable = calculateFinalAmount();

        System.out.println("\n--- Booking Bill ---");
            System.out.println("Movie Name: " + movieName);
        System.out.printf("Ticket Price: %.2f\n", ticketPrice);
            System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.printf("Total Amount: %.2f\n", rawTotal);
            System.out.printf("Discount: %.2f\n", discountVal);
        System.out.printf("Final Amount: %.2f\n", finalPayable);
    }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        System.out.print("Enter movie name: ");
         String title = sc.nextLine();

            System.out.print("Enter ticket price: ");
         double price = sc.nextDouble();

        System.out.print("Enter number of tickets: ");
        int count = sc.nextInt();

          MovieTicket ticketBooking = new MovieTicket(title, price, count);
          ticketBooking.displayBill();

    }
}