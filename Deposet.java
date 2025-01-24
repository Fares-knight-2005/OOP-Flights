import java.util.Scanner;

public class Deposet {

    public static void Deposet ( ){
        Scanner s = new Scanner(System.in ) ;
        System.out.println("enter your user name :");
        String  userName = s.nextLine();
        System.out.println("enter your passwrd :");
        String passwrd = s.nextLine();


       ClsPassengers c ;

        c =  ClsPassengers.CheckByUserNameAndPasword(userName ,passwrd ) ;
        
        if(ClsPassengers.isEmpty(c))
        {
            System.out.println("Wrong User Name Or Password ");
            return;
        }


        System.out.println("enter how much you want to deposit :");
        int  caDeposited  = clsImportantClass.ReadIntNumber();
      
        int z = caDeposited+ c.Getpassengercach() ;
    c.SetPassengerCash(z)  ;
    c.Save();

    System.out.println("Successfuly Deposeted");

    }

}