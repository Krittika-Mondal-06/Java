import java.util.Scanner;

class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = scanner.nextInt();
        int reversedNum = 0, remainder;
        int originalNum = num; 
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder; 
            num /= 10; 
        }
        if (originalNum == reversedNum) {
            System.out.println(originalNum + " is a Palindrome.");
        } else {
            System.out.println(originalNum + " is not a Palindrome.");
        }
        scanner.close();
    }
}
