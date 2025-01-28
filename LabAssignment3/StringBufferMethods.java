public class StringBufferMethods {
    public static void main(String[] args) {
                StringBuffer sb = new StringBuffer("Hello");
        sb.append(" World!");
        System.out.println("append(): " + sb);  
        System.out.println("capacity(): " + sb.capacity()); 
        System.out.println("charAt(6): " + sb.charAt(6));  
        sb.delete(6, 12); 
        System.out.println("delete(6, 12): " + sb);  
        sb.deleteCharAt(5); 
        System.out.println("deleteCharAt(5): " + sb);  
        sb.ensureCapacity(50);  
        System.out.println("ensureCapacity(50): " + sb.capacity()); 
        char[] charArray = new char[5];
        sb.getChars(0, 5, charArray, 0);
        System.out.print("getChars(): ");
        for (char c : charArray) {
            System.out.print(c + " ");  
        }
        System.out.println();
        System.out.println("indexOf('lo'): " + sb.indexOf("lo"));  
        sb.insert(5, " Java");
        System.out.println("insert(5, ' Java'): " + sb);  
        System.out.println("length(): " + sb.length());  
        sb.setCharAt(5, 'P');
        System.out.println("setCharAt(5, 'P'): " + sb);  
        sb.setLength(8);
        System.out.println("setLength(8): " + sb);  
        String substring = sb.substring(0, 5);
        System.out.println("substring(0, 5): " + substring);  
        String str = sb.toString();
        System.out.println("toString(): " + str);  
    }
}
