
package javaapplication11;


public class ClsBookNewTiceket extends clsScreeen {
    
    private static clsFlight SerchForFlight(){
      
        System.out.println("enter the flight number you want to book");
        System.out.println("");
        String flightNum =clsImportantClass.ReadString();
        clsFlight flight = clsFlight.Find(flightNum);
        clsFlight isempty= clsFlight.GetEmptyObject();
        
        if (flight==isempty)
        {
            System.out.println("the flight number is wrong pleas try another number ");
             SerchForFlight();
        }
        clsImportantClass.ClearScreen ();
        return flight ;
    }
    
    public static void BookNewTiceket(ClsPassengers passenger){
        clsFlight flight= SerchForFlight();
        if (passenger.Getpassengercach()<flight.GetPrice()){
            
            System.out.println("you dont have enough cash in your account");
            
            return;
        }
        else{
            System.out.println("");
            System.out.println("");
            System.out.println("are you sure you want yo book this tiecket ");
            System.out.println("y/n");
            String sure =clsImportantClass.ReadString();
            if(sure.charAt(0)=='y'){
                passenger.SetPassengerCash(passenger.Getpassengercach()-flight.GetPrice());
                ClsTickets.AddNew(flight, passenger.GetPassengerUserName()); 
            
            }
            else{
                System.out.println("we didnt book the ticeket");
                
            }
        }
      clsImportantClass.ClearScreen();
    }
   
}
