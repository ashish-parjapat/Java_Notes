package Objects;

/**
 * Employee
 */
public class Employee {

     int sal;
    int id;

    static{
        System.out.println("this is static initilser");
    }

    {
        System.out.println("this is non static initilzer");
    }

   public Employee(){

    System.out.println("this is employee construcote");

    
   
   
   }

   public static void main(String[] args) {
    Employee e=new Employee();
    System.out.println("----------------------------------------");
    Employee e2=new Employee();
   }

    
   
}