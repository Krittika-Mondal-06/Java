public class Array{
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("Array elements are:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        int index = 2; 
        System.out.println("\nElement at index " + index + " is: " + numbers[index]);
    }
}
