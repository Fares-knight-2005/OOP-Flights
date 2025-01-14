public class clsShowFlghts {






    public static void ShowFlightScreen()
    {


        System.out.println("_____________________________________________");
        System.out.println("Here We Should Print The Fligts");
        System.out.println("_____________________________________________;");

        String b ="A101#//#Dams#//#8000#//#$Homs";

        String[] Arr =b.split("#//#");

        String s = "";
       
        
        s = String.join("#//#", Arr);

        System.out.println(s);
    }
}
