package PackageA;

public class D {

 public static void main(String[] args) {
    C ob2=new C();
    //public

    System.out.println(ob2.c);
    System.out.println(C.d);
    C.run();
    ob2.runner();

    //protected

    System.out.println(ob2.g);
    System.out.println(C.h);
    ob2.Nikil();
    C.Nikil2();
    //private

    System.out.println(ob2.a);
    System.out.println(C.b);


    //defailt

    System.out.println(ob2.e);
    System.out.println(C.f);
    C.Rajan();
    ob2.Rajan2();


 }
 
    
}
