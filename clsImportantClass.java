import java.util.Scanner;

public class clsImportantClass {


    private static Scanner input = new Scanner(System.in);

    public static String Taps(int HowManyTaps)
    {
        String AllTaps = "";

        for(int i = 0 ; i < HowManyTaps ; i++)
        {
            AllTaps += " ";
        }

        return AllTaps;
    }
    
    public static void ClearScreen()
    {
        for(int i = 0 ; i < 100 ; i++)
        {
            System.out.println();
        }
    }

    public static int ReadIntNumberBetwin(int smallerNum , int BigerNum)
    {
        int num = input.nextInt();

        if(num < smallerNum || num > BigerNum)
        {
             System.out.println("Number Not Within Range  :(");
             System.out.print("Enter Number : ");
             num = input.nextInt();
        }

        return num;

    }

    public static int ReadIntNumberBetwin(int smallerNum , int BigerNum , String ErorMessge)
    {
        int num = input.nextInt();

        if(num < smallerNum || num > BigerNum)
        {
             System.out.println(ErorMessge);
             System.out.print("Enter Number : ");
             num = input.nextInt();
        }

        return num;

    }
    
    public static int ReadIntNumberBetwin(int smallerNum , int BigerNum , String ErorMessge , String Taps)
    {
        int num = input.nextInt();

        if(num < smallerNum || num > BigerNum)
        {
             System.out.println(Taps + ErorMessge);
             System.out.print(Taps + "Enter Number : ");
             num = input.nextInt();
        }

        return num;

    }

    public static int ReadIntNumber()
    {
       int num ;
while (true) { 
    try {
        num=Integer.parseInt(input.nextLine());
        break;
    } catch (NumberFormatException  e) {
        System.out.println("Wrong input please Enter Integer");
    }
    
}
       input.nextLine();
       return num;
       
    }
 
 
    public static String ReadString()
    {
       return input.nextLine();
    }
   


}
