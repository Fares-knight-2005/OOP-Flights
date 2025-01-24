

public class clsDeleteTicket {
    
    private static clsFlight SearchToDleletTicket(){
       
        System.out.println("enter the flight number you want to delet your book on it");
        System.out.println("");
        String flightnum=clsImportantClass.ReadString();
        
        clsFlight foundflight=clsFlight.Find(flightnum);
   
        
        
        if(foundflight.IsFlightEmpty(foundflight)){
         System.out.println("the flight number is wrong pleas try another number");
            SearchToDleletTicket();
        }
        
        return foundflight ;
    }
    
    
    public static void DeletTicket (ClsPassengers passenger){
         
         
         clsFlight found = SearchToDleletTicket();
         ClsTickets ticket=ClsTickets.Find(passenger.GetPassengerUserName(), found);
         //هون المفروض يكون التابع يلي انا ماكنت اعرف كيف بدي ساويه
         //عذرا منك -_-   -_-
         if (passenger.GetTickets().size()==0){     
         
             
             System.out.println("you dont have book for this  flight");
             return;
         
         }
         else{
             
             System.out.println("if you delet your booked ticeket you will get just 33% cash pack");
             System.out.println("");
             System.out.println("are you sure you wont to delet your booked ticeket");
             System.out.println("[y/n]");
            String sure =clsImportantClass.ReadString();
            if (sure.charAt(0)=='y'){
                
                System.out.println("we have deleted your ticeket");
                passenger.SetPassengerCash(passenger.Getpassengercach()+(found.GetPrice()*(67/100)));
                
                
                ClsPassengers.AddNew(passenger);
                
                ClsPassengers.Save(ClsPassengers.GetAllPassenger());
                
                passenger.DeleteTicket(found.GetNumberOfFlight());
                
            }
            else{
                System.out.println("we let your booked ticeket"); 
                System.out.println("your ticeket is not delet");
                return;
            }
         }
    
    }
}