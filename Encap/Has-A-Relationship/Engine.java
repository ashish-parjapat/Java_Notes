

/**
 * Engine
 */
public class Engine {

    int cc;
    double mileage;

    public Engine(){

    }
    public Engine(int cc,double mileage){
        this.cc=cc;
        this.mileage=mileage;
    }

    public void startEmgine(){
        System.out.println("engine started");
    }
}