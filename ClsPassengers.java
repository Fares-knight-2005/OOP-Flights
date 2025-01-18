package passenger;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;


public class ClsPassengers {
 private String PassengerUserName ;
 private String PassengerName ;
 private int PassengerAge;
 private int PassengerCash ;
 private String pasword ;
 String [] arr ;

  
  Scanner in =new Scanner (System.in);
  //هاد التابع مشان يتاكد انو اليوزر نيم يكون مميز لكل شخص رح يسجل
  public String checkname(String name){
  
   try{    
   BufferedReader read = new BufferedReader (new FileReader("user.txt"));
   String line =read.readLine();
   while((line =read.readLine())!= null) {
   
           String [] sarr =line.split("#//#") ;
    if(name.equals(sarr[0])){
        System.out.print("this user name is already use you most try antoer user name");
       name =in.nextLine();
        checkname(name);
    }
   
   }
   
   
   }catch(Exception e){
   e.fillInStackTrace();
   }
  
  return name;
  }

  //هاد باني فارغ يعني بيعطي قيم صفر لل انتجر و فراغ لل سترينغ
  public ClsPassengers(){
  
   PassengerUserName="";
   PassengerName="";
   pasword="";
   PassengerAge=0;
   PassengerCash=0;
  }
  
   //هاد هو الباني عملت الو اكثر من وضيفة 
  //هو رح ياخد القيم ويخزن القيم داخل ملف بعد تحويلهن الى متحولات من نوع سترينغ
  
  ClsPassengers(String PassengerUserName,String PassengerName ,int PassengeAge
                 ,int PassengeCash, String pasword){
  
  
  PassengerUserName=checkname(PassengerUserName);
  
  this.PassengerUserName=PassengerUserName ;
  this.PassengerName=PassengerName;
  this.PassengerAge=PassengeAge ;
  this.PassengerCash=PassengeCash;
  this.pasword=pasword;
  
  String [ ]arr={Integer.toString(PassengerCash),Integer.toString(PassengerAge)};
 
 try{
 BufferedWriter write = new BufferedWriter (new FileWriter ("user.txt",true));
 
 write.write(PassengerUserName+"#//#"+PassengerName+"#//#"+PassengerAge+"#//#"+PassengerCash+"#//#"+pasword+"\n");
 
 write.close();
 }catch(Exception e){
 e.fillInStackTrace();
 }
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
public void SetPassengerCash(int cach){
this.PassengerCash=cach;
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
 
 write.write(ConvertToLine(passenger));
 
 write.close();
 }catch(Exception e){
 e.fillInStackTrace();
 }
}

public static ClsPassengers GetEmptyobject (){
ClsPassengers passenger = new passenger.ClsPassengers();
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
        
 }catch(Exception e){
 e.fillInStackTrace();
 }
    return allpassnger;
}

}

