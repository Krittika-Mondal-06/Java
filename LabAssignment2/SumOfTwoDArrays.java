import java.util.Scanner;
public class SumOfTwoDArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
        int[][] array1 = new int[rows][columns];
        int[][] array2 = new int[rows][columns];
        System.out.println("Enter elements of the first array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter elements of the second array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                array2[i][j] = scanner.nextInt();
            }
        }
        int[][] sumArray = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sumArray[i][j] = array1[i][j] + array2[i][j];
            }
        }
        System.out.println("Resulting sum array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(sumArray[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
