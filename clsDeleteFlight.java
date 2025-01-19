
public class clsDeleteFlight {
    public static void DeleteFlight(){
System.out.println("enter number of Flight");
String NumberOfFlight= clsImportantClass.ReadString();
for (clsFlight e : clsFlight.GetAllFlights()) {
    if(e.GetNumberOfFlight().equals(NumberOfFlight)){
        clsFlight.GetAllFlights().remove(e);
    }


}


    }

}
