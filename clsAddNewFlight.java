import java.util.Scanner;

public class clsAddNewFlight extends clsScreeen{

    private static Scanner input = new Scanner(System.in);

    private static clsFlight ReadFlight()
    {
        clsFlight Flight = clsFlight.GetEmptyObject();

      
        System.out.print("Enter The Number Of The Flight : ");
        Flight.setNumberOfFlight(clsImportantClass.ReadString());
        System.out.println();

        System.out.print("How Many Chears In The Flight : ");
        Flight.setNumberOfChears( clsImportantClass.ReadIntNumber());
        System.out.println();


        System.out.print("Enter The Travel Date yyyy/mm/dd : ");
        Flight.setDateToTravel(clsImportantClass.ReadString());
        System.out.println();

        System.out.print("Enter Go Back Date  yyyy/mm/dd : ");
        Flight.setDateToGoBack(clsImportantClass.ReadString());
        System.out.println();

        System.out.print("Enter The Price Of The Flight : ");
        Flight.setPrice(clsImportantClass.ReadIntNumber());
        System.out.println();

        System.out.print("Enter The From Country : ");
        Flight.setFromCountry(clsImportantClass.ReadString());
        System.out.println();

        System.out.print("Enter The To Country : ");
        Flight.setToCountry(clsImportantClass.ReadString());
        System.out.println();

        System.out.print("Enter The Time Of Go Out [hh : mm] : ");
        Flight.setStringtimeOfGo(clsImportantClass.ReadString());
        System.out.println();

        System.out.print("Enter The Time Of Arriving [hh : mm] : ");
        Flight.setTimeOfArriving(clsImportantClass.ReadString());
        System.out.println();

        System.out.print("Enter Expected Time To Stay In The Sky : ");
        Flight.setHowMuchTimeInTheSky(clsImportantClass.ReadString());
        System.out.println();

        return Flight;

    }

    public static void AddNewFlight(){

        NewScreen("\t     Add New Flight Screen" , 55);

        clsFlight Flight = ReadFlight();

        System.out.println();
        System.out.println();
        System.out.println("Are You Sure To Add This Flight [y/n] : ");

        String Sure = clsImportantClass.ReadString();

        if(Sure.charAt(0) == 'y')
        {
           clsFlight.AddFlight(Flight);
           System.out.println();
           System.out.println("Added Successfuly :) ");
        }

        else{
            System.out.println("Didn't Add The Flight ");
        }

    }

}
