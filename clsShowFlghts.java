import java.util.jar.Attributes.Name;

public class clsShowFlghts {






    public static void ShowFlightScreen()
    {

        
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


        
    }
}