public class Throws {
    static void division() throws ArithmeticException {
        int a = 10, b = 0;
        int c = a / b;
        System.out.println("Result: " + c);
    }

    public static void main(String[] args) {
        try {
            division();
        } catch (ArithmeticException e) {
            System.out.println("Exception handled: " + e);
        }
    }
}
