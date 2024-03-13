public class DelhiMetro {

    public static void Swipe(int balance) throws DelhiMetroNoBalceExc{
        if(balance>=10){
            System.out.println("Welcome to delhi metro");
            System.out.println("Balce is "+balance);
        }
        else{
            throw new DelhiMetroNoBalceExc();
        }
    }
    
}
