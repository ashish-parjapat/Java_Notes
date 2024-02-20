package PackageA;

public class E extends C {

    public static void main(String[] args) {
        E obj4=new E();
    

    //public
    System.out.println(obj4.c);
    System.out.println(C.d);

    //private

    System.out.println(obj4.a);
    System.out.println(C.b);

    //protected

    System.out.println(obj4.g);
    System.out.println(C.h);

    //default

    System.out.println(obj4.e);
    System.out.println(C.f);
    }

    
}
