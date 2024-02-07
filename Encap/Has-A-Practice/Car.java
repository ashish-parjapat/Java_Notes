import java.util.Scanner;

public class Car {

    Scanner in=new Scanner(System.in);

   private String brand,model;
  private  int price;


  //getter
  public String GetBrand(){
    return brand;
  }

  //getter
  public String GetModel(){
    return model;
  }
  //getter

  public int GetPrice(){
    return price;
  }



public Car(String brand,String model,int price){
    this.brand=brand;
    this.model=model;
    this.price=price;

}

public Car (String brand,String model,int price,Engine e,Ac a,Mp m){
    this(brand, model, price);
    this.e=e;
    this.a=a;
    this.m=m;

}


public Car (String brand,String model,int price,Engine e,Ac a,Mp m,Tire t1,Tire t2,Tire t3,Tire t4){
   this(brand, model, price, e, a, m);
   this.t1=t1;
   this.t2=t2;
   this.t3=t3;
   this.t4=t4;

}

public void PrintDetails(){
    System.out.println("Car Brand is "+brand);
    System.out.println("Car model is "+model);
    System.out.println("Car price is "+price);
    System.out.println("Engine cc is "+e.Getcc());
    System.out.println("Engine mileage is "+e.GetMileage());
    System.out.println("Ac temp is "+a.GetTemp());

    if(m!=null){
        System.out.println("Mp brand is "+m.GetBrand());
    }else{
        System.out.println("Mp is not available");
    }
    
    System.out.println("Tire1 brand is "+t1.GetBrand());
    System.out.println("Tire2 brand is "+t2.GetBrand());
    System.out.println("Tire3 brand is "+t3.GetBrand());
    System.out.println("Tire4 brand is "+t4.GetBrand());

}

public void ChangeTire(Tire t1,Tire t2,Tire t3,Tire t4){
    System.out.println("Enter which tire you want to chnage");
System.out.println("1 for Front Right");
System.out.println("2 for Front Left");
System.out.println("3 for Back Right");
System.out.println("4 for Back Left");

    int TireNumber=in.nextInt();

    if(TireNumber==1){
    //     String res=t1.GetBrand();
    //   res=  null;
        System.out.println("Boss which brand tire now you want to add");
        String TireBrand=in.next();
        t1.SetBrand(TireBrand);
        System.out.println(t1.GetBrand());

    }
    else if(TireNumber==2){
        // String res=t2.GetBrand();
        System.out.println("Boss which brand tire now you want to add");
        String TireBrand=in.next();
        t2.SetBrand(TireBrand);

    }
    else if(TireNumber==3){
        // String res=t3.GetBrand();
        System.out.println("Boss which brand tire now you want to add");
        String TireBrand=in.next();
        t3.SetBrand(TireBrand);

    }
    else if(TireNumber==4){
        // String res=t4.GetBrand();
        System.out.println("Boss which brand tire now you want to add");
        String TireBrand=in.next();
        t4.SetBrand(TireBrand);

    }
    else{
        System.out.println("Invalid input");
    
}
}





    Engine e=new Engine();
    Ac a=new Ac();
    Mp m=new Mp();
    Tire t1=new Tire();
    Tire t2=new Tire();
    Tire t3=new Tire();
    Tire t4=new Tire();

    
}
