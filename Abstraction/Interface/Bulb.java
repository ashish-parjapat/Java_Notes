public  abstract class Bulb implements SwitchBoard {
    @Override
    public void SwitchOn(){
        System.out.println("this will switch on the bulb");
    }

    @Override
    public void SwitchOff(){
        System.out.println("this will switch off the bulb");
    }


    public abstract void Color();

    
}
