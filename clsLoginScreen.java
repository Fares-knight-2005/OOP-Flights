

public class clsLoginScreen extends clsScreeen{
      
    private enum enWhatToDO {CreatNewAccount , Login , SysLine};


    

 
    private static void GenrateLogin(enWhatToDO WhatToDo)
    {
        switch (WhatToDo) {
            case CreatNewAccount:

            clsImportantClass.ClearScreen();
            clsCreatNewAccount.AddNewAccount();
          //  System.out.println("Screen Will Be Here Nearly \n");
            System.out.println("Press Any Key To Go Back To to Login Screen...");
            clsImportantClass.ReadString();
            LogIn();
            break;


            case Login:
            clsImportantClass.ClearScreen();
            //System.out.println("Screen Will Be Here Nearly \n");
            //System.out.println("Press Any Key To Go Back To to Login Screen...");
         //   clsImportantClass.ReadString();
           // clsImportantClass.ReadString();
            MainMenu.MainMenu();
            LogIn();
            break;


            case SysLine:

            clsImportantClass.ClearScreen();
           // System.out.println("Screen Will Be Here Nearly \n");
           // System.out.println("Press Any Key To Go Back To to Login Screen...");
        //    clsImportantClass.ReadString();
          //  clsImportantClass.ReadString();
           clsSystem.SystemScreen();
            LogIn();
            break;


        }
    }





    public static void LogIn()
    {
        clsImportantClass.ClearScreen();


        NewScreen("\t        The Login Screen", 55);

        System.out.println( "===========================================");
        System.out.println( "                   Login                   ");
        System.out.println( "===========================================");
        System.out.println( "  Creat New Account   [1]");
        System.out.println( "  Log in My Account   [2]");
        System.out.println( "  System Of AirLine   [3]");
        System.out.println( "===========================================");

        System.out.println();
        
        System.out.print("Enter What Do You Want To Do [1 --> 3] : ");
            int ToDo = clsImportantClass.ReadIntNumber();

            GenrateLogin(enWhatToDO.values()[ToDo - 1]);
      }    
}   
