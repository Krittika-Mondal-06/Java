public class StringHandling {
    public static void main(String[] args) {
                String immutableString = "Hello, World!";
        System.out.println("Original Immutable String: " + immutableString);
                immutableString = immutableString.replace("World", "Java");
        System.out.println("Modified Immutable String: " + immutableString);
        StringBuilder mutableString = new StringBuilder("Hello, World!");
        System.out.println("\nOriginal Mutable String: " + mutableString);
        mutableString.replace(7, 12, "Java");
        System.out.println("Modified Mutable String: " + mutableString);
        String str = "Java Programming";
                char ch = str.charAt(5);  
        System.out.println("\ncharAt(5): " + ch); 
        String str2 = "Java Programming";
        int comparison = str.compareTo(str2);
        System.out.println("compareTo(str2): " + comparison); 
                boolean isEqual = str.equals(str2); 
        System.out.println("equals(str2): " + isEqual); 
        String str3 = "java programming";
        boolean isEqualIgnoreCase = str.equalsIgnoreCase(str3); 
        System.out.println("equalsIgnoreCase(str3): " + isEqualIgnoreCase); 
        int index = str.indexOf("Program"); 
        System.out.println("indexOf('Program'): " + index); 
        int length = str.length(); 
        System.out.println("length(): " + length); 
        String subStr = str.substring(5, 16); 
        System.out.println("substring(5, 16): " + subStr); 
        char[] charArray = str.toCharArray();
        System.out.print("toCharArray(): ");
        for (char c : charArray) {
            System.out.print(c + " "); 
        }
        System.out.println();
        String lowerCase = str.toLowerCase(); 
        System.out.println("toLowerCase(): " + lowerCase); 
        String upperCase = str.toUpperCase(); 
        System.out.println("toUpperCase(): " + upperCase); 
        String strAsString = str.toString();
        System.out.println("toString(): " + strAsString); 
        String trimmedStr = "   Java Programming   ".trim(); 
        System.out.println("trim(): " + "\"" + trimmedStr + "\""); 
        int num = 100;
        String numStr = String.valueOf(num); 
        System.out.println("valueOf(num): " + numStr); 
    }
}
