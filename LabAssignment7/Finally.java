 class Finally {
    public static void main(String[] args) {
        try {
            System.out.println("No exception occurs");
        } finally {
            System.out.println("Finally block executed");
        }
    }
}
