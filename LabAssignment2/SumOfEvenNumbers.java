import java.util.Scanner;
public class SumOfEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        int sumOfEvens = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                sumOfEvens += num;
            }
        }

        // Step 4: Print the result
        System.out.println("Sum of even numbers: " + sumOfEvens);

        scanner.close();
    }
}
