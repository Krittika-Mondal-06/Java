import java.util.Scanner;
public class Add_Number 
{
    public static void main(String[]args)
    {
        System.out.println("*Addition of two numbers*\n");
        Scanner myObj=new Scanner(System.in);
        System.out.println("Enter two numbers to be Added:");
        int Val1=myObj.nextInt();
        int Val2=myObj.nextInt();
        System.out.println("Sum of "+Val1+" and "+Val2+" is:"+(Val1+Val2));
    }
    
}
