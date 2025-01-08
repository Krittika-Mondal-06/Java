import java.util.Scanner;
public class Rect_Cir_Area_Peri{
    public static void main(String args[])
    { 
        Scanner myObj=new Scanner(System.in);
        System.out.println("*Area and Perimeter of an Rectangle.*\n");
        System.out.println("Enter the lenght and breadth of the rectangle:");
        float len=myObj.nextFloat();
        float br=myObj.nextFloat();
        System.out.println("The Area of the Rectangle is:"+(len*br)+" and perimeter of the rectangle is:"+((2*len)+(2*br))+".");
        System.out.println("\n *Area and Perimeter of a Circle*\n");
        System.out.print("Enter the radius of a circle:");
        double rad=myObj.nextFloat();
        double pi=3.14;
        System.out.println("The Area of the Circle is"+(pi*rad*rad)+" and the perimeter of the circle is:"+(2*pi*rad)+".");

    }
}