import java.util.Scanner;

public class Car {
    String brand,model;
    int price;
    Scanner in=new Scanner(System.in);


    public Car(){
        System.err.println("Enter Car brand :");
        String Brand=in.next();
        this.brand=Brand;

        System.out.println("Enter car model: ");
        String Model=in.next();
        this.model=Model;

        System.out.println("enter Car price:");
        int Price=in.nextInt();
        if(Price<300000){
            while(Price<300000){
                System.out.println("enter price graeater than 300000");
                Price=in.nextInt();
              
            }
            

        }
        else{
            this.price=Price;
        }


        System.out.println("enter car CC");
        int CC=in.nextInt();
        if(CC<200){
            CC=200;
           this.e.cc=CC;

        }
        else if(CC>2000){
            CC=2000;
            this.e.cc=CC;
        }



        System.out.println("enter Car mileage");
        double Mileage=in.nextDouble();
        if(Mileage<5){
            Mileage=5;
            this.e.mileage=Mileage;
        }
        else if(Mileage>25){
            Mileage=25;
            this.e.mileage=Mileage;
        }


        System.out.println("enter temperatrure");
        int Temp=in.nextInt();
        if(Temp<16){
            Temp=16;
            this.a.temp=Temp;
        }else if(Temp>28){
            Temp=28;
            this.a.temp=Temp;
        }


        System.out.println("enter Tire1 model ");
        String t1=in.next();
        this.t1.brand=t1;


        System.out.println("enter Tire2 model ");
        String t2=in.next();
        this.t2.brand=t2;

        System.out.println("enter Tire3 model ");
        String t3=in.next();
        this.t3.brand=Brand;

        System.out.println("enter Tire1+4 model ");
        String t4=in.next();
        this.t4.brand=t4;
        
System.out.println("do you wan to add Music Player if so enter YES or NO");
String Choice=in.next();
if(Choice.equals("YES")){
    System.out.println("enter music brand");
    String MusicBrand=in.next();
    this.m.brand=MusicBrand;

}else{
    this.m=null;
}
    


    }

    public Car(String brand,String model,int price,Engine e,Ac a){
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.e=e;
        this.a=a;

    }


    public Car(String brand,String model,int price,Engine e,Ac a,Tire mrf,Tire tvs,Tire ceat){
      this(brand, model, price, e, a);
        this.t1=mrf;
        this.t2=tvs;
        this.t3=ceat;

    }

    Engine e;
    Ac a;
    Mp m=new Mp();

    {
        e=new Engine();
        a=new Ac();

    }

     

    // public void insertMp(Mp inmp){
    //     m=inmp;
    //     System.out.println("Mp installed");


    // }

    Tire t1=new Tire();
    Tire t4=new Tire();
    // Tire mrf;

    Tire t2;
    Tire t3;
    {
        t2=new Tire();
        t3=new Tire();
        

    }


    public void PrintDetails(){
        System.out.println("brand is:"+brand);
        System.out.println("model is "+model);
        System.out.println("price is "+price);
        System.out.println("cc of car is "+e.cc);
        System.out.println("mileage of car is "+e.mileage);
        System.out.println("front1 tire "+t1.brand);
        System.out.println("front2 tire "+t2.brand);
        System.out.println("front3 tire "+t3.brand);
        System.out.println("front3 tire "+t4.brand);

        if(m!=null){
            System.out.println("Music brand is"+m.brand);
        }else{
            System.out.println("myusic player not found");
        }


    }


    
}
//how to create a objecct inside the method

//create tire class with 4 different brand of tires and





