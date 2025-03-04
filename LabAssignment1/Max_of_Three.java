import java.util.Scanner;
public class Max_of_Three
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("*Program for finding maximum of three numbers.*\n");
        System.out.println("Enter the three numbers you want to compare:");
        System.out.print("1st Number:");
        float num1 = sc.nextFloat();
        System.out.print("2nd Number:");
        float num2 = sc.nextFloat();
        System.out.print("3rd Number:");
        float num3 = sc.nextFloat();
        if(num1>=num2 && num1>=num3)
        System.out.println(num1 + " is the maximum number.");
        else if(num2>=num1&&num2>=num3)
        System.out.println(num2 + " is the maximum number.");
        else
        System.out.println(num3 + " is the maximum number.");

    }
}