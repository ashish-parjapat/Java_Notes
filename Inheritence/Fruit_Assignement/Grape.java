/**
 * Grape
 */
public class Grape extends Fruit {
    String type;


    public Grape(double price,double qty,String type){
        super(price, qty);
        this.type=type;





    }

    public void makeWine(){
        System.out.println("this will make the wine");
    }

    public void Details(){
        System.out.println("type is "+type);

    }

    
}