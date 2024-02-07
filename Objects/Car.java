public class Car {

    String Brand;
    String Model;
    double Mileage;
    int Price;

    Car(String b,String m,double mi,int p){
        Brand=b;
        Model=m;
        Mileage=mi;
        Price=p;
        

    }


    public void print(){

System.out.println("Brand is "+Brand+" Model is: "+Model+" Mileage is "+Mileage+"Price is "+Price);

    }
    public static void main(String[] args) {

        Car ob1=new Car("Alto","k10",10.5,25102);
        ob1.print();


        Car ob2=new Car("Punch","k10",10.5,25102);
ob2.print();

        Car ob3=new Car("nano","k10",10.5,25102);

        ob3.print();
       
    }
}
