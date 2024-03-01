public class Runner {

    public static void main(String[] args) {
        IBMS i=new BookMyShow();

        if(i.Login()==true){
            i.FullBooking();
        }
        else{
            System.out.println("Login failed");
        }
    }
    
}
