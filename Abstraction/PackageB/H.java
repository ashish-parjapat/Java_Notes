package PackageB;

import PackageA.C;

public class H  extends C{

    public static void main(String[] args) {
        H obj5=new H();
        //public
        System.out.println(obj5.c);
        System.out.println(H.d);

        //protected

        System.out.println(obj5.g);
        System.out.println(H.h);

        //private
        System.out.println(obj5.a);
        System.out.println(H.b);

        //default

        System.out.println(obj5.e);
        System.out.println(H.f);
        

        
    }
   



    
    
}
