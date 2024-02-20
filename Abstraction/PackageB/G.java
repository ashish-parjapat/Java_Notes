package PackageB;

import PackageA.C;

public class G {

    public static void main(String[] args) {
        C ob3=new C();

        //public
        System.out.println(ob3.c);
        System.out.println(C.d);

        //private

        System.out.println(ob3.a);
        System.out.println(ob3.b);

        //protected

        System.out.println(ob3.g);
        System.out.println(C.h);

        //defaault

        System.out.println(ob3.e);
        System.out.println(C.f);

    }
    
}
