import java.util.Scanner;
public class BinaryDecimalConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a binary number to convert to decimal: ");
        String binary = scanner.nextLine(); 
        int decimalFromBinary = Integer.parseInt(binary, 2); 
        System.out.println("Decimal equivalent of binary " + binary + " is: " + decimalFromBinary);
        System.out.println("\nEnter a decimal number to convert to binary: ");
        int decimal = scanner.nextInt(); 
        String binaryFromDecimal = Integer.toBinaryString(decimal); 
        System.out.println("Binary equivalent of decimal " + decimal + " is: " + binaryFromDecimal);
        scanner.close();
    }
}
