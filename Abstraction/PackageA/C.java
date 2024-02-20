package PackageA;

/**
 * C
 */
public class C {

    //Private Members

    private int a;
    private static int b;

    private static void demo(){
        System.out.println("this is private static demo method");
    }
private void test(){
    System.out.println("this is private  void method");


}

//public Members

public int c;
public static int d;

public static void run(){
    System.out.println("this is run of public static");
}
   public void runner(){
    System.out.println("this is runnner method of public void");
   } 


   //default members

    int e;
   static int f;
    static void Rajan(){
        System.out.println("this is default static");
    }

    void Rajan2(){
        System.out.println("this is default non static");
    }


    //protected Members

    protected int g;
    protected static int h;

    protected void Nikil(){
        System.out.println("this is proyecddted non staatic methid");
    }

    protected static void Nikil2(){
        System.out.println("this is proyecddted  staatic methid");
    }


    public static void main(String[] args) {
      C ob=new C();
      //public
      System.out.println(ob.c);
      C.run();
      ob.runner();

      //private
      System.out.println(ob.a);
      System.out.println(b);

      //protected

      System.out.println(ob.g);
      System.out.println(h);
      ob.Nikil();
      Nikil2();

      //
      System.out.println(ob.e);
      System.out.println(f);
    Rajan();
    ob.Rajan2();

    }


}