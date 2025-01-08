public class Name
{
    public static void main(String[] args)
    {
        System.out.println("*Name Printing from Command Line Argument*");
        System.out.print("My name is Krittika Mondal");
        for(int i=0;i<args.length;i++)
        {
            System.out.print(args[i]+" ");
        }
    }

}