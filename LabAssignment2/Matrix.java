import java.util.Scanner;
class Matrix {
    private int rows;
    private int cols;
    private int[][] data;
    public Matrix() {
        this.rows = 2;
        this.cols = 2;
        this.data = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = 0;
            }
        }
    }
    public void inputMatrix(Scanner scanner) {
        System.out.println("Enter elements of the matrix (" + rows + " x " + cols + "):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                data[i][j] = scanner.nextInt();
            }
        }
    }
    public void displayMatrix() {
        System.out.println("Matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Matrix matrix = new Matrix();
        matrix.inputMatrix(scanner);
        matrix.displayMatrix();
        scanner.close();
    }
}
