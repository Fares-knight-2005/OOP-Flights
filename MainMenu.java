import java.util.Scanner;


public class MainMenu extends clsScreeen{


    private enum enWhatToDO {ShowFlights , SearchForaFlight , MyBooks , BookNewFlight , DeleteFlight , LogOut}

    private static Scanner input = new Scanner(System.in);


    private static void GenrateMainMenu(enWhatToDO WhatToDO , ClsPassengers CurrentPassenger)
    {

        switch(WhatToDO)
        {
          case ShowFlights:
          clsImportantClass.ClearScreen();
          clsShowFlghts.ShowFlightScreen();
          System.out.println("Press Any Key To Go Back To Main Menu...");
          input.nextLine();
          input.nextLine();
          MainMenu(CurrentPassenger);
          break;

          case SearchForaFlight:
          clsImportantClass.ClearScreen();
          clsSearchForaFlight.SearchForaFlight();
         // System.out.println("Screen Will Be Here Nearly \n");
          System.out.println("Press Any Key To Go Back To Main Menu...");
          input.nextLine();
          input.nextLine();
          MainMenu(CurrentPassenger);
          break;

          case MyBooks:
          clsImportantClass.ClearScreen();
        //  clsAddNewFlight.AddNewFlight();
         // System.out.println("Screen Will Be Here Nearly \n");
         clsPassengerTickets.printTickets(CurrentPassenger);
          System.out.println("Press Any Key To Go Back To Main Menu...");
          input.nextLine();
          input.nextLine();
          MainMenu(CurrentPassenger);
          break;

          case BookNewFlight:
          clsImportantClass.ClearScreen();
         // System.out.println("Screen Will Be Here Nearly \n");
         ClsBookNewTiceket.BookNewTiceket(CurrentPassenger);
          System.out.println("Press Any Key To Go Back To Main Menu...");
          input.nextLine();
          input.nextLine();
          MainMenu(CurrentPassenger);
          break;

          case DeleteFlight:
          clsImportantClass.ClearScreen();
          //System.out.println("Screen Will Be Here Nearly \n");
          clsDeleteTicket.DeletTicket(CurrentPassenger);
          System.out.println("Press Any Key To Go Back To Main Menu...");
          input.nextLine();
          input.nextLine();
          MainMenu(CurrentPassenger);
          break;


          case LogOut:
          break;

          default:
          MainMenu(CurrentPassenger);

        }
    }


    public static void MainMenu(ClsPassengers CurrentPassenger)
    {

        clsImportantClass.ClearScreen();


        NewScreen("\t    The Main Menu For Pasenngers", 55);

        System.out.println( "===========================================");
        System.out.println( "                Main Menu                  ");
        System.out.println( "===========================================");
        System.out.println( "  Show Avelable Flights   [1]");
        System.out.println( "  Search For a Flight     [2]");
        System.out.println( "  My Booked Tickets       [3]");
        System.out.println( "  Book New Flight Ticket  [4]");
        System.out.println( "  Delete Flight Ticket    [5]");
        System.out.println( "  Log Out                 [6]");
        System.out.println( "===========================================");

        System.out.println();
        
            System.out.print("Enter What Do You Want To Do [1 --> 6] : ");
            int ToDo = input.nextInt();

            GenrateMainMenu(enWhatToDO.values()[ToDo - 1] , CurrentPassenger);
        
    }

}
