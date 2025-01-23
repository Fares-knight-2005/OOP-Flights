
import java.util.ArrayList;
public class clsDeleteFlight {

    public static void DeleteFlight(){
System.out.println("enter number of Flight : ");
String NumberOfFlight= clsImportantClass.ReadString();
ArrayList<clsFlight> newArrayafterdelete=clsFlight.GetAllFlights();
if(clsFlight.Find(NumberOfFlight).equals(clsFlight.GetEmptyObject()))
{
    System.out.println("\n couldn't Find User :( ");
    return;
}
//flightwanttodelet.setDelete(true);

// int index= newArrayafterdelete.indexOf(flightwanttodelet);
// System.out.println(index);
//System.out.println(newArrayafterdelete);
// ArrayList<Integer> test = new ArrayList<>();
// test.add(1);
// test.add(25);
// test.add(3);
// test.remove(2);
// System.out.println(test);
    // newArrayafterdelete.remove(clsFlight.Find(NumberOfFlight));
     for (int i = 0 ; i < newArrayafterdelete.size() ; i++)
     {
        if(newArrayafterdelete.get(i).GetNumberOfFlight().equals(NumberOfFlight))
        {
            newArrayafterdelete.get(i).MarkToDelete = true;
            break;
        }
     }
         clsFlight.Save(newArrayafterdelete);
      }
     
    // System.out.println("done");
   
  
     }





    


