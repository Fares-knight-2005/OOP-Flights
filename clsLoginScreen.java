

public class clsLoginScreen extends clsScreeen{
      
    private enum enWhatToDO {CreatNewAccount , Login , SysLine};


    private static ClsPassengers log()  
    {
        clsImportantClass.ClearScreen();

        NewScreen("\t         Login Screen" , 55);

        System.out.println("Enter Your User Name : ");

        String UserName = clsImportantClass.ReadString();

        System.out.println("Enter Your Password : ");

        String Password = clsImportantClass.ReadString();

        ClsPassengers CurrentPassenger = ClsPassengers.CheckByUserNameAndPasword(UserName, Password);

        return CurrentPassenger;

    }

 
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

            ClsPassengers CurrentPassenger = log();

            if(CurrentPassenger.Getpassengercach() == 0)
            {
               System.out.println("\n");
                System.out.println("Wrong User Name Or Password :(");
                System.out.println("Do You Want To Try Again [y/n] : ");
                String Try = clsImportantClass.ReadString();

                if(Try.charAt(0) == 'y')
                {
                   GenrateLogin(enWhatToDO.Login);
                }
            }

            else
            {
                clsImportantClass.ClearScreen();
                //System.out.println("Screen Will Be Here Nearly \n");
                //System.out.println("Press Any Key To Go Back To to Login Screen...");
             //   clsImportantClass.ReadString();
               // clsImportantClass.ReadString();
                 MainMenu.MainMenu();
            }

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
