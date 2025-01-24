import java.util.ArrayList;

public class ClsBookNewTiceket extends clsScreeen {
    
    private static clsFlight SerchForFlight(){
      
        System.out.println("enter the flight number you want to book : ");
        String flightNum =clsImportantClass.ReadString();
        clsFlight flight = clsFlight.Find(flightNum);
      
        
        if (flight.IsFlightEmpty(flight))
        {
            System.out.println("the flight number is wrong pleas try another number ");
             SerchForFlight();
        }
        
        return flight ;
    }
    
    public static void BookNewTiceket(ClsPassengers passenger){
        clsFlight flight= SerchForFlight();

        if (passenger.Getpassengercach() < flight.GetPrice()){
            
            System.out.println("you dont have enough cash in your account :(");
            
            return;
        }

        else{
            System.out.println("");
            System.out.println("this ticek price is : "+flight.GetPrice());
            System.out.println("are you sure you want to book this Ticket [y/n] : ");
            String sure =clsImportantClass.ReadString();

            if(sure.charAt(0)=='y'){
                
                System.out.println("we have book a new ticket for you");
                
                passenger.SetPassengerCash(passenger.Getpassengercach() - flight.GetPrice());
                
                ClsTickets.AddNew(flight, passenger.GetPassengerUserName());
                

                ArrayList <ClsPassengers> AllPassengers = ClsPassengers.GetAllPassenger();

                for(int i = 0 ;i < AllPassengers.size() ; i++)
                {
                         if(AllPassengers.get(i).GetPassengerUserName().equals(passenger.GetPassengerUserName()))
                         {
                            AllPassengers.get(i).SetPassengerCash(passenger.Getpassengercach());
                         }
                }

                ClsPassengers.Save(AllPassengers); 
            
            }

            else{
                System.out.println("we didn't book the ticeket");
                
                return;
            }
        }
    }
   
}