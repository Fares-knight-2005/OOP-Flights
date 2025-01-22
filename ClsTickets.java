

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalTime;
import java.util.ArrayList;

public class ClsTickets {
     private clsFlight Flight ;
    
     private String username;
    
     LocalTime currenttime ;
    
     
    
    public ClsTickets(clsFlight flight ,String username)
    {
      this.Flight =flight ;
      this.username=username;
     currenttime=LocalTime.now();
     
    }
    

    public String GetUserName()
    {
        return username;
    }

    public clsFlight GetFlight()
    {
        return Flight;
    }

    //
    private static String ConvertToline(ClsTickets tickect){
      
           String[] Arr = {tickect.username,tickect.currenttime.toString(),
               Integer.toString(tickect.Flight.GetNumberOfChars())
               ,Integer.toString(tickect.Flight.GetNumberOfPassengers())
               , tickect.Flight.GetNumberOfFlight()
               , tickect.Flight.GetDateToTravel() 
               , tickect.Flight.GetDateToGoBack()
               , Integer.toString(tickect.Flight.GetPrice()) 
               ,tickect.Flight.GetFromCountry()
               ,tickect.Flight.GetToCountry()
               ,tickect.Flight.GetStringTimeOfGo() 
               ,tickect. Flight.GetTimeOfArriving() 
               , tickect.Flight.GetHowMuchTimeInTheSky()};

     return String .join("#//#",Arr);
                   
        
    }
    
    
    public static void AddNew(clsFlight flight ,String username ){
        try{
            ClsTickets object=new ClsTickets(flight,username);
             BufferedWriter write=new BufferedWriter(new FileWriter("ticket.txt",true));
            write.write(ConvertToline(object)+"\n");
            write.close();
        }catch(Exception e){
            
           e.fillInStackTrace();
           
           }
        
    } 
    
    public static ClsTickets Getemptyobject(){
    return new ClsTickets(clsFlight.GetEmptyObject() ,"");
    }
    
    //
    private static ClsTickets ConvertlineToObject(String line){
        
       String []Arr=line.split("#//#");
       
       clsFlight f1=new clsFlight(Integer.parseInt( Arr[2]), Integer.parseInt(Arr[3]), Arr[4], Arr[5], Arr[6], Integer.parseInt(Arr[7]),
         Arr[8], Arr[9], Arr[10], Arr[11], Arr[12]);
       ClsTickets object = new ClsTickets(f1,Arr[0]);
       String s =Arr[1];
       try{
       object.currenttime=object.currenttime.parse(Arr[1]);
       }catch(Exception e){
            
           e.fillInStackTrace();
           
           }
       return object ;
    }


    public static ArrayList <ClsTickets> GetAllTickets()
    {
        
        ArrayList <ClsTickets> AllTickets = new ArrayList<>();
        try{

           BufferedReader Reader = new BufferedReader(new FileReader("ticket.txt"));

          

           String Line ="";

           while ( (Line = Reader.readLine()) != null) {
            AllTickets.add(ConvertlineToObject(Line));
           }

           Reader.close();
           return AllTickets;

        }catch(Exception e)
        {
            e.fillInStackTrace();
            return AllTickets;
        }
    }


    public static ClsTickets Find(String UserName , clsFlight Flight)
    {
        ArrayList <ClsTickets> AllTickets = GetAllTickets();

        for(ClsTickets Ticket : AllTickets)
        {
             if(Ticket.username.equals(UserName))
                if(Ticket.Flight.equals(Flight))
                   return Ticket;
        }  

        return Getemptyobject();

    }

    public static void Save(ArrayList <ClsTickets> AllTickets)
    {
        try{

            
            BufferedWriter Writer = new BufferedWriter(new FileWriter("ticket.txt"));
    
    
            String Line;
            for(ClsTickets Ticket : AllTickets)
            {
                Line = ConvertToline(Ticket);
                Writer.write(Line);
            }
    
            }
            catch(Exception e)
            {
                e.fillInStackTrace();
            }
    }


    public void Delete()
    {
        if(this.equals(Getemptyobject()))
          return;

        ArrayList <ClsTickets> AllTickets = GetAllTickets();
        
        AllTickets.remove(this);

        Save(AllTickets);
        
    }

}
