package Constructor;
/**
 * Employee
 */
public class Employee {

    static String Company="Wipro";
    int Empid;
    String Name;
    double Sal;
    int DeptNo;
    String Job;

//Prunting function
    public void PrintDetails(){

System.out.println("Company name is "+Company);
System.out.println("Empid is "+Empid);
System.out.println("Name is "+Name);
System.out.println("Salary is "+Sal);
System.out.println("Department Number is "+DeptNo);
System.out.println("Job is "+Job);

    }


    //check number of digitts function

    int CheckDigit(int n){
        int i=0;
        while(n>0){
            n/=10;
            i++;
        }
        return i;
    }


    //check for vowel function

    boolean CheckVowel(char a){
        if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U'||a=='a'||a=='e'||a=='i'||a=='o'||a=='u'){
            return true;

        }
        return false;
    }

    // check Salary Function

    public double CheckSalary(double salary){

if(salary>0&&salary<1000000){
    if(salary<500000){
        salary=salary;
    }
    else if(salary<70000){
        double taxValue=(salary*5)/100;
        salary=salary-taxValue;
    }
    else if(salary<850000){
        double taxValue=(salary*7.5)/100;
        salary=salary-taxValue;
    }else{
        double taxValue=(salary*10)/100;
        salary=salary-taxValue;

    }

    



}
if(salary<0){
    salary=0;
}
if(salary>1000000){
    salary=1000000;
}

return salary;

    }

//Empty Constructor
  public Employee(){
    System.out.println("This is empty Constructor");
  }

  //Empid and Name

  public Employee(int Empid,String Name){

    System.out.println("This is Empid and Name Constructor");

    int NumberOfDigit=CheckDigit(Empid);
    if(NumberOfDigit!=4){
        this.Empid=0;
    }else{
        this.Empid=Empid;
    }

    boolean isVowel=CheckVowel(Name.charAt(0));
    if(isVowel==true){
        this.Name="KUNTAL";
    }else{

        this.Name=Name;
    }



  }
//Empid,Name and Sal Constructor

public Employee(int Empid,String Name,double Sal){
    this(Empid,Name);

    System.out.println("This is Empid , Name and Sal Constructor");

    // int NumberOfDigit=CheckDigit(Empid);
    // if(NumberOfDigit!=4){
    //     this.Empid=0;
    // }else{
    //     this.Empid=Empid;
    // }

    // boolean isVowel=CheckVowel(Name.charAt(0));
    // if(isVowel==true){
    //     this.Name="KUNTAL";
    // }else{

    //     this.Name=Name;
    // }
 
    double salary=CheckSalary(Sal);

    this.Sal=salary;





}

//Empid ,Name,Sal and DeptNo Constructor
public Employee(int Empid,String Name,double Sal,int DeptNo){

    this(Empid,Name,Sal);

    System.out.println("This is Empid , Name and Sal and DeptNo Constructor");

    // int NumberOfDigit=CheckDigit(Empid);
    // if(NumberOfDigit!=4){
    //     this.Empid=0;
    // }else{
    //     this.Empid=Empid;
    // }

    // boolean isVowel=CheckVowel(Name.charAt(0));   in.next();
    // if(isVowel==true){
    //     this.Name="KUNTAL";
    // }else{

    //     this.Name=Name;
    // }

    // double salary=CheckSalary(Sal);

    // this.Sal=salary;

    int NumberOfDigitInDep=CheckDigit(DeptNo);

    if(NumberOfDigitInDep==2&&DeptNo%5==0){
        this.DeptNo=DeptNo;
    }else{
        this.DeptNo=0;
    }





}

//This is Full Constructor

public Employee(int Empid,String Name,double Sal,int DeptNo,String Job){

    this(Empid,Name,Sal,DeptNo);

    System.out.println("This is Empid , Name and Sal and DeptNo Constructor");

    // int NumberOfDigit=CheckDigit(Empid);
    // if(NumberOfDigit!=4){
    //     this.Empid=0;
    // }else{
    //     this.Empid=Empid;
    // }

    // boolean isVowel=CheckVowel(Name.charAt(0));
    // if(isVowel==true){
    //     this.Name="KUNTAL";
    // }else{

    //     this.Name=Name;
    // }

    // double salary=CheckSalary(Sal);

    // this.Sal=salary;

    // int NumberOfDigitInDep=CheckDigit(DeptNo);

    // if(NumberOfDigitInDep==2&&DeptNo%5==0){
    //     this.DeptNo=DeptNo;
    // }else{
    //     this.DeptNo=0;
    // }


this.Job=Job;


}

   
     
}