public class SimpleArray
 {
    public static void main(String[] args) 
    {
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("\nAccessing all elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}
