import java.util.ArrayList;

public class clsShowFlghts extends clsScreeen{


    public static void printOneFlight(clsFlight Flight)
    {
        System.out.printf("| %s       | %s       | %s       |   %s   |   %s   |    %d      |      %d        |    %s    |       %s      | %s                |\n" , Flight.GetNumberOfFlight() , Flight.GetFromCountry() , Flight.GetToCountry() , 
        Flight.GetDateToTravel() , Flight.GetDateToGoBack() , Flight.GetNumberOfChars() , Flight.GetNumberOfPassengers() , Flight.GetStringTimeOfGo() , Flight.GetTimeOfArriving() , Flight.GetHowMuchTimeInTheSky());
    }



    private static ArrayList <clsFlight> SortByDate(ArrayList <clsFlight> AllFlights)
    {
        for(int j = 1 ; j < AllFlights.size() ; j++)
        {
            for(int i = 0 ; i < AllFlights.size() - 1 ; i++)
            {
                boolean Done = false;

                String Date1 = AllFlights.get(i).GetDateToTravel();
                String Date2 = AllFlights.get(i + 1).GetDateToTravel();
                String[] ArrDate1 = Date1.split("/");
                String[] ArrDate2 = Date2.split("/");

                if(Integer.parseInt(ArrDate1[0]) > Integer.parseInt(ArrDate2[0]))
                {
                 clsFlight Temp = AllFlights.get(i);
                 AllFlights.set(i, AllFlights.get(i + 1));
                 AllFlights.set(i + 1, Temp);
                 Done = true;
                }

                else if(Integer.parseInt(ArrDate1[1]) > Integer.parseInt(ArrDate2[1]))
                {
                 clsFlight Temp = AllFlights.get(i);
                 AllFlights.set(i, AllFlights.get(i + 1));
                 AllFlights.set(i + 1, Temp);
                 Done = true;
                }

                else if(Integer.parseInt(ArrDate1[2]) > Integer.parseInt(ArrDate2[2]))
                {
                 clsFlight Temp = AllFlights.get(i);
                 AllFlights.set(i, AllFlights.get(i + 1));
                 AllFlights.set(i + 1, Temp);
                 Done = true;
                }

                Date1 = AllFlights.get(i).GetStringTimeOfGo();
                Date2 = AllFlights.get(i + 1).GetStringTimeOfGo();

                String[] Arr1 = Date1.split(":");
                String[] Arr2 = Date2.split(":");

                if(!Done)
                if(Integer.parseInt(Arr1[0]) > Integer.parseInt(Arr2[0]))
                {
                 clsFlight Temp = AllFlights.get(i);
                 AllFlights.set(i, AllFlights.get(i + 1));
                 AllFlights.set(i + 1, Temp);
                }

                else if(Integer.parseInt(Arr1[1]) > Integer.parseInt(Arr2[1]))
                {
                 clsFlight Temp = AllFlights.get(i);
                 AllFlights.set(i, AllFlights.get(i + 1));
                 AllFlights.set(i + 1, Temp);
                }

               
            }
        } 
        
        return AllFlights;
    }


    public static void ShowFlightScreen()
    {
        
        NewScreen("\t          Show Flights Screen" , 55);

        ArrayList <clsFlight> AllFlights = clsFlight.GetAllFlights();



        System.out.println("|__________________________________________________________________________________________________________________________________________________________|");
        System.out.println("|                                                              Flights Informations                                                                        |");
        System.out.println("|__________________________________________________________________________________________________________________________________________________________|");
        System.out.println("| Flight Num | From Country | To Country | Travel Date  |  Go Back Date  | Chears Num | Passegers Num | Going Time | Arraiving Time | Stay in The Sky hours|");
        System.out.println("|__________________________________________________________________________________________________________________________________________________________|");

        if(AllFlights.isEmpty())
        {
            
          System.out.println("                                                                  No Flights Exest");
          System.out.println("|__________________________________________________________________________________________________________________________________________________________|");

          return;
        }

        AllFlights = SortByDate(AllFlights);
        
        for(clsFlight Flight : AllFlights)
        {
            printOneFlight(Flight);
        }





        System.out.println("|__________________________________________________________________________________________________________________________________________________________|");

        System.out.println();



       /* 

        
        // هاد هو الأوبجكن الي بدنا نخزن منو بلفايل 
       class Student
       {
        String Name;
        int Age;
        String PhonNum;

        Student(String Name , int Age , String PhonNum)
        {
            this.Age = Age;
            this.Name = Name;
            this.PhonNum = PhonNum;
        }
       }
        // بدي حول هاد الاوبجكت لسترينغ
       Student st1 = new Student("Mohammad", 27, "097362766247");


                               // هاد بحول الانجر لسترينغ
       String[] Arr = {st1.Name , Integer.toString(st1.Age) ,st1.PhonNum};
       // كل معلومة من معلومات الاوبجكن بتنحط لحالها بلأري



       String s = ""; // هاد السترينغ الي بدي اجمع في كل معلومات الاوبجكت
       


       //هاد الفنكشن بياخد الفاصل الي بدي حطو بين كل معلومتين من معلومات الاوبجكت 
       // وبياخد الاري و برجعلي سترينغ فيو كل معلومة مفصولة حسب الفاصل الي بعتلو ياه
       s = String.join("#//#" ,Arr);



        //   هاد الشكل الي بصير عنا و الي بدنا نخزن في على الفايل
        String b ="Mohammad#//#27#//#097362766247";
        

        // هون بس بصفا انو خزن هاد السطر بلاري




        // طيب لما ناخد هاد السطر و نرجعو اوبجكت 
        // لازم نعمل عملية عكسية 
        //  هون استخدمنا فنكشن جاهز بس حطينا نقطة للسترينغ ام لقينا 
        // هاد الفنكشن بقسم السترينغ الواحد لكذا سترينغ على حسب الباريمتر الي منبعتو
        Arr =b.split("#//#");
        //يعني بعد هاد الفنكشن رح يصير عنا بهي ال اراي
        // Arr[0] = "Mohammad" // Arr[1] = "27" // Arr[2] = "097362766247"
        // طبعا مع احترام انو الشي الي معرف كرقم لازم نرجعو كرقم



        // و اخر خطوة انو نرجع الاري كأوبجكت
        Student st2 = new Student(Arr[0], Integer.parseInt(Arr[1]), Arr[2]);


        */




    }
}