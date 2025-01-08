import java.util.Scanner;
public class Temp_Conv
{
  public static void main(String args[])
  {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Temperature Conversion\n");
    System.out.println("Enter your choice of conversion:\n1.Fahrenheit to Celsius \n2.Celsius to Fahrenheit");
    int choice=myObj.nextInt();
    if(choice==1)
    {
        Fahr_Cel();
    }
    else if(choice==2)
    Cel_Fahr();
  else
  {
    System.out.println("Wrong choice entered");
  }
  }
  public static void Fahr_Cel()
  {
    Scanner myObj=new Scanner(System.in);
    System.out.print("Enter the temperature in Fahrenheit:");
    float fahr = myObj.nextFloat();
    float cel;
    cel=((fahr-32)*5)/9;
    System.out.println("\n The Temperature in Celsius is:"+cel);
  }

  public static void Cel_Fahr()
  {
    Scanner myObj=new Scanner(System.in);
    System.out.print("Enter the temperature in Celsius:");
    float cel = myObj.nextFloat();
    float fahr;
    fahr=((cel*9)/5)+32;
    System.out.println("\n The Temperature in Fahrenheit is:"+fahr);
  }
  
}