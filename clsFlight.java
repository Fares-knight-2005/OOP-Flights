import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;


public class clsFlight {

    private int NumberOfChars;
    private int NumberOfPasengers;
    private String NumberOfFlight;
    private String DateToTravel;
    private String DateToGoBack;
    private int price;
    private String FromCountry;
    private String ToCountry;
    private String StringTimeOfGo;
    private String TimeOfArriving;
    private String HowMuchTimeInTheSky;

    public clsFlight(int NumberOfChars , int NumberOfPasengers , String NumberOfFlight , String DateToTravel , 
    String DateToGoBack , int price , String FromCountry , String ToCountry ,String StringTimeOfGo , 
    String TimeOfArriving , String HowMuchTimeInTheSky)
    {
        this.NumberOfChars = NumberOfChars;
        this.NumberOfPasengers = NumberOfPasengers;
        this.NumberOfFlight = NumberOfFlight;
        this.DateToTravel = DateToTravel;
        this.DateToGoBack =DateToGoBack;
        this.price = price;
        this.FromCountry = FromCountry;
        this.ToCountry = ToCountry;
        this.StringTimeOfGo = StringTimeOfGo;
        this.TimeOfArriving =TimeOfArriving;
        this.HowMuchTimeInTheSky = HowMuchTimeInTheSky;
    }

    public int GetNumberOfChars()
    {
        return NumberOfChars;
    }

    public void setNumberOfChears(int NumberOfChears)
    {
        this.NumberOfChars =NumberOfChears;
    }

    public int GetNumberOfPassengers()
    {
        return NumberOfPasengers;
    }

    public void setNumberOfPassengers(int NumberOfPasengers)
    {
        this.NumberOfPasengers = NumberOfPasengers;
    }

    public String GetNumberOfFlight()
    {
        return NumberOfFlight;
    }

    public void setNumberOfFlight(String NumberOfFlight)
    {
        this.NumberOfFlight =NumberOfFlight;
    }

    public String GetDateToTravel()
    {
        return DateToTravel;
    }

    public void setDateToTravel(String DateToTravel)
    {
        this.DateToTravel = DateToTravel;
    }

    public String GetDateToGoBack()
    {
        return DateToGoBack;
    }

    public void setDateToGoBack(String DateToGoBack)
    {
        this.DateToGoBack = DateToGoBack;
    }

    public int GetPrice()
    {
        return price;
    }

    public void setPrice(int Price)
    {
        this.price = Price;
    }

    public String GetFromCountry()
    {
        return FromCountry;
    }

    public void setFromCountry(String FromCountry)
    {
        this.FromCountry = FromCountry;
    }

    public String GetToCountry()
    {
        return ToCountry;
    }

    public void setToCountry(String ToCountry)
    {
        this.ToCountry =ToCountry;
    }

    public String GetStringTimeOfGo()
    {
        return StringTimeOfGo;
    }

    public void setStringtimeOfGo(String TimeOfGo)
    {
        this.StringTimeOfGo = TimeOfGo;
    }

    public String GetTimeOfArriving()
    {
        return TimeOfArriving;
    }

    public void setTimeOfArriving(String Time)
    {
        this.TimeOfArriving = Time;
    }

    public String GetHowMuchTimeInTheSky()
    {
        return HowMuchTimeInTheSky;
    }

    public void setHowMuchTimeInTheSky(String HowMuchTimeInTheSky)
    {
        this.HowMuchTimeInTheSky = HowMuchTimeInTheSky;
    }

    private static String ConvertObjectToLine(clsFlight Flight)
    {
        String[] Arr = {Integer.toString(Flight.NumberOfChars) , Integer.toString(Flight.NumberOfPasengers) ,
      Flight.NumberOfFlight , Flight.DateToTravel , Flight.DateToGoBack , Integer.toString(Flight.price) ,
      Flight.FromCountry , Flight.ToCountry , Flight.StringTimeOfGo , Flight.TimeOfArriving , Flight.HowMuchTimeInTheSky};

        return String.join("#//#", Arr);
    }

    public static void AddFlight(clsFlight Flight)
    {
        String Line = ConvertObjectToLine(Flight);

        try{
        BufferedWriter Writer = new BufferedWriter(new FileWriter("Flights.txt" , true));
        Writer.write(Line + "\n");
        Writer.close();
        }catch(Exception e)
        {
            e.fillInStackTrace();
        }
    }

    public static clsFlight GetEmptyObject()
    {
        return new clsFlight(0 , 0 , "" , "" , "" , 0,"" ,"" ,"" ,"" ,"");
    }

    private static clsFlight ConvertLineToObject(String Line)
    {
        String[] Arr = Line.split("#//#");

        return new clsFlight(Integer.parseInt( Arr[0]), Integer.parseInt(Arr[1]), Arr[2], Arr[3], Arr[4], Integer.parseInt(Arr[5]),
         Arr[6], Arr[7], Arr[8], Arr[9], Arr[10]);
    }

    public static  ArrayList <clsFlight> GetAllFlights()
{                           

         ArrayList <clsFlight> AllFlights = new ArrayList<>();
        try{

           BufferedReader Reader = new BufferedReader(new FileReader("Flights.txt"));

          

           String Line ="";

           while ( (Line = Reader.readLine()) != null) {
            AllFlights.add(ConvertLineToObject(Line));
           }

           Reader.close();
           return AllFlights;

        }catch(Exception e)
        {
            e.fillInStackTrace();
            return AllFlights;
        }
        
    }

    public static  ArrayList <clsFlight> ArrayHaveAllFlightsCountry(String Countryto){
        ArrayList <clsFlight> arrayListWithcountry =new ArrayList();
      
        for (clsFlight e : GetAllFlights() ) {
            if(e.ToCountry.equals(Countryto)){
            arrayListWithcountry.add(e);}
        }
return arrayListWithcountry;


    }


}
