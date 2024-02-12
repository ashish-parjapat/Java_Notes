public class Car extends Vehicle {

    static{
        System.out.println("this is static in Car class");
    }

    {
        System.out.println("this is non static in Car class");
    }
    
}
