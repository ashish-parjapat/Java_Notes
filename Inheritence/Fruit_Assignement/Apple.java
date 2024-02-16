/**
 * Apple
 */
public class Apple extends Fruit{
    String type;



    public Apple() {
        
        System.out.println("Apple is created");
    }

    public Apple(double price,double qty,String type) {
        // super(price, qty);

        System.out.println("apple construcotr is working");
        this.type = type;
    }


    


    public void makeVodka(){
        System.out.println("this will make the vodka");
    }

    public void Details(){
        System.out.println("type is "+type);
        super.Details();

    }


    
}