import java.util.Scanner;

/**
 * Mobile
 */
public class Mobile {
    String Brand,Model;
    int Price;
    Scanner in=new Scanner(System.in);

   

public Mobile(String Brand,String Model,int Price,double Power){
    this.Brand=Brand;
    this.Model=Model;
    this.Price=Price;
    this.battery.Power=Power;
}

public Mobile(String Brand,String Model,int Price,double Power,String c1,String c2){
    this(Brand, Model, Price, Power);
    this.sim1.Company=c1;
    this.sim2.Company=c2;
}

public Mobile(){
    System.out.println("enter brand of mobile: ");
    String Brand=in.next();
    this.Brand=Brand;
    
    System.out.println("Enter mobile model");
    String Model=in.next();
    this.Model=Model;

    System.out.println("Enter price: ");
    int Price=in.nextInt();
    this.Price=Price;


    System.out.println("enter power of battery");
    double Power=in.nextDouble();
    this.battery.Power=Power;

    System.out.println("Sim 1 opeartir");
    String op1=in.next();
    this.sim1.Company=op1;


    System.out.println("Sim 2 opeartir");
    String op2=in.next();
    this.sim2.Company=op2;



}


    Battery battery=new Battery();
    Operator sim1=new Operator();
    Operator sim2=new Operator();

    public void InsertSim1(String Company){
        sim1.Company=Company;

    }

    public void InsertSim2(String Company){
        sim2.Company=Company;

    }

    public void PrintDetails(){
        System.out.println("Brand is "+Brand);
        System.out.println("Model is "+Model);
        System.out.println("Price is "+Price);
        System.out.println("Power is "+battery.Power);
        System.out.println("sim1 compnay name "+sim1.Company);
        System.out.println("sim2 compnay name "+sim2.Company); 
    }


    
}