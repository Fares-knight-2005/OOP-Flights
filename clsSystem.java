
import java.util.Scanner;

public class clsSystem extends clsScreeen{
    private static Scanner a = new Scanner(System.in);

    private enum enWhatToDO {AddNew , Delete, Deposet , GoBack};
    private static void GenrateSystem(enWhatToDO WhatToDo)
    {
        switch (WhatToDo) {
            case AddNew:

                clsImportantClass.ClearScreen();
                //  System.out.println("Screen Will Be Here Nearly \n");
                clsAddNewFlight.AddNewFlight();
                System.out.println("Press Any Key To Go Back To to System Screen...");
                clsImportantClass.ReadString();
                SystemScreen();
                break;

            case Delete:
                clsImportantClass.ClearScreen();
                //  System.out.println("Screen Will Be Here Nearly \n");
                clsDeleteFlight.DeleteFlight();
                System.out.println("Press Any Key To Go Back To to System Screen...");
                clsImportantClass.ReadString();
                SystemScreen();
                break;

            case Deposet:
            clsImportantClass.ClearScreen();
              System.out.println("Screen Will Be Here Nearly \n");
            System.out.println("Press Any Key To Go Back To to System Screen...");
            clsImportantClass.ReadString();
            SystemScreen();
            break;

            case GoBack:

        }
    }


    public static void SystemScreen() {
        clsImportantClass.ClearScreen();

        System.out.print("The Airlin System , enter the password : ");
        String Password = a.nextLine();
        if (Password.equals("0000") ) {
            NewScreen("\t        The AirLin System", 55);

            System.out.println("===========================================");
            System.out.println("              AirLine System               ");
            System.out.println("===========================================");
            System.out.println("  Add New Flight       [1]");
            System.out.println("  Delete Flight        [2]");
            System.out.println("  Deposet To Passenger [3]");
            System.out.println("  Go Back To Login     [4]");
            System.out.println("===========================================");

            System.out.println();

            System.out.print("Enter What Do You Want To Do [1 --> 4] : ");
            int ToDo = clsImportantClass.ReadIntNumber();

            GenrateSystem(enWhatToDO.values()[ToDo - 1]);
        } else {
            System.out.println("The password is incorrect , please Try again .");

            System.out.println("Press Any Key To Go Back To to Login Screen...");
            clsImportantClass.ReadString();
            clsLoginScreen.LogIn();
        }
    }
}