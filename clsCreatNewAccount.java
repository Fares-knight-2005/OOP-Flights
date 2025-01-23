

import java.util.ArrayList;
import java.util.Scanner;
public class clsCreatNewAccount extends  clsScreeen {
    private static Scanner s = new Scanner(System.in);

    private static ClsPassengers AddNew() {

        ClsPassengers obj = ClsPassengers.GetEmptyobject();
        boolean Exest = false;
      while(true){
        System.out.print("Enter The User Name : ");
        obj.SetPassengerUserName(clsImportantClass.ReadString());
        ArrayList <ClsPassengers> AllPassengers = ClsPassengers.GetAllPassenger();
        for(ClsPassengers P : AllPassengers)
        {
            if(P.GetPassengerUserName().equals(obj.GetPassengerUserName())){
              System.out.println("Already Exest Try Another User Name");
                Exest = true;
            }
        }
      
        System.out.println();
        if (!Exest) {
            break;
        }

        System.out.print("Enter your name : ");
        String name = s.nextLine();
        System.out.println();

        obj.SetPassengerName(name);
        System.out.print("Enter your pasword : ");
        String paswword = s.nextLine();
        System.out.println();

        obj.Setpasword(paswword);
        System.out.print("Enter your Age : ");
        System.out.println();

        int age = clsImportantClass.ReadIntNumber();
        obj.SetPassengerAge(age);
        System.out.println();

        System.out.print("Enter your cash : ");
        int cash = clsImportantClass.ReadIntNumber();
        obj.SetPassengerCash(cash);
        System.out.println();

        return obj;
    }

    public static void AddNewAccount() {

        NewScreen("\t     Add New Account ", 55);

        ClsPassengers obj = AddNew();

        System.out.println();
        System.out.println();
        System.out.println("Are You Sure To Add This Account [y/n] : ");

        String Sure = clsImportantClass.ReadString();

        if (Sure.charAt(0) == 'y') {
            ClsPassengers.AddNew(obj);
            System.out.println();
            System.out.println("Added Successfuly :) ");
        }
    }
}
