/**
 * Fruit
 */
public class Fruit {
    double price;
    double qty;



    public Fruit() {
        System.out.println("Fruit is created");
    }



    public Fruit(double price, double qty) {
        System.out.println("Fruit connstructor is working");
        this.price = price;
        this.qty = qty;
    }


    public void makeJuice(){
        System.out.println("this will make the juice");
    }

    public void Details(){
        System.out.println("Price is "+price);
        System.out.println("qty is "+qty);
    }

    
}