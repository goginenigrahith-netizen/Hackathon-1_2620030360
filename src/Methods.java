import java.util.Scanner;

class Methods {
    public static double calculateTotalEnergy(double morningEnergy, double eveningEnergy) {
        return morningEnergy + eveningEnergy;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter morning energy consumption:");
        double morning = sc.nextDouble();
            System.out.println("Enter evening energy consumption:");
        double evening = sc.nextDouble();
        double total = calculateTotalEnergy(morning, evening);
            System.out.println("Total energy consumption: " + total);

        sc.close();
    }
}