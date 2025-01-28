import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine(); 
        System.out.println("Enter your age: ");
        int age = scanner.nextInt(); 
        System.out.println("Enter your height (in meters): ");
        double height = scanner.nextDouble(); 
        System.out.println("\nUser Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height + " meters");
        scanner.close();
    }
}
