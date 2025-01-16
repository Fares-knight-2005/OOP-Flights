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
 private int pasword ;
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
 //هاد هو الباني عملت الو اكثر من وضيفة 
  //هو رح ياخد القيم ويخزن القيم داخل ملف بعد تحويلهن الى متحولات من نوع سترينغ
  ClsPassengers(String PassengerUserName,String PassengerName ,int PassengeAge
                 ,int PassengeCash, int pasword){
  
  
  PassengerUserName=checkname(PassengerUserName);
  
  this.PassengerUserName=PassengerUserName ;
  this.PassengerName=PassengerName;
  this.PassengerAge=PassengeAge ;
  this.PassengerCash=PassengeCash;
  this.pasword=pasword;
  
  String [ ]arr={Integer.toString(pasword),Integer.toString(PassengerCash),Integer.toString(PassengerAge)};
 
 try{
 BufferedWriter write = new BufferedWriter (new FileWriter ("user.txt",true));
 
 write.write(PassengerUserName+"#//#"+PassengerName+"#//#"+PassengerAge+"#//#"+PassengerCash+"#//#"+pasword+"\n");
 
 write.close();
 }catch(Exception e){
 e.fillInStackTrace();
 }
  }
 

  
}

