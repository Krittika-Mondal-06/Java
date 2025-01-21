import java.util.Scanner;
class ValueReference {
    public void callByValue(int num) {
        num += 10;
        System.out.println("Inside callByValue method, num = " + num);
    }
    public void callByReference(int[] arr) {
        arr[0] += 10;
        System.out.println("Inside callByReference method, arr[0] = " + arr[0]);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ValueReference example = new ValueReference();
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Before callByValue method, number = " + number);
        example.callByValue(number);
        System.out.println("After callByValue method, number = " + number);
        int[] array = new int[1];
        System.out.print("Enter an array element: ");
        array[0] = scanner.nextInt();
        System.out.println("Before callByReference method, array[0] = " + array[0]);
        example.callByReference(array);
        System.out.println("After callByReference method, array[0] = " + array[0]);
        scanner.close();
    }
}
