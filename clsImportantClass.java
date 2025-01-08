public class clsImportantClass {

    public static String Taps(int HowManyTaps)
    {
        String AllTaps = "";

        for(int i = 0 ; i < HowManyTaps ; i++)
        {
            AllTaps += " ";
        }

        return AllTaps;
    }
    
    public static void ClearScreen()
    {
        for(int i = 0 ; i < 100 ; i++)
        {
            System.out.println();
        }
    }
}
