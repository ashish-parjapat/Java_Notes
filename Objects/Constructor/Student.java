 package Constructor;

public class Student {
    static String company="TCS";
    String name;
    int age;
    char gender;


   public Student(String name,int age,char gender){
    this.name=name;
    this.age=age;
    this.gender=gender;
  

   }

public  void details( ){
    System.out.println("Comapny name is "+company);
    System.out.println("name is "+name);
    System.out.println("age is "+age);
    System.out.println("gender is "+gender);
    System.out.println("Comapny name is "+company);
   }

   

    public static void main(String[] args) {

        Student ob1=new Student("ashish", 23, 'M');
        ob1.details();
        
    }













   
}
