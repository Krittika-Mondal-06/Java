import java.util.Scanner;
public class BufferedReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine(); 
        System.out.println("Enter your age: ");
        int age = scanner.nextInt(); 
        System.out.println("\nHello, " + name + "!");
        System.out.println("You are " + age + " years old.");
        scanner.close();
    }
}
