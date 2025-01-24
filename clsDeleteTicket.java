import java.util.ArrayList;

public class clsDeleteTicket {
    
    private static clsFlight SearchToDleletTicket(){
       
        System.out.print("enter the flight number you want to delete your book on it : ");
        String flightnum=clsImportantClass.ReadString();
        
        clsFlight foundflight=clsFlight.Find(flightnum);
   
        
        
        if(clsFlight.IsFlightEmpty(foundflight)){
         System.out.println("the flight number is wrong pleas try another number");
            SearchToDleletTicket();
        }
        
        return foundflight ;
    }
    
    
    public static void DeletTicket (ClsPassengers passenger){
         
         if (passenger.GetTickets().size()==0){     
         
             
             System.out.println("you dont Booked To Any Flight Yet ");
             return;
         
         }

         
         clsFlight found = SearchToDleletTicket();
         ClsTickets ticket=ClsTickets.Find(passenger.GetPassengerUserName(), found);
         //هون المفروض يكون التابع يلي انا ماكنت اعرف كيف بدي ساويه
         //عذرا منك -_-   -_-
       
             
             System.out.println("if you delet your booked ticeket you will get just 67% cash pack");
             System.out.print("are you sure you want to delet your booked ticeket [y/n] : ");
             String sure =clsImportantClass.ReadString();

            if (sure.charAt(0)=='y'){
                
                System.out.println("we have deleted your ticeket");
                passenger.SetPassengerCash(passenger.Getpassengercach()+(found.GetPrice()*(67/100)));
                
                ArrayList <ClsPassengers> AllPassengers = ClsPassengers.GetAllPassenger();

                for(int i = 0 ; i < AllPassengers.size() ; i++)
                {

                    if(AllPassengers.get(i).GetPassengerUserName().equals(passenger.GetPassengerUserName()))
                    {
                        AllPassengers.get(i).SetPassengerCash(passenger.Getpassengercach());
                    }
                }

                
                ClsPassengers.Save(AllPassengers);
                
                passenger.DeleteTicket(found.GetNumberOfFlight());
                
            }
            else{
                System.out.println("we let your booked ticeket"); 
                System.out.println("your ticeket is not deleted");
                return;
            }
         }
    
    }
