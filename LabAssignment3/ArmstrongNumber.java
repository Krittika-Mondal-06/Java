import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to check if it is an Armstrong number: ");
        int number = scanner.nextInt();
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
        scanner.close();
    }
    public static boolean isArmstrong(int num) {
        int originalNum = num;
        int result = 0;
        int n = Integer.toString(num).length();
        while (num != 0) {
            int digit = num % 10; 
            result += Math.pow(digit, n);
            num /= 10; 
        }
        return result == originalNum;
    }
}
