/**
 * Employee
 */
public class Employee {
    int Eid;
    String Ename;
    double Sal;
    String Job;
    
    public Employee(int Eid,String Ename,double Sal,String Job){
        this.Eid=Eid;
        this.Ename=Ename;
        this.Sal=Sal;
        this.Job=Job;
    }

    // public String toString(){
    //     String Eid="Employee Id is "+this.Eid;
        
    //     String Ename="Employee name is "+this.Ename;
    //     System.out.println();
    //     String Sal="Employee sal is "+this.Sal;
    //     System.out.println();
    //     String Job="Job is "+this.Job;
    //     System.out.println();

    //     return Eid+Ename+Sal+Job;

    // }


    //all data comaprrsion

//    public boolean equal(Object obj){
//     Employee E=(Employee)obj;
//     if(E.Eid==this.Eid && E.Ename==this.Ename && E.Sal==this.Sal && E.Job==this.Job){
//         return true;
//     }
//     else{
//         return false;
//     }
//    }


   //job and

   public boolean equal(Object obj){
    Employee E=(Employee)obj;
    return E.Sal==this.Sal;
   }



   //hashcode method to print hascode based on the datas


   public int hascode(Object obj){
    Employee E=(Employee)obj;

    int Sal=(int)E.Sal;

    return E.Eid+E.Ename.hashCode()+Sal+E.Job.hashCode();

   }



    public static void main(String[] args) {

       







        Employee E1=new Employee(101, "SMITH", 800, "CLERK");
        Employee E2=new Employee(102, "FORD", 3000, "ANALYST");
        Employee E3=new Employee(103, "ADAMS", 1250, "CLERK");
        Employee E4=new Employee(104, "BLAKE", 2850, "MANAGER");
        Employee E5=new Employee(105, "SCOTT", 3000, "ANALYST");
        Employee E6=new Employee(101, "SMITH", 800, "CLERK");
        Employee E7=new Employee(104, "BLAKE", 2850, "MANAGER");


        //overidde tostring method to print detaills

        // System.out.println(E1);
        // System.out.println(" ");
        // System.out.println(E2);
        // System.out.println(" ");
        // System.out.println(E3);
        // System.out.println(" ");
        // System.out.println(E4);
        // System.out.println(" ");
        // System.out.println(E5);
        // System.out.println(" ");
        // System.out.println(E6);
        // System.out.println(" ");
        // System.out.println(E7);

        //overidde equal method to compare objects
        // System.out.println(E1.equal(E5));

        // System.out.println(E1.equal(E6));

        System.out.println(E1.hascode(E6));

       



        
    }

    
}