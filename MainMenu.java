import java.util.Scanner;


public class MainMenu extends clsScreeen{


    private enum enWhatToDO {ShowFlights , SearchForaFlight , MyBooks , BookNewFlight , DeleteFlight}

    private static Scanner input = new Scanner(System.in);


    private static void GenrateMainMenu(enWhatToDO WhatToDO)
    {

        switch(WhatToDO)
        {
          case ShowFlights:
          clsImportantClass.ClearScreen();
          clsShowFlghts.ShowFlightScreen();
          System.out.println("Press Any Key To Go Back To Main Menu...");
          input.nextLine();
          input.nextLine();
          MainMenu();
          break;

          case SearchForaFlight:
          clsImportantClass.ClearScreen();
          System.out.println("Screen Will Be Here Nearly \n");
          System.out.println("Press Any Key To Go Back To Main Menu...");
          input.nextLine();
          input.nextLine();
          MainMenu();
          break;

          case MyBooks:
          clsImportantClass.ClearScreen();
          System.out.println("Screen Will Be Here Nearly \n");
          System.out.println("Press Any Key To Go Back To Main Menu...");
          input.nextLine();
          input.nextLine();
          MainMenu();
          break;

          case BookNewFlight:
          clsImportantClass.ClearScreen();
          System.out.println("Screen Will Be Here Nearly \n");
          System.out.println("Press Any Key To Go Back To Main Menu...");
          input.nextLine();
          input.nextLine();
          MainMenu();
          break;

          case DeleteFlight:
          clsImportantClass.ClearScreen();
          System.out.println("Screen Will Be Here Nearly \n");
          System.out.println("Press Any Key To Go Back To Main Menu...");
          input.nextLine();
          input.nextLine();
          MainMenu();
          break;

          default:
          MainMenu();

        }
    }


    public static void MainMenu()
    {

        clsImportantClass.ClearScreen();


        NewScreen("\t    The Main Menu For Pasenngers", 87);

        System.out.println(clsImportantClass.Taps(85) + "===========================================");
        System.out.println(clsImportantClass.Taps(85) + "                Main Menu                  ");
        System.out.println(clsImportantClass.Taps(85) + "===========================================");
        System.out.println(clsImportantClass.Taps(85) + "  Show Avelable Flights   [1]");
        System.out.println(clsImportantClass.Taps(85) + "  Search For a Flight     [2]");
        System.out.println(clsImportantClass.Taps(85) + "  My Booked Tickets       [3]");
        System.out.println(clsImportantClass.Taps(85) + "  Book New Flight Ticket  [4]");
        System.out.println(clsImportantClass.Taps(85) + "  Delete Flight Ticket    [5]");
        System.out.println(clsImportantClass.Taps(85) + "===========================================");

        System.out.println(clsImportantClass.Taps(85));



        
            System.out.print("Enter What Do You Want To Do [1 --> 5] : ");
            int ToDo = input.nextInt();

            GenrateMainMenu(enWhatToDO.values()[ToDo - 1]);
        
    }

}
