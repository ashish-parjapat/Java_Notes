public class Car extends Vehicle {
    double temp;

    public Car(int cc,double price,double temp){
        

        super(cc, price);
        System.out.println("this is car constructor");

        this.temp=temp;



    }

    public void openDoor(){
        System.out.println("bhai door khol de");
    }

    public void details(){
        System.out.println("Temp is "+temp);
        super.details();
       
    }
    
}
