import java.util.Scanner;

class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Enter energy generation value:");
        
        double genEnergy = sc.nextDouble();

        if (genEnergy >= 10) {
            System.out.println("Good Energy Generation");
        } else {
            System.out.println("Low Energy Generation");
        }

        sc.close();
    }
}