import java.util.Scanner;
public class Leap_Year
{
    public static void main(String[]args)
    {
    Scanner myObj = new Scanner(System.in);
    System.out.println("*Check if a given year is a leap year or not.*\n");
    System.out.println("Enter a year in 'YYYY' format: ");
    int year = myObj.nextInt();
    boolean leap = false;
    if(year>=0 && year<=9999)
    {
        if(year%4==0)
        {
            if(year%100==0)
            {
                if(year%400==0)
                leap = true;
            else
               leap = false;
            }
            else 
              leap = true;
        }
        else 
          leap = false;
        if(leap)
          System.out.println(year +" is a leap year");
        else
          System.out.println(year+" is not a leap year.");
    }
    else
    {
     System.out.println(year+" is not a leap year.");
    }
        }
    }
