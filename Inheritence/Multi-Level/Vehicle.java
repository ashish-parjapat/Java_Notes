/**
 * Vehicle
 */
public class Vehicle {
    int cc;
    double price;


    public Vehicle(int cc,double price){
        System.out.println("this is vehiccle constructor");
        this.cc=cc;
        this.price=price;
    }

    public void startEngine(){
        System.out.println("engine started");
    }


    public void stopEngine(){
        System.out.println("engine stopeed");
    }

    public void details(){
        System.out.println("Cc of vehicle is "+cc);
        System.out.println("Price of vehicle is "+price);
    }

    
}