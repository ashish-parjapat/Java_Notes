public class CarRunner {
    public static void main(String[] args) {

//         Car c=new Car();

// //car
//         System.out.println(c.brand);
//         System.out.println(c.price);
//         System.out.println("----------------------------------------------------------------------------");

//         //Engine 
//         System.out.println(c.e);
//         System.out.println(c.e.cc);
//         System.out.println(c.e.mileage);
//         System.out.println("----------------------------------------------------------------------------");

//         //Ac
//         System.out.println(c.a);
//         System.out.println(c.a.temp);
//         System.out.println("----------------------------------------------------------------------------");

//         //Mp
//         System.out.println(c.m);
//         System.out.println(c.m.brand);
//         System.out.println("----------------------------------------------------------------------------");

//         System.out.println(c.t1.brand);
//         System.out.println(c.t2.brand);
//         System.out.println(c.t3.brand);
//         System.out.println(c.t4.brand);
//         System.out.println("----------------------------------------------------------------------------");


        // Car c2=new Car("tata", "altroz", 10000000);

        // System.out.println(c2.brand);
        // System.out.println(c2.model);
        // System.out.println(c2.price);
        //  System.out.println("----------------------------------------------------------------------------");

        //  System.out.println(c2.e.cc);
        //  System.out.println(c2.e.mileage);
        //  System.out.println("----------------------------------------------------------------------------");

        //  Car c3=new Car("tata", "altroz", 10000000, new Engine(150,10.52), new Ac(16), new Mp("Tseries"));

        //  System.out.println(c3.brand);
        // System.out.println(c3.model);
        // System.out.println(c3.price);
        //  System.out.println("----------------------------------------------------------------------------");

        //  System.out.println(c3.e.cc);
        //  System.out.println(c3.e.mileage);
        //  System.out.println("----------------------------------------------------------------------------");

        //  System.out.println(c3.a.temp);
        //  System.out.println(c3.m.brand);
        //  System.out.println("----------------------------------------------------------------------------");


         
         Car c4=new Car("Mahiendra", "Scoprpio", 18000000,new Engine(4500,11),new Ac(22),new Mp("Ankit Music"),new Tire("CEAT"),new Tire("APOLO"),new Tire("MRF"),new Tire("TVF"));
           c4.PrintDetails();
           c4.ChangeTire(new Tire("CEAT"),new Tire("APOLO"),new Tire("MRF"),new Tire("TVF"));



        
    }
    
}
