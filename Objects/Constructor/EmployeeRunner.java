package Constructor;

import java.util.Scanner;

public class EmployeeRunner {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        //1st object
    // Employee e1=new Employee();
    // System.out.println("========================================");
    // e1.PrintDetails();

    // System.out.println("========================================");


    //   //2st object
    //   Employee e2=new Employee(4521,"Ashish");
    //   System.out.println("========================================");
    //   e2.PrintDetails();

    //   System.out.println("========================================");


    //    //3rd object
    //    Employee e3=new Employee(4521,"Ashish",600000);
    //    System.out.println("========================================");
    //    e3.PrintDetails();

    //    System.out.println("========================================");


    //     //4th object
    //     Employee e4=new Employee(4521,"Ashish",600000,126);
    //     System.out.println("========================================");
    //     e4.PrintDetails();

    //     System.out.println("========================================");


    //  //5th object
    //  Employee e5=new Employee(4521,"Ashish",600000,41,"Software Developer");
    //  System.out.println("========================================");
    //  e5.PrintDetails();

    //  System.out.println("========================================");

    int Empid=in.nextInt();
   in.next();
    String Name=in.nextLine();
    double Salary=in.nextDouble();
   
    int DeptNo=in.nextInt();

    String Job=in.nextLine();
    

     Employee e7=new Employee(Empid,Name,Salary,DeptNo,Job);
     e7.PrintDetails();
}
    

}
