import java.util.Scanner;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the range (positive integer): ");
        int range = scanner.nextInt();
        if (range < 1) {
            System.out.println("Please enter a positive integer.");
        } else {
            int sum = 0;
            for (int i = 1; i <= range; i++) {
                sum += i; 
            }
            System.out.println("The sum of natural numbers up to " + range + " is: " + sum);
        }
        scanner.close();
    }
}
