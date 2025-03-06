class MultiCatch {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
            int arr[] = new int[5];
            arr[10] = 50;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: " + e);
        }
    }
}
