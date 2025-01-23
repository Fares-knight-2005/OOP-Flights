
import java.util.*;

public class clsSearchForaFlight {

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
        Comparator<clsFlight> priceComparator;
        switch (x) {
            case 1:
               
                 priceComparator = new Comparator<clsFlight>() {
                 @Override public int compare(clsFlight f1, clsFlight f2){
                      return Double.compare(f2.GetPrice(), f1.GetPrice()); } 
                    };
                    Collections.sort(allcountryflights, priceComparator);
                   for (clsFlight e : allcountryflights) {
                    clsShowFlghts.printOneFlight(e);                   }
                

                break;
            case 2:     
                
                 priceComparator = new Comparator<clsFlight>() {
                 @Override public int compare(clsFlight f1, clsFlight f2)
                     { return Double.compare(f1.GetPrice(), f2.GetPrice()); } 
                    }
                    ; Collections.sort(allcountryflights, priceComparator);
                   for (clsFlight e : allcountryflights) {
                    clsShowFlghts.printOneFlight(e);                   }

            default:
                System.out.println("enter Between [1] --> [2]");
        }

    }

}
