/**
 * Excep
 */
public class Excep {
    int a;

    public static void main(String[] args) {

     Excep ex=new Excep();
     ex.a=10;
     ex=null;


        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException exe){
            System.out.println("bhai kya kar raha h");

        }

        try{
            System.out.println(ex.a);
        }
        catch(NullPointerException np){
            System.out.println("kuch h h");

        }
    }
}