class ExceptionCase1 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        System.out.println(numbers[3]); // Accessing an index out of bounds
        System.out.println("This line will not be executed."); // This line won't be reached.
    }
}