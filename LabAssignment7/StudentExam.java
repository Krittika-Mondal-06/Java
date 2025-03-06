class RangeException extends Exception {
    public RangeException(String message) {
        super(message);
    }
}

public class StudentExam {
    public static void main(String[] args) {
        try {
            if (args.length < 7)
                throw new Exception("Insufficient arguments!");

            String name = args[0];
            int total = 0;
            
            for (int i = 1; i <= 6; i++) {
                int marks = Integer.parseInt(args[i]);
                if (marks < 0 || marks > 50)
                    throw new RangeException("Marks out of range for subject " + i);
                total += marks;
            }

            double percentage = (total / 300.0) * 100;
            System.out.println("Student: " + name);
            System.out.println("Total Marks: " + total);
            System.out.println("Percentage: " + percentage + "%");
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
