
import java.util.*;

public class clsSearchForaFlight {


    
    private static ArrayList <clsFlight> SortByPriceDownToUp(ArrayList <clsFlight> AllFlights)
    {
       for(int j = 1 ; j < AllFlights.size() ; j++) 
         for(int i = 0 ; i < AllFlights.size() - j ; i++)
         {
             if(AllFlights.get(i).GetPrice() > AllFlights.get(i + 1).GetPrice())
             {
                 clsFlight Temp = AllFlights.get(i);
                 AllFlights.set(i, AllFlights.get(i + 1));
                 AllFlights.set(i + 1, Temp);
             }
         }

         return AllFlights;

    }

    
    private static ArrayList <clsFlight> SortByPriceUoToDown(ArrayList <clsFlight> AllFlights)
    {
       for(int j = 1 ; j < AllFlights.size() ; j++) 
         for(int i = 0 ; i < AllFlights.size() - j ; i++)
         {
             if(AllFlights.get(i).GetPrice() < AllFlights.get(i + 1).GetPrice())
             {
                 clsFlight Temp = AllFlights.get(i);
                 AllFlights.set(i, AllFlights.get(i + 1));
                 AllFlights.set(i + 1, Temp);
             }
         }

         return AllFlights;

    }

    public static void SearchForaFlight() {
        System.out.println(" the price from high to low  [1]");
        System.out.println(" the price from low to high  [2]");
        System.out.println("_________________________________");
        System.out.println("Enter Number [1 --> 2] : ");

        int x = clsImportantClass.ReadIntNumber();
        clsImportantClass.ClearScreen();
        System.out.println("Enter The country you want to go ?");
        String countryto = clsImportantClass.ReadString();
        clsImportantClass.ClearScreen();

        System.out.println("|__________________________________________________________________________________________________________________________________________________________|");
        System.out.println("|                                                              Flights Informations                                                                        |");
        System.out.println("|__________________________________________________________________________________________________________________________________________________________|");
        System.out.println("| Flight Num | From Country | To Country | Travel Date  |  Go Back Date  | Chears Num | Passegers Num | Going Time | Arraiving Time | Stay in The Sky hours|");
        System.out.println("|__________________________________________________________________________________________________________________________________________________________|");

       
        ArrayList<Integer> allprices = new ArrayList<>();
        ArrayList<clsFlight> allcountryflights = clsFlight.ArrayHaveAllFlightsCountry(countryto);
         if(allcountryflights.isEmpty())
        {
            
          System.out.println("                                                                  No Flights Exest");
          System.out.println("|__________________________________________________________________________________________________________________________________________________________|");

          return;
        }
        switch (x) {
            case 1:
               
                 ArrayList <clsFlight> Flights = SortByPriceUoToDown(allcountryflights);

                   for (clsFlight e : Flights) {
                    clsShowFlghts.printOneFlight(e);                   }
                
                    System.out.println("|__________________________________________________________________________________________________________________________________________________________|");

                break;
            case 2:     
                
                 ArrayList <clsFlight> Flightss = SortByPriceDownToUp(allcountryflights);

                   for (clsFlight e : Flightss) {
                    clsShowFlghts.printOneFlight(e);                   }
                    System.out.println("|__________________________________________________________________________________________________________________________________________________________|");

                break;
            default:
            clsImportantClass.ClearScreen();
                SearchForaFlight();
               
        }

    }

}
