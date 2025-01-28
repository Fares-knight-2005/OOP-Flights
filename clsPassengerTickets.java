import java.util.ArrayList;
import java.util.Scanner;

public class clsPassengerTickets extends clsScreeen {
    
    private static Scanner input = new Scanner(System.in);


    private static void PrintOneTicket(ClsTickets Ticket)
    {
        int NumberOfPasengers = Ticket.GetFlight().GetNumberOfPassengers();
        int NumberOfChars = Ticket.GetFlight().GetNumberOfChars();
        String NumberOfFlight = Ticket.GetFlight().GetNumberOfFlight();
        String DateToTravel = Ticket.GetFlight().GetDateToTravel();
        String DateToGoBack = Ticket.GetFlight().GetDateToGoBack();
        int price = Ticket.GetFlight().GetPrice();
        String FromCountry = Ticket.GetFlight().GetFromCountry();
        String ToCountry = Ticket.GetFlight().GetToCountry();
        String StringTimeOfGo = Ticket.GetFlight().GetStringTimeOfGo();
        String TimeOfArriving = Ticket.GetFlight().GetTimeOfArriving();
        String HowMuchTimeInTheSky = Ticket.GetFlight().GetHowMuchTimeInTheSky();

        

        System.out.println(".....................................................");
        System.out.println("the Number Of Chars flight is " + NumberOfChars);
        System.out.println(".....................................................");
        System.out.println("the Number Of Pasengers flight is " + NumberOfPasengers);
        System.out.println(".....................................................");
        System.out.println("the Number Of Flight  is " + NumberOfFlight);
        System.out.println(".....................................................");
        System.out.println("the Date To Travel of flight is " + DateToTravel);
        System.out.println(".....................................................");
        System.out.println("the  price of flight is " + price);
        System.out.println(".....................................................");
        System.out.println("the Date To Go Back flight is " + DateToGoBack);
        System.out.println(".....................................................");
        System.out.println("the From Country of flight is " + FromCountry);
        System.out.println(".....................................................");
        System.out.println("the To Country flight is " + ToCountry);
        System.out.println(".....................................................");
        System.out.println("the Time Of Go to  flight is " + StringTimeOfGo);
        System.out.println(".....................................................");
        System.out.println("the Time Of Arriving flight is " + TimeOfArriving);
        System.out.println(".....................................................");
        System.out.println("the Time In The Sky flight is " + HowMuchTimeInTheSky);
        System.out.println(".....................................................");
        System.out.println();
        System.out.println();
        System.out.println();
    }


    public static void printTickets (ClsPassengers Passenger){
        NewScreen("\t             Your Tickets", 55);
        
        ArrayList <ClsTickets> PassengerTickets = Passenger.GetTickets();
        
        int i = 0; 
        System.out.println();

        for(ClsTickets Ticket : PassengerTickets)
        {
               i++;            
               System.out.println("Ticket " + i + " : ");
               PrintOneTicket(Ticket);
        }

    }


}