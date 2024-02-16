public class Ev extends Car {
    int chargePer;


    public Ev(int cc,double price,double temp,int chargePer){
        super(cc, price, temp);
        System.out.println("this is ev constructor");
        this.chargePer=chargePer;
      
    }

    public void charging(){
        System.out.println("battery is charging");
    }

    public void details(){
        System.out.println("charge percenatge is "+chargePer);
        super.details();
    }
    
}
