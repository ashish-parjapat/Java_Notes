public class DelhiMetroNoBalceExc extends Exception {

    @Override
    public String getMessage(){
        return "no balance";
    }

    public String toString(){
        return "No entry,please recharge";
    }
    
}
