class CheckArgumentException extends Exception {
    public CheckArgumentException(String message) {
        super(message);
    }
}

public class CheckArgument {
    public static void main(String[] args) {
        try {
            if (args.length < 5)
                throw new CheckArgumentException("Less than 5 arguments provided!");
            
            int sum = 0;
            for (String arg : args)
                sum += Integer.parseInt(arg);

            System.out.println("Sum: " + sum);
        } catch (CheckArgumentException | NumberFormatException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
