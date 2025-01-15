

public class clsSystem extends clsScreeen{

    private enum enWhatToDO {AddNew , Delete , GoBack};


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
              System.out.println("Screen Will Be Here Nearly \n");
              System.out.println("Press Any Key To Go Back To to System Screen...");
              clsImportantClass.ReadString();
              SystemScreen();
              break;

              case GoBack:

        }
    }


    public static void SystemScreen()
    {
        clsImportantClass.ClearScreen();


        NewScreen("\t        The AirLin System", 55);

        System.out.println( "===========================================");
        System.out.println( "              AirLine System               ");
        System.out.println( "===========================================");
        System.out.println( "  Add New Flight    [1]");
        System.out.println( "  Delete Flight     [2]");
        System.out.println( "  Go Back To Login  [3]");
        System.out.println( "===========================================");

        System.out.println();
        
        System.out.print("Enter What Do You Want To Do [1 --> 3] : ");
            int ToDo = clsImportantClass.ReadIntNumber();

            GenrateSystem(enWhatToDO.values()[ToDo - 1]);
    }
}
