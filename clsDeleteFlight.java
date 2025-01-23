
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

for(ClsTickets Ticket : ClsTickets.GetAllTickets())
{
    if(Ticket.GetFlight().GetNumberOfFlight().equals(NumberOfFlight)){
        System.out.println();
        System.out.println("You Cann't Delete Flight Some Books Exest :( ");
        return;
    }
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

     System.out.println("Are You Sure To Delete [y/n] : ");
     String Sure = clsImportantClass.ReadString();
     if(Sure.charAt(0) == 'y'){
         clsFlight.Save(newArrayafterdelete);
         System.out.println();
         System.out.println("Deleted Successfuly\n\n");
     }

     else{System.out.println("Didn't Save :)");}

      }
     
    // System.out.println("done");
   
  
     }





    


