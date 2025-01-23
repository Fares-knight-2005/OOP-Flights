


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;



public class ClsPassengers {
 private String PassengerUserName ;
 private String PassengerName ;
 private int PassengerAge;
 private int PassengerCash ;
 private String pasword ;

  

 
  //هاد باني فارغ يعني بيعطي قيم صفر لل انتجر و فراغ لل سترينغ
  public ClsPassengers(){
  
   PassengerUserName="";
   PassengerName="";
   pasword="";
   PassengerAge=0;
   PassengerCash=0;
  }
  
  //هاد هو الكونستركتر العادي الطلب رقم2  
   public ClsPassengers(String PassengerUserName,String PassengerName ,
           int PassengerAge,int PassengerCash,String pasword){
          
       this.PassengerUserName= PassengerUserName;
       this.PassengerName= PassengerName;
       this.PassengerAge=PassengerAge;
       this.PassengerCash=PassengerCash;
       this.pasword=pasword;
   }
  

  
  
  //هون الستير و الجيتر مافيهن شي مميز 
public void SetPassengerUserName(String passengeruserName){
this.PassengerUserName=passengeruserName;
}

public void SetPassengerName(String passengerName){
this.PassengerName=passengerName;
}

public void SetPassengerAge(int age){
this.PassengerAge=age;
}

public void SetPassengerCash(int PassengerCash){
this.PassengerCash=PassengerCash;
}

public void Setpasword(String pasword){
this.pasword=pasword;
}
public String  GetPassengerUserName(){
    return PassengerUserName;
}

public String GetpassengerName(){
return PassengerName;
}

public int GetpassengerAge(){
return PassengerAge ;
}

public int Getpassengercach (){
 return   PassengerCash;
}

public String Getpasword (){
return pasword ;
}




private static String ConvertToLine(ClsPassengers passenger){
   
    String []arr = {passenger.PassengerUserName,passenger.PassengerName
            ,Integer.toString(passenger.PassengerAge),Integer.toString(passenger.PassengerCash),passenger.pasword};
     return String.join("#//#", arr);

}


public static void AddNew(ClsPassengers passenger){
try{
 BufferedWriter write = new BufferedWriter (new FileWriter ("user.txt",true));
 
 write.write(ConvertToLine(passenger) + "\n");
 
 write.close();
 }catch(Exception e){
 e.fillInStackTrace();
 }
}

public static ClsPassengers GetEmptyobject (){
ClsPassengers passenger = new ClsPassengers();
return passenger ;
}



private static ClsPassengers ConvertLineToObject(String line ){

    ClsPassengers passenger=new ClsPassengers();
    String [] arr=line.split("#//#");
    passenger.PassengerUserName=arr[0];
    passenger.PassengerName=arr[1];
    passenger.PassengerAge=Integer.parseInt(arr[2]);
    passenger.PassengerCash=Integer.parseInt(arr[3]);
    passenger.pasword=arr[4];
    return passenger;

    }



public void print (ClsPassengers passenger){

    System.out.println(passenger.PassengerUserName+"\n"+passenger.PassengerName+"\n"+passenger.PassengerAge
    +"\n"+passenger.PassengerCash+"\n"+pasword);
}



public static ArrayList<ClsPassengers> GetAllPassenger(){
  
    String line="";
    ArrayList<ClsPassengers>allpassnger=new ArrayList<>();
    try{
 
        BufferedReader read =new BufferedReader(new FileReader("user.txt"));
        while((line=read.readLine())!=null){
            
            allpassnger.add(ConvertLineToObject(line));
            
        }
        read.close();
        
 }catch(Exception e){
 e.fillInStackTrace();
 }
    return allpassnger;
}

public void DeletPassenger (){
     
    ArrayList <ClsPassengers> allpassenger=GetAllPassenger();
    
    for(int i =0 ; i<allpassenger.size();i++){
        
        ClsPassengers passenger=allpassenger.get(i) ;
        if(passenger.PassengerUserName.equals(this.PassengerUserName)){
            allpassenger.remove(i);
            ClsPassengers.Save(allpassenger);
            break ;
            
        }
        
        
    }
}

public static ClsPassengers CheckByUserNameAndPasword(String userName,String pasword){
  
    ArrayList<ClsPassengers> passengers = GetAllPassenger();

    for(ClsPassengers Passenger : passengers){
    if(Passenger.PassengerUserName.equals(userName)){
       
        if(Passenger.pasword.equals(pasword)){
           
            return Passenger;
        }
    
    }

    }
    return GetEmptyobject();

}


public void AddTicket(clsFlight Flifght)
{
    ClsTickets.AddNew(Flifght, PassengerUserName);
}

public void DeleteTicket(String FlightNumber)
{
   ClsTickets Ticket =  ClsTickets.Find(PassengerUserName , clsFlight.Find(FlightNumber));
   Ticket.Delete();
}

public ArrayList <ClsTickets> GetTickets()
{
    ArrayList <ClsTickets> AllTickets = ClsTickets.GetAllTickets();

    ArrayList <ClsTickets> PassengerTickets = new ArrayList<>();

    for(ClsTickets Ticket : AllTickets)
    {
        if(Ticket.GetUserName().equals(PassengerUserName))
           PassengerTickets.add(Ticket);
    }

    return PassengerTickets;
}

public static void Save(ArrayList <ClsPassengers> NewAllPassenger){
    
    try{
    BufferedWriter write = new BufferedWriter(new FileWriter("user.txt"));
    
    String line = "" ;
    
    for(ClsPassengers passenger :NewAllPassenger ){
        
        line=ClsPassengers.ConvertToLine(passenger);
        write.write(line+"\n");
    }
    write.close();
    }catch(Exception e){
 e.fillInStackTrace();
 }
}
}

