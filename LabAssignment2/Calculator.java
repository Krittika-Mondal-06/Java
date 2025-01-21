import java.util.Scanner;
class Calculator {
    public int addNumbers(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        Calculator calculator = new Calculator();
        int sum = calculator.addNumbers(num1, num2);
        System.out.println("The sum is: " + sum);
        scanner.close();
    }
}
