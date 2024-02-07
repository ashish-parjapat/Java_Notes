import java.util.Scanner;

/**
 * Student
 */
public class Student {
    static String SchoolName="delhi Public School";
   int sid;
    String name;
    char gender;
    double percentage;
    long phonenumber;

    public void StudentDetails(){
        System.err.println("School name is: "+SchoolName);
        System.err.println("Student id is: "+sid);
        System.err.println("Gender is: "+gender);
        System.err.println("Percentage is: "+percentage);
        System.err.println("Phone number is: "+phonenumber);
    }

    static{
        System.err.println("this is run first even before the main method");
        System.err.println("------------------------------");
    }

    {
        System.err.println("this will run for every object creation ");
        System.err.println("------------------------------");
    }



    public static void main(String[] args) {

        Student ob1=new Student();
        // System.out.println(ob1);
        
        // System.out.println(SchoolName);
        // System.out.println(ob1.sid);
        // System.out.println(ob1.name);
        // System.out.println(ob1.gender);
        // System.out.println(ob1.percentage);
        // System.out.println(ob1.phonenumber);
        ob1.StudentDetails();

        System.err.println("------------------------------");


        
        Student ob2=new Student();
        ob2.sid=123;
        ob2.name="Ashish";
        ob2.gender='M';
        ob2.percentage=85.5;
        ob2.phonenumber=8745212365l;
      ob2.StudentDetails();

      
      System.err.println("------------------------------");

        Student ob3=new Student();
        Scanner in=new Scanner(System.in);
        System.err.println("Enter sid");
        ob3.sid=in.nextInt();
        System.err.println("Enter student name: ");
        ob3.name=in.next();
        System.err.println("Enter Gender of Student:");
        ob3.gender=in.next().charAt(0);
        System.err.println("Enter his percentage:");
        ob3.percentage=in.nextDouble();
        System.err.println("Enter his phone number: ");
        ob3.phonenumber=in.nextLong();

        ob3.StudentDetails();
        System.err.println("------------------------------");


        
    }

    
}